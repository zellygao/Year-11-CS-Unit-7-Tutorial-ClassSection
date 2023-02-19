# Year-11-CS-Unit-7-Tutorial-ClassSection

Your job is to create two classes called ClassSection and Student. 
You should pass all of the tests in the ClassSectionTester class.

![image](https://user-images.githubusercontent.com/57818506/219935614-677bba64-978b-4745-b263-7e1aab709a66.png)

Each Student object that is created will be assigned a unique id number that corresponds to the number of Student objects that currently exist upon the creation of the Student object. That is to say, the first Student object that is created will have id 1, the second Student object that is created will have id 2, …, the nth Student object that is created will have id n.

The equals method will take a Student reference as a parameter and check to see whether this Student object is identical to the one that the method is being invoked upon. 
For example …

Student student1 = new Student("Sylvia", "Tseng", 16, 11);
Student student2 = new Student("Sylvia", "Tseng", 16, 11);

student1.equals(student2); // returns true

![image](https://user-images.githubusercontent.com/57818506/219935637-fdec3861-ed4a-438c-abb2-d609788964ac.png)

The addStudent(), removeStudent(), and isStudentEnrolled() methods will take a Student object as a parameter.

The isStudentEnrolled() method will check to see if an identical student already exists in the class section and returns a boolean value.

Goodluck, have fun! :)
