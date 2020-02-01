import java.util.Scanner ;
class a
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number 1(0-9)");
		int num1=input.nextInt();
		if(num1>9)
		{
			System.out.println("1st number greater than 9 Enter again");
			num1=input.nextInt();
		}
		System.out.println("Enter number 2(0-9)");
		int num2=input.nextInt();
		if(num2>9)
		{
			System.out.println("2nd number greater than 9 Enter again");
			num2=input.nextInt();
		}
		System.out.println("Enter number 3(0-9)");
		int num3=input.nextInt();
		if(num1>9)
		{
			System.out.println("3rd number greater than 9 Enter again");
			num3=input.nextInt();
		}
		System.out.println(String.valueOf(num1)+String.valueOf(num2)+String.valueOf(num3));
		System.out.println(String.valueOf(num1)+String.valueOf(num3)+String.valueOf(num2));
		System.out.println(String.valueOf(num2)+String.valueOf(num1)+String.valueOf(num3));
		System.out.println(String.valueOf(num2)+String.valueOf(num3)+String.valueOf(num1));
		System.out.println(String.valueOf(num3)+String.valueOf(num2)+String.valueOf(num1));
		System.out.println(String.valueOf(num3)+String.valueOf(num1)+String.valueOf(num2));
		
	}
}