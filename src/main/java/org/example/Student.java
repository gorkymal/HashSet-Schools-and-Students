package org.example;

import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@Getter
@FieldDefaults (level = AccessLevel.PRIVATE)

public class Student implements Comparable{
    String name;
    String lastName;
    String gender;
    int age;
    int classNumber;
    double averageMark;
    String hasPartner;

    public Student(String[] line) {
        this.name = line[0].trim();
        this.age = Integer.parseInt(line[1].trim());
    }

    @Override //this method is not right to use because we always compare object by one MARK. In 'main' added an argument into method 'sorted'
    public int compareTo(Object o) {
        Student student = (Student) o;
        if (this.averageMark > student.getAverageMark()) {
            return 1;
        }

        else return -1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", classNumber=" + classNumber +
                ", averageMark=" + averageMark +
                ", hasPartner='" + hasPartner + '\'' +
                '}';
    }
}
