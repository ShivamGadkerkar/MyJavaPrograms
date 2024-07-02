class Animal{
    
}
class Monkey extends Animal{
    
}
class Style{
    
     public void add(Animal a){
         System.out.println("Animal");
     } 
     
     public void add(Monkey m) {
         System.out.println("Monkey");
     }
}

public class Overload5{
        
        public static void main (String []args){
            Style s=new Style();
            
            Animal a= new Animal();
            
            Monkey m= new Monkey();
            
           Animal a1=new Monkey();
            
           // Monkey m1 = new Animal();
            
            s.add(a);   // a is taken because in above method i parameter class animal is been declared
            s.add(m);   // same as above
            
            s.add(a1);
            
           // s.add(m1);
        }   
}