import java.util.Scanner;

public class PrimeNo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean ans  = checkPrime(n);
    System.out.println(ans);
  }

  static boolean checkPrime(int num){
    if(num <= 1){
      return false;
    }
    int c = 2;
    while(c * c <= num){
      if(num %  c == 0){
        return false;
      }
      c++;
    }
    return true;
  }
}
