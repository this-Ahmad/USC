package com.company;

public class TimeTable {
    public TimeTable() {
    }

    public void lessonZumba(Zumba[] z, int n, long week) {
        System.out.println("|----|----|----Zumba----|----|----|");
        for (int i = 0; i <= n; i++) {
            if (z[i].day.equals("Saturday") && z[i].timing.equals("Morning") && z[i].week==week) {
                System.out.println("Saturday     Morning     " + (4 - z[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= n; i++) {
            if (z[i].day.equals("Saturday") && z[i].timing.equals("Afternoon") && z[i].week==week) {
                System.out.println("Saturday     Afternoon     " + (4 - z[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= n; i++) {
            if (z[i].day.equals("Saturday") && z[i].timing.equals("Evening") && z[i].week==week) {
                System.out.println("Saturday     Evening     " + (4 - z[i].no_of_students) + " seats Remaining");
            break;
            }
        }

        for (int i = 0; i <= n; i++) {
            if (z[i].day.equals("Sunday") && z[i].timing.equals("Morning") && z[i].week==week) {
                System.out.println("Sunday     Morning     " + (4 - z[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= n; i++) {
            if (z[i].day.equals("Sunday") && z[i].timing.equals("Afternoon") && z[i].week==week) {
                System.out.println("Sunday     Afternoon     " + (4 - z[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= n; i++) {
            if (z[i].day.equals("Sunday") && z[i].timing.equals("Evening") && z[i].week==week) {
                System.out.println("Sunday     Evening     " + (4 - z[i].no_of_students) + " seats Remaining");
                break;
            }
        }
    }
        public void lessonYoga(Yoga[] y, int n, long week){
            System.out.println("|----|----|----Yoga----|----|----|");
            for (int i = 0; i <= n; i++) {
                if (y[i].day.equals("Saturday") && y[i].timing.equals("Morning") && y[i].week==week) {
                    System.out.println("Saturday     Morning     " + (4 - y[i].no_of_students) + " seats Remaining");
                    break;
                }
            }
            for (int i = 0; i <= n; i++) {
                if (y[i].day.equals("Saturday") && y[i].timing.equals("Afternoon") && y[i].week==week) {
                    System.out.println("Saturday     Afternoon     " + (4 - y[i].no_of_students) + " seats Remaining");
                    break;
                }
            }
            for (int i = 0; i <= n; i++) {
                if (y[i].day.equals("Saturday") && y[i].timing.equals("Evening") && y[i].week==week) {
                    System.out.println("Saturday     Evening     " + (4 - y[i].no_of_students) + " seats Remaining");
                    break;
                }
            }

            for (int i = 0; i <= n; i++) {
                if (y[i].day.equals("Sunday") && y[i].timing.equals("Morning") && y[i].week==week) {
                    System.out.println("Sunday     Morning     " + (4 - y[i].no_of_students) + " seats Remaining");
                    break;
                }
            }
            for (int i = 0; i <= n; i++) {
                if (y[i].day.equals("Sunday") && y[i].timing.equals("Afternoon") && y[i].week==week) {
                    System.out.println("Sunday     Afternoon     " + (4 - y[i].no_of_students) + " seats Remaining");
                    break;
                }
            }
            for (int i = 0; i <= n; i++) {
                if (y[i].day.equals("Sunday") && y[i].timing.equals("Evening") && y[i].week==week) {
                    System.out.println("Sunday     Evening     " + (4 - y[i].no_of_students) + " seats Remaining");
                    break;
                }
            }


        }
    public void lessonAquacise(Aquacise[] a, int n, long week){
        System.out.println("|----|----|----Aquacise----|----|----|");
        for (int i = 0; i <= n; i++) {
            if (a[i].day.equals("Saturday") && a[i].timing.equals("Morning") && a[i].week==week) {
                System.out.println("Saturday     Morning     " + (4 - a[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= n; i++) {
            if (a[i].day.equals("Saturday") && a[i].timing.equals("Afternoon") && a[i].week==week) {
                System.out.println("Saturday     Afternoon     " + (4 - a[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= n; i++) {
            if (a[i].day.equals("Saturday") && a[i].timing.equals("Evening") && a[i].week==week) {
                System.out.println("Saturday     Evening     " + (4 - a[i].no_of_students) + " seats Remaining");
                break;
            }
        }

        for (int i = 0; i <= n; i++) {
            if (a[i].day.equals("Sunday") && a[i].timing.equals("Morning") && a[i].week==week) {
                System.out.println("Sunday     Morning     " + (4 - a[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= n; i++) {
            if (a[i].day.equals("Sunday") && a[i].timing.equals("Afternoon") && a[i].week==week) {
                System.out.println("Sunday     Afternoon     " + (4 - a[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= n; i++) {
            if (a[i].day.equals("Sunday") && a[i].timing.equals("Evening") && a[i].week==week) {
                System.out.println("Sunday     Evening     " + (4 - a[i].no_of_students) + " seats Remaining");
                break;
            }
        }


    }
    public void lessonBodyBlitz(BodyBlitz[] b, int n, long week){
        System.out.println("|----|----|----Body Blitz----|----|----|");
        for (int i = 0; i <= n; i++) {
            if (b[i].day.equals("Saturday") && b[i].timing.equals("Morning") && b[i].week==week) {
                System.out.println("Saturday     Morning     " + (4 - b[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= n; i++) {
            if (b[i].day.equals("Saturday") && b[i].timing.equals("Afternoon") && b[i].week==week) {
                System.out.println("Saturday     Afternoon     " + (4 - b[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= n; i++) {
            if (b[i].day.equals("Saturday") && b[i].timing.equals("Evening") && b[i].week==week) {
                System.out.println("Saturday     Evening     " + (4 - b[i].no_of_students) + " seats Remaining");
                break;
            }
        }

        for (int i = 0; i <= n; i++) {
            if (b[i].day.equals("Sunday") && b[i].timing.equals("Morning") && b[i].week==week) {
                System.out.println("Sunday     Morning     " + (4 - b[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= n; i++) {
            if (b[i].day.equals("Sunday") && b[i].timing.equals("Afternoon") && b[i].week==week) {
                System.out.println("Sunday     Afternoon     " + (4 - b[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= n; i++) {
            if (b[i].day.equals("Sunday") && b[i].timing.equals("Evening") && b[i].week==week) {
                System.out.println("Sunday     Evening     " + (4 - b[i].no_of_students) + " seats Remaining");
                break;
            }
        }


    }

    public void lessonBoxFit(BoxFit[] f, int n, long week){
        System.out.println("|----|----|----Box Fit----|----|----|");
        for (int i = 0; i <= n; i++) {
            if (f[i].day.equals("Saturday") && f[i].timing.equals("Morning") && f[i].week==week) {
                System.out.println("Saturday     Morning     " + (4 - f[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= n; i++) {
            if (f[i].day.equals("Saturday") && f[i].timing.equals("Afternoon") && f[i].week==week) {
                System.out.println("Saturday     Afternoon     " + (4 - f[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= n; i++) {
            if (f[i].day.equals("Saturday") && f[i].timing.equals("Evening") && f[i].week==week) {
                System.out.println("Saturday     Evening     " + (4 - f[i].no_of_students) + " seats Remaining");
                break;
            }
        }

        for (int i = 0; i <= n; i++) {
            if (f[i].day.equals("Sunday") && f[i].timing.equals("Morning") && f[i].week==week) {
                System.out.println("Sunday     Morning     " + (4 - f[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= n; i++) {
            if (f[i].day.equals("Sunday") && f[i].timing.equals("Afternoon") && f[i].week==week) {
                System.out.println("Sunday     Afternoon     " + (4 - f[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= n; i++) {
            if (f[i].day.equals("Sunday") && f[i].timing.equals("Evening") && f[i].week==week) {
                System.out.println("Sunday     Evening     " + (4 - f[i].no_of_students) + " seats Remaining");
                break;
            }
        }


    }

    public void saturdayLesson(Zumba[] z, int Z, Yoga[] y, int Y, Aquacise[] a, int A, BodyBlitz[] b, int bb, BoxFit[] f, int bf, long week){
        System.out.println("|----|----|----Zumba----|----|----|");
        for (int i = 0; i <= Z; i++) {
            if (z[i].day.equals("Saturday") && z[i].timing.equals("Morning") && z[i].week==week) {
                System.out.println("Saturday     Morning     " + (4 - z[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= Z; i++) {
            if (z[i].day.equals("Saturday") && z[i].timing.equals("Afternoon") && z[i].week==week) {
                System.out.println("Saturday     Afternoon     " + (4 - z[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= Z; i++) {
            if (z[i].day.equals("Saturday") && z[i].timing.equals("Evening") && z[i].week==week) {
                System.out.println("Saturday     Evening     " + (4 - z[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        System.out.println("|----|----|----Yoga----|----|----|");
        for (int i = 0; i <= Y; i++) {
            if (y[i].day.equals("Saturday") && y[i].timing.equals("Morning") && y[i].week==week) {
                System.out.println("Saturday     Morning     " + (4 - y[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= Y; i++) {
            if (y[i].day.equals("Saturday") && y[i].timing.equals("Afternoon") && y[i].week==week) {
                System.out.println("Saturday     Afternoon     " + (4 - y[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= Y; i++) {
            if (y[i].day.equals("Saturday") && y[i].timing.equals("Evening") && y[i].week==week) {
                System.out.println("Saturday     Evening     " + (4 - y[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        System.out.println("|----|----|----Aquacise----|----|----|");
        for (int i = 0; i <= A; i++) {
            if (a[i].day.equals("Saturday") && a[i].timing.equals("Morning") && a[i].week==week) {
                System.out.println("Saturday     Morning     " + (4 - a[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= A; i++) {
            if (a[i].day.equals("Saturday") && a[i].timing.equals("Afternoon") && a[i].week==week) {
                System.out.println("Saturday     Afternoon     " + (4 - a[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= A; i++) {
            if (a[i].day.equals("Saturday") && a[i].timing.equals("Evening") && a[i].week==week) {
                System.out.println("Saturday     Evening     " + (4 - a[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        System.out.println("|----|----|----Body Blitz----|----|----|");
        for (int i = 0; i <= bb; i++) {
            if (b[i].day.equals("Saturday") && b[i].timing.equals("Morning") && b[i].week==week) {
                System.out.println("Saturday     Morning     " + (4 - b[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= bb; i++) {
            if (b[i].day.equals("Saturday") && b[i].timing.equals("Afternoon") && b[i].week==week) {
                System.out.println("Saturday     Afternoon     " + (4 - b[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= bb; i++) {
            if (b[i].day.equals("Saturday") && b[i].timing.equals("Evening") && b[i].week==week) {
                System.out.println("Saturday     Evening     " + (4 - b[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        System.out.println("|----|----|----Box Fit----|----|----|");
        for (int i = 0; i <= bf; i++) {
            if (f[i].day.equals("Saturday") && f[i].timing.equals("Morning") && f[i].week==week) {
                System.out.println("Saturday     Morning     " + (4 - f[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= bf; i++) {
            if (f[i].day.equals("Saturday") && f[i].timing.equals("Afternoon") && f[i].week==week) {
                System.out.println("Saturday     Afternoon     " + (4 - f[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= bf; i++) {
            if (f[i].day.equals("Saturday") && f[i].timing.equals("Evening") && f[i].week==week) {
                System.out.println("Saturday     Evening     " + (4 - f[i].no_of_students) + " seats Remaining");
                break;
            }
        }


    }

    public void sundayLesson(Zumba[] z, int Z, Yoga[] y, int Y, Aquacise[] a, int A, BodyBlitz[] b, int bb, BoxFit[] f, int bf, long week){
        System.out.println("|----|----|----Zumba----|----|----|");
        for (int i = 0; i <= Z; i++) {
            if (z[i].day.equals("Sunday") && z[i].timing.equals("Morning") && z[i].week==week) {
                System.out.println("Sunday     Morning     " + (4 - z[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= Z; i++) {
            if (z[i].day.equals("Sunday") && z[i].timing.equals("Afternoon") && z[i].week==week) {
                System.out.println("Sunday     Afternoon     " + (4 - z[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= Z; i++) {
            if (z[i].day.equals("Sunday") && z[i].timing.equals("Evening") && z[i].week==week) {
                System.out.println("Sunday     Evening     " + (4 - z[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        System.out.println("|----|----|----Yoga----|----|----|");
        for (int i = 0; i <= Y; i++) {
            if (y[i].day.equals("Sunday") && y[i].timing.equals("Morning") && y[i].week==week) {
                System.out.println("Sunday     Morning     " + (4 - y[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= Y; i++) {
            if (y[i].day.equals("Sunday") && y[i].timing.equals("Afternoon") && y[i].week==week) {
                System.out.println("Sunday     Afternoon     " + (4 - y[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= Y; i++) {
            if (y[i].day.equals("Sunday") && y[i].timing.equals("Evening") && y[i].week==week) {
                System.out.println("Sunday     Evening     " + (4 - y[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        System.out.println("|----|----|----Aquacise----|----|----|");
        for (int i = 0; i <= A; i++) {
            if (a[i].day.equals("Sunday") && a[i].timing.equals("Morning") && a[i].week==week) {
                System.out.println("Sunday     Morning     " + (4 - a[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= A; i++) {
            if (a[i].day.equals("Sunday") && a[i].timing.equals("Afternoon") && a[i].week==week) {
                System.out.println("Sunday     Afternoon     " + (4 - a[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= A; i++) {
            if (a[i].day.equals("Sunday") && a[i].timing.equals("Evening") && a[i].week==week) {
                System.out.println("Sunday     Evening     " + (4 - a[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        System.out.println("|----|----|----Body Blitz----|----|----|");
        for (int i = 0; i <= bb; i++) {
            if (b[i].day.equals("Sunday") && b[i].timing.equals("Morning") && b[i].week==week) {
                System.out.println("Sunday     Morning     " + (4 - b[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= bb; i++) {
            if (b[i].day.equals("Sunday") && b[i].timing.equals("Afternoon") && b[i].week==week) {
                System.out.println("Sunday     Afternoon     " + (4 - b[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= bb; i++) {
            if (b[i].day.equals("Sunday") && b[i].timing.equals("Evening") && b[i].week==week) {
                System.out.println("Sunday     Evening     " + (4 - b[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        System.out.println("|----|----|----Box Fit----|----|----|");
        for (int i = 0; i <= bf; i++) {
            if (f[i].day.equals("Sunday") && f[i].timing.equals("Morning") && f[i].week==week) {
                System.out.println("Sunday     Morning     " + (4 - f[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= bf; i++) {
            if (f[i].day.equals("Sunday") && f[i].timing.equals("Afternoon") && f[i].week==week) {
                System.out.println("Sunday     Afternoon     " + (4 - f[i].no_of_students) + " seats Remaining");
                break;
            }
        }
        for (int i = 0; i <= bf; i++) {
            if (f[i].day.equals("Sunday") && f[i].timing.equals("Evening") && f[i].week==week) {
                System.out.println("Sunday     Evening     " + (4 - f[i].no_of_students) + " seats Remaining");
                break;
            }
        }


    }
}