class Add
{
	static int add(int a,int b) 
	{
		return a+b;
	
	}
  static int add(int a, int b, int c) 
  {
	 return a+b+c;
	}
}
class TestOverloading 
 {
	 public static void main (String args[]) 
	{
		
		System.out.println(Add.add(11, 11));
		System.out.println(Add.add(11,11,11));
	}

}