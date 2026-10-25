class Thesis extends LibraryItem{
 private String studentName;
 private String supervisor;
 private String fieldOfStudy;

 public Thesis(String num, String tempTitle, String tempPublisher, int tempYear,
        String tempStudentName, String tempSupervisor, String tempFieldOfStudy){
  super(num, tempTitle, tempPublisher, tempYear);
  studentName = tempStudentName;
  supervisor = tempSupervisor;
  fieldOfStudy = tempFieldOfStudy;
 }

 public void setStudentName(String tempStudentName) {studentName = tempStudentName;}
 public String getStudentName() {return studentName;}
 public void setSupervisor(String tempSupervisor) {supervisor = tempSupervisor;}
 public String getSupervisor() {return supervisor;}
 public void setFieldOfStudy(String tempFieldOfStudy) {fieldOfStudy = tempFieldOfStudy;}
 public String getFieldOfStudy() {return fieldOfStudy;}
 
 @Override
 public String getDetails(){
  return "Thesis's ID: " + getId() +
          "\nTitle: " + getTitle() +
          "\nPublisher: " + getPublisher() +
          "\nYear: " + getYear() +
          "\nStudent's name: " + getStudentName() +
	  "\nSupervisor: " + getSupervisor() +
	  "\nField of study: " + getFieldOfStudy() +
        "\n----------------------------";
  
 }
 @Override
 public String saveToFile(){

       return "Thesis," +
       getId() + "," +
       getTitle() + "," +
       getPublisher() + "," +
       getYear() + "," +
       getStudentName() + "," +
       getSupervisor() + "," +
       getFieldOfStudy();
 }
};