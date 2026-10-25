class Magazine extends LibraryItem{
  private String editor;
  private int volumes;
  private int issues;

 public Magazine(String num, String tempTitle, String tempPublisher, int tempYear,
          String tempEditor, int tempVolumes, int tempIssues){
   super(num, tempTitle, tempPublisher, tempYear);
    editor = tempEditor;
    volumes = tempVolumes;
    issues = tempIssues;
 }
 
 public void setEditor(String tempEditor) {editor = tempEditor;}
 public String getEditor() {return editor;}
 public void setVolumes(int tempVolumes) {volumes = tempVolumes;}
 public int getVolumes() {return volumes;}
 public void setIssues(int tempIssues) {issues = tempIssues;}
 public int getIssues(){ return issues;}

 @Override
 public String getDetails(){
  return "Magazine's ID: " + getId() +
          "\nTitle: " + getTitle() +
          "\nPublisher: " + getPublisher() +
          "\nYear: " + getYear() +
          "\nEditor: " + getEditor() +
          "\nVolumes: " + getVolumes() + 
          "\nIssues: " + getIssues() +
          "\n----------------------------";
 }
 @Override
 public String saveToFile(){
    return "Magazine," +
           getId() + "," +
           getTitle() + "," +
           getPublisher() + "," +
           getYear() + "," +
           getEditor() + "," +
           getVolumes() + "," +
           getIssues();
  } 

 };
