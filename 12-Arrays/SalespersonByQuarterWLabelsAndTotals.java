/**

	This program prints a two dimensional array and is a modification of
	the SalespersonByQuarter program.
	
	Quarter totals, annual salesperson totals, overall annual sales total
	and row and column labels were added.
	
	@author Stephanie-Angela Brauer

*/

public class SalespersonByQuarterWLabelsAndTotals {

	public static void main(String[] args) {

		final int NUM_SALESPERSONS = 3;
		final int NUM_QUARTERS = 4;			
		double total=0;
		double sales[][] ={
							{3214.99,7422.56,3161.43,734.98},
							{1243.09,4246.55,1600.67,2192.39},
							{1000.62,3299.99,1500.12,2300.88}
						  };
						  
		System.out.println();		
		System.out.println("Here are the sales: ");
		System.out.println();		
		System.out.println("Salesperson\tQ1\t Q2\t  Q3\t   Q4\t Total");   //This is the first row	
		
		for (int salesperson=0; salesperson<NUM_SALESPERSONS;salesperson++) {
			double totalSalesperson=0;
			System.out.print("    "+(salesperson+1)+"    ");
				for (int quarter=0;quarter<NUM_QUARTERS;quarter++) {
					totalSalesperson+=sales[salesperson][quarter];
					total+=sales[salesperson][quarter];
						System.out.printf("%9.2f",sales[salesperson][quarter]);
				}
			System.out.print(" "+totalSalesperson);
			System.out.println();	
		}
		
		//This is the last row with the totals
		System.out.print("Total\t ");

		for (int quarter=0;quarter<NUM_QUARTERS;quarter++) {

			double totalQuarter=0;

			for (int salesperson=0; salesperson<NUM_SALESPERSONS;salesperson++) {
				totalQuarter+=sales[salesperson][quarter];
			}

			System.out.printf("%9.2f",totalQuarter);
		}
		System.out.printf("%9.2f",total);
		System.out.println();
	}	
}