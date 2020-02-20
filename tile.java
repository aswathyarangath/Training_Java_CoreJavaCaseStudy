import java.util.*;
class tile{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the length and breadth : ");
	int l=s.nextInt();
	int b=s.nextInt();
	int rem=0,n=0;
	if((l%8==0)&&(b%8!=0)){
		rem=l/8;
	}
	else if((l%8!=0)&&(b%8==0)){
		rem=b/8;
	}
	else if((l%8!=0)&&(b%8!=0)){
		rem=(l/8)+(b/8)+1;
	}
	else
		rem=0;
	n=(l/8)*(b/8);
	System.out.println("The number of tiles used " + n +"  remaining tiles  "+ rem);
	}
}
		