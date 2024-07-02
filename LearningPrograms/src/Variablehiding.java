class Parent{
    String a="parent";          //whwtever datatype you declare the  ans will  be the same becuse this works  on reference Object//
}
class Child extends Parent{
 String a= "child";   
}
                    //this is nown as variable Variblehiding// 
                    
public class Variblehiding{
    
    public static void main (String[]args){
       
        Parent p=new Parent();
        System.out.println(p.a);
        
        Child c=new Child();
        System.out.println(c.a);
        
        Parent p1=new Child();
        System.out.println(p.a);
        
    }
    
}