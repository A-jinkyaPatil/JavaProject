/*
public class Array{
	public static void main(String[] args){
		int[] x = {13,19,11,18,21,7,25};
		for (int i=0; i<x.length; i++){ //to print reverse for (int i=x.length-1; i>=0; i--)
			System.out.print(x[i] +" ");
		}
	}
}
13 19 11 18 21 7 25

public class Array{
	public static void main(String[] args){
		int[][] x = {{2,3,5,},{9,8,7,},{6,5,4}};
		for (int i=0; i<x.length; i++){  // to print no in reverse for (int i=x.length-1; i>=0; i--)
			for (int j=0; j<x[i].length; j++){ //for (int j=x[i].length-1; j>=0; j--)
			System.out.print(x[i][j] +" ");  // o/p 4 5 6 7 8 9 5 3 2
			}
		}
	}
}
2 3 5 9 8 7 6 5 4

//Program for adding all variable
public class Array{
	public static void main(String[] args){
		int Temp = 0;
		int[] x = {13,19,11,18,21,7,25};
		for (int i=0; i<x.length; i++){
			Temp = Temp+x[i];
		}System.out.print(Temp +" ");
	}
}
114

public class Array{
	public static void main(String[] args){
		int[][] x = {{2,3,5,},{9,8,7,},{6,5,4}};
		int Temp=0;
		for (int i=0; i<x.length; i++){  
			for (int j=0; j<x[i].length; j++){ 
			Temp = Temp+x[i][j];  
			}
		}System.out.print(Temp +" ");
	}
}
49

// to print duplicate no

public class Array{ 
	public static void main(String[] args){
		int n = 1;
		int[] x = {13,21,19,11,7,18,21,7,7,13,25};
		for (int i=0; i<x.length-1;i++){
			for (int j = i+1; j<x.length; j++){
			    if (x[i]==x[j])
			    System.out.print(x[j] +" ");
			
			} 
		}
	}
}


// to print array in ascending order and find second largest no
public class Array{
	public static void main(String[] args){
		int[] x = {13,9,11,18,21,7,25};
		int Temp=0;
		int Swapping=0;
		do{
			Swapping=0;
		   for (int i=0; i<x.length-1; i++){ 
           		
			   if(x[i]>x[i+1]){
				   Temp = x[i+1];
			       x[i+1]=x[i];
			       x[i]=Temp;
				    Swapping++;
			    }
		    }
	    }          while (Swapping !=0);
				          System.out.println();
				   System.out.print("print array in ascending order :");
				   for (int i=0; i<x.length; i++){
					     System.out.print( x[i] + " ");
				   }
				   System.out.println();
				   System.out.println("Second greatest number of Array is : " +x[x.length-2]);
				   
	}
 }
 */
import java.util.Scanner;  
public class Array{  
      public static void main(String[] args){  
         int n;  
         Scanner sc=new Scanner(System.in);  
         System.out.print("Enter the number of elements you want to store: ");  
         n=sc.nextInt();    
         int[] array = new int[10];  
         System.out.println("Enter the elements of the array: ");  
         for(int i=0; i<n; i++){    
             array[i]=sc.nextInt();  
            }  
           System.out.println("Array elements are: ");    
              for (int i=n-1; i>=0; i--){  
                  System.out.println(array[i]);  
				}  
        }   
    }  