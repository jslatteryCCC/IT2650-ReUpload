
/**
 * TestCup class. Client code that uses the Cup class.
 * 
 * @author (ITMP 2650 Spring 2020) 
 * @version (3/4/2020)
 */
public class TestCup
{
   
    public static void main(String[] args)
    {
        Cup one = new Cup();
        System.out.println("Cup one:\n" + one);
        
        one.set(10, "white", "ceramic");
        System.out.println("Cup one after change:\n" + one);
         
        Cup two = new Cup(one);  //Test the copy constructor
        System.out.println("Cup two:\n" + two);
        
        if( one.equals(two))
          System.out.println("These cups are equal!");
        else
          System.out.println("These cups are not equal!");
          
       two.set(8, "white", "foam");
       System.out.println("Cup two after change:\n" + two);
    }
}
