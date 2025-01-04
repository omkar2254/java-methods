public class Overloading {
  public static void main(String[] args){
    fun(3);
    fun(29, 2);
  }

  static void fun(int a){
    System.out.println(a);
  }

  static void fun(int a, int b){
    System.out.println(a + b);
  }
}
