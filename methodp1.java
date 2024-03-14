public class methodp1 {
    int logic (int a , int b ){
        int c;
        if(a>b){
            c = (7*a+b);
        }
        else{
            c = (9*a+8*b);
        }
        return c;
    }
    public static void main(String[]args){
        int a = 4;
        int b = 6;
        int c;
        methodp1 obj = new methodp1();
        c = obj.logic(a,b);

        
        System.out.println(c);
    }
    
}
