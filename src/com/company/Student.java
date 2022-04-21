package com.company;


public class Student {
    String name;
    int id;
    int no_of_lesson=0;
    String ExersiceName[] = new String[10];
    String ExersiceTiming[] = new String[10];
    String ExersiceDay[] = new String[10];
    long ExersiceWeek[] = new long[10];

    public Student (){

    }

    public Student(String name, int id){
        this.name=name;
        this.id=id;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo_of_lesson() {
        return no_of_lesson;
    }

//    public void setNo_of_lesson(int no_of_lesson) {
//        this.no_of_lesson = no_of_lesson;
//    }

    public void bookALesson(String exersice,String timing, String day, long week){
        boolean flag = true;
        for (int i=0; i<=no_of_lesson; i++){
            if (ExersiceTiming[i]==timing && ExersiceDay[i]==day && ExersiceWeek[i]==week){
                flag = false;
            }}
            if (flag==true){
        this.ExersiceName[no_of_lesson]=exersice;
        this.ExersiceTiming[no_of_lesson]=timing;
        this.ExersiceDay[no_of_lesson]=day;
        this.ExersiceWeek[no_of_lesson]=week;
        System.out.println("You have booked "+exersice+ " lesson's "+timing+ " session on "+day+ " of week "+week);
        this.no_of_lesson=no_of_lesson+1;}
            else
                System.out.println("You have Already booked a lesson in this time slot");


    }
    public void changeBooking(String exersice,String timing, String day, long week){
            boolean flag = true;
            for (int i=0; i<=no_of_lesson; i++){
                if (ExersiceTiming[i]==timing && ExersiceDay[i]==day && ExersiceWeek[i]==week){
                    flag = false;
                }}
                if (flag==true){
        this.ExersiceName[no_of_lesson]=exersice;
        this.ExersiceTiming[no_of_lesson]=timing;
        this.ExersiceWeek[no_of_lesson]=week;
        System.out.println("You have booked "+exersice+ " lesson's "+timing+ " session on "+day+ " of week "+week);}
                else
                    System.out.println("You have Already booked a lesson in this time slot");

    }

    public void printDetailsOfStudent(){
        System.out.println("Student name is "+getName()+" id is "+getId());
        System.out.println("Student has booked following lesson on following days and time");
        System.out.println("Exersice Name | Session | Day | Week");
        for (int i=0; i<=no_of_lesson; i++ ){
            System.out.println(ExersiceName[i]+"    "+ExersiceTiming[i]+"    "+ ExersiceDay[i]+"   "+ExersiceWeek[i]);
        }
    }
}

