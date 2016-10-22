package com.satyram.ds;
//playing with recursion
//few programming languages does not have iterations / loops so recursion was used then.
public class Recursion {
	//simple recursion example to print n to 1
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
	//recursion to find out factorial of a number
	public static int fact(int n){
		if(n==1)
			return 1;
		return n*fact(n-1);
	}
	//recursion to find sum of numbers from n to 1
	public static int sum(int n){
		if(n==0)
			return 0;
		return n+sum(n-1);
	}
	//recursion to find x power n
	public static int power(int x,int n){
		if(n==1)return x;
		return x*(power(x,n-1));
	}
	//recursion to find moves of law of bramha / towers of hanoii
	public static void hanoi(int n, char src,char aux,char dst){
		if(n==0)return;
		if(n==1){
			System.out.println(src+"->"+dst);
			return;
		}
		hanoi(n-1,src,dst,aux);
		System.out.println(src+"->"+dst);
		hanoi(n-1,aux,src,dst);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun1(5);
		System.out.println();
		System.out.println("factorial="+fact(5));
		System.out.println("sum="+sum(5));
		System.out.println("power="+power(2,4));
		System.out.println("Towers of Hanoi disk moves:");
		hanoi(3,'A','B','C');
	}

}
/*
 * OUTPUT:
5 4 3 2 1 
factorial=120
sum=15
power=16
Towers of Hanoi disk moves:
A->C
A->B
C->B
A->C
B->A
B->C
A->C
 */
