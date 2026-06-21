package PROJECT.PROJECT_2;

import java.util.Scanner;

public class student_marks_report_system {
    static Scanner sc = new Scanner(System.in);
    static String name;
    static int stdId;
    static int englishMarks;
    static int dsaMarks;
    static int javaMarks;
    static int webDevMarks;
    static int problemSolvingMarks;
    static int operatingSysMarks;
    static int total;
    static double average;
    static double percentage;
    static String grade;
    static boolean isDataEntered = false;

    public static void main(String[] args) {

        onStart();

    }

    static void onStart() {
        while (true) {
            System.out.println("");
            System.out.println("\nJAVATRON UNIVERSITY");
            System.out.println("1. STUDENT DETAILS");
            System.out.println("2. ALL SUBJECT MARKS");
            System.out.println("3. CALCULATE PERCENTAGE");
            System.out.println("4. AVERAGE");
            System.out.println("5. STATUS");
            System.out.println("6. VIEW COMPLETE MARKSHEET");
            System.out.println("7. EXIT");

            System.out.print("\nEnter your Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    createStudent();
                    break;

                case 2:
                    marks();
                    break;

                case 3:
                    percentage();
                    break;

                case 4:
                    average();
                    break;

                case 5:
                    status();
                    break;

                case 6:
                    if (!isDataEntered) {
                        System.out.println("Please fill all details from above choices to get final marksheet");
                        return;
                    } else {
                        completeMarkSheet();
                    }
                    break;

                    case 7:
                        System.out.println("Exit Successful");
                        return;

                default:
                    System.out.println("INVALID CHOICE");
                    break;
            }

        }
    }

    static void createStudent() {
        isDataEntered = true;

        System.out.print("\nEnter Your Name: ");
        name = sc.next();

        while (true) {
            System.out.print("\nEnter Your ID: ");
            stdId = sc.nextInt();
            if (stdId >= 100 && stdId <= 999) {
                break;
            } else {
                System.out.println("Enter ID with 3-digit.");
            }
        }

    }

    static void marks() {
        isDataEntered = true;
        System.out.print("\nEnter Your English Marks: ");
        englishMarks = sc.nextInt();

        System.out.print("\nEnter Your DSA Marks: ");
        dsaMarks = sc.nextInt();

        System.out.print("\nEnter Your Java Marks: ");
        javaMarks = sc.nextInt();

        System.out.print("\nEnter Your Problem Solving Marks: ");
        problemSolvingMarks = sc.nextInt();

        System.out.print("\nEnter Your Web Development Marks: ");
        webDevMarks = sc.nextInt();

        System.out.print("\nEnter Your Operating System Marks: ");
        operatingSysMarks = sc.nextInt();

        total = (englishMarks + dsaMarks + javaMarks + problemSolvingMarks + webDevMarks + operatingSysMarks);

        System.err.print("\nTOTAL MARKS: " + total);
    }

    static void percentage() {
        percentage = (total / 600.0) * 100;

        System.out.println("PERCENTAGE: " + String.format("%.1f", percentage));
    }

    static void average() {
        average = total / 6.0;

        System.out.print("AVERAGE: " + String.format("%.1f",average));
    }

    static void status() {
        if (englishMarks < 35 || javaMarks < 35 || dsaMarks < 35 || problemSolvingMarks < 35 || webDevMarks < 35
                || operatingSysMarks < 35) {
            System.out.print("FAIL");
        } else {
            System.out.print("PASS");
        }

        if (percentage >= 90)
            grade = "O";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 50)
            grade = "D";
        else
            grade = "E";
    }

    static void completeMarkSheet() {
        System.err.print("\nSTUDENT NAME: " + name);
        System.out.print("\nSTUDENT ID: " + stdId);

        System.out.print("\nSUBJECTS            MARKS\n");
        System.out.print(" \nEnglish             " + englishMarks);
        System.out.print(" \nJava                " + javaMarks);
        System.out.print(" \nDSA                 " + dsaMarks);
        System.out.print(" \nWeb Development     " + englishMarks);
        System.out.print(" \nProblem Solving     " + problemSolvingMarks);
        System.out.print(" \nOperating Systems   " + operatingSysMarks);

        System.out.print("\nTOTAL:" + total);

        System.out.print("\nPERCENTAGE: " + percentage);

        System.out.print("\nAVERAGE: " + average);

        System.out.print("STATUS: " + grade);

    }
}
