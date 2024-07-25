import java.util.*;
class sumarr
{
	public static void main(String args[])
	{
		int arr[]=new int[50];
		int sum=0;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array:");
		int n=s1.nextInt();
		System.out.println("Enter the "+n+"elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=s1.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			 sum=sum+arr[i];
		}
		System.out.println("The sum of elements of the array are:"+sum);
		s1.close();
	}
}
			
