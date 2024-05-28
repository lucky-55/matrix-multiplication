import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int r1,r2,c1,c2;
		Scanner input=new Scanner(System.in);
		System.out.println("enter r1,c1 and r2,c2 of matrices:");
	    r1=input.nextInt();
	    c1=input.nextInt();
		r2=input.nextInt();
		c2=input.nextInt();
		int[][] a=new int[r1][c1];
		int[][] b=new int[r2][c2];
		int[][] c=new int[r1][c2];
		if(c1==r2)
		{
		System.out.println("enter the elements of 1st matrices row wise \n");
		for(int i=0;i<r1;i++)
		{
		    for(int j=0;j<c1;j++)
		    {
		        a[i][j]=input.nextInt();
		    }
		}
		System.out.println("enter the elements of 2nd matrix row wise \n");
		for(int i=0;i<r2;i++)
		{
		    for(int j=0;j<c2;j++)
		    {
		        b[i][j]=input.nextInt();
		    }
		}
		System.out.println("Multiplying the matrices...");
		for(int i=0;i<r1;i++)
		{
		    for(int j=0;j<c2;j++)
		    {
		        for(int k=0;k<r2;k++)
		        {
		            c[i][j]=c[i][j]+a[i][k]*b[k][j];
		        }
		    }
		}
		System.out.println("the product is:");
		for(int i=0;i<r1;i++)
		{
		    for(int j=0;j<c2;j++)
		    {
		        System.out.print(c[i][j]+" ");
		    }
		    System.out.println();
		}
		}
		else{
		    System.out.println("matrix multiply is not possible");
		}
		input.close();
	}
}

		
		
		
		    
		
		      
		    
		
		
		
		
	


