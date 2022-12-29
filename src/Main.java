import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[10];
        employeeArray[0] = new Employee("Зыкова Татьяна Александровна", 1, 105000);
        employeeArray[1] = new Employee("Александрова Юлия Федоровна", 4, 45000);
        employeeArray[2] = new Employee("Гурулева Ирина Юрьевна", 5, 95000);
        employeeArray[3] = new Employee("Красильников Алексей Андреевич", 4, 80000);
        employeeArray[4] = new Employee("Седов Александр Владимирович", 2, 25000);
        employeeArray[5] = new Employee("Карачарова Марина Сергеевна", 3, 35000);
        employeeArray[6] = new Employee("Черков Юрий Генадьевич", 5, 60000);
        employeeArray[7] = new Employee("Штенцель Даниил Робертович", 1, 50000);
        employeeArray[8] = new Employee("Цилин Евгений Александрович", 2, 70000);
        employeeArray[9] = new Employee("Оганисян Карина Мушеговна", 3, 60000);
        list(employeeArray);
        int maxSum = sum(employeeArray);
        System.out.println("Сумма всех зарплат = "+maxSum);
        System.out.println("Саммая маленькая зп  = " +min(employeeArray,maxSum));
        System.out.println("Самая высокая зп = "+ max(employeeArray));
        System.out.println(midlSalary(employeeArray,maxSum));
        FIO(employeeArray);
    }
    public static void list(Employee[] employeeArray){
        for(int i = 0;i< employeeArray.length;i++){
            System.out.print(employeeArray[i]);
        }
    }
    public static int sum(Employee[] employeeArray){
        int sum = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            sum+=employeeArray[i].getSalary();
        }
        return sum;
    }
    public static int min (Employee[] employeeArray,int maxSum){
        int min = maxSum;
        for (int i = 0; i < employeeArray.length; i++){
            if(min>employeeArray[i].getSalary()){
                min = employeeArray[i].getSalary();
            }
        }
        return min;
    }
    public static int max (Employee[] employeeArray){
        int max = 0 ;
        for (int i = 0; i < employeeArray.length; i++) {
            if(max<employeeArray[i].getSalary()){
                max=employeeArray[i].getSalary();
            }
        }
        return max;
    }
    public static int midlSalary(Employee[] employeeArray,int maxSum){
        int midlSalary = maxSum/ (employeeArray.length+1);
    return midlSalary;
    }
    public static void FIO(Employee[] employeeArray){
        for (int i = 0; i < employeeArray.length-1; i++) {
            System.out.print(employeeArray[i].getNFT()+", ");
        }
        System.out.print(employeeArray[employeeArray.length-1].getNFT()+".");
    }
}
