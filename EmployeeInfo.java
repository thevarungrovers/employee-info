
package javaprojects.EmployeeData;

import java.util.Scanner;

public class EmployeeInfo {
     public static void main(String[] args){
       Employee e = new Employee();
       Scanner s = new Scanner(System.in);
   
//       e.setName(0,"john");
//       System.out.println(e.getName(0));
       
//variables
       String addNew = "yes";
       String Name, Address;
       int n = 0, Salary, YearJoin;
       
//       get input
       do {
//           if(n > 3){
//               System.out.println("Details cannot be added because of insufficient details !!");
//               break;
//               
//           }
           
//           else{
               	   System.out.println("Enter Employee details :");
//    	   name
    	   System.out.println("Name :");
    	   Name = s.next();
    	   e.setName(n, Name);
    	   
//    	   salary
    	   System.out.println("Salary :");
    	   Salary = s.nextInt();
    	   e.setSalary(n, Salary);

//    	   year of join
    	   System.out.println("Year of Join :");
    	   YearJoin = s.nextInt();
    	   e.setYearJoin(n, YearJoin);
    	   
//    	   address
    	   System.out.println("Address :");
    	   Address = s.next();
    	   e.setAddress(n, Address);
    	   

//           }
//    	   increment index value
    	   n++;
           
           
       }while(n < 3);
       
       //     printing
     System.out.println("NAME\t SALARY\t YEAR_OF_JOIN\t\t ADDRESS \n");
     for(int j = 0; j< 3;j++){
//      System.out.println(e.getName[j] + e.getSalary[j] + e.getYearJoin[j] + e.getAddress[j]);
        System.out.println(e.getName(j) +"\t " + e.getSalary(j) +"\t\t " + e.getYearJoin(j) +"\t\t " + e.getAddress(j) + "\n");

    }
     
    }
     

}

