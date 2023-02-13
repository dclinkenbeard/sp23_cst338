package Week04;

/**
 * @author Drew A. Clinkenbeard
 * @since 13 - Feb - 2023 This class is used to demonstrate inheritance and show that all burgers
 * are sandwiches but not all sandwiches are burgers.
 */

import java.util.HashMap;

public class Sandwich {

  private Integer slicesOfBread;
  private HashMap<String, Integer> fillings;

  public Sandwich(Integer slicesOfBread, HashMap<String, Integer> fillings) {
    this.slicesOfBread = slicesOfBread;
    this.fillings = fillings;
  }

  public Sandwich(Integer bread, String filling) {
    this.slicesOfBread = bread;
    HashMap<String, Integer> hashmap = new HashMap<>();
    hashmap.put(filling, 1);
    this.fillings = hashmap;

  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    if (slicesOfBread > 1) {
      sb.append("bread\n");
    }
    for (String key : fillings.keySet()) {
      for (int i = fillings.get(key); i > 0; i--) {
        sb.append(key);
        sb.append("\n");
      }
    }
    sb.append("bread\n");
    return sb.toString();
  }
}

