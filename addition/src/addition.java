import java.util.Scanner;
public class addition {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		int num1;
		int num2;
		int sum;
		
		System.out.print("enter the first num"  );
		num1=input.nextInt();
		
		System.out.print("enter the second num"  );
		num2=input.nextInt();
		
		sum =num1+num2;
		
		System.out.printf("sum is %d\n",sum);

	}

}
