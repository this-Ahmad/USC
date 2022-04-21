package com.company;

class Lesson {
    String day;
    String timing;
    long week;

    public Lesson(){}

    public Lesson(String day, String timing, long week){
        this.day=day;
        this.timing= timing;
        this.week= week;
    }

    public long getWeek() {
        return week;
    }

    public String getDay() {
        return day;
    }

    public String getTiming() {
        return timing;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public void setWeek(long week) {
        this.week = week;
    }

    public void details(){
        System.out.println("Yoga lesson session "+getTiming()+ " on "+getDay()+" of week "+getWeek());

    }
}
