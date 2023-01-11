import java.util.*;
public class App {
    public static void main (String[] args) throws Exception {
        var number =Set.of(10, 20, 30, 40);
        System.out.println(number);

        var newset = new HashSet<>();
        newset.add("Jason");
        System.out.println(newset);
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.nextLine();
        newset.add(name);
        System.out.println(newset);

        if(newset.contains("Jason")) {
            System.out.println("Jason在");
        }else {
            System.out.println("Jason不在");
        }
        
        var tset = new TreeSet<>();
        String [] tsetContent = {"box", "dog", "help", "time", "ox", "map", "apple"};
        for (String t:tsetContent) {
            tset.add(t);
        }    
        System.out.println(tset);
        System.out.println(tset.first());
        System.out.println(tset.last());
        System.out.println("input a word");
        String st1 = keyboard.nextLine();
        if (tset.contains(st1)) {
            System.out.println(tset.tailSet(st1));
        }else {
            System.out.println("we do not have this word");
        }
    }
}
