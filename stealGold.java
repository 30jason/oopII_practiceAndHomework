class goldClass implements Runnable {
    static int gold = 2000000;
    int tGold;
    Thread t;
    goldClass(String name) {
        tGold = 0;
        t= new Thread(this, name);
        t.start();
    }
    public void run() {
        while(grabGold() == true) {
            tGold++;
        }
        System.out.println(t.getName()+"總共偷到"+tGold+"金幣");
    }
    private synchronized static boolean grabGold() {
        if (gold > 0) {
            gold--;
            return true;
        }else {
            return false;
        }
    }
}
    public class stealGold {
        public static void main (String [] args) {
            goldClass tA = new goldClass("小偷A");
            goldClass tB = new goldClass("小偷B");
            goldClass tC = new goldClass("小偷C");
        }
    }