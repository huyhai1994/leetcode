package completable_future;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Slf4j
class ShopTest {

    @Test
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

}