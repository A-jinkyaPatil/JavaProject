//Prog to call inheritance and satic  method in another class.... same bcoz staic method hi parent class cha weles load hotye so same proce for another class madhe call karyala

public class MethodDemo1{
	public static void main (String [] args){
		MethodDemo b= new MethodDemo();
		b.add(5,20);
	}
}


public class Ex1 {
	
	 int a=500;
	 
	public void m1() {
		System.out.println("inside non static method m1");	
		System.out.println(a=50);
		int a1=100;
		m2();
	}
	
	public void m2() {
		System.out.println("inside non static method m2");
		System.out.println(a);
	}
	
	public static  void m3() {
		System.out.println("inside  static method m3");
	}
	
	public static void main(String[] args) {
		m3();
		Ex2.m3();
		Ex1 obj=new Ex1();
		
		obj.m1();
		
		
	}
	

}