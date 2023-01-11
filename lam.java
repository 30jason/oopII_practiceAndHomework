import java.util.Arrays;
public class lam {
    public static void main (String [] args) throws Exception {
        String [] name = {"coook", "cook", "quinn", "app"};
        Arrays.sort(name, (str1, str2)->str1.compareToIgnoreCase(str2));
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        } 
    }
}