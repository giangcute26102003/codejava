import java.util.Scanner;
public class xaukitu {
    public static void main (String[] args){ 
        Scanner sc = new Scanner(System.in);
        
        String s1= "heloo co ba ";
        String s2 = sc.next();
        int a = s1.length();
        System.out.print(a);
        for(int i =0;i<s2.length();i++){
            System.out.print(s2.charAt(i)+" ");
        }
        // so sanh 2 chuoi su dung "equals" 
     if(s1.equals(s2)) System.out.printf("2 xau bang nhau ");
     else System.out.print("2 xau khac nhau ");
     int sosanh = s1.compareTo(s2);
     System.out.print(sosanh);
    }
}