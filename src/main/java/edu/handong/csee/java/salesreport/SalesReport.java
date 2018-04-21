package edu.handong.csee.java.salesreport;
import java.util.ArrayList;
import java.util.Scanner;

public class SalesReport {


	// TODO Auto-generated method stub
	private double HighestSales;
	private double averageSales;
	ArrayList<Salesman> team;// ArrayList

	/**
	 * this class is for clculating a salesreport
	 * and to print out the highest sales guy among the salesmen
	 *  
	 */

	/*public SalesReport() { //method
		System.out.println("Enter number of salesman");// command to print this line
		Scanner myScanner = new Scanner(System.in);// instantiating

		numOfSalesman = myScanner.nextInt();// calling from scanner

	}*/




	public static void main(String[] args) {

		SalesReport myReport = new SalesReport();// constructor
		myReport.getData();
		myReport. calculateAverageSales();
		myReport.highestSales();
		myReport.printOutResults();

	}


	public void getData() {// method



		team = new ArrayList<Salesman>();//instantiation

		System.out.println("Enter items for the list, when prompted. ");
		boolean done = false;

		//for(int i=0; i < ; i++) {// loop
		while(!done) {

		
			Scanner keyboard = new Scanner(System.in);// instantiating

			System.out.println("Enter name for associate " );//command to print out

			String name =keyboard.nextLine();//constructor

			System.out.println("Enter sales");//print this line
			double sales = keyboard.nextDouble();

			Salesman mySalesman = new Salesman();//instantiating
			mySalesman.setmName(name);//call it from salesman class
			mySalesman.setSales(sales);

			team.add(mySalesman);

			Scanner check = new Scanner(System.in);

			System.out.print("More items for the list? ");
			String accept = check.nextLine ();

			if (!accept.equalsIgnoreCase ("yes"))
				done = true;
		}

	}


	public void calculateAverageSales() {// method

		double sum = 0;//defining the variable

		for(int i = 0 ; i < (team.size() ); i++){

			double sales = team.get(i).getSales();//
			sum = sum + sales;
		}

		averageSales = sum /team.size();
	}

	public void highestSales () {

		for(int i=0; i <team.size()-1; i++) {

			if(team.get(i).getSales() < team.get(i+1).getSales()) {

				HighestSales = team.get(i+1).getSales();
			}
		}

	}
	public void printOutResults() {//method


		System.out.println("Average: " + averageSales);//command to print out the line
		System.out.println("Highest Sales: " + HighestSales );//command to print out the line



		System.out.println("The Highest Sales guy");// print out the highest sales guy

		for(int i = 0; i < team.size(); i++) //loop
		{
			if(HighestSales == (team.get(i).getSales()))//if statement

			{
				System.out.println("name: " + team.get(i).getmName());//command to print out the line
				System.out.println("Sales: " +team.get(i).getSales());// print out the line.


			}
		}
	}
}





