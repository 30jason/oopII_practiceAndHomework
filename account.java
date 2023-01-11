import java.util.*;
public class account implements Runnable {
    static Object lock = new Object();
    static int balance = 0;
    Thread t;
    public account() {
        t = new Thread(this);
        t.start();
        try {
            t.join();
        }catch (InterruptedException e) {
            System.out.println("被中斷");
        }
    }
    public void run() {
        int ori = balance;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("輸入存款或提款餘額");
        int money = keyboard.nextInt();
        deposit(money);         
        if (balance < 0) {
            balance = ori;
            System.out.println("餘額不足");
        }
        System.out.println("帳戶餘額:"+balance);
    }
    public synchronized static void deposit(int money) {
        balance += money;
    }
}