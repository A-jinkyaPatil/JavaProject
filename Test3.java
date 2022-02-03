//concept of static and Instance vairable
/*
public class Test3{
	 int x = 20;// 
	public static void main(String[] args){
		Test3 t = new Test3();// new object created
		Test3 s = new Test3();
		Test3 y = new Test3();
		s.x = t.x+5;
		t.x = s.x+5;
		System.out.println("value of t.x: "+t.x);//30
	    System.out.println("value of s.x: "+s.x);//25
		System.out.println("value of y.x: "+y.x);//20
	}

}
		
public class Test3{
	static int x = 20;// static variable, ekda change saglyane tye canges disnar
	public static void main(String[] args){
		Test3 t = new Test3();
		Test3 s = new Test3();
		Test3 y = new Test3();
		s.x = t.x+5;
		t.x = s.x+5;
		System.out.println("value of t.x: "+t.x);//30
	    System.out.println("value of s.x: "+s.x);//30
		System.out.println("value of y.x: "y.x);//30
	}

}
		*/
		//static varialble is loaded in memory si it got printed 
		
		public class Test3{
			
	static int x = 20;// static variable, ekda change saglyane tye canges disnar
	public static void main(String[] args){
		int s;
		int t;
		s = x+5;
		x= s+5;
		System.out.println("value of s: "+s);//30
	    System.out.println("value of s: "+s);//30
		System.out.println("value of x: "+x);//30
	}

}