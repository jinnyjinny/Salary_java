public class Salesman extends Employee{
    int a_sales;
    double a_salary;

    public Salesman(String name, int m_salary, int a_sales) {
        super(name, m_salary);
        this.a_sales = a_sales;
    }

    public double annualSalary(int m_salary, int a_sales) {
        double a_salary;
        if (a_sales * 0.2 > 20000) {
            a_salary = (m_salary * 12) + 20000;
        }
        else{
            a_salary = (m_salary * 12) + (a_sales * 0.02);
        }
        return a_salary;
    }

    public String toString() {

        return "<<Salesman>> \n"
                + "Name: " + name + "\n"
                + "Monthly Salary: " + m_salary + "\n"
                + "Annual Sales: " + a_sales + "\n"
                + "Annual Salary: " + annualSalary(m_salary, a_sales) + "\n";
    }


}
