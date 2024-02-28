import java.util.Scanner;
public class Greatest {
       public static void main(String args[]){
  
      Scanner loot =new Scanner(System.in);
      int a=loot.nextInt();
      int b=loot.nextInt();
      int c=loot.nextInt();
      if(a>b &&a>c){
        System.out.println("A is greatest");
      }  
      if(b>a && b>c){
        System.out.println("B is greatest");
      }
      else{
        System.out.println("C is greatest");
      }
    
    }

    
}