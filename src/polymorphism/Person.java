package polymorphism;

public class Person {
	private String name;
	private int age;
	static String country = "CN";
	
	public void setName(String name) 
	{
		this.name=name;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setAge(int age) 
	{
		this.age=age;
	}
	
	public int getAge() 
	{
		return age;
	}
	
	
	public void show() 
	{
		System.out.println(country + name);
	}
	
	
	
	
	Person()
	{
		name = "baby";
		age = 1;
	}
	
	Person(String name)
	{
		this.name = name;
	}
	
	Person(String name, int age)
	{
		this(name);
		this.age = age;
	}
	
	Person(String name, int age, String country)
	{
		this(name);
		this.age = age;
		this.country = country;
	}
	public void speak() 
	{
		System.out.println("Name:" + this.name + "..." + "Age:" + this.age + "..."+"Country:"+ this.country);
	}
	
	public boolean compare(Person p) 
	{
//		if(this.age==p.age)
//			return true;
//		else
//			return false;
		return this.age==p.age;
		
	}
}
