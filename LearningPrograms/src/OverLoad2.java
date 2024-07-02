
class Style{
    
    public void add(int i){
        System.out.println("general method"+ ""+ i);
    }
    
    public void add(int...i){
        System.out.println("Varang method " + i);
    }
    
}
   
public class OverLoad2{
    public static void main(String [] args){
        
        Style s=new Style();
        s.add(1);
        
        s.add(2,4,5,6);
        s..add(null);
        
    }
}