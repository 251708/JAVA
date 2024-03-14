public class impmethod {
    static void change1(int a){
        a = 98;
    }
        static void change2(int []arr){
            arr[0] = 48;
        }
    
public static void main(String[]args){
    
    //Case 1: changing the integer 
    /*int x = 45;
    change(x);
    System.out.println("The value after change is "+ x);*/

    //Case 2 : Changing the array

    int [] marks = {34,56, 67,78,89};
    change2(marks);
    System.out.println("the value of x after changing the value is "+ marks[0]);

}
    
}
