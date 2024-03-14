//method calling using object creation method 
public class methodobj {
    int logic ( int a, int b){
        int c;
        if( a>b){
            c = (a+b);
        }
        else{
            c = (2*a+b);
        }
        return c;
    }
    public static void main(String[]args){
        int x = 3;
        int y = 8;
        int z;
        methodobj obj = new methodobj();
        z =  obj.logic ( x ,  y);
        System.out .println(z);
    }
}
