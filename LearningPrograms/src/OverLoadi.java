// 01/07/24
class Style{
    
    public void add(Object o){
        System.out.println("Style");
    }
    
    public void add(String s){
        System.out.println(s);
    }
}



 

public class OverLoadi{
    
    public static void main(String[]args){
        Style s=new Style();
        s.add("shiva");
        s.add(new Object());
        
    }
}