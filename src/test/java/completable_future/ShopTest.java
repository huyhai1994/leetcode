package completable_future;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import support.Watch;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Slf4j
class ShopTest {

    public static final List<Shop> SHOPS = Arrays.asList(
            new Shop("Best Price"),
            new Shop("LetSaveBig"),
            new Shop("MyFavoriteShop"),
            new Shop("BuyItAll"),
            new Shop("ShopEasy"),
            new Shop("BuyItAll"),
            new Shop("ShopEasy"),
            new Shop("LetSaveBig"),
            new Shop("MyFavoriteShop"),
            new Shop("BuyItAll"),
            new Shop("ShopEasy"),
            new Shop("BuyItAll"),
            new Shop("ShopEasy")
    );

    public static final String PRODUCT = "myPhone27S";

    private final Executor executor = Executors.newFixedThreadPool(Math.min(SHOPS.size(), 100), r ->
    {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    });

    void getFutureAsyncPrice() {
        Shop shop = new Shop("Best Shop");
        long start = System.currentTimeMillis();
        Future<Double> futurePrice = shop.getPriceAsync("my favorite product");
        long invocationTime = System.currentTimeMillis() - start;
        log.info("Invocation returned after {} ms", invocationTime);
        try {
            double price = futurePrice.get();
            assertThat(price).isNotZero();
            log.info("Price is {}", price);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        long retrievalTime = System.currentTimeMillis() - start;
        assertThat(retrievalTime).isBetween(1000L, 2000L);
        log.info("Price returned after {} ms", retrievalTime);

    }

    @Test
    @DisplayName("Parallelizing the findPrices method")
    void getFutureAsyncPriceMultipleShop_whenUsingParallelStream() {

        try (Watch ignored = Watch.getWatch()) {
            List<String> prices = SHOPS
                    .parallelStream()
                    .map(mapper(PRODUCT))
                    .collect(Collectors.toList());
            assertThat(prices.size()).isGreaterThan(1);
        }
    }

    @Test
    void getFuturePriceMultipleShop_whenUsingStream() {

        try (Watch ignored = Watch.getWatch()) {
            List<String> prices = SHOPS
                    .stream()
                    .map(mapper(PRODUCT))
                    .collect(Collectors.toList());

            assertThat(prices.size()).isGreaterThan(1);
        }
    }

    @Test
    void makingAsyncRequests() {
        try (Watch ignored = Watch.getWatch()) {
            List<CompletableFuture<String>> priceFutures = SHOPS
                    .stream()
                    .map(mapperAsync(PRODUCT))
                    .collect(Collectors.toList());

            assertThat(priceFutures.size()).isGreaterThan(2);

            List<String> prices =
                    priceFutures
                            .stream()
                            .map(CompletableFuture::join)
                            .collect(Collectors.toList());
            assertThat(prices.size()).isGreaterThan(2);
        }
    }

    private Function<Shop, String> mapper(String product) {
        return shop ->
                String.format(
                        "%s price is %.2f",
                        shop.getShopName(),
                        shop.getPrice(product)
                );
    }

    private Function<Shop, CompletableFuture<String>> mapperAsync(String product) {
        return shop -> CompletableFuture.supplyAsync(
                () -> String.format(
                        "%s price is %.2f",
                        shop.getShopName(),
                        shop.getPrice(product)
                )
                , executor);
    }
}