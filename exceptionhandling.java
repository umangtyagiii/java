import java.util.*;
public class exceptionhandling {
    public static void main(String[] args) {
        int a = 5, b=0;
        
        try{
            int c = a/b;
            //arithmetic exception
            System.out.println(c);
        }

        //exceptionhandling
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        //you can also create your custom exceptions under exception class
    }
}
