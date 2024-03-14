public class methodp {
    static int logic(int a, int b){
        int c;
        if(a>b){
            c = (a+b);
        }
        else{
            c = (2*a+b)*5;
        }
        return c;
    }
    public static void main(String[]args){
        int x = 6;
        int y = 8;
        int z;
        z = logic( x,y);
        System.out.println(z);
    }
    
}
