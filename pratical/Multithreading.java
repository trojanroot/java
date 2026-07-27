class BankAccount {
    private int balance = 1000;
    synchronized void withdraw(String name, int amount) {
        System.out.println(name + " is trying to withdraw Rs." + amount);
        if (balance >= amount) {
            System.out.println(name + " is processing...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            balance = balance - amount;
            System.out.println(name + " Withdraw Successful");
            System.out.println("Remaining Balance : Rs." + balance);
        } else {
            System.out.println(name + " Insufficient Balance");
        }
        System.out.println();
    }
}
class UserOne extends Thread {
    BankAccount account;
    UserOne(BankAccount account) {
        this.account = account;
    }
    public void run() {
        account.withdraw("User One", 400);
    }
}
class UserTwo implements Runnable {
    BankAccount account;
    UserTwo(BankAccount account) {
        this.account = account;
    }
    public void run() {
        account.withdraw("User Two", 500);
    }
}

class UserThree implements Runnable {

    BankAccount account;
    UserThree(BankAccount account) {
        this.account = account;
    }
    public void run() {
        account.withdraw("User Three", 300);
    }
}

public class Multithreading{
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        UserOne t1 = new UserOne(account);
        Thread t2 = new Thread(new UserTwo(account));
        Thread t3 = new Thread(new UserThree(account));
        System.out.println("Before Starting Threads");
        System.out.println("Thread 1 : " + t1.getState());
        System.out.println("Thread 2 : " + t2.getState());
        System.out.println("Thread 3 : " + t3.getState());
        System.out.println();
        t1.start();
        t2.start();
        t3.start();
        System.out.println("After Starting Threads");
        System.out.println("Thread 1 : " + t1.getState());
        System.out.println("Thread 2 : " + t2.getState());
        System.out.println("Thread 3 : " + t3.getState());
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println();
        System.out.println("After Completion");
        System.out.println("Thread 1 : " + t1.getState());
        System.out.println("Thread 2 : " + t2.getState());
        System.out.println("Thread 3 : " + t3.getState());

    }
}
