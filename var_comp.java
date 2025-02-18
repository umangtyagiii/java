
public class var_comp {
    static int a = 10;
    void fun()
    {
        int b = 20;
        System.out.println(a+" "+b);
        ++a; ++b; 
    }
    public static void main(String[] args) 
    {
        var_comp ref = new var_comp();
        ref.fun();
        ref.fun();
    }
}
