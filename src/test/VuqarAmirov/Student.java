package test.VuqarAmirov;

public class Student {
    private boolean hasGraduate = false;
    private final String studentName;
    private int age;
    public Student(String name){
        this.studentName = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public boolean graduate(int iq){
        int smartness = iq;
        System.out.println(studentName + " has an iq of " + smartness);
        if (smartness > 100){
            hasGraduate = true;
            return hasGraduate;
        } else {
            System.out.println("You have not graduated therefore you iq is too low to process");
            return hasGraduate;
        }
    }

    public void averageTestScore(int test1, int test2, int test3){
        if (test1 > 50 && test2 > 50 && test3 > 50){
            System.out.println("Your test score is above average");
        } else{
            System.out.println("Your test score may not be above 50");
        }
        double average = (test1 + test2 + test3) / 3;
        System.out.println("Your average is " + average);
    }


    public void bestSubjectForUni(String bestSubject){
        switch (bestSubject){
            case "History":
                System.out.println("Smartest choice would be to go for History");
                break;
            case "Computer Science":
                System.out.println("Smartest choice would be to go for Computer Science");
                break;
            default:
                System.out.println("Smartest choice would be not to go to uni");
        }
    }

    public void classSubscription(String subject){
        if (subject.equals("History")){
            System.out.println("You will be enrolled for history lessons");
        }
    }

    public String toName(){
        return studentName;
    }
}
