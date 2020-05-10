public class Employee {
   String name;
   int m_salary;

    public Employee(String name, int m_salary) {
        this.name = name;
        this.m_salary = m_salary;
    }

    public String toString() {
        return "<<Employee>> \n"
                + "Name: " + name + "\n"
                + "Monthly Salary: " + m_salary + "\n"
                + "Annual Salary: " + m_salary * 12 + "\n";
    }

}

