class Animal{
	
	public void test() {
		System.out.println("Best");
		
	}
	public void test(int i) {
		System.out.println(i);
	}
	public void test(float f) {
		System.out.println("hello");
	}
	
}
public class Overloading {
	
	public static void main(String args[]) {
		Animal a=new Animal();
		a.test(10.5f);		
	}
}
