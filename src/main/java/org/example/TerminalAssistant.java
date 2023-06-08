package org.example;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TerminalAssistant {

    public static void listsCreator() {
//        String pathToArtemLebedev = "C:/Users/gmalyshev/Desktop/ListOfStudents_school_lebedev.txt";
//        String pathToAppleSchool = "C:/Users/gmalyshev/Desktop/ListOfStudents_school_Apple.txt";
//        String pathToSkolkovo = "C:/Users/gmalyshev/Desktop/ListOfStudents_school_Skolkovo.txt";
//        String pathToSchools = "C:/Users/gmalyshev/Desktop/listOfSchools.txt";
//        String pathMyCode = "C:/Users/gmalyshev/Desktop/digitalCode.txt";
//
//        Path pathOne = Paths.get(pathToArtemLebedev);
//        Scanner scan1 = null;
//        try {
//            scan1 = new Scanner(pathOne);
//        } catch (IOException e) {
//            System.out.println("Error1");
//        }
//
//        List<String[]> allInfoAboutStudents = new ArrayList<>();
//        for (int i = 0; i < 21; i++) {
//            String[] textAboutStudents = scan1.nextLine().split(", ");
//            allInfoAboutStudents.add(textAboutStudents);
//        }
//
//        Path pathTwo = Paths.get(pathToSchools);
//        Scanner scan2 = null;
//        try {
//            scan2 = new Scanner(pathTwo);
//        } catch (IOException e) {
//            System.out.println("Error2");
//        }
//
//        List<String[]> allInfoAboutSchools = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            String[] textAboutSchools = scan2.nextLine().split(",");
//            allInfoAboutSchools.add(textAboutSchools);
//        }
//
//        List<School> listOfSchools = new ArrayList<>();
//
//        Student student = null;
//        School school = null;
//        for (int i = 0; i < 3; i++) {
//            String[] temporarySchoolInfo = allInfoAboutSchools.get(i);
//            school = new School(
//                    temporarySchoolInfo[0].trim(),
//                    temporarySchoolInfo[1].trim(),
//                    Integer.parseInt(temporarySchoolInfo[2].trim()));
//            listOfSchools.add(school);
//            for (int j = 0; j < 21; j++) {
//                String[] temporaryStudentInfo = allInfoAboutStudents.get(j);
//                student = new Student(
//                        temporaryStudentInfo[0].trim(),
//                        temporaryStudentInfo[1].trim(),
//                        temporaryStudentInfo[2].trim(),
//                        Integer.parseInt(temporaryStudentInfo[3].trim()),
//                        Integer.parseInt(temporaryStudentInfo[4].trim()),
//                        Double.parseDouble(temporaryStudentInfo[5].trim()),
//                        temporaryStudentInfo[6].trim());
//                school.getListOfStudents().add(student);
//            }
//        }
//    }
    }
}
