/*
public class Patterns{
	public static void main(String[] args){
		for(int i=1; i<=4; i++){ // for row
			for(int j=1; j<=5; j++){ // for coloum
				System.out.print("*");
			}System.out.println( );
		}
	}
}// output
*****
*****
*****
*****

public class Patterns{
	public static void main(String[] args){
		for(int i=1; i<=4; i++){
			for(int j=1; j<=5; j++){
				if(i==1 || j==1 || i==4 || j==5){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println(" ");
		}
	}
}// output for Hollow rectangle prog
*****
*   *
*   *
*****

public class Patterns{
	public static void main(String[] args){
		for(int i=1; i<=4;i++){
			for(int j=1; j<=i; j++){ // inner loop cha limit = i(row)|| for(int j=5-i; j<=4; j++)
				System.out.print("*");
			}System.out.println(" ");
	    }	
	}
}
*
**
***
****

public class Patterns{
	public static void main(String[] args){
		for(int i=1; i<=4;i++){
			for(int j=i; j<=4; j++){ 
			System.out.print("*");
			}System.out.println(" ");
	    }	
	}
}
****
***
**
*

public class Patterns{
	public static void main(String[] args){
		for(int i=1; i<=4;i++){
			for(int j=0; j<=i; j++){
				System.out.print(j+" ");
			}System.out.println(" ");
		}
	}
}
1
1 2
1 2 3
1 2 3 4

public class Patterns{
	public static void main(String[] args){
		int result=0;
		for(int i=1; i<=4;i++){
			for(int j=1; j<=i; j++){
				result = result+1;
				System.out.print(result+" ");
			}System.out.println(" ");
			
		}
	}
}
1
2 3
4 5 6
7 8 9 10

public class Patterns{
	public static void main(String[] args){
		int n = 4;
		for(int i=1; i<=n;i++){
			for(int j=1; j<=i; j++){ 
				System.out.print("*");
			}
	    
            int space = 2*(n-i); // main logic for space
			for(int j=1; j<=space;j++){
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){ 
			System.out.print("*");
			}System.out.println(" ");
		}
		for(int i=1; i<=n;i++){
			for(int j=i; j<=n; j++){ 
				System.out.print("*");
			}
			int space = 2*(n-i);
			for(int j=n+1; j>=space;j--){
				System.out.print(" ");
			}
			for(int j=i; j<=n; j++){ 
				System.out.print("*");
			}System.out.println(" ");
	    }	
    }
}
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *


public class Patterns{
	public static void main(String[] args){
		int n = 5;
		for(int i=1; i<=n;i++){
			for(int space=n-i; space>=1; ){ // > < check this sign if error is for infinite
				System.out.print(" ");
				space--;
			} for(int j=1; j<=n; j++){
				System.out.print("*");
			}System.out.println(" ");
				
			  
		}
	}
}
    *****
   *****
  *****
 *****
*****

public class Patterns{
	public static void main(String[] args){
		int result=0;
		for(int i=1; i<=5;i++){
			for(int j=1; j<=i; j++){
				
				System.out.print(i+" ");
			}System.out.println(" ");
			
		}
	}
}
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

public class Patterns{
	public static void main(String[] args){
		int n = 5;
		for(int i=1; i<=n;i++){
			for(int space=n-i; space>=1; ){
				System.out.print(" ");
				space--;
			} for(int j=1; j<=i; j++){
				System.out.print(i+" ");// i
			}System.out.println(" ");
				
			  
		}
	}
}
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

public class Patterns{
	public static void main(String[] args){
		int n = 5;
		int result=0;
		for(int i=1; i<=n;i++){
			for(int space=n-i; space>=1; ){
				System.out.print(" ");
				space--;
			} for(int j=i; j>=1; j--){
					System.out.print(j);
				}for(int j=2; j<=i; j++){
					System.out.print(j);
				  }System.out.println(" ");
	    } 
	}
}
    1
   212
  32123
 4321234
543212345

public class Patterns{
	public static void main(String[] args){
		Char n = ;
		for(char i='a'; i<='e';i++){
			for(int space=n-i; space>=1; ){
				System.out.print(" ");
				space--;
			} for(int j=1; j<=i; j++){
				System.out.print(i+" ");// i
			}System.out.println(" ");
				
			  
		}
	}
}

public class Patterns{
	public static void main(String[] args){
		int n = 5;
		for(int i=1; i<=n;i++){
			for(int space=n-i; space>=1; ){
				System.out.print(" ");
				space--;
			} for(int j=1; j<=i; j++){
				System.out.print("*");
			}for(int j=2; j<i+1; j++){
				System.out.print("*");
			
			}
			
			
			
			System.out.println(" ");
				
			  
		}
	}
}
    *
   ***
  *****
 *******
*********


public class Patterns{
	public static void main(String[] args){
		for(int i=1; i<=5;i++){
			for(int j=1; j<=9; j++){
				if((i+j==6) || (j-i==4) ||(i==3&&j==4) ||(i==3&&j==5) ||(i==3&&j==6)){
				      System.out.print("*");
				}
				  else {
					   System.out.print(" ");
				    }    
			}System.out.println(" ");
			
		}
	}
}// Hard coding

    *
   * *
  *****
 *     *
*       *


public class Patterns{
	public static void main(String[] args){
		int n = 10;
		for(int i=1; i<=n;i++){
			for(int space=n; space>=i; ){
				System.out.print(" ");
				space--;
				
			}	if(i==6) {
					for(int k=0; k<5;k++){
							System.out.print("* ");
					}
				}
			 for(int j=1; j<=i; j++){
				if((j==1) || (j==i)){
				System.out.print("* ");
				}
				else{
					System.out.print("  ");
				
				}
			}System.out.println(" ");
				
			  
		}
	}
}
          *
         * *
        *   *
       *     *
      *       *
     * * * * * *         *
    *           *
   *             *
  *               *
 *                 *
 
 
public class Patterns{
	public static void main (String [] args){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int space=n; space>=i;space--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
     *
    * *
   * * *
  * * * *
 * * * * *
 

public class Patterns{
	public static void main (String [] args){
		int n=5;
		char ch='a';
		for(int i=1;i<=n;i++){
			for(int space=n; space>=i;space--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				
				System.out.print(ch+" ");// 2st case ch++; yaat khali asla tar
			}
			System.out.println();
			ch++;
		}
	}
}  
     a                    
    b b
   c c c
  d d d d
 e e e e e
     a
    b c
   d e f
  g h i j
 k l m n o
 
     *
    * *
   * * *
  * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
 */
public class Patterns{
	public static void main (String [] args){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int space=n; space>i;space--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				
				System.out.print("* ");
			}
			System.out.println();
		
		}
		for(int line=1;line<=4;line++){
			for(int pace=1; pace<=line;pace++){
				System.out.print(" ");
			}
			for(int k=line;k<=4;k++){
				
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}
} 
