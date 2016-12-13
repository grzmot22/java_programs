import java.util.Scanner;

/*
* Program describe a student with the following attributes: student ID, name
and level, with appropriate data types.
*Also take data from student about marks and count average from these marks.
*
*@author Grzmot22
* @version 31.10.16
*/

public class Student {
    //private Scanner in = new Scanner(System.in);
    int sId;
    String name;
    String level;

    public void id(int sId){
        System.out.println("Student id: " + sId);
    }
    public void sName(String sName){
        System.out.println("Name of student: " + sName);
    }
    public void sLevel(String sLevel){
        System.out.println("Level of student: " + sLevel);
    }
    public void marks(int m1,int m2,int m3,int m4,int m5){
        System.out.println("Your marks " + m1 + " " + m2 + " " + m3 + " " + m4 + " " + m5 + "\n"
                           + "Average of these marks is " + (m1+m2+m3+m4+m5)/5 );
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sId, mark1, mark2, mark3, mark4, mark5;
        String sName, junk, sLevel;
        Student bedStudent = new Student();
        System.out.println("Type your Student ID: ");
        sId = in.nextInt();
        System.out.print("Type your name:");
        junk = in.nextLine(); // To get rid of '\n'
        sName = in.nextLine();
        System.out.println("Type your level:");
        sLevel = in.nextLine();
        System.out.println("Enter your 5 marks");
        mark1 = in.nextInt();
        mark2 = in.nextInt();
        mark3 = in.nextInt();
        mark4 = in.nextInt();
        mark5 = in.nextInt();
        bedStudent.id(sId);
        bedStudent.sName(sName);
        bedStudent.sLevel(sLevel);
        bedStudent.marks(mark1, mark2, mark3, mark4, mark5);

    }
}
