public class recursion {
    static int  factorial(int n ){
        
        if(n == 0||n==1){
            return 1;

        }
    else{
       // return n*factorial(n-1);
       //this is the another method of finding the factorial
       int product = 1;
       for (int i = 1; i<=n; i++){
        product *= i;
       }
       return product;
    }
}
    public static void main(String[]args){
        int n = 5;
        System.out.println("the value of factorial 5 is "+ factorial(n));
    }
    }
    

