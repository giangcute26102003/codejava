import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int a = sc.nextInt();
        System.out.println("nam "+a+" "+name+"toi ra doi ");
        char c =(char)(sc.next().charAt(0)+5);
        System.out.println(c);
        int b=5;
        int d=8;
        System.out.println(b>d);
    }
}
