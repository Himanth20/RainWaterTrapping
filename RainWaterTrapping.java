import java.util.*;
public class RainingWaterTrapping1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int left[]=new int[n];
		left[0]=a[0];
		for(int i=1;i<n;i++)
		{
			if(left[i-1]<a[i])
			{
				left[i]=a[i];
			}
			else
			{
				left[i]=left[i-1];
			}
		}
		int right[]=new int[n];
		right[n-1]=a[n-1];
		for(int i=n-2;i>=0;i--)
		{
			if(right[i+1]<a[i])
			{
				right[i]=a[i];
			}
			else
			{
				right[i]=right[i+1];
			}
		}
		int w=0;
		for(int i=0;i<n;i++)
		{
			int small=0;
			if(left[i]<right[i])
			{
				small=left[i];
			}
			else
			{
				small=right[i];
			}
			w+=small-a[i];
		}
		System.out.println(w);
	}
}
