package multithread.headfirst.race_condition;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RequiredArgsConstructor
public class RyanAndMonicaJob implements Runnable {
    private final String name;
    private final BankAccount account;
    private final int amountToSpend;


    @Override
    public void run() {
        goShopping(amountToSpend);
    }

    private void goShopping(int amountToSpend) {
        if (account.getBalance() >= amountToSpend) {
            log.info("{} is about to spend", name);
            account.spend(amountToSpend);
            log.info("{} finishes spending", name);
        } else {
            log.warn("Sorry, not enough for {}", name);
        }
    }
}
