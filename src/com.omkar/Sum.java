import java.util.Scanner;

/* Syntax:
  return_type name(arguments){
     body
     return statement;
  }
   */
//Basic example
public class Sum {
  public static void main(String[] args){
    sum();

    //return someting
    int sum = sum2();
    System.out.println(sum);

    //arguments
    int total = sum3(5, 5);
    System.out.println(total);
  }

  static void sum(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter num one: ");
    int num1 = sc.nextInt();
    System.out.println("Enter num two: ");
    int num2 = sc.nextInt();
    int sum = num1 + num2;
    System.out.println(sum);
  }

  static int sum2(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter num one: ");
    int num1 = sc.nextInt();
    System.out.println("Enter num two: ");
    int num2 = sc.nextInt();
    int sum = num1 + num2;
    return sum;
  }

  //passing the value while calling
  static int sum3(int a, int b){
    int sum = a + b;
    return sum;
  }

}
