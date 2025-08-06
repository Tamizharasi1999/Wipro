

public class PrintMessage {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please enter two command line args");
            return;
        }
        String s1 = args[0];
        String s2  = args[1];
        System.out.println(s1+s2);
    }

}
