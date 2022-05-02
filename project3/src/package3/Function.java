package package3;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function obj=new Function();
		obj.add (10,20);// function calling
		System.out.println("After function execution back to main");
		obj.add(90,20);
			}
		void add (int x, int y)
		{
			int sum=x+y;
			System.out.println("sum of two numbers are"+sum);
			

	}

}
