interface Exam{
    boolean isPassed(int mark);
}

interface Classify{
    String getDivision(double average);
}

class Result implements Exam, Classify {

    public boolean isPassed(int mark){
        return mark >= 35;
    }

    public String getDivision(double average){
        if(average >= 60){
            return "First Division !!";
        } else if(average >= 50){
            return "Second Division !!";
        } else if(average >= 40){
            return "Third Division !!";
        } else {
            return "You're Fail !!";
        }
    }

    public static void main(String[] args) {
        Result s = new Result();
        int mark = 50;
        double average = 25.00;

        if(s.isPassed(mark)){
            System.out.println("Student Has Passed!!");
        } else {
            System.out.println("Student Has Failed!!");
        }

        System.out.println("The Division Of Student Is: " + s.getDivision(average));
    }
}
