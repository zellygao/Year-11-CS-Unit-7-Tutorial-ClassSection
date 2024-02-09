import org.junit.jupiter.api.Test;
//import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassSectionTester {

    private Student student1;
    private Student student2;
    private Student student3;
    private Student student4;
    private ClassSection cs;


    public void setUp() {
        student1 = new Student("Adrian", "Wong", 17, 12);
        student2 = new Student("Sylvia", "Tseng", 16, 11);
        student3 = new Student("Caitlyn", "Tang", 16, 11);
        student4 = new Student("Antigone", "Wong", 17, 12);
        cs = new ClassSection("Art", 10, 12);
    }


    public void tearDown() {
        student1 = null;
        student2 = null;
        student3 = null;
        student4 = null;
        cs = null;
    }

    /** Tests for Student class. **/
    @Test
    // Test 1
    public void TestForFirstName() {
        setUp();
        assertEquals("Adrian", student1.getFirstName(), "Make sure first name property is initialized correctly!");
        tearDown();
    }

    @Test
    // Test 2
    public void TestForLastName() {
        setUp();
        assertEquals("Wong", student1.getLastName(), "Make sure last name property is correct!");
        tearDown();
    }

    @Test
    // Test 3
    public void TestForAge() {
        setUp();
        assertEquals(17, student1.getAge(), "Make sure age property is correct!");
        tearDown();
    }

    @Test
    // Test 4
    public void TestForYearLevel() {
        setUp();
        assertEquals(12, student1.getYearLevel(), "Make sure year level is correct!");
        tearDown();
    }

    @Test
    // Test 5
    public void TestForToString() {
        setUp();
        assertEquals("Student{id=77, firstName='Adrian', lastName='Wong', age=17, yearLevel=12}", student1.toString(), "Make sure toString is correct!");
        tearDown();
    }

    @Test
    // Test 6
    public void TestForSetFirstName() {
        setUp();
        student1.setFirstName("Michaela");
        assertEquals("Michaela", student1.getFirstName(), "Make sure that the setter method for first name is correct!" );
        tearDown();
    }

    @Test
    // Test 7
    public void TestForSetLastName() {
        setUp();
        student1.setLastName("Swift");
        assertEquals("Swift", student1.getLastName(), "Make sure that the setter method for last name is correct!");
        tearDown();
    }

    @Test
    // Test 8
    public void TestForSetAge() {
        setUp();
        student1.setAge(21);
        assertEquals(21, student1.getAge(), "Make sure that the setter method for age is correct!");
        tearDown();
    }

    @Test
    // Test 9
    public void TestForSetYearLevel() {
        setUp();
        student1.setYearLevel(13);
        assertEquals(13, student1.getYearLevel(), "Make sure that the setter method for year level is correct!");
        tearDown();
    }

    /** Tests for Class Section. **/

    @Test
    // Test 10
    public void TestForClassSectionSubject() {
        setUp();
        assertEquals("Art", cs.getSubject(), "Make sure that the subject is initialized correctly!");
        tearDown();
    }

    @Test
    // Test 11
    public void TestForClassSectionYearLevel() {
        setUp();
        assertEquals(12, cs.getYearLevel(), "Make sure that the year level is initialized correctly!");
        tearDown();
    }

    @Test
    // Test 12
    public void TestForClassSectionCapacity() {
        setUp();
        assertEquals(10, cs.getCapacity(), "Make sure that the capacity is initialized correctly!");
        tearDown();
    }

    @Test
    // Test 13
    public void TestForClassSectionToString() {
        setUp();
        assertEquals("ClassSection{subject='Art', capacity=10, yearLevel=12, students=[]}", cs.toString(), "Make sure that the toString method is implemented correctly!");
        tearDown();
    }

    @Test
    // Test 14
    public void TestForClassSectionSetSubject() {
        setUp();
        cs.setSubject("History");
        assertEquals("History", cs.getSubject(), "Make sure that the setter method for subject is correct!");
        tearDown();
    }

    @Test
    // Test 15
    public void TestForClassSectionSetCapacity() {
        setUp();
        cs.setCapacity(20);
        assertEquals(20, cs.getCapacity(), "Make sure that the setter method for capacity is correct!");
        tearDown();
    }

    @Test
    // Test 16
    public void TestForClassSectionSetYearLevel() {
        setUp();
        cs.setYearLevel(13);
        assertEquals(13, cs.getYearLevel(), "Make sure that the setter method for year level is correct!");
        tearDown();
    }

    @Test
    // Test 17
    public void TestForClassSectionAddStudentAddsStudentCorrectly() {
        setUp();
        cs.addStudent(student1);
        assertEquals(1, cs.getStudents().size(), "Make sure that the add student method adds a student to the class section!");
        tearDown();
    }

    @Test
    // Test 18
    public void TestForClassSectionAddStudentDoesNotAddIncorrectYearLevel() {
        setUp();
        cs.addStudent(student2);
        assertEquals(0, cs.getStudents().size(), "Make sure that the add student method doesn't add students of a different year level than the section allows!");
        tearDown();
    }

    @Test
    // Test 19
    public void TestForClassSectionAddStudentAddsMultipleStudentsCorrectly() {
        setUp();
        cs.addStudent(student1);
        cs.addStudent(student2);
        cs.addStudent(student3);
        cs.addStudent(student4);
        assertEquals(2, cs.getStudents().size(), "Make sure that the add student method adds a student to the class section!");
        tearDown();
    }

    @Test
    // Test 20
    public void TestForClassSectionRemoveStudentRemovesStudentCorrectly() {
        setUp();
        cs.addStudent(student1);
        cs.addStudent(student3);
        cs.removeStudent(student1);
        assertEquals(false, cs.getStudents().contains(student1), "Make sure that the remove student method removes that student from the class section!");
        tearDown();
    }

    @Test
    // Test 21
    public void TestForClassSectionRemoveStudentRemovesMultipleStudentsCorrectly() {
        setUp();
        cs.addStudent(student1);
        cs.addStudent(student2);
        cs.addStudent(student3);
        cs.addStudent(student4);
        cs.removeStudent(student1);
        cs.removeStudent(student4);
        assertEquals(0, cs.getStudents().size(),"Make sure that the add student and remove student methods work correctly!");
        tearDown();
    }

    @Test
    // Test 22
    public void TestIfMultipleIdenticalStudentObjectsCanBeAdded() {
        setUp();
        cs.addStudent(student1);
        cs.addStudent(student1);
        assertEquals(1, cs.getStudents().size(), "Make sure that no two identical Student objects can be added to a class section!");
        tearDown();
    }


}
