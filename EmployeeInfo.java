package tryProject;

import java.util.Scanner;

public class EmployeeInfo {

    public static void main(String[] args) {
        Employee e = new Employee();
    
        Scanner s = new Scanner(System.in);  
            
        System.out.println("Enter details: ");
        System.out.println("Name: ");
        String input_name = s.nextLine();
        e.setName(input_name);
        System.out.println(e.getName());
        
        System.out.println("Salary: ");
        int input_salary = s.nextInt();
        e.setSalary(input_salary);
        System.out.println(e.getSalary());
        
        System.out.println("Year of Join: ");
        int input_YearJoin = s.nextInt();
        e.setYearJoin(input_YearJoin);
        System.out.println(e.getYearJoin());
        
        System.out.println("Address: ");
        String input_Address = s.nextLine();
        e.setAddress(input_Address);
        System.out.println(e.getAddress());
        
    }

}
