class Employee{
    String name;
    double baseSalary;
    
    public Employee(String name , double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }
    
    double calculatePay(){
        return this.baseSalary;
    }
}

class Manager extends Employee{
    double bonus;
    
    public Manager(String name , double baseSalary , double bonus){
        super(name ,baseSalary);
        this.bonus = bonus;
    }
    
    @Override
    double calculatePay(){
        double result = baseSalary + bonus;
        return result;
    }
}

class SalesPerson extends Employee{
    double commission ;
    
    public SalesPerson (String name , double baseSalary , double commission){
        super(name,baseSalary);
        this.commission = commission;
    }
    
    @Override
    double calculatePay(){
        double result = baseSalary + commission;
        return result;
    }  
}
public class EmployeePayrollSystem{
    public static void main(String[] args){
        Employee[] team = {
            new Employee("Rahul" , 45000.00),
            new Manager("Priya" , 80000.00 , 15000.00),
            new SalesPerson("Amit" , 35000.00 , 8500.00)
        };
        
        System.out.println("Moonthly payment payroll");
        
        for (Employee emp : team){
            System.out.println("Employee: "+emp.name);
            System.out.println("Total pay : "+emp.calculatePay());
        }
    }
}