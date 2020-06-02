
//This class is responsible for keeping track of students' fees, name, grade, and fees paid

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;


    /**
     * To create new student object by initializing values.
     * @param id id for student which will be unique.
     * @param name  name of student.
     * @param grade grade of the student.
     */
    public Student(int id, String name, int grade){
        feesPaid = 0;
        feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    /**
     * Used to upgrade student's grade
     * @param grade new grade of the student.
     */
    public void setGrade(int grade){
        this.grade = grade;
    }

    /**
     * Update fees paid by the student.
     * @param fees new amount of fees paid.
     */
    public void payFees(int fees){
        this.feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees(){
        return feesTotal -feesPaid;
    }

}
