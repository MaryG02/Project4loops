import java.util.Scanner;
public class hw4part3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
        String str2 = "";
        char ch;
        String name;
        Boolean bool = true;
        String con;
        System.out.println("Hello, enter your name, please");
        name = scan.nextLine();
        while (bool) {
            System.out.println("Enter your word");
            str = scan.nextLine();
            for (int i = 0; i < str.length(); i++) {
                ch = str.charAt(i);
                str2 = ch + str2; //adds character in front of the string
            }
            System.out.println(str2);
            str2 = " ";
            System.out.println(name + ", if you want to repeat, type anything, if you want to leave type leave");
            con = scan.nextLine();
            if(con.equals("leave")){
                bool = false;
                System.out.println("Goodbye!");}

        }
    }
}
