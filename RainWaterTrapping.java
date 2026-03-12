
//Brute force Method


import java.util.*;
public class RainingWaterTrapping {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int w=0;
		for(int i=0;i<n;i++)
		{
			int leftMax=a[0];
			for(int j=1;j<i;j++)
			{
				if(a[j]>leftMax)
				{
					leftMax=a[j];
				}
			}
			int rightMax=0;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]>rightMax)
				{
					rightMax=a[j];
				}
			}
			if(leftMax<rightMax)
			{
				if(leftMax>a[i])
				{
					w+=leftMax-a[i];
				}
			}
			else
			{
				if(rightMax>a[i])
				{
					w+=rightMax-a[i];
				}
			}
		}
		System.out.println(w);
	}

}

