import java.util.Scanner;

public class StringExample {

  public static void main(String[] args) {
    String message = greetMe();
    System.out.println(message);

    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    String personalized = forYou(name);
    System.out.println(personalized);
  }

  static String greetMe(){
    String myGreet = "Hello Developer!";
    return myGreet;
  }

  static String forYou(String name){
    String greetForYou = "Hello " + name;
    return greetForYou;
  }

}
