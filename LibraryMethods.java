import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LibraryMethods{

    public static void createNewBook(ArrayList<LibraryItem> container, String tempId, String tempTitle, int tempYear , String tempPublisher,
    String tempAuthor, int tempPages, String tempIsbn){


   Book newBook = new Book(tempId, tempTitle, tempPublisher, tempYear, tempAuthor, tempPages, tempIsbn);
   container.add(newBook);
 
}      


    public static void createNewThesis(ArrayList<LibraryItem> container, String tempId, String tempTitle, String tempPublisher, int tempYear,
    String tempStudentName, String tempSupervisor, String tempFieldOfStudy){
                Thesis newThesis = new Thesis(tempId, tempTitle, tempPublisher,  tempYear, tempStudentName, tempSupervisor, tempFieldOfStudy);
                container.add(newThesis);}


    public static void createNewMagazine(ArrayList<LibraryItem> container, String tempId, String tempTitle, String tempPublisher, int tempYear,
    String tempEditor, int tempVolumes, int tempIssues){
                Magazine newMagazine = new Magazine(tempId, tempTitle, tempPublisher, tempYear, tempEditor, tempVolumes, tempIssues);
                container.add(newMagazine);
}
        

    public static void doBorrowing(ArrayList<LibraryItem> container, String r){
      for(LibraryItem i : container){
        if(i.getTitle().equalsIgnoreCase(r)){
          if(i.isAvaiable()){
            i.borrowItem();
            return;
          }
          else System.out.println("This item is not avaiable at the moment");
        }
      }
     System.out.println("Item with said titel was not found within the library!");
    }


    public static void searchByTitle(ArrayList<LibraryItem> container, String name){
      boolean found = false;
      for(LibraryItem i : container){
        if(i.getTitle().toLowerCase().contains(name.toLowerCase())){
           System.out.println(i.getDetails());
           System.out.println("*********************************");
           found = true;
           }
      }
      if(!found){
      System.out.println("Item was not found!");
      }
}

    
    public static void doReturning(ArrayList<LibraryItem> container, String r){
      for (LibraryItem i : container){
        if(i.getTitle().equalsIgnoreCase(r)){
          if(!i.isAvaiable()){
             i.returnItem();
            return;
          }
          else System.out.println("This item is not borrowed therefore cannot be returned");
        }
      }
      System.out.println("Item with said title was not found within the library!");
    }


    public static void saveToFile(ArrayList<LibraryItem> container){
        try{
          FileWriter writer = new FileWriter("archive.txt");

          for(LibraryItem item : container){
            writer.write(item.saveToFile());
            writer.write("\n");
          }
          System.out.println("Library saved successfully.");
          writer.close();

        }catch(IOException e){
          System.out.println("Error while saving");
        }

    }


    public static void loadFromFile(ArrayList<LibraryItem> container){
      container.clear();
      try{
        Scanner f = new Scanner(new File("archive.txt"));

        while(f.hasNextLine()){
           String line = f.nextLine();
           String[] parts = line.split(",");

           switch(parts[0]){
              case "Book":
                    container.add(new Book(
                        parts[1],
                        parts[2],
                        parts[3],
                        Integer.parseInt(parts[4]),
                        parts[5],
                        Integer.parseInt(parts[6]),
                        parts[7]
                    ));

                    break;

                case "Magazine":
                    container.add(new Magazine(
                        parts[1],
                        parts[2],
                        parts[3],
                        Integer.parseInt(parts[4]),
                        parts[5],
                        Integer.parseInt(parts[6]),
                        Integer.parseInt(parts[7])
                    ));

                    break;

                case "Thesis":
                    container.add(new Thesis(
                        parts[1],
                        parts[2],
                        parts[3],
                        Integer.parseInt(parts[4]),
                        parts[5],
                        parts[6],
                        parts[7]
                    ));

                    break;

                default:
                    System.out.println("Unknown item type: " + parts[0]);
            }
           }      
        f.close();

      }catch(FileNotFoundException e){
         System.out.println("File not found.");
      }catch(NumberFormatException e){
        System.out.println("The file contains invalid numbers.");
      }

    }


}

    

