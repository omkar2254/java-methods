public class passByValueOfReference {
  int value;
  int newValue;

  static void primitiveMethod(int primitiveType){
    primitiveType = 30;
  }
  static void nonPrimitiveMethod(passByValueOfReference object){
    object.value = 40;
  }
  static void nonPrimitiveMethodReassinged(passByValueOfReference newObject){
    newObject = new passByValueOfReference();
    newObject.newValue = 80;
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

    passByValueOfReference newObject = new passByValueOfReference();
    newObject.newValue = 70;
    System.out.println("Before modification: "+ newObject.newValue);
    nonPrimitiveMethodReassinged(newObject);
    System.out.println("After modification: "+ newObject.newValue);
  }
}


