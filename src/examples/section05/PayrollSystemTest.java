package examples.section05;

/**
 * @author Mohammed.Elsayyed
 */
public class PayrollSystemTest 
{
    public static void main( String[] args )
    {
        // Process employees non-polymorphically
        // Create subclass objects
        SalariedEmployee salariedEmployee = 
                new SalariedEmployee( "Mohamed", "Elsayed", "111-11-1111", 5000 );
        HourlyEmployee hourlyEmployee = 
                new HourlyEmployee( "Ahmed", "Aly", "222-22-2222", 16.75, 40 );
        CommissionEmployee commissionEmployee = 
                new CommissionEmployee( "Helen", "Jason", "333-33-3333", 10000, .06 );
        BasePlusCommissionEmployee basePlusCommissionEmployee = 
                new BasePlusCommissionEmployee( "Karen", "Lewis", "444-44-4444", 5000, .04, 300 );
        
        System.out.println( "Employees processed individually:\n" );
        
        System.out.printf( "%s\n%s: $%,.2f\n\n", 
                salariedEmployee, "earned", salariedEmployee.earnings() );
        System.out.printf( "%s\n%s: $%,.2f\n\n", 
                hourlyEmployee, "earned", hourlyEmployee.earnings() );
        System.out.printf( "%s\n%s: $%,.2f\n\n", 
                commissionEmployee, "earned", commissionEmployee.earnings() );
        System.out.printf( "%s\n%s: $%,.2f\n\n", 
                basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings() );
        
        // Proces employees polymorphically
        Employee[] employees = new Employee[ 4 ];
        employees[ 0 ] = salariedEmployee;
        employees[ 1 ] = hourlyEmployee;
        employees[ 2 ] = commissionEmployee;
        employees[ 3 ] = basePlusCommissionEmployee;
        
        System.out.println( "Employees processed ploymorphically:\n" );
        
        for ( Employee currentEmployee : employees )
        {
            System.out.println( currentEmployee );
            
            // Check whether currentEmployee is a BasePlusCommissionEmployee to increase base salary by 10%
            if ( currentEmployee instanceof BasePlusCommissionEmployee )
            {
                // Downcast Employee reference to BasePlusCommissionEmployee reference
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                
                // It is allowed to call subclass-specific methods via employee variable
                // Increase base salary 10%
                employee.setBaseSalary( 1.10 * employee.getBaseSalary() );
                
                System.out.printf( "new base salary with 10%% increase is $%,.2f\n", 
                        employee.getBaseSalary() );
            }
            
            System.out.printf( "earned: $%,.2f\n\n", currentEmployee.earnings() );
        }
        
        // Determine and display each object type in employees array
        for ( int i = 0 ; i < employees.length; i++ )
        {
            /*
            System.out.printf( "Employee %d is a %s\n", i, 
                    employees[ i ].getClass().getName().substring( employees[ i ].getClass().getName().lastIndexOf( "." ) + 1 ) );
        
            */
            // Uncomment the above statment if you don't like to display package name
            System.out.printf( "Employee %d is a %s\n", i, employees[ i ].getClass().getName() );
        }
    }
}
