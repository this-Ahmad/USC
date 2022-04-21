package com.company;

public class Report {
    public Report(){}

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }

    public void firstFourWeekReportZumba(Zumba[] z, int n ){
        for (int i=0; i<=n; i++){
            if(z[i].week<5){
                z[i].details();
            }
        }
    }

    public void firstFourWeekReportYoga(Yoga[] y, int n ){
        for (int i=0; i<=n; i++){
            if(y[i].week<5){
                y[i].details();
            }
        }
    }

    public void firstFourWeekReportAquacise(Aquacise[] a, int n ){
        for (int i=0; i<=n; i++){
            if(a[i].week<5){
                a[i].details();
            }
        }
    }

    public void firstFourWeekReportBodyBlitz(BodyBlitz[] b, int n ){
        for (int i=0; i<=n; i++){
            if(b[i].week<5){
                b[i].details();
            }
        }
    }

    public void firstFourWeekReportBoxFit(BoxFit[] f, int n ){
        for (int i=0; i<=n; i++){
            if(f[i].week<5){
                f[i].details();
            }
        }
    }

    public void secondFourWeekReportZumba(Zumba[] z, int n ){
        for (int i=0; i<=n; i++){
            if(z[i].week>4 && z[i].week<9){
                z[i].details();
            }
        }
    }

    public void secondFourWeekReportYoga(Yoga[] y, int n ){
        for (int i=0; i<=n; i++){
            if(y[i].week>4 && y[i].week<9){
                y[i].details();
            }
        }
    }

    public void secondFourWeekReportAquacise(Aquacise[] a, int n ){
        for (int i=0; i<=n; i++){
            if(a[i].week>4 && a[i].week<9){
                a[i].details();
            }
        }
    }

    public void secondFourWeekReportBodyBlitz(BodyBlitz[] b, int n ){
        for (int i=0; i<=n; i++){
            if(b[i].week>4 && b[i].week<9){
                b[i].details();
            }
        }
    }

    public void secondFourWeekReportBoxFit(BoxFit[] f, int n ){
        for (int i=0; i<=n; i++){
            if(f[i].week>4 && f[i].week<9){
                f[i].details();
            }
        }
    }

    public void financialReportFirstFourWeek(Zumba[] z, int Z, Yoga[] y, int Y, Aquacise[] a, int A, BodyBlitz[] b, int bb, BoxFit[] f, int bf){
        int Zumba_fees=0;
        int Yoga_fees=0;
        int Aquacise_fees=0;
        int BodyBlitz_fees=0;
        int BOxFit_fees=0;
        for (int i=0; i<=Z; i++){
            if (z[i].week<5)
            Zumba_fees=Zumba_fees+z[i].getPrice();
        }
        for (int i=0; i<=Y; i++){
            if (y[i].week<5)
            Yoga_fees=Yoga_fees+y[i].getPrice();
        }
        for (int i=0; i<=A; i++){
            if (a[i].week<5)
            Aquacise_fees=Aquacise_fees+a[i].getPrice();
        }
        for (int i=0; i<=bb; i++){
            if (b[i].week<5)
            BodyBlitz_fees=BodyBlitz_fees+b[i].getPrice();
        }
        for (int i=0; i<=bf; i++){
            if (f[i].week<5)
            BOxFit_fees=BOxFit_fees+f[i].getPrice();
        }

        int[] Array = new int[]{Zumba_fees,Yoga_fees,Aquacise_fees,BodyBlitz_fees,BOxFit_fees};

        insertionSort(Array);//sorting array using insertion sort

        if (Array[4]==Zumba_fees){
            System.out.println("Zumba lesson has generated the highest income "+Zumba_fees);
        }
        if (Array[4]==Yoga_fees){
             System.out.println("Yoga lesson has generated the highest income "+Yoga_fees);
        }
        if (Array[4]==Aquacise_fees){
           System.out.println("Aquacise lesson has generated the highest income "+Aquacise_fees);
        }
        if (Array[4] == BodyBlitz_fees) {
            System.out.println("Body BLitz lesson has generated the highest income "+BodyBlitz_fees);
        }
        if (Array[4]==BOxFit_fees){
            System.out.println("Aquacise lesson has generated the highest income "+BOxFit_fees);
        }
    }

    public void financialReportSecondFourWeek(Zumba[] z, int Z, Yoga[] y, int Y, Aquacise[] a, int A, BodyBlitz[] b, int bb, BoxFit[] f, int bf){
        int Zumba_fees=0;
        int Yoga_fees=0;
        int Aquacise_fees=0;
        int BodyBlitz_fees=0;
        int BOxFit_fees=0;
        for (int i=0; i<=Z; i++){
            if (z[i].week>4 && z[i].week<9)
            Zumba_fees=Zumba_fees+z[i].getPrice();
        }
        for (int i=0; i<=Y; i++){
            if (y[i].week>4 && y[i].week<9)
            Yoga_fees=Yoga_fees+y[i].getPrice();
        }
        for (int i=0; i<=A; i++){
            if (a[i].week>4 && a[i].week<9)
            Aquacise_fees=Aquacise_fees+a[i].getPrice();
        }
        for (int i=0; i<=bb; i++){
            if (b[i].week>4 && b[i].week<9)
            BodyBlitz_fees=BodyBlitz_fees+b[i].getPrice();
        }
        for (int i=0; i<=bf; i++){
            if (f[i].week>4 && f[i].week<9)
            BOxFit_fees=BOxFit_fees+f[i].getPrice();
        }

        int[] Array = new int[]{Zumba_fees,Yoga_fees,Aquacise_fees,BodyBlitz_fees,BOxFit_fees};

        insertionSort(Array);//sorting array using insertion sort

        if (Array[4]==Zumba_fees){
            System.out.println("Zumba lesson has generated the highest income "+Zumba_fees);
        }
        if (Array[4]==Yoga_fees){
            System.out.println("Yoga lesson has generated the highest income "+Yoga_fees);
        }
        if (Array[4]==Aquacise_fees){
            System.out.println("Aquacise lesson has generated the highest income "+Aquacise_fees);
        }
        if (Array[4] == BodyBlitz_fees) {
            System.out.println("Body BLitz lesson has generated the highest income "+BodyBlitz_fees);
        }
        if (Array[4]==BOxFit_fees){
            System.out.println("Aquacise lesson has generated the highest income "+BOxFit_fees);
        }
    }



}
