
import java.util.*;

public class JavaExceptions{
    List<Vehicles> vehicles = new ArrayList<>(); 
    Vehicles c = new Vehicles<>();
    SampleExceptions se = new SampleExceptions("Invalid input!. Enter positive numbers only...");
    public static void main(String[] args) {
        SampleExceptions se = new SampleExceptions("Invalid input!. Enter positive numbers only...");
        JavaExceptions jv = new JavaExceptions();
        Scanner sc = new Scanner(System.in);
        int choice = 0;    
        try{
            System.out.println("How many objects you want to create: ");
            int userchoice = sc.nextInt();
            if (userchoice < 0){
                throw new SampleExceptions("Invalid input!. Enter positive numbers only...");

            }
            else{
                while ( choice < userchoice){
                    jv.askInput();
                    choice++;  
                }
            }
        }
        catch(InputMismatchException e){
            se.integerException();
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }  
    }
    public void askInput(){
        String inputObj;
        int priceObj;
        Scanner sc = new Scanner(System.in);
        try{
        
        System.out.println("Enter the name of the type of vehicle you want to create: ");

        inputObj = sc.nextLine();
        System.out.println("Enter the price of the vehicle");
        priceObj = sc.nextInt();
        sc.close();
       
        vehicles.add(new Vehicles<>(inputObj, priceObj));
        System.out.println("\nSuccessfully added!");
        Iterator<Vehicles> it = vehicles.iterator();
        while(it.hasNext()){
            Vehicles temp = it.next();
            System.out.println("Object name is: " + temp.getname() + " and the price is " + temp.getprice());
        }
    }
    catch (InputMismatchException ime){
        se.integerException();

    }
    }
}