public class Book extends LibraryItem{
  private String author;
  private int pages;
  private String isbn;
  
  public Book(String num, String tempTitle, String tempPublisher, int tempYear,
       String tempAuthor, int tempPages, String tempIsbn){
    super(num, tempTitle, tempPublisher, tempYear);
    author = tempAuthor;
    pages = tempPages;
    isbn = tempIsbn;
 }

 public void setAuthor(String tempAuthor) {author = tempAuthor;}
 public String getAuthor() {return author;}
 public void setPages(int num) {pages = num;}
 public int getPages() {return pages;}
 public void setIsbn(String s) {isbn = s;}
 public String getIsbn() {return isbn;}
 
 @Override
 public String getDetails(){
    return "Book's ID: " + getId() +
           "\nTitle: " + getTitle() +
           "\nPublisher: " + getPublisher() +
           "\nYear: " + getYear() +
           "\nAuthor: " + getAuthor() +
           "\nPages: " + getPages() +
           "\nISBN: " + getIsbn() +
           "\n----------------------------";
 }
 @Override
 public String saveToFile(){
       return "Book," +
            getId() + "," +
            getTitle() + "," +
            getPublisher() + "," +
            getYear() + "," +
            getAuthor() + "," +
            getPages() + "," +
            getIsbn();
 }




};