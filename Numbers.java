import java.util.Scanner;//user input
class  Numbers
{
		public void mov()
		{
		System.out.println("Rainbow");
		}
		public static void move()
		{
				System.out.println("Water");
			}
			public static void main(String[]args)
	{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter number");
				int sa=sc.nextInt();//integer value
				if (sa==0)
				{
					System.out.println("no methods will be called");
				}
				else if (sa%2==0)//even number
				{
					Numbers bhavi=new Numbers();
					bhavi.mov();
				}
				else //odd number
		{
					move();
	}
	}
}
