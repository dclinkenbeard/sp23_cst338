package week03;

public class MyObject {
  String name;
  Integer count;

  public MyObject() {
    name = "Drew";
    count = 0;
  }

  @Override
  public String toString() {
    return "MyObject{" +
        "My name is ='" + name + '\'' +
        ", count=" + count +
        '}';
  }

  public static void main(String[] args) {
    MyObject o1 = new MyObject();
    System.out.println(o1);
  }

}
