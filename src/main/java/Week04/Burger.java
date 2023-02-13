package Week04;
/**
 * @author Drew A. Clinkenbeard
 * @since 13 - Feb - 2023
 * This class is used to demonstrate inheritance and show that all burgers are sandwiches
 * but not all sandwiches are burgers.
 */
public class Burger extends Sandwich{

  public Burger() {
    this("Beef patty");
  }
  public Burger(String filling){
    super(2,filling);
  }
}
