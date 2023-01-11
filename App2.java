class myThread implements Runnable {
    int m;
    myThread(int m) {
        this.m = m;
    }
    public void run () {
        for (int i = 1; i <= this.m; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class App2 {
    public static void main (String [] args) {
        myThread mA = new myThread(20);
        myThread mB = new myThread(25);
        Thread tA = new Thread(mA, "執行緒A");
        Thread tB = new Thread(mB, "執行緒B");
        tA.start();
        tB.start();
    }
}