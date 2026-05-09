package multithread.headfirst.race_condition;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Slf4j
public class BankAccount {
    private int balance = 100;

    public void spend(int amount) {
        balance = balance - amount;
        if (balance < 0) {
            log.info("Overdrawn!");
        }
    }

}
