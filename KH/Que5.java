import java.util.*;  
class Que5   
{  
    public static void main(String a[])   
    {   
        System.out.print("Enter the value of x and y: ");  
        Scanner sc = new Scanner(System.in);  
       
        int x = sc.nextInt();  
        int y = sc.nextInt();  
        System.out.println("before swapping numbers: "+x +" "+ y);  
         
        x = x + y;   
        y = x - y;   
        x = x - y;   
        System.out.println("After swapping: "+x +"  " + y);   
    }   
}  