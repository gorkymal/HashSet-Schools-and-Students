package org.example;
import java.io.*;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String pathToArtemLebedev = "C:/Users/gmalyshev/Desktop/ListOfStudents_school_lebedev.txt";
        String pathToAppleSchool = "C:/Users/gmalyshev/Desktop/ListOfStudents_school_Apple.txt";
        String pathToSkolkovo = "C:/Users/gmalyshev/Desktop/ListOfStudents_school_Skolkovo.txt";
        String pathToSchools = "C:/Users/gmalyshev/Desktop/listOfSchools.txt";
        //String pathMyCode = "C:/Users/gmalyshev/Desktop/digitalCode.txt";

        Path pathOne = Paths.get(pathToArtemLebedev);
        Scanner scan1 = null;
        try {
            scan1 = new Scanner(pathOne);
        } catch (IOException e) {
            System.out.println("Error1");
        }

        List<String[]> allInfoAboutStudents = new ArrayList<>();
        for (int i = 0; i < 21; i++) {
            String[] textAboutStudents = scan1.nextLine().split(", ");
            allInfoAboutStudents.add(textAboutStudents);
        }

        Path pathTwo = Paths.get(pathToSchools);
        Scanner scan2 = null;
        try {
            scan2 = new Scanner(pathTwo);
        } catch (IOException e) {
            System.out.println("Error2");
        }

        List<String[]> allInfoAboutSchools = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String[] textAboutSchools = scan2.nextLine().split(",");
            allInfoAboutSchools.add(textAboutSchools);
        }

        while (scan2.hasNextLine()) {
            String[] textAboutSchools = scan2.nextLine().split(", ");
        }

        List<School> listOfSchools = new ArrayList<>();

        Student student = null;
        School school = null;
        for (int i = 0; i < 3; i++) {
            String[] temporarySchoolInfo = allInfoAboutSchools.get(i);
            school = new School(
                    temporarySchoolInfo[0].trim(),
                    temporarySchoolInfo[1].trim(),
                    Integer.parseInt(temporarySchoolInfo[2].trim()));
            listOfSchools.add(school);

            for (int j = 0; j < 21; j++) {
                String[] temporaryStudentInfo = allInfoAboutStudents.get(j);
                student = new Student(
                        temporaryStudentInfo[0].trim(),
                        temporaryStudentInfo[1].trim(),
                        temporaryStudentInfo[2].trim(),
                        Integer.parseInt(temporaryStudentInfo[3].trim()),
                        Integer.parseInt(temporaryStudentInfo[4].trim()),
                        Double.parseDouble(temporaryStudentInfo[5].trim()),
                        temporaryStudentInfo[6].trim());
                school.getListOfStudents().add(student);
            }
        }
        printStudentsOfSchool(school.getListOfStudents(), listOfSchools);
        sortStudentsAverageMarks(school.getListOfStudents());
    }


    public static void printStudentsOfSchool(List<Student> listOfStudents, List<School> listOfSchools) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which school's students shall I print? Type: ");
        String userText = scan.nextLine();

        if (userText.equalsIgnoreCase(listOfSchools.get(0).getName())) {
            for (Student list : listOfStudents) {
                System.out.println(list.getName() + " " + list.getLastName());
            }
        }  //print names of Artem Lebedev

        else if (userText.equalsIgnoreCase(listOfSchools.get(1).getName())) {
            for (Student list : listOfStudents) {
                System.out.println(list.getName() + " " + list.getLastName());
            }
        }  //print Apple names

        else if (userText.equalsIgnoreCase(listOfSchools.get(2).getName())) {
            for (Student list : listOfStudents) {
                System.out.println(list.getName() + " " + list.getLastName());
            }
        }  //print Skolkovo names
    }

    public static void sortStudentsAverageMarks(List<Student> listOfStudents) {
        Collections.sort(listOfStudents, Comparator.comparing(Student::getAverageMark));
        for (Student list : listOfStudents) {
            System.out.println(list.getAverageMark());
        }

        listOfStudents.stream().sorted().forEach(System.out::println);

        //if i compare only by one parameter, this method is the best
        //if I compare by many parameters, need to override 'compareTo'
        //listOfStudents.stream().sorted(Comparator.comparing(Student::getAverageMark)).forEach(System.out::println);
        //listOfStudents.stream().sorted(Comparator.comparing(Student::getAverageMark).thenComparing(Student::getAge));
        listOfStudents.stream().sorted(Comparator.comparing((Student element) -> element.getAverageMark()).thenComparing((Student element) -> element.getAge()));
        listOfStudents.stream().flat

        List<String> list = Arrays.asList("a,b,c", "d,e,f", "g,h,i");
        list.stream()
                .flatMap(s -> Arrays.stream(s.split(",")))
                .forEach(System.out::println);

        list.stream().map(element -> element.split(", ")).forEach(element -> System.out.println(element));

        listOfStudents.stream().sorted( (element1, element2) -> {
            if (element1.getAverageMark() > element2.getAverageMark()) {
                return 1;
            }
            else return -1;
        }).forEach(System.out::println);
    }
}








