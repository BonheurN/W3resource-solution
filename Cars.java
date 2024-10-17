import java.util.Stack;

public class cars{
  public static void main(String[]args){

    Stack<String> cars = new Stack<String>();
    cars.push("Bughatti");
    cars.push("Lamborghini");
    cars.push("Ferrari");
    cars.push("Ford");
    cars.push("Urus");

    System.out.println(cars.pop()); // This printed method will output the cut off object which is the last obect Urus
    System.out.println(cars.isEmpty()); // This to evaluate if the stack structure is empty in this case it is false the answer because we posses value in this one 
  }
}
