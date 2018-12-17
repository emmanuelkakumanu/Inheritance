
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class A
{
	void fun1()
	{
		System.out.println("fun1 from class A is called");
	}
	void fun2()
	{
		System.out.println("fun2 from class A is called");
	}
	void print()
	{
		System.out.println("print method from class A is called(overridden method)");
	}
}
class B extends A
{
	void fun3()
	{
		System.out.println("fun3 from class B is called");
	}
	void fun4()
	{
		System.out.println("fun4 from class B is called");
	}
	void print()
	{
		System.out.println("print method from class B is called(overridden method)");
	}
}
class C extends B
{
	void fun5()
	{
		System.out.println("fun5 from class C is called");
	}
	void fun6()
	{
		System.out.println("fun6 from class C is called");
	}
	void print()
	{
		System.out.println("print method from class C is called(overridden method)");
	}
}
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		A objA=new A();
		B objB=new B();
		C objC=new C();
		objA.fun1();objA.fun2();
		objB.fun3();objB.fun4();
		objC.fun5();objC.fun6();
		objA.print();
		A obj1=new C();
		obj1.print();
		A obj2=new B();
		obj2.print();
	}
}
