public class mthoverloading {
    static void foo(){

    }
    static void foo (int x , int y){

    }
    static void foo (int x , int y , int z){

    }
    public static void main(String[]args){
        int x = 5;
        int y = 6;
        int z = 8;
        System.out.println(x+y);
        System.out.println("this is a methodoverloading");
        System.out.println("So we can see how method overloading works so the value of x+y+z is " +x + y + z);


    }
    
}
//we can see that this is a lenthy method so try to solve this problem by some another approach
//arguments are actual values in industry people use two words like parameter and arguments
//For solving this problem we use variable Arguments approach

