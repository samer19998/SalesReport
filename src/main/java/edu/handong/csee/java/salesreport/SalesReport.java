package edu.handong.csee.java.salesreport;

import java.util.Scanner;

public class SalesReport {

	
		// TODO Auto-generated method stub
		private double highestSales;
		private double averageSales;
		private SalesReport[] team;
		private int numOfSalesman;
		
		
		public SalesReport() {
			System.out.println("Enter number of salesman");
			Scanner myScanner = new Scanner(System.in);
			
			numOfSalesman = myScanner.nextInt();
			
	}
		public void printOutMySentence() {
			System.out.println("I want to print out something when i compile");
			
		}
		
		public static void main(String[] args) {
			
			SalesReport myReport = new SalesReport();
			myReport.getData();
			myReport.calculate();
	}
public void getData() {
	
	team = new Salesman[numOfSalesman];
	
	for(int i=0; i < numOfSalesman; i++) {
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Enter data for associate number") + (i+1));
		
		System.out.println("Enter name");
		String name = myScanner.nextline();
		
		System.out.println("Enter sales");
		double sales = myScanner.nextDouble();
		
		Salesman mySalesman = newSalesman();
		mySalesman.setName(name);
		mySalesman.setSales(sales);
		
		
	}
	
}
public void calculateAverageSales() {
	
	double sum = 0;
	
	for(int i=0; i <team.length; i++);
		double sales = team[i].getSales();
		sum = sum+ sales;
}

	averageSales = sum/team.length;
}

public void calculateHighestSales() {
	
	for(int i=0; i <team.length-1; i++) {
		if(team{[i].getSales() < team[i+1].getSales()) {
			highestSales = team[i+1].getSales();
		    }
		}
		
	}
	public void printOutResults() {
		
		System.out.println("Average: " + averageSales);
		System.out.println("Highest Sales: " + highestSales);
		
	    System.out.println("The Highest Sales guy");
		for(int i = 0; i < team.length; i++) {
			if(team[i].getSales() == highestSales) {
				System.out.println("name: " + team[i].getName());
				System.out.println("Sales: " team[i].getSales());
			}
		}
	}
	
	
}
