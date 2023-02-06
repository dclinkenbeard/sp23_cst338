package week03;

public class Answer {

  int value;

  public Answer() {
    value = 42;
  }

  public static void main(String[] args) {
    Answer answer = new Answer();
    Answer answer2 = new Answer();
//    System.out.println(answer.equals(answer2));

    String name = "Carol Danvers";
    String name2 = "Carol Danvers";
    System.out.println("comparing \"" + name + "\" to \"" + name2 + "\"");
    System.out.println(name.equals(name2));
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Answer answer = (Answer) o;

    return value == answer.value;
  }

  @Override
  public int hashCode() {
    return value;
  }
}
