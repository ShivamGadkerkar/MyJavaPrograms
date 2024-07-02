class Parent{
    
    public void money(){
        System.out.println("cash+gold+property");
    }
    public void  marry(){
        System.out.println("Anu+ priya");
    }
}
class Child extends Parent{
    public void marry(){
        System.out.println(" tina");
    }
}


public class Overrinding{
    public static void main(String []args){
        Overrinding o=new Overrinding();
        Parent p= new Parent();
        Child c=new Child();
        p.money();
        p.marry();
        c.marry();
        
        
    }
}