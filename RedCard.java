public class RedCard extends Card{
  
  private String color;
  

  //zero-argumanet default contructor
  public RedCard(){
    color = "red";
    
  }
  public String toString(){
    return super.toString() + " " + color;
  }
}//end of class