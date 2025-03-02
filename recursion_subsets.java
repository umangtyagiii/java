import java.util.*;
public class recursion_subsets {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = obj.next();
        subs("",str);
    }
    public static void subs(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subs(p+ch,up.substring(1));
        subs(p,up.substring(1));
    }
}
