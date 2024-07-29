import java.util.Scanner;

public class Que10 {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num : ");
        int num = sc.nextInt();

        String s = Integer.toString(num);
        for(int i = 0; i< s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }
}