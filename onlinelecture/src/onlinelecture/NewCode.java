package onlinelecture;


class A
{
	public void show()
	{
		System.out.println("in A");
	}
}
class B extends A
{
   
    public void show()
  {
	  
		System.out.println("in B");
  }
}
 class C extends A
 {   
	 public void show()
	 {
		 System.out.println("in C");
	 }
 }



public class NewCode {
   //   runtime & compile time
	public static void main(String[] args) 
	{ 
		A obj1 = new B();   //run time polymorphism 
		obj1.show();
		obj1 = new C();       //same ref n diff objects --- dynamic method dispatch
		obj1.show();
		 
	}
}

