public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int yearLevel;
    private static int studentCount=0;

    public Student(String firstName, String lastName, int age, int yearLevel){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age =age;
        this.yearLevel = yearLevel;
        studentCount++;
        this.id = studentCount;
    }
   // public void setId(int id){
      //  this.id = id;
  //  }
    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getYearLevel(){
        return yearLevel;
    }
    public void setYearLevel(int yearLevel){
        this.yearLevel=yearLevel;
    }
    public int getStudentCount(){
        return studentCount;
    }
    public boolean equals(Student one, Student two){
        if(one.equals(two)){
            return true;
        }
        return false;
    }
    public String toString(){
        return "Student{id=" + id +", firstName='" + firstName + "', lastName='" + lastName + "', age=" + age + ", yearLevel=" + yearLevel + "}";
    }
}
