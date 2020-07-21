package task_3.maven;
import java.util.*;
import java.io.*;

public class Newyear
{
	Scanner sc = new Scanner(System.in);
	int a,b,c=0;
	public void  Chocolates()
	{
		System.out.println("Enter how many chocolates:");
		a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			System.out.println("Enter"+i+"chocolate weight");
			b=sc.nextInt();
			c=c+b;
		}
		System.out.println("Weight of chocolates is:"+c);	
	}
	public void  Chocolates(int i)
	{
		System.out.println("The order of chocolates:");
		int c=sc.nextInt();
		int d=sc.nextInt();
		System.out.println(c+"to"+d);
	}
//	public abstract class Candles()
//	{
//		abstract void candlecount();
//	}	
	public class Abc extends Candles()
	{
		void candlecount()
		{
			System.out.println("Enter count of candles:");
			int e=sc.nextInt();
			System.out.println("There are"+e+"candlesin the bag");
		}	
	}
	public static void main(String[] args)
	{
//		Scanner sc=new Scanner(System.in);
		
		Newyear ac=new Newyear();
		Abc obj=new Abc();
		ac.Chocolates();
		ac.Chocolates(5);
		obj.candlecount();
	}
}



