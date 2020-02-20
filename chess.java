import java.util.*;
class chess{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the size of chess board ");
		int n=s.nextInt();
		int m=2*(n-1);
		System.out.println("Maximum number of bishops : "+ m);
	}
}
		
