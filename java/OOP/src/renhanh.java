import java.util.Scanner;
public class renhanh{
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 int a =sc.nextInt();
 if(a%2==0){
     System.out.println(a + "a is even number ");
 }
 else 
     System.out.println(a+ "a is odd number ");
 String name = sc.next();
 String name1 = sc.next();
 if(name.equals(name1)){
     System.out.println("giong nhau ");
 }
 else System.out.println("khac nhau ");
 int b = sc.nextInt();
 int c = sc.nextInt();
 int max=a;
 if(b> max ) max = b;
 if(c > max ) max =c;
 System.out.println(max);
}
}
 
