public class A{
    public static void main(String[] args){
        
        if(args.length<4){
            System.out.println("program required 4 arguments");
            return;
        }

        String name = args[0];
        String course = args[1];
        int roll = Integer.parseInt(args[2]);
        int sem = Integer.parseInt(args[3]);
            System.out.println("name - "+ name);
            System.out.println("course - "+ course);
            System.out.println("roll_no - "+ roll);
            System.out.println("semester - "+ sem);

    }
}
