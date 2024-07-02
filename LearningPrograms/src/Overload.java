// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// 01/07/24
 class Animal{
    public void add(){

        System.out.println("hello");
    }
    public void add(int x, float s){
        System.out.println(x+""+s);
    }
         static public void add(double f){
        System.out.println(f);
    
}
     public void add(int x ,String r){
        System.out.println("Shivam");
    }
} 
public class Overload{
    public static void main(String [] args){
        Animal a=new Animal();
        a.add(10.0);
        a.add(2 ,"raj");
      Animal.add(10.5)  ;
    }
}