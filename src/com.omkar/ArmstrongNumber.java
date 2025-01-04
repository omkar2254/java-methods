import java.util.Scanner;

public class ArmstrongNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
//    boolean ans  = checkArmstrong(n);
//    System.out.println(ans);

    int i=100;
    while(i < 1000){
      if(checkArmstrong(i)){
        System.out.println(i + " ");
      }
      i++;
    }
  }

  static boolean checkArmstrong(int num){
    int originalNum = num;
    int sum = 0;
    while(num > 0){
      int reminder = num % 10;
      int cube = reminder * reminder * reminder;
      sum += cube;
      num /= 10;
    }
    if(sum != originalNum) {
      return false;
    }
    return true;
  }

}
