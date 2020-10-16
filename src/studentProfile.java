class studentPro {
    int expexted_graduate = 2022;
    String firstName = "";
    String lastName = "";
    double Gpa;
    int graduate;

    studentPro(String firstName, String lastName, double Gpa,int graduate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Gpa = Gpa;
        this.graduate = graduate;
    }

    public void expectedGraduate() {
        while (true) {
            if (this.expexted_graduate == this.graduate) {
                break;
            } else {
                this.graduate += 1;
            }
        }
    }
}


public class studentProfile {
    public static void main(String[] args) {

        studentPro student1=new studentPro("kumar","gaurav",8.6,2018);
        System.out.println("enter the details of student 1:");
        System.out.println("first name:" +student1.firstName);
        System.out.println("Last name:" +student1.lastName);
        System.out.println("Student1 GPA:" +student1.Gpa);
        student1.expectedGraduate();
        System.out.println("student1 Expected graduate Year:" +student1.graduate);

        System.out.println();
        studentPro student2=new studentPro("kushal","das",8.7,2023);
        System.out.println("enter the details of student 2:");
        System.out.println("first name:" +student2.firstName);
        System.out.println("Last name:" +student2.lastName);
        System.out.println("Student2 GPA:" +student2.Gpa);
        student2.expectedGraduate();
        System.out.println("student2 Expected graduate Year:" +student2.graduate);





    }
}