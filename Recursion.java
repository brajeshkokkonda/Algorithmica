package com.satyram.ds;
//playing with recursion
//few programming languages does not have iterations / loops so recursion was used then.
public class Recursion {
	public static void fun1(int n){
		if(n==0)
			return;
		else
		{
			System.out.print(n+" ");
			n=n-1;
			fun1(n);
		}
	}
	public static int fact(int n){
		if(n==1)
			return 1;
		return n*fact(n-1);
	}
	public static int sum(int n){
		if(n==0)
			return 0;
		return n+sum(n-1);
	}
	public static int power(int x,int n){
		if(n==1)return x;
		return x*(power(x,n-1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun1(5);
		System.out.println();
		System.out.println("factorial="+fact(5));
		System.out.println("sum="+sum(5));
		System.out.println("power="+power(2,4));
	}

}
