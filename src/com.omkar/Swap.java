public class Swap {

  public static void main(String[] args) {
    int a = 10;
    int b = 20;

//    int temp = a;
//    a = b;
//    b = temp;

    //This is not working think about it
    swapnum(10, 20);

    System.out.println(a + " " + b);
  }

  static void swapnum(int a, int b){
    //Function scope
    int temp = a;
    a = b;
    b = temp;
  }
}
