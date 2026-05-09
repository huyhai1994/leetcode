package multithread.headfirst.dead_lock;

class Main {
    public static void main(String[] args) {
        final Account a = new Account(1, 1000);
        final Account b = new Account(2, 300);
        Thread t1 = new Thread(() -> transfer(a, b, 200));
        Thread t2 = new Thread(() -> transfer(b, a, 300));
        t1.start();
        t2.start();
    }

    public static void transfer(Account from, Account to, double amount) {
        synchronized (from) {
            synchronized (to) {
                from.withdraw(amount);
                to.deposit(amount);
            }
        }
    }
}