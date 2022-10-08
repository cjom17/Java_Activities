public class SampleExceptions extends Exception {
    public void negativeException(){
        System.out.println("Invalid input! Please input numbers greater than 0");

    }
    public void integerException(){
        System.out.println("Invalid input! Please input an integer.");

    }
    public SampleExceptions(String message){
        super(message);
    }
}
