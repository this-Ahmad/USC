package com.company;
import java.util.*;

public class BoxFit extends Lesson{
    int price;
    int no_of_students;
    int[] RATE = new int[4];
    String[] REVIEW = new String[4];
    int averagerating=0;
    public BoxFit(){}

    Scanner sc= new Scanner(System.in); //System.in is a standard input stream
    public BoxFit(String day, String timing, long week, int price){
        super(day, timing,week);
        this.price=price;
        no_of_students=0;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void updatePrice(int price) {
        this.price = price*no_of_students;
    }

    public int getNo_of_students() {
        return no_of_students;
    }

    public void incrementNo_Of_students() {
        if (no_of_students<4)
            this.no_of_students = no_of_students+1;
        else
            System.out.println("Lesson is completely booked\nNo more students can be enrolled");
    }

    public void rating(){
        System.out.print("Rate your experience in numbers according to\n 1: Very dissatisfied, 2: Dissatisfied, 3: Ok, 4: Satisfied, 5: Very Satisfied");
        int rate  = sc.nextInt();//reads int
        RATE[no_of_students]=rate;

    }

    public void review(){
        System.out.print("Enter a string: ");
        String rev = sc.nextLine();//reads string
        REVIEW[no_of_students]=rev;

    }

    public int averageRating(){
        for (int i=0; i<=getNo_of_students(); i++){
            averagerating=averagerating+RATE[i];
        }
        averagerating/=getNo_of_students();
        return averagerating;
    }
    public void printReviewWithRating(){
        for (int i=0; i<=getNo_of_students();i++){
            System.out.println("Review : "+REVIEW[i]+ "Rating : "+RATE[i]);
        }
    }

    public void details(){
        super.details();
        System.out.println("Number of students attended "+getNo_of_students());
        System.out.println("Average Rating "+averageRating());
    }
}
