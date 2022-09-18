public class Hw4part1 {
    public static void main(String[] args) {
//1.1
        int n = 5;
        while (n > 0) {
            System.out.print(n-- + " ");
        }
        System.out.println();

//1.2
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 5);
        System.out.println();

//1.3.1
        for (int r = 1; r<=10; r++)
        {
            System.out.print(r +" ");
        }
        System.out.println();

//1.3.2
        for (int r = 10; r>=1; r--)
        {
            System.out.print(r +" ");
        }
        System.out.println();

//1.4
        String s = "Something";
        for (int d = 0; d< s.length(); d++){
            System.out.println(s.charAt(d));}
        System.out.println();

//1.5
        for (int k = 5; k>=1; k--) {
            for (int l =1; l<=k; l++){
                System.out.print(l);
            } System.out.println();

        }
    }
}



