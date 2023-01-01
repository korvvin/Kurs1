import java.util.Arrays;

public class Main {
    static Employee[] employeeArray = new Employee[10];
    public static void main(String[] args) {
        employeeArray[0] = new Employee("Зыкова Татьяна Александровна", 1, 105000.5);
        employeeArray[1] = new Employee("Александрова Юлия Федоровна", 4, 45000);
        employeeArray[2] = new Employee("Гурулева Ирина Юрьевна", 5, 95000);
        employeeArray[3] = new Employee("Красильников Алексей Андреевич", 4, 80000);
        employeeArray[4] = new Employee("Седов Александр Владимирович", 2, 25000);
        employeeArray[5] = new Employee("Карачарова Марина Сергеевна", 3, 35000);
        employeeArray[6] = new Employee("Черков Юрий Генадьевич", 5, 60000);
        employeeArray[7] = new Employee("Штенцель Даниил Робертович", 1, 50000);
        employeeArray[8] = new Employee("Цилин Евгений Александрович", 2, 70000);
        employeeArray[9] = new Employee("Оганисян Карина Мушеговна", 3, 60000);
        list();
        double maxSum = sum();
        System.out.println("Сумма всех зарплат = "+maxSum);
        System.out.println("Меньше всех зарабатывает " +min(maxSum));
        System.out.println("Больше всех зарабатывае "+ max());
        System.out.println(midlSalary(maxSum));
        fio();
    }
    public static void list(){
        for(int i = 0;i< employeeArray.length;i++){
            System.out.print(employeeArray[i]);
        }
    }
    public static double sum(){
        double sum = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            sum+=employeeArray[i].getSalary();
        }
        return sum;
    }
    public static String min (double maxSum){
        double min = maxSum;
        String name = " ";
        for (int i = 0; i < employeeArray.length; i++){
            if(min>employeeArray[i].getSalary()){
                min = employeeArray[i].getSalary();
                name = employeeArray[i].getFio();
            }
        }
        return name;
    }
    public static String max (){
        double max = 0 ;
        String name = "";
        for (int i = 0; i < employeeArray.length; i++) {
            if(max<employeeArray[i].getSalary()){
                max=employeeArray[i].getSalary();
                name = employeeArray[i].getFio();
            }
        }
        return name;
    }
    public static double midlSalary(double maxSum){
        double midlSalary = 0.0;
        midlSalary=maxSum/ employeeArray.length;
    return midlSalary;
    }
    public static void fio(){
        for (int i = 0; i < employeeArray.length-1; i++) {
            System.out.print(employeeArray[i].getFio()+", ");
        }
        System.out.print(employeeArray[employeeArray.length-1].getFio()+".");
    }
}
