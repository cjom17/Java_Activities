import java.util.ArrayList;
import java.util.Scanner;
// import java.util.List;
class JavaList{
    ArrayList<Integer> numbers = new ArrayList<>();
    public static void main(String[] args) {
        JavaList jv = new JavaList();
        jv.choices();
        Scanner sc = new Scanner(System.in);
        sc.close();
    }
// >>>>>>>>>>>>> This is for the Choices Method <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public void choices(){
        char choices;
        Scanner sc = new Scanner(System.in);            
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>     Welcome to Java ArrayList Example program       <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>                     Menu                            <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>     1. Add Numbers                                  <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>     2. Remove Numbers                               <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>     3. Display Numbers                              <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>     4. Clear Numbers                                <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>     5. Exit                                         <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("");
        System.out.println("Enter the number according to your choice: ");
        choices = sc.next().charAt(0);
        System.out.println("-------------------------------------------------------------");
        System.out.println("");
        switch (choices){
            case '1':
            addNumbers();
            break;
            case '2':
            RemoveNum();
            break;
            case '3':
            DisplayNum();
            break;
            case '4':
            ClearNum();
            break;
            case '5':
            exitP();
            break;
        }
    sc.close();  
    }
// >>>>>>>>>>>>>>>>>>>> This is for add method <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public void addNumbers (){
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("You choose to add numbers in an Array");
        System.out.println("");
        System.out.println("Enter the number you want to add in the Arraylist: ");
        input = sc.nextInt();
            if (input < 0){
                System.out.println("Invalid input. Input positive numbers only");
                addNumbers();
            }
            else{
                numbers.add(input);
            }
        System.out.println("");
        System.out.println(numbers);
        System.out.println("The number is added in the ArrayList Successfully. Do you want to add more? YES/NO");
        String Option = sc.next();
        
            if ((Option.equals("YES")) || (Option.equals("Yes") || (Option.equals("yes")) )) {
                addNumbers();     
            }
            else if ((Option.equals("No")) || (Option.equals("NO") || (Option.equals("no")))){
                System.out.println("");
                System.out.println("Choose another you want to do from the menu. ");
                choices();
            }
            else{
                System.out.println("You entered the wrong choice... Closing Program.........");
                System.out.println("-------------------------------------------------------------------");
                System.exit(0);
            }
        sc.close();    
    }
// >>>>>>>>>>>>>> This is for the remove method <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public void RemoveNum(){
        int arrSize = numbers.size(); 
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("You choose to remove numbers in an Array");
        System.out.println("");
        System.out.println("Enter the \" INDEX \"you want to remove in the Arraylist: ");
        input = sc.nextInt();
            if (input >= arrSize){
                System.out.println("The value you entered is out of the size of the arraylist. The size of the arraylist is 0 up to " + (arrSize));
                System.out.println("Do you want to change the value? Yes/No");
                String Option = sc.next();
                if ((Option.equals("YES")) || (Option.equals("Yes")  || (Option.equals("yes")))) {
                    RemoveNum();
                }
                else{
                    choices();
                }
            }
        System.out.println("The value you remove is " + numbers.get(input));
        numbers.remove(input);
        System.err.println("");
        System.out.println(numbers);
        System.out.println("The number is removed in the ArrayList Successfully. Do you want to remove more? YES/NO");
        String Option = sc.next();
            if ((Option.equals("YES")) || (Option.equals("Yes") || (Option.equals("yes")))) {
                RemoveNum();      
            }
            else if ((Option.equals("No")) || (Option.equals("NO") || (Option.equals("no")))){
                System.out.println("");
                System.out.println("Choose another you want to do from the menu. ");
                choices();
            }
            else{
                System.out.println("You entered the wrong choice... Closing Program.........");
                System.out.println("-------------------------------------------------------------------");
                System.exit(0);
            } 
        sc.close();
    }
//  >>>>>>>>>>>>>>>>>>> This is for the  display method <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public void DisplayNum(){
        Scanner sc = new Scanner(System.in);
        int arrSize = numbers.size(); 
        int i;
        System.out.println("\nYou choose to display the numbers. Here is what's inside the list! ");
        for(i = 0; i < arrSize; i++)
        {
            System.out.println("Number that is in index " + i + " is " + numbers.get(i));
        }
        System.out.println("\nDo you want to make another choices? Yes/No");
        String Option = sc.next();
            if ((Option.equals("YES")) || (Option.equals("Yes") || (Option.equals("yes")))) {
                System.out.println("");
                System.out.println("Choose another you want to do from the menu. ");
                choices();  
            }
            else if ((Option.equals("No")) || (Option.equals("NO") || (Option.equals("no")))){
                System.out.println("");
                DisplayNum();
            }
            else{
                System.out.println("You entered the wrong choice... Closing Program.........");
                System.out.println("-------------------------------------------------------------------");
                System.exit(0);
            }
        sc.close();
        
    }
// >>>>>>>>>>>>>>>>>>>>>>>>> This is for the clear method <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public void ClearNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("You Choose to \" CLEAR \" all the numbers inside the array." + 
        "\nAre you sure you want to remove all the numbers inside the array? Yes/No");
        String Option = sc.next();
        if ((Option.equals("YES")) || (Option.equals("Yes") || (Option.equals("yes")))) {
            numbers.removeAll(numbers);
            int arrSize = numbers.size(); 
            System.out.println("");
            System.out.println("You removed all the numbers successfully. ");
            System.out.println("\n This is the arraylist after clear " + "\n \nArraylist: " + numbers);
            System.out.println("\nSize of the arraylist now is: " + arrSize );
            System.out.println("----------------------------------------------------------------------");
            System.out.println("\nDo you want to go back to the menu? Yes/No" );
            String choose = sc.next();
            if ((choose.equals("YES")) || (choose.equals("Yes") || (choose.equals("yes")))) {
                System.out.println("");
                choices();
            }
            else if ((choose.equals("No")) || (choose.equals("NO") || (choose.equals("no")))){
                System.out.println("");
                exitP();
            }      
        }
        else if ((Option.equals("No")) || (Option.equals("NO") || (Option.equals("no")))){
            System.out.println("");
            choices();
        }
        else{
            System.out.println("You entered the wrong choice... Closing Program.........");
            System.out.println("-------------------------------------------------------------------"); 
            System.exit(0);
        }
        sc.close();
    }
//  >>>>>>>>>>>>>>>>>>> This is for exit method <<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public void exitP(){
        System.out.println("Thank you for using Arraylist Program" );
        System.out.println("Closing program...........................");
        System.out.println("----------------------------------------------------------------------------------------");
        System.exit(0);
    }
}
