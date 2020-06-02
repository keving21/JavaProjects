//This class is responsible for keeping track of teacher's id, name, and salary.

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Initializes teacher variables.
     * @param id unique id of the teacher.
     * @param name name of teacher.
     * @param salary salary of the teacher.
     */
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned =0;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public int getSalary() {
        return salary;
    }


    public void setSalary(int salary){
        this.salary = salary;
    }

    public void getPaid(int salary){
        salaryEarned +=salary;
        School.updateTotalMoneySpent(salary);

    }

}
