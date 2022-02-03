// upper case String, System, Test --> all capitals stated words are class 
/*
public class Test{
	 public static void main(String[] args){
		 int x = 5;
		 int result = x+3;
		 System.out.println("The Addition is " +result); 
	 }
} 

public class Test{
	public static void main(String[] args){
		 long b = 4587890209l; // notes --> same for float--> f
		 System.out.println("Value of long: "+b);
	 }
}
		
public class Test{
	public static void main(String[] args){
		char x = '7';
		int r = x+3; //--> result must be 10 but it will shows 58 as it has taken 7 value which is predefine in unicode as 55 
		System.out.println("Addition of 7+3 is : "+r);
	}
}		
		 
public class Test{
	public static void main(String[] args){
		char c = 97;
		System.out.println("value of c: "+c);
	}
}

public class Test{
		public static void main(String[] args){
		int i =48;		
		char c = (char)i; // explicit type casting 
		System.out.println("value 48 in unicode is: "+c);	
		}

}
*/
public class Test{
	 int x = 20;// ststic varialable
	public static void main(String[] args){
		Test t = new Test();
		Test s = new Test();
		Test y = new Test();
		s.x = t.x+5;
		t.x = s.x+5;
		System.out.println(t.x);
	
	}

}
		
		