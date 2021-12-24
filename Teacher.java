package school.budget.managment.system;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned =0;
    }

    //get method
    public int getId(){
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary(){
        return this.salary;
    }

    //set method
    public void setSalary(){
        this.salary = salary;
    }

    public void recevieSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Name of the Teacher:"+ name +
                " Total Salary Earned so far "+ salaryEarned;

    }
}
