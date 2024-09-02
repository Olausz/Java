import java.util.Scanner;
public class While {
    

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int valorX = sc.nextInt();
            for ( int i = 1; i <= valorX; i++) {
                if(1 % 2 != 0 && i > 1 && i < 1000) {
                    System.out.println(i);
                }
            }


        }
}
}
