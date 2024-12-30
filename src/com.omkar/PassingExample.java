public class PassingExample {

  public static void main(String[] args) {
    String name = "Hulk";
    greet(name);

    //Pass by copy of the value of the reference variable
    changeName(name);
    System.out.println(name);
  }

  static void greet(String name){
    System.out.println("Hello "+name);
  }

  static void changeName(String naam){
    //It will not change original value
    naam = "Iron Man";
  }
}
