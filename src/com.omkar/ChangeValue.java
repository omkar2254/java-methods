import java.util.Arrays;

public class ChangeValue {

  public static void main(String[] args) {
    int [] arr = {1, 2, 3 ,4, 5};
    //When the object reference is passed 
    change(arr);
    System.out.println(Arrays.toString(arr));
  }
  static void change(int[] nums){
    nums[0] = 5; //If you make a change to the object via this ref variable it will change the original object
  }
}
