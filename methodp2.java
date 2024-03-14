public class methodp2 {
    static int logic(int a ,int b){
        int c;
        if(a>b)
        {
            c = (a+b);
        }
        else{
            c = (2*a+b);
        }

        return c;
         
    }
    public static void main(String[]args){
        int x = 7;
        int y = 8;
        int z;
        z = logic(x,y);
        System.out.println(z);
    }

    
}
