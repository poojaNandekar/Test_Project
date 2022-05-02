package package3;

public class MatrixArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][] a= {{1,2}, {3,4}};
int [][] b= {{5,6}, {7,8}};
int [][] sum=new int [2][2];
int i,j;
for(i=0;i<a.length;i++)
{
	 for(j=0; j<a[0].length; j++)
	{
		sum[i][j]=a[i][j]+b[i][j];
		
	}
}
System.out.println("The addition of two Matrix");
for(i=0; i<a.length; i++)
{
  for(j=0; j<a[0].length; j++)
	{
		System.out.format("%d \t",sum[i][j]);
	}
	System.out.println("");
}
	}

}
