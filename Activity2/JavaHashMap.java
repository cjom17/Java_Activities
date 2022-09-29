import java.util.HashMap;
import java.util.Scanner;

class JavaHashMap{
    HashMap<String, Integer> numbers = new HashMap<>();
    public static void main(String[] args) {
        JavaHashMap jh = new JavaHashMap();
        jh.choices();
        Scanner sc = new Scanner(System.in);
        sc.close();
    }
// >>>>>>>>>>>>> This is for the Choices Method <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public void choices(){
        char choices;
        Scanner sc = new Scanner(System.in);            
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>     Welcome to Java HashMap Example program       <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
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
        int num;
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("You choose to add numbers in the HashMap");
        System.out.println("");
        System.out.println("Enter the \" String \" value key you want to add in the HashMap: ");
        input = sc.next();
        System.out.println("");
        System.out.println("Enter the \" Integer \" value you want to add in the HashMap: ");
        num = sc.nextInt();
        System.out.println("");
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
        if (num % i == 0) {
            flag = true;
            break;
        }
        }

        if (!flag){
        System.out.println("");
        System.out.println(num + " is a prime number. You cannot enter a prime number. Do you want to change the value?");
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
        
        }   
        else{
            System.out.println(num + " is not a prime number. It will be added to the HashMap successfully.");
            numbers.put(input, num);
            System.out.println("\nThis is the current value inside in the HashMap: " + numbers);
            System.out.println("\nDo you want to add more value's in the HashMap? Yes/No");
            String choose = sc.next();
                if ((choose.equals("YES")) || (choose.equals("Yes") || (choose.equals("yes")) )) {
                    addNumbers();     
                }
                else if ((choose.equals("No")) || (choose.equals("NO") || (choose.equals("no")))){
                    System.out.println("");
                    System.out.println("Choose another you want to do from the menu. ");
                    choices();
                }
                else{
                    System.out.println("You entered the wrong choice... Closing Program.........");
                    System.out.println("-------------------------------------------------------------------");
                    System.exit(0);
                }
         
            
        }
    
        sc.close();    
    }

// >>>>>>>>>>>>>> This is for the remove method <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public void RemoveNum(){
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("You choose to remove numbers in the HashMap");
        System.out.println("");
        System.out.println("Enter the \" String KEY \"you want to remove in the HashMap: ");
        input = sc.next();
        if(numbers.containsKey(input)){
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
            

        }
        else{
            System.out.println("\nThe \" Key \" you input is not in the HashMap. Do you want to  view what's inside the HashMap and try again? YES/NO");
            String choose = sc.next();
            if ((choose.equals("YES")) || (choose.equals("Yes") || (choose.equals("yes")) )) {
                DisplayNum();     
            }
            else if ((choose.equals("No")) || (choose.equals("NO") || (choose.equals("no")))){
                System.out.println("");
                System.out.println("Choose another you want to do from the menu. ");
                RemoveNum();
            }
            else{
                System.out.println("You entered the wrong choice... Closing Program.........");
                System.out.println("-------------------------------------------------------------------");
                System.exit(0);
            }
        }
            
       
        sc.close();
    }
// //  >>>>>>>>>>>>>>>>>>> This is for the  display method <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public void DisplayNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nYou choose to display the numbers. Here is what's inside the list! ");
        System.out.println("-------------------------------------------------------------------------------- \n");
        numbers.forEach((key, value)-> System.out.println(key + " = " + value));
        System.out.println("");
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
// // >>>>>>>>>>>>>>>>>>>>>>>>> This is for the clear method <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public void ClearNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("You Choose to \" CLEAR \" all the numbers inside the HashMap." + 
        "\nAre you sure you want to remove all the numbers inside the HashMap? Yes/No");
        String Option = sc.next();
        if ((Option.equals("YES")) || (Option.equals("Yes") || (Option.equals("yes")))) {
            numbers.clear();
            int hashSize = numbers.size(); 
            System.out.println("");
            System.out.println("You removed all the numbers successfully. ");
            System.out.println("\nThis is the HashMap after clear " + "\n \nHashMap: " + numbers);
            System.out.println("\nSize of the arraylist now is: " + hashSize );
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
// //  >>>>>>>>>>>>>>>>>>> This is for exit method <<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public void exitP(){
        System.out.println("Thank you for using Arraylist Program" );
        System.out.println("Closing program...........................");
        System.out.println("----------------------------------------------------------------------------------------");
        System.exit(0);
    }
}
