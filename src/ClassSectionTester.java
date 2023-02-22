import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class ClassSectionTester {

    private Student student1;
    private Student student2;
    private Student student3;
    private Student student4;
    private ClassSection cs;

    private int testsPassed = 0;


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
        assertEquals("Make sure first name property is initialized correctly!", student1.getFirstName(), "Adrian");
        tearDown();
    }

    @Test
    // Test 2
    public void TestForLastName() {
        setUp();
        assertEquals("Make sure last name property is correct!", student1.getLastName(), "Wong");
        tearDown();
    }

    @Test
    // Test 3
    public void TestForAge() {
        setUp();
        assertEquals("Make sure age property is correct!", student1.getAge(), 17);
        tearDown();
    }

    @Test
    // Test 4
    public void TestForYearLevel() {
        setUp();
        assertEquals("Make sure year level is correct!", student1.getYearLevel(), 12);
        tearDown();
    }

    @Test
    // Test 5
    public void TestForToString() {
        setUp();
        assertEquals("Make sure toString is correct!", student1.toString(), "Student{id=92, firstName='Adrian', lastName='Wong', age=17}");
        tearDown();
    }

    @Test
    // Test 6
    public void TestForSetFirstName() {
        setUp();
        student1.setFirstName("Michaela");
        assertEquals("Make sure that the setter method for first name is correct!", student1.getFirstName(), "Michaela");
        tearDown();
    }

    @Test
    // Test 7
    public void TestForSetLastName() {
        setUp();
        student1.setLastName("Swift");
        assertEquals("Make sure that the setter method for last name is correct!", student1.getLastName(), "Swift");
        tearDown();
    }

    @Test
    // Test 8
    public void TestForSetAge() {
        setUp();
        student1.setAge(21);
        assertEquals("Make sure that the setter method for age is correct!", student1.getAge(), 21);
        tearDown();
    }

    @Test
    // Test 9
    public void TestForSetYearLevel() {
        setUp();
        student1.setYearLevel(13);
        assertEquals("Make sure that the setter method for year level is correct!", student1.getYearLevel(), 13);
        tearDown();
    }

    @Test
    // Test 10
    public void TestForSetId() {
        setUp();
        student1.setId(5);
        assertEquals("Make sure that the setter method for id is correct!", student1.getId(), 5);
        tearDown();
    }

    /** Tests for Class Section. **/

    @Test
    // Test 11
    public void TestForClassSectionSubject() {
        setUp();
        assertEquals("Make sure that the subject is initialized correctly!", cs.getSubject(), "Art");
        tearDown();
    }

    @Test
    // Test 12
    public void TestForClassSectionYearLevel() {
        setUp();
        assertEquals("Make sure that the year level is initialized correctly!", cs.getYearLevel(), 12);
        tearDown();
    }

    @Test
    // Test 13
    public void TestForClassSectionCapacity() {
        setUp();
        assertEquals("Make sure that the capacity is initialized correctly!", cs.getCapacity(), 10);
        tearDown();
    }

    @Test
    // Test 14
    public void TestForClassSectionToString() {
        setUp();
        assertEquals("Make sure that the toString method is implemented correctly!", cs.toString(), "ClassSection{subject='Art', capacity=10, students=[]}");
        tearDown();
    }

    @Test
    // Test 15
    public void TestForClassSectionSetSubject() {
        setUp();
        cs.setSubject("History");
        assertEquals("Make sure that the setter method for subject is correct!", cs.getSubject(), "History");
        tearDown();
    }

    @Test
    // Test 16
    public void TestForClassSectionSetCapacity() {
        setUp();
        cs.setCapacity(20);
        assertEquals("Make sure that the setter method for capacity is correct!", cs.getCapacity(), 20);
        tearDown();
    }

    @Test
    // Test 17
    public void TestForClassSectionSetYearLevel() {
        setUp();
        cs.setYearLevel(13);
        assertEquals("Make sure that the setter method for year level is correct!", cs.getYearLevel(), 13);
        tearDown();
    }

    @Test
    // Test 18
    public void TestForClassSectionAddStudentAddsStudentCorrectly() {
        setUp();
        cs.addStudent(student1);
        assertEquals("Make sure that the add student method adds a student to the class section!", cs.getStudents().size(), 1);
        tearDown();
    }

    @Test
    // Test 19
    public void TestForClassSectionAddStudentDoesNotAddIncorrectYearLevel() {
        setUp();
        cs.addStudent(student2);
        assertEquals("Make sure that the add student method doesn't add students of a different year level than the section allows!", cs.getStudents().size(), 0);
        tearDown();
    }

    @Test
    // Test 20
    public void TestForClassSectionAddStudentAddsMultipleStudentsCorrectly() {
        setUp();
        cs.addStudent(student1);
        cs.addStudent(student2);
        cs.addStudent(student3);
        cs.addStudent(student4);
        assertEquals("Make sure that the add student method adds a student to the class section!", cs.getStudents().size(), 2);
        tearDown();
    }

    @Test
    // Test 21
    public void TestForClassSectionRemoveStudentRemovesStudentCorrectly() {
        setUp();
        cs.addStudent(student1);
        cs.addStudent(student3);
        cs.removeStudent(student1);
        assertEquals("Make sure that the remove student method removes that student from the class section!", cs.getStudents().contains(student1), false);
        tearDown();
    }

    @Test
    // Test 22
    public void TestForClassSectionRemoveStudentRemovesMultipleStudentsCorrectly() {
        setUp();
        cs.addStudent(student1);
        cs.addStudent(student2);
        cs.addStudent(student3);
        cs.addStudent(student4);
        cs.removeStudent(student1);
        cs.removeStudent(student4);
        assertEquals("Make sure that the add student and remove student methods work correctly!", cs.getStudents().size(), 0);
        tearDown();
    }

    @Test
    // Test 23
    public void TestIfMultipleIdenticalStudentObjectsCanBeAdded() {
        setUp();
        cs.addStudent(student1);
        cs.addStudent(student1);
        assertEquals("Make sure that no two identical Student objects can be added to a class section!", cs.getStudents().size(), 1);
        tearDown();
    }

    @Test
    // Test 24
    public void TestIfMultipleStudentsWithTheSameIdCanBeAdded() {
        setUp();
        cs.addStudent(student1);
        student2.setId(1);
        cs.addStudent(student2);
        assertEquals("Make sure that students with conflicting ids cannot be added to a class section!", cs.getStudents().contains(student2), false);
        tearDown();
    }

}
