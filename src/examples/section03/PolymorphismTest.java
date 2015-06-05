package examples.section03;

/**
 * @author Mohamed Elsayed
 */
public class PolymorphismTest 
{
    public static void main( String[] args )
    {
        CommissionEmployee commissionEmployee = new CommissionEmployee(
                "Mohamed", "Elsayed", "222-22-2222", 10000, 0.06 );
        System.out.printf( "%s:\n\n%s\n\n",
                "Call CommissionEmployee's toString with superclass reference to superclass object",
                commissionEmployee.toString() );
        
        BasePlusCommissionEmployee basePlusCommissionEmployee = 
                new BasePlusCommissionEmployee(
                        "Ahmed", "Ali", "333-33-3333", 5000, .2, 1000 );
        System.out.printf( "%s:\n\n%s\n\n",
                "Call BasePlusCommissionEmployee's toString with subclass reference to subclass object",
                basePlusCommissionEmployee.toString() );
        
        CommissionEmployee commissionEmployee2 = basePlusCommissionEmployee;
        System.out.printf( "%s:\n\n%s\n\n",
                "Call BasePlusCommissionEmployee's toString with superclass reference to subclass object",
                commissionEmployee2.toString() );
    }
}
