import java.util.Scanner;
public class if_statements {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter value:");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        obj.close();
        if(a>=18){
            System.out.println("adult");
        } // simple if statements


        if(a>0){
            System.out.println("born");
        }
        else{
            System.out.println("not born");
        } // if else statements

        if(a>=18){
            System.out.println("adult");
        }
        else if(a>=10){
            System.out.println("child");
        }
        else if(a>=5){
            System.out.println("kid");
        }
        else if(a>0){
            System.out.println("born");
        }
        else{
            System.out.println("not born");
        } //if else ladder

        if(a<18){
            System.out.println("not adult");
            if(a>=10){
                System.out.println("but child");
            }
            else{
                System.out.println("not child");
            }
        } // nested if else
    }
}
