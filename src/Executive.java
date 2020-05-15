public class Executive extends Employee {
    public int stock;

    public Executive(int id, int year, String name, String position, int m_salary, int stock) {
        super(id, year, name, position, m_salary);
        this.stock = stock;
    }

    public double annualSalary(int m_salary) {
        double a_salary;
        double bonus;
        if (stock >= 50) {
            bonus = 30000;
        }
        else {
            bonus = stock;
        }
        a_salary =  (m_salary * 12) + bonus;

        return a_salary;
    }

    public String toString() {

        return "<<" + position + ">>" + "\n"
                + "Id: " + id + "\n"
                + "Year: " + year + "\n"
                + "Name: " + name + "\n"
                + "Monthly Salary: " + m_salary + "\n"
                + "Stock Price: " + stock + "\n"
                + "Annual Salary: " + annualSalary(m_salary) + "\n";
    }

}
