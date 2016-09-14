import java.util.Scanner;

public class Average{

  //this is the main methodpublic
  //where the application startspublicpublic
  public static void main(String[] args){
    
    //these are exmples of data types
   Scanner input = new Scanner(System.in);
    
    /*int x = 3;
    double number = 3.0;
    String word = "lskjdlk!!";
    char letter = 'x';
    */
    System.out.println("Enter 3 numbers: ");
    double num1 = input.nextDouble();
    double num2 = input.nextDouble();
    double num3 = input.nextDouble();
    
    double addition = (num1 + num2 + num3);
      
      System.out.println("This is the addition" + addition);
      
  }
  
}