public class A{
    public static void main(String[] args){
        
        if(args.length<4){
            System.out.println("program required 4 arguments");
            return;
        }
            System.out.println("name - "+ args[0]);
            System.out.println("course - "+ args[1]);
            System.out.println("roll_no - "+ args[2]);
            System.out.println("semester - "+ args[3]);

    }
}