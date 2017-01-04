public class CardTester{
  
  public static void main(String[]args){
    
    
    Card c = new Card();
    
    c.setColor("black");
    c.setSuit("spade");
    c.setRank('5');
    
    System.out.println(c.toString());
    
    Card c2 = new Card();
    
    c2.setColor("black");
    c2.setSuit("spade");
    c2.setRank('K');
    
    System.out.println(c2.toString());
    
    
    Card c3 = new Card();
    
    c3.setColor("black");
    c3.setSuit("spade");
    c3.setRank('T');
    
    System.out.println(c3.toString());
    
    
    Card c4 = new Card();
    
    c4.setColor("black");
    c4.setSuit("spade");
    c4.setRank('J');
    
    System.out.println(c4.toString());
    
    
    Card c5 = new Card();
    
    c5.setColor("black");
    c5.setSuit("spade");
    c5.setRank('Q');
    
    System.out.println(c5.toString());
    
    
    
    
    
    
    
    

  }
}