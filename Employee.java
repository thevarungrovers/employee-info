
package javaprojects.EmployeeData;

public class Employee {
	private String name[] = new String[3];
	private String address[] = new String[3];
	private int salary[] = new int[3];
	private int yearJoin[] = new int[3];
	
//	name
	public void setName(int i, String name) {
		this.name[i] = name;
	}

	public String getName(int i) {
		return name[i];
	}
	
//	salary
	public void setSalary(int i, int salary) {
		this.salary[i] = salary;
	}

	public int getSalary(int i) {
		return salary[i];
	}
	
//	year of join
	public void setYearJoin(int i, int yearJoin) {
		this.yearJoin[i] = yearJoin;
	}

	public int getYearJoin(int i) {
		return yearJoin[i];
	}
	
	
//	address
	public void setAddress(int i, String address) {
		this.address[i] = address;
	}

	public String getAddress(int i) {
		return address[i];
	}
	
	
}
