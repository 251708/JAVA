
class worker{
        int id ;
        String name;
        //System.out.println("what are u want ");
        public void printdetails(){
            System.out.println("My id is very unique and that is "+ id);
            System.out.println("My name is urforgotable  so lets see my name  "+ name);

        }
    }
    public class customclass {
        public static void main(String[]args){
            
            worker sakshi = new worker(); //instantiating a new worker object
            worker shibbu = new worker();
            //setting properties
            sakshi.id = 5;
            sakshi.name = "gudiya";
            shibbu.id = 7;
            shibbu.name = "shreya";
            //System.out.println("hello i am ready to give the seminar");
            //System.out.println(sakshi.id);

        }
    

    
}
