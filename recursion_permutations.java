import java.util.*;
public class recursion_permutations {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = obj.next();
        perm("",str);
    }
    public static void perm(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int j=0; j<=p.length(); j++){
            String x = p.substring(0,j);
            String y = p.substring(j,p.length());
            perm(x+ch+y, up.substring(1));
        }
        
    }
} 
