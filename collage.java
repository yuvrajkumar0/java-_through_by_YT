 
 class student{
    String name = "yuvraj";
    void displayStudent(){
        System.out.println(name);
    }
}
class Teacher{
    String teacherName = "Rahul Sir";
    void displayTeacher(){
    System.out.print(teacherName);
    }
    
}
public class collage{
    public static void main(String[] args){
        student s = new student();
        Teacher t = new Teacher();
        s.displayStudent();
        t.displayTeacher();
    }
}