public class passByValueOfReference {
  int value =10;

  static void primitiveMethod(int primitiveType){
    primitiveType = 30;
  }
  static void nonPrimitiveMethod(passByValueOfReference object){
    object.value = 40;
  }
  public static void main(String[] args){
    //Primitive data types
    int primitiveType = 20;
    primitiveMethod(primitiveType); //Not affect the original value
    System.out.println(primitiveType);

    //Non-Primitive data types
    passByValueOfReference object = new passByValueOfReference();
    object.value = 20;
    System.out.println("Before modification: "+ object.value);
    nonPrimitiveMethod(object);
    System.out.println("After modification: "+ object.value);
  }
}


