package Week04;

/**
 * @author Drew A. Clinkenbeard
 * @since 13 - Feb - 2023
 * This class is used to demonstrate inheritance and show that all burgers are sandwiches
 * but not all sandwiches are burgers.
 */
public class Sandwich {
  private Integer slicesOfBread;
  private String filling;

  public Sandwich(Integer slicesOfBread, String filling) {
    this.slicesOfBread = slicesOfBread;
    this.filling = filling;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("This Sandwich has ");
    sb.append(filling);
    sb.append(" between ");
    sb.append(slicesOfBread);
    sb.append(" slices of bread.");
    return sb.toString();
  }
}

