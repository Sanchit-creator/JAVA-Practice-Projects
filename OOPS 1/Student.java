public class Student {
    public String name;
    private int rollNumber;
    // statci properties are shared by object and they belong to class, rest all belong to objects, it will be same fpr every student object
    // output: Student.numStudent
    static int numStudent;
    // COnstructor doesn't return and same name as class, you have to pass both arguement, not only one


    public Student(String n, int num){
        name = n;
        rollNumber = num;
        numStudent++;
    }

    // Default constructor example

    // public Student(String n) {
    //     name = "abc";
    //     rollNumber = 9;
    // }

    // getter and setter

    // public int getRollNumber() {
    //     return rollNumber;
    // }

    // public void setRollNumber(int num) {
    //     rollNumber = num;
    // }



    
}
