package ref;

public class Method2 {
        public static void main(String[] args) {
            Student student1 = createStudent("학생1", 15,90);
            Student student2 = createStudent("학생2", 16,80);

            printStudent(student1);
            printStudent(student2);
    }

    static Student createStudent(String name, int age, int grade) { // 객체 생성 및 초기값 설정을 하고 반환
            Student student = new Student();
            student.name = name;
            student.age = age;
            student.grade = grade;
            return student;
    }

    static void printStudent(Student student) {
        System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.grade);
    }
}
