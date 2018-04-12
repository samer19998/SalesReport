package edu.handong.csee.java.salesreport;

import java.util.Scanner;

public class SalesReport {


	// TODO Auto-generated method stub
	private double HighestSales;
	private double averageSales;
	private Salesman[] team;
	private int numOfSalesman;
	//private double getSales;


	/**
	 * 
	 */
	
	public SalesReport() {
		System.out.println("Enter number of salesman");
		Scanner myScanner = new Scanner(System.in);

		numOfSalesman = myScanner.nextInt();

	}




	public static void main(String[] args) {

		SalesReport myReport = new SalesReport();
		myReport.getData();
		myReport. calculateAverageSales();
		myReport.highestSales();
		myReport.printOutResults();
		
	}


	public void getData() {

		team = new Salesman[numOfSalesman];

		for(int i=0; i < numOfSalesman; i++) {

			Scanner myScanner = new Scanner(System.in);

			System.out.println("Enter data for associate number" + (i+1));

			System.out.println("Enter name");
			String name = myScanner.nextLine();

			System.out.println("Enter sales");
			double sales = myScanner.nextDouble();

			Salesman mySalesman = new Salesman();
			mySalesman.setmName(name);
			mySalesman.setSales(sales);

			team[i] = mySalesman;
		}

	}


	public void calculateAverageSales() {

		double sum = 0;

		for(int i = 0 ; i <team.length; i++){

			double sales = team[i].getSales();
			sum = sum + sales;
		}

		averageSales = sum /team.length;
	}

	public void highestSales () {

		for(int i=0; i <team.length-1; i++) {

			if(team[i].getSales()< team[i+1].getSales()) {

				HighestSales = team[i+1].getSales();
			}
		}

	}
	public void printOutResults() {
		

		System.out.println("Average: " + averageSales);
		System.out.println("Highest Sales: " + HighestSales );
		
	

	System.out.println("The Highest Sales guy");
		for(int i = 0; i < team.length; i++) 
		{
			if(HighestSales == (team[i].getSales()))
				
			{
			System.out.println("name: " + team[i].getmName());
			System.out.println("Sales: " +team[i].getSales());
		
		}
	}
	}
}





