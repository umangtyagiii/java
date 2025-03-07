import java.util.*;
public class inheritance {
    public static void main(String [] args){
        wavy b1 = new wavy(2,3,4, 5);
        System.out.println(b1.l + " " + b1.h + " " + b1.w + " " + b1.p) ;
    }
}
class Box{
    int l;
    int h;
    int w;
    Box(int l, int h, int w){
        this.l = l;
        this.h = h;
        this.w = w;
    }
}
class wavy extends Box{
    int p;
    wavy(int l, int h, int w, int p){
        super(l, h, w);
        this.p = p;
    }
}

