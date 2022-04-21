package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        Student [] S = new Student[15];
        int student_count=0;

        Yoga [] Y = new Yoga[5];
        int yoga_count=0;
        int Yoga_fees=200;
        Zumba [] Z = new Zumba[5];
        int zumba_count=0;
        int Zumba_fees=100;

        Aquacise [] A = new Aquacise[5];
        int aquacise_count=0;
        int Aquacise_fees=300;
        BoxFit [] BF = new BoxFit[5];
        int boxfit_count=0;
        int Boxfit_fees=400;
        BodyBlitz [] BB = new BodyBlitz[5];
        int bodyblitz_count=0;
        int bodyblitz_fees=500;
        long week =(System.currentTimeMillis()/1000/3600/24/7)-1;
        int input;
        int input_session;
        TimeTable tt = new TimeTable();
        Scanner sc= new Scanner(System.in);


        System.out.println("Enter student Name and Id");
        String Student_name = sc.nextLine();
        int Student_id = sc.nextInt();
        S[student_count]=new Student(Student_name,Student_id);
        System.out.println("Enter 1 or 2 for\n1: Chose the exercise lesson student want to book from the given list\n2: Select the Day on which you want to book");
        do {
            input = sc.nextInt();
            if (input!=1 && input!=2)
            System.out.println("Invalid input enter again");
        }while (input!=1 && input!=2);
        if (input==1){
            System.out.println("Enter the serial number to select the exercise lesson student want to book\n1: Zumba\n2: Yoga\n3: Aquacise\n4: Body Blitz\n5: Box Fit");
            do {
                input = sc.nextInt();
                if (input<1||input>5)
                    System.out.println("Invalid input enter again");
            }while (input<1||input>5);
            switch (input) {
                case 1 -> {
                    tt.lessonZumba(Z, zumba_count, (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                    System.out.println("Select the day of lesson Enter 1: Saturday 2: Sunday");
                    do {
                        input = sc.nextInt();
                        if (input != 1 && input != 2)
                            System.out.println("Invalid input enter again");
                    } while (input != 1 && input != 2);
                    if (input == 1) {
                        System.out.println("Select the time of the lesson Enter 1: Morning 2: Afternoon 3: Evening");
                        do {
                            input = sc.nextInt();
                            if (input != 1 && input != 2 && input != 3)
                                System.out.println("Invalid input enter again");
                        } while (input != 1 && input != 2 && input != 3);
                        if (input == 1) {
                            Z[zumba_count] = new Zumba("Saturday", "Morning", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Zumba_fees);
                            Z[zumba_count].incrementNo_Of_students();
                            Z[zumba_count].updatePrice(Zumba_fees);
                            S[student_count].bookALesson("Zumba", "Morning", "Saturday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input == 2) {
                            Z[zumba_count] = new Zumba("Saturday", "Afternoon", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Zumba_fees);
                            Z[zumba_count].incrementNo_Of_students();
                            Z[zumba_count].updatePrice(Zumba_fees);
                            S[student_count].bookALesson("Zumba", "Afternoon", "Saturday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input == 3) {
                            Z[zumba_count] = new Zumba("Saturday", "Evening", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Zumba_fees);
                            Z[zumba_count].incrementNo_Of_students();
                            Z[zumba_count].updatePrice(Zumba_fees);
                            S[student_count].bookALesson("Zumba", "Evening", "Saturday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        input = 0;
                    }
                    if (input == 2) {
                        System.out.println("Select the time of the lesson Enter 1: Morning 2: Afternoon 3: Evening");
                        do {
                            input = sc.nextInt();
                            if (input != 1 && input != 2 && input != 3)
                                System.out.println("Invalid input enter again");
                        } while (input != 1 && input != 2 && input != 3);
                        if (input == 1) {
                            Z[zumba_count] = new Zumba("Sunday", "Morning", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Zumba_fees);
                            Z[zumba_count].incrementNo_Of_students();
                            Z[zumba_count].updatePrice(Zumba_fees);
                            S[student_count].bookALesson("Zumba", "Morning", "Sunday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input == 2) {
                            Z[zumba_count] = new Zumba("Sunday", "Afternoon", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Zumba_fees);
                            Z[zumba_count].incrementNo_Of_students();
                            Z[zumba_count].updatePrice(Zumba_fees);
                            S[student_count].bookALesson("Zumba", "Afternoon", "Sunday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input == 3) {
                            Z[zumba_count] = new Zumba("Sunday", "Evening", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Zumba_fees);
                            Z[zumba_count].incrementNo_Of_students();
                            Z[zumba_count].updatePrice(Zumba_fees);
                            S[student_count].bookALesson("Zumba", "Evening", "Sunday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        input = 0;
                    }
                }
                case 2 -> {
                    tt.lessonYoga(Y, yoga_count, (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                    System.out.println("Select the day of lesson Enter 1: Saturday 2: Sunday");
                    do {
                        input = sc.nextInt();
                        if (input != 1 && input != 2)
                            System.out.println("Invalid input enter again");
                    } while (input != 1 && input != 2);
                    if (input == 1) {
                        System.out.println("Select the time of the lesson Enter 1: Morning 2: Afternoon 3: Evening");
                        do {
                            input = sc.nextInt();
                            if (input != 1 && input != 2 && input != 3)
                                System.out.println("Invalid input enter again");
                        } while (input != 1 && input != 2 && input != 3);
                        if (input == 1) {
                            Y[yoga_count] = new Yoga("Saturday", "Morning", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Yoga_fees);
                            Y[yoga_count].incrementNo_Of_students();
                            Y[yoga_count].updatePrice(Yoga_fees);
                            S[student_count].bookALesson("Yoga", "Morning", "Saturday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input == 2) {
                            Y[yoga_count] = new Yoga("Saturday", "Afternoon", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Yoga_fees);
                            Y[yoga_count].incrementNo_Of_students();
                            Y[yoga_count].updatePrice(Yoga_fees);
                            S[student_count].bookALesson("Yoga", "Afternoon", "Saturday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input == 3) {
                            Y[yoga_count] = new Yoga("Saturday", "Evening", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Yoga_fees);
                            Y[yoga_count].incrementNo_Of_students();
                            Y[yoga_count].updatePrice(Yoga_fees);
                            S[student_count].bookALesson("Yoga", "Evening", "Saturday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        input = 0;
                    }
                    if (input == 2) {
                        System.out.println("Select the time of the lesson Enter 1: Morning 2: Afternoon 3: Evening");
                        do {
                            input = sc.nextInt();
                            if (input != 1 && input != 2 && input != 3)
                                System.out.println("Invalid input enter again");
                        } while (input != 1 && input != 2 && input != 3);
                        if (input == 1) {
                            Y[yoga_count] = new Yoga("Sunday", "Morning", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Yoga_fees);
                            Y[yoga_count].incrementNo_Of_students();
                            Y[yoga_count].updatePrice(Yoga_fees);
                            S[student_count].bookALesson("Yoga", "Morning", "Sunday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input == 2) {
                            Y[yoga_count] = new Yoga("Sunday", "Afternoon", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Yoga_fees);
                            Y[yoga_count].incrementNo_Of_students();
                            Y[yoga_count].updatePrice(Yoga_fees);
                            S[student_count].bookALesson("Yoga", "Afternoon", "Sunday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input == 3) {
                            Y[yoga_count] = new Yoga("Sunday", "Evening", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Yoga_fees);
                            Y[yoga_count].incrementNo_Of_students();
                            Y[yoga_count].updatePrice(Yoga_fees);
                            S[student_count].bookALesson("Yoga", "Evening", "Sunday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        input = 0;
                    }
                }
                case 3 -> {
                    tt.lessonAquacise(A, aquacise_count, (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                    System.out.println("Select the day of lesson Enter 1: Saturday 2: Sunday");
                    do {
                        input = sc.nextInt();
                        if (input != 1 && input != 2)
                            System.out.println("Invalid input enter again");
                    } while (input != 1 && input != 2);
                    if (input == 1) {
                        System.out.println("Select the time of the lesson Enter 1: Morning 2: Afternoon 3: Evening");
                        do {
                            input = sc.nextInt();
                            if (input != 1 && input != 2 && input != 3)
                                System.out.println("Invalid input enter again");
                        } while (input != 1 && input != 2 && input != 3);
                        if (input == 1) {
                            A[aquacise_count] = new Aquacise("Saturday", "Morning", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Aquacise_fees);
                            A[aquacise_count].incrementNo_Of_students();
                            A[aquacise_count].updatePrice(Aquacise_fees);
                            S[student_count].bookALesson("Aquacise", "Morning", "Saturday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input == 2) {
                            A[aquacise_count] = new Aquacise("Saturday", "Afternoon", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Aquacise_fees);
                            A[aquacise_count].incrementNo_Of_students();
                            A[aquacise_count].updatePrice(Aquacise_fees);
                            S[student_count].bookALesson("Aquacise", "Afternoon", "Saturday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input == 3) {
                            A[aquacise_count] = new Aquacise("Saturday", "Evening", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Aquacise_fees);
                            A[aquacise_count].incrementNo_Of_students();
                            A[aquacise_count].updatePrice(Aquacise_fees);
                            S[student_count].bookALesson("Aquacise", "Evening", "Saturday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        input = 0;
                    }
                    if (input == 2) {
                        System.out.println("Select the time of the lesson Enter 1: Morning 2: Afternoon 3: Evening");
                        do {
                            input = sc.nextInt();
                            if (input != 1 && input != 2 && input != 3)
                                System.out.println("Invalid input enter again");
                        } while (input != 1 && input != 2 && input != 3);
                        if (input == 1) {
                            A[aquacise_count] = new Aquacise("Sunday", "Morning", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Aquacise_fees);
                            A[aquacise_count].incrementNo_Of_students();
                            A[aquacise_count].updatePrice(Aquacise_fees);
                            S[student_count].bookALesson("Aquacise", "Morning", "Sunday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input == 2) {
                            A[aquacise_count] = new Aquacise("Sunday", "Afternoon", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Aquacise_fees);
                            A[aquacise_count].incrementNo_Of_students();
                            A[aquacise_count].updatePrice(Aquacise_fees);
                            S[student_count].bookALesson("Aquacise", "Afternoon", "Sunday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input == 3) {
                            A[aquacise_count] = new Aquacise("Sunday", "Evening", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Aquacise_fees);
                            A[aquacise_count].incrementNo_Of_students();
                            A[aquacise_count].updatePrice(Aquacise_fees);
                            S[student_count].bookALesson("Aquacise", "Evening", "Sunday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        input = 0;
                    }
                }
                case 4 -> {
                    tt.lessonBodyBlitz(BB, bodyblitz_count, (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                    System.out.println("Select the day of lesson Enter 1: Saturday 2: Sunday");
                    do {
                        input = sc.nextInt();
                        if (input != 1 && input != 2)
                            System.out.println("Invalid input enter again");
                    } while (input != 1 && input != 2);
                    if (input == 1) {
                        System.out.println("Select the time of the lesson Enter 1: Morning 2: Afternoon 3: Evening");
                        do {
                            input = sc.nextInt();
                            if (input != 1 && input != 2 && input != 3)
                                System.out.println("Invalid input enter again");
                        } while (input != 1 && input != 2 && input != 3);
                        if (input == 1) {
                            BB[bodyblitz_count] = new BodyBlitz("Saturday", "Morning", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), bodyblitz_fees);
                            BB[bodyblitz_count].incrementNo_Of_students();
                            BB[bodyblitz_count].updatePrice(bodyblitz_fees);
                            S[student_count].bookALesson("Body Blitz", "Morning", "Saturday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input == 2) {
                            BB[bodyblitz_count] = new BodyBlitz("Saturday", "Afternoon", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), bodyblitz_fees);
                            BB[bodyblitz_count].incrementNo_Of_students();
                            BB[bodyblitz_count].updatePrice(bodyblitz_fees);
                            S[student_count].bookALesson("Body Blitz", "Afternoon", "Saturday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input == 3) {
                            BB[bodyblitz_count] = new BodyBlitz("Saturday", "Evening", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), bodyblitz_fees);
                            BB[bodyblitz_count].incrementNo_Of_students();
                            BB[bodyblitz_count].updatePrice(bodyblitz_fees);
                            S[student_count].bookALesson("Body Blitz", "Evening", "Saturday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        input = 0;
                    }
                    if (input == 2) {
                        System.out.println("Select the time of the lesson Enter 1: Morning 2: Afternoon 3: Evening");
                        do {
                            input = sc.nextInt();
                            if (input != 1 && input != 2 && input != 3)
                                System.out.println("Invalid input enter again");
                        } while (input != 1 && input != 2 && input != 3);
                        if (input == 1) {
                            BB[bodyblitz_count] = new BodyBlitz("Sunday", "Morning", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), bodyblitz_fees);
                            BB[bodyblitz_count].incrementNo_Of_students();
                            BB[bodyblitz_count].updatePrice(bodyblitz_fees);
                            S[student_count].bookALesson("Body Blitz", "Morning", "Sunday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input == 2) {
                            BB[bodyblitz_count] = new BodyBlitz("Sunday", "Afternoon", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), bodyblitz_fees);
                            BB[bodyblitz_count].incrementNo_Of_students();
                            BB[bodyblitz_count].updatePrice(bodyblitz_fees);
                            S[student_count].bookALesson("Body Blitz", "Afternoon", "Sunday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input == 3) {
                            BB[bodyblitz_count] = new BodyBlitz("Sunday", "Evening", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), bodyblitz_fees);
                            BB[bodyblitz_count].incrementNo_Of_students();
                            BB[bodyblitz_count].updatePrice(bodyblitz_fees);
                            S[student_count].bookALesson("Body Blitz", "Evening", "Sunday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        input = 0;
                    }
                }
                case 5 -> {
                    tt.lessonBoxFit(BF, boxfit_count, (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                    System.out.println("Select the day of lesson Enter 1: Saturday 2: Sunday");
                    do {
                        input = sc.nextInt();
                        if (input != 1 && input != 2)
                            System.out.println("Invalid input enter again");
                    } while (input != 1 && input != 2);
                    if (input == 1) {
                        System.out.println("Select the time of the lesson Enter 1: Morning 2: Afternoon 3: Evening");
                        do {
                            input = sc.nextInt();
                            if (input != 1 && input != 2 && input != 3)
                                System.out.println("Invalid input enter again");
                        } while (input != 1 && input != 2 && input != 3);
                        if (input == 1) {
                            BF[boxfit_count] = new BoxFit("Saturday", "Morning", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Boxfit_fees);
                            BF[boxfit_count].incrementNo_Of_students();
                            BF[boxfit_count].updatePrice(Boxfit_fees);
                            S[student_count].bookALesson("Box Fit", "Morning", "Saturday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input == 2) {
                            BF[boxfit_count] = new BoxFit("Saturday", "Afternoon", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Boxfit_fees);
                            BF[boxfit_count].incrementNo_Of_students();
                            BF[boxfit_count].updatePrice(Boxfit_fees);
                            S[student_count].bookALesson("Box Fit", "Afternoon", "Saturday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input == 3) {
                            BF[boxfit_count] = new BoxFit("Saturday", "Evening", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Boxfit_fees);
                            BF[boxfit_count].incrementNo_Of_students();
                            BF[boxfit_count].updatePrice(Boxfit_fees);
                            S[student_count].bookALesson("Box Fit", "Evening", "Saturday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        input = 0;
                    }
                    if (input == 2) {
                        System.out.println("Select the time of the lesson Enter 1: Morning 2: Afternoon 3: Evening");
                        do {
                            input = sc.nextInt();
                            if (input != 1 && input != 2 && input != 3)
                                System.out.println("Invalid input enter again");
                        } while (input != 1 && input != 2 && input != 3);
                        if (input == 1) {
                            BF[boxfit_count] = new BoxFit("Sunday", "Morning", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Boxfit_fees);
                            BF[boxfit_count].incrementNo_Of_students();
                            BF[boxfit_count].updatePrice(Boxfit_fees);
                            S[student_count].bookALesson("Box Fit", "Morning", "Sunday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input == 2) {
                            BF[boxfit_count] = new BoxFit("Sunday", "Afternoon", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Boxfit_fees);
                            BF[boxfit_count].incrementNo_Of_students();
                            BF[boxfit_count].updatePrice(Boxfit_fees);
                            S[student_count].bookALesson("Box Fit", "Afternoon", "Sunday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input == 3) {
                            BF[boxfit_count] = new BoxFit("Sunday", "Evening", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Boxfit_fees);
                            BF[boxfit_count].incrementNo_Of_students();
                            BF[boxfit_count].updatePrice(Boxfit_fees);
                            S[student_count].bookALesson("Box Fit", "Evening", "Sunday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        input = 0;
                    }
                }
            }

        }
        if (input==2){
            System.out.println("Enter the serial number to select the on which student want to book exercise\n1: Saturday\n2: Sunday");
            do {
                input = sc.nextInt();
                if (input!=1 && input!=2)
                    System.out.println("Invalid input enter again");
            }while (input!=1 && input!=2);
            switch (input) {
                case 1 -> {
                    tt.saturdayLesson(Z, zumba_count, Y, yoga_count, A, aquacise_count, BB, bodyblitz_count, BF, boxfit_count, (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                    System.out.println("Enter the serial number to select the exercise lesson student want to book\n1: Zumba\n2: Yoga\n3: Aquacise\n4: Body Blitz\n5: Box Fit");
                    do {
                        input = sc.nextInt();
                        if (input < 1 || input > 5)
                            System.out.println("Invalid input enter again");
                    } while (input < 1 || input > 5);
                    System.out.println("Which Session you want to book\n1: Morning 2: Afternoon 3: Evening");
                    do {
                        input_session = sc.nextInt();
                        if (input_session < 1 || input_session > 3)
                            System.out.println("Invalid input enter again");
                    } while (input_session < 1 || input_session > 3);
                    if (input == 1) {
                        if (input_session == 1) {
                            Z[zumba_count] = new Zumba("Saturday", "Morning", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Zumba_fees);
                            Z[zumba_count].incrementNo_Of_students();
                            Z[zumba_count].updatePrice(Zumba_fees);
                            S[student_count].bookALesson("Zumba", "Morning", "Saturday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input_session == 2) {
                            Z[zumba_count] = new Zumba("Saturday", "Afternoon", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Zumba_fees);
                            Z[zumba_count].incrementNo_Of_students();
                            Z[zumba_count].updatePrice(Zumba_fees);
                            S[student_count].bookALesson("Zumba", "Afternoon", "Saturday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input_session == 3) {
                            Z[zumba_count] = new Zumba("Saturday", "Evening", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Zumba_fees);
                            Z[zumba_count].incrementNo_Of_students();
                            Z[zumba_count].updatePrice(Zumba_fees);
                            S[student_count].bookALesson("Zumba", "Evening", "Saturday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                    }
                    if (input == 2) {
                        if (input_session == 1) {
                            Y[yoga_count] = new Yoga("Saturday", "Morning", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Yoga_fees);
                            Y[yoga_count].incrementNo_Of_students();
                            Y[yoga_count].updatePrice(Yoga_fees);
                            S[student_count].bookALesson("Yoga", "Morning", "Saturday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input_session == 2) {
                            Y[yoga_count] = new Yoga("Saturday", "Afternoon", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Yoga_fees);
                            Y[yoga_count].incrementNo_Of_students();
                            Y[yoga_count].updatePrice(Yoga_fees);
                            S[student_count].bookALesson("Yoga", "Afternoon", "Saturday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input_session == 3) {
                            Y[yoga_count] = new Yoga("Saturday", "Evening", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Yoga_fees);
                            Y[yoga_count].incrementNo_Of_students();
                            Y[yoga_count].updatePrice(Yoga_fees);
                            S[student_count].bookALesson("Yoga", "Evening", "Saturday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                    }
                    if (input == 3) {
                        if (input_session == 1) {
                            A[aquacise_count] = new Aquacise("Saturday", "Morning", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Aquacise_fees);
                            A[aquacise_count].incrementNo_Of_students();
                            A[aquacise_count].updatePrice(Aquacise_fees);
                            S[student_count].bookALesson("Aquacise", "Morning", "Saturday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input_session == 2) {
                            A[aquacise_count] = new Aquacise("Saturday", "Afternoon", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Aquacise_fees);
                            A[aquacise_count].incrementNo_Of_students();
                            A[aquacise_count].updatePrice(Aquacise_fees);
                            S[student_count].bookALesson("Aquacise", "Afternoon", "Saturday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input_session == 3) {
                            A[aquacise_count] = new Aquacise("Saturday", "Evening", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Aquacise_fees);
                            A[aquacise_count].incrementNo_Of_students();
                            A[aquacise_count].updatePrice(Aquacise_fees);
                            S[student_count].bookALesson("Aquacise", "Evening", "Saturday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                    }
                    if (input == 4) {
                        if (input_session == 1) {
                            BB[bodyblitz_count] = new BodyBlitz("Saturday", "Morning", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), bodyblitz_fees);
                            BB[bodyblitz_count].incrementNo_Of_students();
                            BB[bodyblitz_count].updatePrice(bodyblitz_fees);
                            S[student_count].bookALesson("Body Blitz", "Morning", "Saturday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input_session == 2) {
                            BB[bodyblitz_count] = new BodyBlitz("Saturday", "Afternoon", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), bodyblitz_fees);
                            BB[bodyblitz_count].incrementNo_Of_students();
                            BB[bodyblitz_count].updatePrice(bodyblitz_fees);
                            S[student_count].bookALesson("Body Blitz", "Afternoon", "Saturday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input_session == 3) {
                            BB[bodyblitz_count] = new BodyBlitz("Saturday", "Evening", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), bodyblitz_fees);
                            BB[bodyblitz_count].incrementNo_Of_students();
                            BB[bodyblitz_count].updatePrice(bodyblitz_fees);
                            S[student_count].bookALesson("Body Blitz", "Evening", "Saturday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                    }
                    if (input == 5) {
                        if (input_session == 1) {
                            BF[boxfit_count] = new BoxFit("Saturday", "Morning", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Boxfit_fees);
                            BF[boxfit_count].incrementNo_Of_students();
                            BF[boxfit_count].updatePrice(Boxfit_fees);
                            S[student_count].bookALesson("Box Fit", "Morning", "Saturday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input_session == 2) {
                            BF[boxfit_count] = new BoxFit("Saturday", "Afternoon", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Boxfit_fees);
                            BF[boxfit_count].incrementNo_Of_students();
                            BF[boxfit_count].updatePrice(Boxfit_fees);
                            S[student_count].bookALesson("Box Fit", "Afternoon", "Saturday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input_session == 3) {
                            BF[boxfit_count] = new BoxFit("Saturday", "Evening", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Boxfit_fees);
                            BF[boxfit_count].incrementNo_Of_students();
                            BF[boxfit_count].updatePrice(Boxfit_fees);
                            S[student_count].bookALesson("Box Fit", "Evening", "Saturday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                    }
                }
                case 2 -> {
                    tt.sundayLesson(Z, zumba_count, Y, yoga_count, A, aquacise_count, BB, bodyblitz_count, BF, boxfit_count, (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                    System.out.println("Enter the serial number to select the exercise lesson student want to book\n1: Zumba\n2: Yoga\n3: Aquacise\n4: Body Blitz\n5: Box Fit");
                    do {
                        input = sc.nextInt();
                        if (input < 1 || input > 5)
                            System.out.println("Invalid input enter again");
                    } while (input < 1 || input > 5);
                    System.out.println("Which Session you want to book\n1: Morning 2: Afternoon 3: Evening");
                    do {
                        input_session = sc.nextInt();
                        if (input_session < 1 || input_session > 3)
                            System.out.println("Invalid input enter again");
                    } while (input_session < 1 || input_session > 3);
                    if (input == 1) {
                        if (input_session == 1) {
                            Z[zumba_count] = new Zumba("Sunday", "Morning", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Zumba_fees);
                            Z[zumba_count].incrementNo_Of_students();
                            Z[zumba_count].updatePrice(Zumba_fees);
                            S[student_count].bookALesson("Zumba", "Morning", "Sunday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input_session == 2) {
                            Z[zumba_count] = new Zumba("Sunday", "Afternoon", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Zumba_fees);
                            Z[zumba_count].incrementNo_Of_students();
                            Z[zumba_count].updatePrice(Zumba_fees);
                            S[student_count].bookALesson("Zumba", "Afternoon", "Sunday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input_session == 3) {
                            Z[zumba_count] = new Zumba("Sunday", "Evening", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Zumba_fees);
                            Z[zumba_count].incrementNo_Of_students();
                            Z[zumba_count].updatePrice(Zumba_fees);
                            S[student_count].bookALesson("Zumba", "Evening", "Sunday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                    }
                    if (input == 2) {
                        if (input_session == 1) {
                            Y[yoga_count] = new Yoga("Sunday", "Morning", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Yoga_fees);
                            Y[yoga_count].incrementNo_Of_students();
                            Y[yoga_count].updatePrice(Yoga_fees);
                            S[student_count].bookALesson("Yoga", "Morning", "Sunday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input_session == 2) {
                            Y[yoga_count] = new Yoga("Sunday", "Afternoon", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Yoga_fees);
                            Y[yoga_count].incrementNo_Of_students();
                            Y[yoga_count].updatePrice(Yoga_fees);
                            S[student_count].bookALesson("Yoga", "Afternoon", "Sunday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input_session == 3) {
                            Y[yoga_count] = new Yoga("Sunday", "Evening", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Yoga_fees);
                            Y[yoga_count].incrementNo_Of_students();
                            Y[yoga_count].updatePrice(Yoga_fees);
                            S[student_count].bookALesson("Yoga", "Evening", "Sunday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                    }
                    if (input == 3) {
                        if (input_session == 1) {
                            A[aquacise_count] = new Aquacise("Sunday", "Morning", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Aquacise_fees);
                            A[aquacise_count].incrementNo_Of_students();
                            A[aquacise_count].updatePrice(Aquacise_fees);
                            S[student_count].bookALesson("Aquacise", "Morning", "Sunday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input_session == 2) {
                            A[aquacise_count] = new Aquacise("Sunday", "Afternoon", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Aquacise_fees);
                            A[aquacise_count].incrementNo_Of_students();
                            A[aquacise_count].updatePrice(Aquacise_fees);
                            S[student_count].bookALesson("Aquacise", "Afternoon", "Sunday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input_session == 3) {
                            A[aquacise_count] = new Aquacise("Sunday", "Evening", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Aquacise_fees);
                            A[aquacise_count].incrementNo_Of_students();
                            A[aquacise_count].updatePrice(Aquacise_fees);
                            S[student_count].bookALesson("Aquacise", "Evening", "Sunday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                    }
                    if (input == 4) {
                        if (input_session == 1) {
                            BB[bodyblitz_count] = new BodyBlitz("Sunday", "Morning", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), bodyblitz_fees);
                            BB[bodyblitz_count].incrementNo_Of_students();
                            BB[bodyblitz_count].updatePrice(bodyblitz_fees);
                            S[student_count].bookALesson("Body Blitz", "Morning", "Sunday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input_session == 2) {
                            BB[bodyblitz_count] = new BodyBlitz("Sunday", "Afternoon", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), bodyblitz_fees);
                            BB[bodyblitz_count].incrementNo_Of_students();
                            BB[bodyblitz_count].updatePrice(bodyblitz_fees);
                            S[student_count].bookALesson("Body Blitz", "Afternoon", "Sunday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input_session == 3) {
                            BB[bodyblitz_count] = new BodyBlitz("Sunday", "Evening", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), bodyblitz_fees);
                            BB[bodyblitz_count].incrementNo_Of_students();
                            BB[bodyblitz_count].updatePrice(bodyblitz_fees);
                            S[student_count].bookALesson("Body Blitz", "Evening", "Sunday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                    }
                    if (input == 5) {
                        if (input_session == 1) {
                            BF[boxfit_count] = new BoxFit("Sunday", "Morning", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Boxfit_fees);
                            BF[boxfit_count].incrementNo_Of_students();
                            BF[boxfit_count].updatePrice(Boxfit_fees);
                            S[student_count].bookALesson("Box Fit", "Morning", "Sunday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input_session == 2) {
                            BF[boxfit_count] = new BoxFit("Sunday", "Afternoon", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Boxfit_fees);
                            BF[boxfit_count].incrementNo_Of_students();
                            BF[boxfit_count].updatePrice(Boxfit_fees);
                            S[student_count].bookALesson("Box Fit", "Afternoon", "Sunday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                        if (input_session == 3) {
                            BF[boxfit_count] = new BoxFit("Sunday", "Evening", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week), Boxfit_fees);
                            BF[boxfit_count].incrementNo_Of_students();
                            BF[boxfit_count].updatePrice(Boxfit_fees);
                            S[student_count].bookALesson("Box Fit", "Evening", "Sunday", (System.currentTimeMillis() / 1000 / 3600 / 24 / 7) - (week));
                        }
                    }
                }
            }



        }

    }
}
