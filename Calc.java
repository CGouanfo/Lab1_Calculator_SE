import java.util.Scanner;
public class Calc{
  
  public static void main(String[] args){
    
    if(args[0].equalsIgnoreCase("add")){
      double one = Double.parseDouble(args[1]);
      double two = Double.parseDouble(args[2]);
      System.out.println(one+two);
    }
    
    
    else if(args[0].equalsIgnoreCase("subtract")){
      double one = Double.parseDouble(args[1]);
      double two = Double.parseDouble(args[2]);
      System.out.println(one-two);
    }
    
    if(args[0].equalsIgnoreCase("multiply")){
      double one = Double.parseDouble(args[1]);
      double two = Double.parseDouble(args[2]);
      System.out.println(one*two);
      
    }
    
    if(args[0].equalsIgnoreCase("devide")){
      double one = Double.parseDouble(args[1]);
      double two = Double.parseDouble(args[2]);
      System.out.println(one/two);
      
    }
  }
}