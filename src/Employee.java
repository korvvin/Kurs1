public class Employee {
    private String NFT;
    private int department;
    private int salary;
    private int counter;
    private static int id;

    public Employee(String NFT,int department,int salary) {
        this.NFT=NFT;
        this.department=department;
        this.salary=salary;
        counter = id++;
    }

    public static int getNumOfInstances() {
        return id;
    }

    public String getNFT() {
        return NFT;
    }

    public void setNFT(String NFT) {
        this.NFT = NFT;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "ФИО: "+NFT +", Отдел сотрудник - "+ department +", Зарплата сотрудника = "+salary +", id= "+counter+"\n";
    }
}

