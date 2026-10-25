import java.util.Scanner;
import java.util.ArrayList;


public class LibraryApp{

    public static void main(String[] args){

      Scanner sc = new Scanner(System.in);

      Book book1 = new Book("B-101", "Animal farm", "The university of Adelaide", 1944, "George Orwell", 107, "978");
      Book book2 = new Book("B-102", "The Queen's Gambit", "New York Times", 2009, "Tevis Walter", 272, "141");
      Magazine magazine1 = new Magazine("M-300", "Vouge", "Conde Nast", 2026, "Chloe Malle", 1, 1);
      Thesis thesis1 = new Thesis("T-201", "Artificial Intelligence in Medical Diagnosis", "University of Oxford", 2025, "Emma Wilson","Dr. Michael Brown", "Computer Science");
      Thesis thesis2 = new Thesis("T-202", "Cybersecurity Techniques for Cloud Computing", "Stanford University", 2024, "Daniel Kim","Prof. Sarah Johnson", "Information Technology");
    

      ArrayList<LibraryItem> library = new ArrayList<>();
    
      library.add(book1);
      library.add(book2);
      library.add(magazine1);
      library.add(thesis1);
      library.add(thesis2);


      while(true){
      System.out.println("Library Menu\n" +
      "*********************************\n" +
      "1.Add a new source\n" +
      "2.Search for a source\n" +
      "3.Borrowing a source\n" +
      "4.Returning a source\n" +
      "5.Show all sources\n" +
      "6.Show all sources avaiable\n" +
      "7.Save to file\n" + 
      "8.Load from file\n" +
      "9.Exit\n"
      );
      
      int choice = Utilities.askForInt(sc, "Enter your choice:");

        switch(choice){
          case 1:
            int sourceType = Utilities.askWhichSource(sc);

            switch(sourceType){
              case 1:
                LibraryMethods.createNewBook(
                library,
                Utilities.askForString(sc, "Enter the ID:"),
                Utilities.askForString(sc, "Enter the title:"),
                Utilities.askForInt(sc, "Enter the year:"),
                Utilities.askForString(sc, "Enter the publisher's name:"),
                Utilities.askForString(sc, "Enter the author's name:"),
                Utilities.askForInt(sc, "Enter the amount of pages:"),
                Utilities.askForString(sc, "Enter the ISBN:")
                );
                System.out.println("Book added successfully!");
                break;
            
              case 2:
                LibraryMethods.createNewMagazine(
                library,
                Utilities.askForString(sc, "Enter the ID:"),
                Utilities.askForString(sc, "Enter the title:"),
                Utilities.askForString(sc, "Enter the publisher's name:"), 
                Utilities.askForInt(sc, "Enter the year:"),
                Utilities.askForString(sc, "Enter the editor's name:"), 
                Utilities.askForInt(sc, "Enter the amount volumes:"), 
                Utilities.askForInt(sc, "Enter the amount issues:")
                );
                System.out.println("Magazine added successfully!");
                break;

              case 3:
                LibraryMethods.createNewThesis(
                library, 
                Utilities.askForString(sc, "Enter the ID:"), 
                Utilities.askForString(sc, "Enter the title:"), 
                Utilities.askForString(sc, "Enter the publisher's name:"), 
                Utilities.askForInt(sc, "Enter the year:"),
                Utilities.askForString(sc, "Enter the student's name:"), 
                Utilities.askForString(sc, "Enter the supervisor's name:"), 
                Utilities.askForString(sc, "Enter the filed of study:")
                );
                System.out.println("Thesis added successfully!");
                break;
            }
            break;
          
          case 2:
            LibraryMethods.searchByTitle(library, Utilities.askForString(sc, "Enter the title to search for:"));
            break;

          case 3:
            LibraryMethods.doBorrowing(library, Utilities.askForString(sc, "Enter the title to borrow:"));
            break;

          case 4:
            LibraryMethods.doReturning(library, Utilities.askForString(sc, "Enter the title to return:"));
            break;

          case 5:
            System.out.println("hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
            for(LibraryItem i : library){
               System.out.println(i.getDetails());
            } 
            break;

          case 6:
              for(LibraryItem i : library){
                if(i.isAvaiable()){
                  System.out.println(i.getDetails());
                }
              }
              break;
          case 7:
            LibraryMethods.saveToFile(library);
            System.out.println("Items were saved succesfully!");
            break;
          case 8:
            LibraryMethods.loadFromFile(library);
            System.out.println("Items were loaded succesfully!");
            break;
            
          case 9:
            System.out.println("Program ended successfully\n" + "********************************\n");
            sc.close();
            return;
        }
      }
    }
  }
