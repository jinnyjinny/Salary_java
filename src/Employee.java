import java.sql.*;

public class Employee {

   int id;
   int year;
   String name;
   String position;
   int m_salary;

    public Employee(int id, int year, String name, String position, int m_salary) {
        this.id = id;
        this.year = year;
        this.name = name;
        this.position = position;
        this.m_salary = m_salary;
    }

    public String toString() {
        return "<<" + position + ">>" + "\n"
                + "Number: " + id + "\n"
                + "Year: " + year + "\n"
                + "Name: " + name + "\n"
                + "Monthly Salary: " + m_salary + "\n"
                + "Annual Salary: " + m_salary * 12 + "\n";
    }

}

