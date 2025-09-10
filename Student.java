public class Student {
    int age;
    int semester;
    int socioEconomicStratum;
    int coursesCompleted;
    int coursesPending;
    String program;
    int programId;

    public Student(int age, int semester, int socioEconomicStratum,
                   int coursesCompleted, int coursesPending,
                   String program, int programId) {
        this.age = age;
        this.semester = semester;
        this.socioEconomicStratum = socioEconomicStratum;
        this.coursesCompleted = coursesCompleted;
        this.coursesPending = coursesPending;
        this.program = program;
        this.programId = programId;
    }

    public void printInfo() {
        System.out.println("Program ID: " + programId +
                ", Program: " + program +
                ", Age: " + age +
                ", Semester: " + semester +
                ", Stratum: " + socioEconomicStratum +
                ", Completed: " + coursesCompleted +
                ", Pending: " + coursesPending);
    }
}
