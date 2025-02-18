
/**
 * variables
 */
public class variables {
    static int b = 20; //static
    int c = 30; //instance
    public static void main(String[] args) {
        int a = 10; //local
        variables ref = new variables();
        System.out.println(a);
        System.out.println(variables.b);
        System.out.println(ref.c);
    }
}