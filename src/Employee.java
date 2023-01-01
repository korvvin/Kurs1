public class Employee {
    private String fio;
    private int department;
    private double salary;
    private int id;
    private static int counter;

    public Employee(String fio,int department,double salary) {
        this.fio=fio;
        this.department=department;
        this.salary=salary;
        id = counter++;
    }

    public String getFio() {
        return fio;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "ФИО: "+fio +", Отдел сотрудник - "+ department +", Зарплата сотрудника = "+salary +", id= "+id+"\n";
    }
}

