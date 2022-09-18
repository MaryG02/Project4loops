import java.util.Scanner;
public class hw4part2 {
    public static void main(String[] args) {
        Boolean bool = true;
        Scanner scan = new Scanner(System.in);
        while(bool) {
            System.out.println("Hello! Enter the world(s)");
            String word;
            word = scan.nextLine();
            System.out.println(word.toUpperCase());
            System.out.println("If you want to repeat, type anything, if you want to leave type leave");
            String con;
            con = scan.nextLine();
            if(con.equals("leave")){
                bool = false;
                System.out.println("Goodbye!");}
        }
    }
}
