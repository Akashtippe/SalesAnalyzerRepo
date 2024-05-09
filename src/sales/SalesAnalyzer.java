package sales;

import java.util.Scanner;

public class SalesAnalyzer {
	private double[]sales;
	private int numSales;
	private final int max_days=7;
	
	public SalesAnalyzer() {
		this.sales=new double[max_days];
		numSales=0;
	}
	
	public void addSale(double saleAmount)throws IllegalArgumentException{
		if(numSales>=max_days) {
			throw new IllegalArgumentException("Cannot more sales.Array is full.");
		}
			if(saleAmount<0) {
				throw new IllegalArgumentException("Sales amount can not be negative.");
			}
			sales[numSales++]=saleAmount;
		
	}
	
	public double getTotalSles() {
		double total=0;
		for(double sale:sales) {
			total+=sale;
		}
		return total;
	}
	
	public double getAverageDailySales() {
		if(sales.length==0) {
			return 0;
		}
		return getTotalSles()/sales.length;
	}
	
	public double getBestSalesDay() {
		double best=Double.MIN_VALUE;
		for(double sale:sales) {
			if(sale > best) {
				best=sale;
			}
		}
		return best;
	}
	public double getWorstSalesDay() {
		double worst=Double.MAX_VALUE;
		for(double sale:sales) {
			if(sale > worst) {
				worst=sale;
			}
		}
		return worst;
	}
	
	public void displaySalesReport() {
		System.out.println("total sales:"+ getTotalSles());
		System.out.println("Average sales:"+ getAverageDailySales());
		System.out.println("Best sales:"+ getWorstSalesDay());
		System.out.println("Worst Sales:"+ getWorstSalesDay());
	}
	


	    public static void main(String[] args) {
	        // Create an array to hold sales amounts for a week
//	        double[] weekSales = new double[7];
//
//	        // Create a Scanner object for user input
//	        Scanner scanner = new Scanner(System.in);
//
//	        // Use a for loop to fill the array with input from the user
//	        for (int i = 0; i < weekSales.length; i++) {
//	            boolean validInput = false;
//	            while (!validInput) {
//	                System.out.print("Enter sales amount for day " + (i + 1) + ": ");
//	                double salesAmount = scanner.nextDouble();
//	                if (salesAmount >= 0) {
//	                    weekSales[i] = salesAmount;
//	                    validInput = true;
//	                } else {
//	                    System.out.println("Invalid input. Sales amount must be greater than or equal to zero.");
//	                }
//	            }
//	        }
//	        
//	    


	        SalesAnalyzer s1 = new SalesAnalyzer();
	        s1.addSale(1000);
	        s1.addSale(3000);
	        s1.addSale(3000);
	        s1.addSale(200.50);
	      s1.displaySalesReport();

	      
	      
	      
	      

	      
	      
//	        // Display the total, average, highest, and lowest sales amounts for the week
//	        System.out.printf("Total Sales: %.2f%n", s1.getTotalSles());
//	        System.out.printf("Average Sales: %.2f%n", s1.getAverageDailySales());
//	        System.out.printf("Highest Sales: %.2f%n", s1.getBestSalesDay());
//	        System.out.printf("Lowest Sales: %.2f%n", s1.getWorstSalesDay());

//	        // Close the scanner
	      //  scanner.close();
	    }
	}
 