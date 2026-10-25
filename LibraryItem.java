public abstract class LibraryItem{
 private String id;
 private String title;
 private String publisher;
 private int year;
 private boolean isAvailable = true;
 
    LibraryItem(String tempId, String tempTitle, String tempPublisher, int tempYear){
        id = tempId;
        title = tempTitle;
        publisher = tempPublisher; 
        year = tempYear;
    }

    public void setId(String num) {id = num;}
    public String getId() {return id;}
    public void setTitle(String tempTitle) {title = tempTitle;}
    public String getTitle() {return title;}
    public void setPublisher(String tempPublisher) {publisher = tempPublisher;}
    public String getPublisher() {return publisher;}
    public void setYear(int tempYear) {year = tempYear;}
    public int getYear() {return year;}
    public boolean isAvaiable(){return isAvailable;}
    public void borrowItem(){
        if(isAvailable){
            isAvailable = false;
            System.out.println("The item " + title +
                               " with the id "+ id + 
                               " was borrowed successfully!");
        }
        else System.out.println("This item is not availiable or is borrowed by someone else right now");
    }

    public void returnItem(){
        if(!isAvailable){
            isAvailable = true;
            System.out.println("The item "+ title + 
                               " with the id "+ id + 
                               " was returned successfully!");
        }
        else System.out.println("This item is not borrowed!");
    }

    public abstract String getDetails();
    public abstract String saveToFile();
 
};