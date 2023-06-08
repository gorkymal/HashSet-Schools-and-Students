package org.example;

import lombok.*;
import lombok.experimental.*;
import java.util.*;


@Getter
@Setter
@FieldDefaults (level = AccessLevel.PRIVATE)
public class School {
    String name;
    String address;
    int amountOfStudents;
    List<Student> listOfStudents;

    public School(String name, String address, int amountOfStudents) {
        this.name = name;
        this.address = address;
        this.amountOfStudents = amountOfStudents;
        this.listOfStudents = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "School{" +
                "listOfStudents=" + listOfStudents +
                '}';
    }

}
