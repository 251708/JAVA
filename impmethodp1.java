public class impmethodp1 {
    static void change2(int []arr){
        arr[0] = 90;


    }
    public static void main(String[]args){
        int[] marks = { 45, 67, 34, 23, 13};
        change2(marks);
        System.out.println("the value of marks after changing is something like that "+ marks[0]);
    }
    
}
