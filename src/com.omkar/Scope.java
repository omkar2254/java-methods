public class Scope {

  public static void main(String[] args) {
    int a = 10;
    int b = 93;
    {
     // int a = 20; //already intialized outside the block
      a = 20; //we can modify it
      System.out.println(a);
      int c = 29;
      //values intialized in this block, will remain in block
    }
  }
  static void random(){
    int num =20;
    System.out.println(num);
  }
}
