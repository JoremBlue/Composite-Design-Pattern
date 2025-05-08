public class NewEraUniversityDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Cruz", "S001", 20000);
        Student s2 = new Student("Tarno", "S002", 22000);
        Student s3 = new Student("Tanggol", "S003", 21000);

        Teacher t1 = new Teacher("Jerry Esperanza", "Computer Science", 50000);
        Teacher t2 = new Teacher("Marc Laureta", "Information Technology", 52000);

        Department csDept = new Department("Computer Science");
        csDept.addUnit(t1);
        csDept.addUnit(s1);
        csDept.addUnit(s2);

        Department itDept = new Department("Information Technology");
        itDept.addUnit(t2);
        itDept.addUnit(s3);

        College engCollege = new College("College of Engineering");
        engCollege.addUnit(csDept);
        engCollege.addUnit(itDept);

        College mainUniversity = new College("New Era University");
        mainUniversity.addUnit(engCollege);

        System.out.println("--- University Structure ---");
        mainUniversity.displayDetails();

        System.out.println("\nTotal Students: " + mainUniversity.getStudentCount());

        System.out.println("Total Budget: " + mainUniversity.getBudget());
    }
}
