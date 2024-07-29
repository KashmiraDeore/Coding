import java.util.*;
public class Palindrome 
{  
   public static void main(String[] args) 
   {  
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the number: ");  
       int num=sc.nextInt();
       int r,sum=0;
       int x=num;    
       while(num>0)
       {    
       r=num%10;    
       sum=(sum*10)+r;    
       num=num/10;    
       }    
        if(x==sum)    
        System.out.println("The entered number "+x+" is a palindrome number ");    
        else    
        System.out.println("The entered number "+x+" is not a palindrome");    
  }  
} 