import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
class JavaHashSet{
    HashSet<Integer> numbers = new HashSet<Integer>();
    public static void main(String[] args) {
        JavaHashSet js = new JavaHashSet();
        js.choices();
        Scanner sc = new Scanner(System.in);
        sc.close();
    }
// >>>>>>>>>>>>> This is for the Choices Method <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public void choices(){
        char choices;
        Scanner sc = new Scanner(System.in);            
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>     Welcome to Java HashSet Example program       <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
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
        }
    sc.close();  
    }
// >>>>>>>>>>>>>>>>>>>> This is for add method <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public void addNumbers (){
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("You choose to add numbers in an HashSet");
        System.out.println("");
        System.out.println("Enter the number you want to add in the Hash: ");
        input = sc.nextInt();
        System.out.println("-----------------------------------------------------------------------");
            if (numbers.contains(input)){
                System.out.println("");
                System.out.println("The number you input is already \" EXIST \" in the HashSet. Try input a different number.");
                addNumbers();
            }
            else{
                numbers.add(input);
            }
        System.out.println("");
        System.out.println(numbers);
        System.out.println("The number is added in the HashSet Successfully. Do you want to add more? YES/NO");
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
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("You choose to remove numbers in a HashSet");
        System.out.println("");
        System.out.println("Enter the \" NUMBER \"you want to remove in the HashSet: ");
        input = sc.nextInt();
        if (numbers.contains(input)){
            System.out.println("\nNumbers inside the HashSet: " + numbers);
            numbers.removeIf(number -> number.equals(input));
            System.out.println("");
            System.out.println("\nYou successfully deleted "+ input +" in the HashSet. Do you want to remove more? Yes/No" );
            System.out.println("\nHere's the updated HashSet: " + numbers); 
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
            }else {
                System.out.println("Inputted number is not on the Set! Do you want to change the number? Yes/No");
                String choose = sc.next();
                if ((choose.equals("YES")) || (choose.equals("Yes") || (choose.equals("yes")))) {
                            RemoveNum();      
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
//  >>>>>>>>>>>>>>>>>>> This is for the  display method <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public void DisplayNum(){
        ArrayList<Integer> numlist = new ArrayList<Integer>(numbers);
        Scanner sc = new Scanner(System.in);
        int HashSize = numbers.size(); 
        int i;
        System.out.println("\nYou choose to display the numbers. Here is what's inside the Set! ");
        for(i = 0; i < HashSize; i++)
        {
            System.out.println("Number that is in index " + i + " is " + numlist.get(i));
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
        System.out.println("You Choose to \" CLEAR \" all the numbers inside the HashSet." + 
        "\nAre you sure you want to remove all the numbers inside the Set? Yes/No");
        String Option = sc.next();
        if ((Option.equals("YES")) || (Option.equals("Yes") || (Option.equals("yes")))) {
            numbers.clear();
            int arrSize = numbers.size(); 
            System.out.println("");
            System.out.println("You removed all the numbers successfully. ");
            System.out.println("\nThis is the HashSet after clear " + "\n \nHashlist: " + numbers);
            System.out.println("\nSize of the HashSet now is: " + arrSize );
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
        System.out.println("Thank you for using HashSet Program" );
        System.out.println("Closing program...........................");
        System.out.println("----------------------------------------------------------------------------------------");
        System.exit(0);
    }
}
