package package3;

public class FunctionJava {

	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		FunctionJava obj=new FunctionJava();
		double total=obj.add(10,20.80);
		System.out.println("Sum of two numbers are " +total);
		total=obj.add(90,70.90);
		System.out.println("Sum of two numbers are " +total);
			}
			double add(int x,double y)
			{
				double sum=x+y;
				return(sum);
			}
}
