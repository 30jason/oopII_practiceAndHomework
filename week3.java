public class week3 {
    public static void main (String [] args) throws Exception{
        Thread t1 = new Thread(()-> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName()+"print "+i+" time(s)");
            }
        });
        t1.start();
    }
}