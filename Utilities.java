import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilities{
    
    public static int askWhichSource(Scanner sc){// Asking the user to determent a source type
        while(true){
            try{ 
                System.out.println("Enter the number of the source you want to add:");
                System.out.println("1.Book\n" + 
                                   "2.Magazine\n" +
                                   "3.Thesis"
                                  );
                int choice = sc.nextInt();
                sc.nextLine();
                if (choice >= 1 && choice <= 3) return choice;
                
            }catch(InputMismatchException e){
                System.out.println("Please enter a valid integer.");
                sc.nextLine();
            }
        }
    }


    public static String askForString(Scanner sc, String text){// Getting a simple string variable without crowding the methodslater on  
        System.out.println(text);
        return sc.nextLine().trim();   
    }


    public static int askForInt(Scanner sc, String text){
      while(true){  
        try{
            System.out.println(text); 
            int temp = sc.nextInt();   
            sc.nextLine();   
            return temp;
        }catch(InputMismatchException e){
            System.out.println("Please enter a valid integer.\n");
            sc.nextLine();
        }
      }
    }
    
}

