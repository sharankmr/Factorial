import java.util.*;
public class Factorial {
	 static int factorial (int a){
		if(a==1)
			return 1;
		else
			return(a*factorial(a-1));
	}

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter the number ");
		int a=Scan.nextInt();
		System.out.println("Factorial no :"+factorial(a));
	}
}
