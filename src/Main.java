import java.util.Scanner;

/**
 * Created by KPS on 7/10/2020.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number");
        int seconds = scanner.nextInt();
        int a , b , c;
        a = seconds%60;
        b = seconds/60;
        c = b%60;
        b = b/60;
        System.out.println(b +" "+c+ " "+a);

    }
}
