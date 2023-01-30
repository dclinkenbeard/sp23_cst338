package week02;

public class JavaTour {
  private int x;

  public JavaTour() {
    x = 23;
  }

  private void evaluateX(){
    if(x < 42){
      System.out.println("x is less than 42 ( x == " + x +" )");
    }else if(x > 42){
      System.out.println("x is greater than 42 ( x == " + x +" )");
    }
  }
}

