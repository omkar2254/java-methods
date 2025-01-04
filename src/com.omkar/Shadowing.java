public class Shadowing {
  static int x = 20; //this x will shadow at line no 6
  static int c = 20;
  public static void main(String[] args){
    System.out.println(x);//20
    int x = 40;
    System.out.println(x);//40

    int c;
    //System.out.println(c); //scope will begin when value is intialized
    c = 40;
    fun();
  }
  static void fun(){
    System.out.println(x);
  }

}
