class Style{
     
     public void add(int a,float f ){
         System.out.println(a+""+f);
         
     }
     public void add( float f, int a){
         System.out.println(a+""+f);
     }
    public int add( int i){
        System.out.println(i);
        return 0;
    }
    
}

public class Overload3{
       
       public static void main(String[]args){
           Style s=new Style();
           s.add(10,10.5f);
           s.add(5);
           s.add(10.5f,10);
         //  s.add(10,10);  // compile time error   because both the method case its promoted
        //    s.add(10.6f,10.6f);   this is ce bcz this cant be promoted 
       }    
}