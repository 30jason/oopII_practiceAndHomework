public class week2 {
    public static void main (String [] args) {
        Thread T1 = new Thread() {
            public void run() {
                for (int i = 1; i <= 20; i++) {
                    System.out.println("兔子跑步中，跑了"+i+"公里");
                    if( i == 10) {
                        try {
                            this.sleep(5000);
                            System.out.println("兔子睡著了");
                        }catch (InterruptedException e) {       
                        }
                    }
                }
            }    
        };
        Thread T2 = new Thread() {
            public void run() {
                for (int i = 1; i <= 20; i++) {
                    System.out.println("龜跑步中，跑了"+i+"公里");
                }

            }
        };
        T1.start();
        T2.start();
    }
}