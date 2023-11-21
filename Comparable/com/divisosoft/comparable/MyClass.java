package com.divisosoft.comparable;

public class MyClass implements Comparable<MyClass>
{
	private int age;
	
	public MyClass(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return age;
	}
	public String toString()
	{
		String toString = ""+age;
		return toString;
	}
	public int compareTo(MyClass my)
	{
		return Integer.compare(this.age,my.age);
	}
}