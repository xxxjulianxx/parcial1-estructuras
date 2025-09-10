public class Main {
    public static void main(String[] args) {
        // Create dataset of students
        Student[] students = new Student[10];
        students[0] = new Student(20, 4, 3, 15, 5, "Computer Science", 101);
        students[1] = new Student(22, 6, 2, 20, 2, "Business", 102);
        students[2] = new Student(19, 2, 4, 8, 10, "Engineering", 103);
        students[3] = new Student(24, 8, 5, 25, 1, "Law", 104);
        students[4] = new Student(21, 5, 3, 18, 4, "Medicine", 105);
        students[5] = new Student(23, 7, 2, 22, 2, "Psychology", 106);
        students[6] = new Student(18, 1, 1, 5, 12, "Design", 107);
        students[7] = new Student(25, 9, 6, 30, 0, "Architecture", 108);
        students[8] = new Student(20, 3, 4, 12, 6, "Education", 109);
        students[9] = new Student(26, 10, 5, 32, 0, "Nursing", 110);

        System.out.println("=== Original List of Students ===");
        for (Student s : students) {
            s.printInfo();
        }

        SortAlgorithms.bubbleSortByAge(students);
        System.out.println("\n=== Students Sorted by Age (Bubble Sort) ===");
        for (Student s : students) {
            s.printInfo();
        }

        SortAlgorithms.insertionSortBySemester(students);
        System.out.println("\n=== Students Sorted by Semester (Insertion Sort) ===");
        for (Student s : students) {
            s.printInfo();
        }

        System.out.println("\n=== Linear Search by Program ID (102) ===");
        Student foundById = SearchAlgorithms.linearSearchByProgramId(students, 102);
        if (foundById != null) {
            System.out.println("Student found:");
            foundById.printInfo();
        } else {
            System.out.println("Student not found.");
        }

        SortAlgorithms.bubbleSortByAge(students);
        System.out.println("\n=== Binary Search by Age (21) ===");
        Student foundByAge = SearchAlgorithms.binarySearchByAge(students, 21);
        if (foundByAge != null) {
            System.out.println("Student found:");
            foundByAge.printInfo();
        } else {
            System.out.println("Student not found.");
        }
    }
}
