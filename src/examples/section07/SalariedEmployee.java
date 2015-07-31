package examples.section07;

/**
 * @author Mohamed
 */
public class SalariedEmployee extends Employee 
{
    private double weeklySalary;

    public SalariedEmployee(String first, String last, String ssn, double salary) 
    {
        super(first, last, ssn);
        setWeeklySalary(salary);    // validate and store weekly salary
    }
    
    public void setWeeklySalary( double salary )
    {
        if ( salary >= 0.0 )
            weeklySalary = salary;
        else
            throw new IllegalArgumentException( "Weekly salary must be >= 0" );
    }
    
    public double getWeeklySalary()
    {
        return weeklySalary;
    }

    @Override
    public double getPaymentAmount() 
    {
        return getWeeklySalary();
    }
    
    @Override
    public String toString()
    {
        return String.format( "%s: %s\n%s: $%,.2f", 
                "salaried employee", super.toString(),
                "weekly salary", getWeeklySalary() );
    }
}
