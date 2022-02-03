// Prog to call inheritance method in same class
/*
public class MethodDemo{
	public void add(int x, int y,){
		int r = x+y;
		System.out.println();
		System.out.println("Hello Ajinkya");
		System.out.print("Addition is : "+r);
	}
	public static void main (String [] args){
		MethodDemo a= new MethodDemo();
		a.add(5,6);
	}
}

// Prog to call static method in same class
public class MethodDemo{
	public static void add(int x, int y){
		int r = x+y;
		System.out.println();
		System.out.println("Hello Ajinkya");
		System.out.print("Addition is : "+r);
	}
	public static void main (String [] args){
		
		add(5,6);
	}
}
// same prog by taking user input
*/
import java.util.Scanner;
public class MethodDemo{
	public void add(int x, int y){
		int r = x+y;
		System.out.println();
		System.out.println("Hello Ajinkya");
		System.out.print("Addition is : "+r);
	}
	     public static void main (String [] args){
		      int user; 
			  int user2;
		      Scanner sc = new Scanner(System.in);
			  System.out.println("Enter the number : "); 
		      user=sc.nextInt();
			   System.out.println("Your Enterd no is: "+user); 
			  Scanner vp = new Scanner(System.in);
			  System.out.println("Enter the number 2 : "); 
		      user2=vp.nextInt();
		      MethodDemo a= new MethodDemo();
		      a.add(user,user2);
	        }
}