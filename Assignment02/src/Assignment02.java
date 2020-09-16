/*-------------------------------------------------------------
// AUTHOR: Justin Blue
// FILENAME: Assignment02.java
// SPECIFICATION: Loops
// CLASS: CSE 110 - Assignment 02
// TIME SPENT: 2 hours
//-----------------------------------------------------------*/
import java.util.Scanner;

public class Assignment02 {
	public static void main(String[] args) {
	       Scanner scan = new Scanner(System.in);
	       System.out.print(String.format("%1$-30s: ", "Length of road project (miles)"));
	       double lengthInMiles = scan.nextDouble();
	       System.out.print(String.format("%1$-30s: ","Number of lanes"));
	       int numOfLanes = scan.nextInt();
	       System.out.print(String.format("%1$-30s: ","Depth of asphalt (inches)"));
	       int depthAsphalt = scan.nextInt();
	       System.out.print(String.format("%1$-30s: ","Days to complete project"));
	       int numDays=scan.nextInt();
	       scan.close();
	      
	       double totalWeightOfAsphalt = lengthInMiles * 5280 * numOfLanes * (depthAsphalt/12.0) * 12 * 150 ;
	       int truckloadsOfAsphalt = (int) Math.ceil(totalWeightOfAsphalt/10000) ;
	       double costOfAsphalt= truckloadsOfAsphalt * 1000 ; //1 ton costs 200, 5 ton will cost 1000
	      
	      
	       int numberOfConduitPipes=(int) (Math.round(lengthInMiles * 5280 / 24));
	       double costOfConduitPipes= numberOfConduitPipes * 500;
	      
	       int numOfIntersections = (int) (Math.floor(lengthInMiles));
	       int numOfStoplights = numOfIntersections * (2 + numOfLanes);
	       double costOfStoplights = numOfStoplights * 25000;
	      
	       int crewMembersNeeded = (int) Math.round(50 * lengthInMiles * numOfLanes /numDays);
	       double costOfLabor = 25 * 8 * numDays* crewMembersNeeded;
	      
	       double totalCost= costOfAsphalt + costOfConduitPipes + costOfStoplights + costOfLabor;
	      
	       System.out.print("=== Amount of materials needed ===" +
	               String.format("\n%1$-25s: ","Truckloads of Asphalt") + truckloadsOfAsphalt +
	               String.format("\n%1$-25s: ","Stoplights") + numOfStoplights +
	               String.format("\n%1$-25s: ","Conduit Pipes") + numberOfConduitPipes +
	               String.format("\n%1$-25s: ","Crew members needed") + crewMembersNeeded +
	               "\n=== Cost of materials ===========" +
	               String.format("\n%1$-25s: $","Cost of Asphalt") + costOfAsphalt +
	               String.format("\n%1$-25s: $","Cost of Stoplights") + costOfStoplights +
	               String.format("\n%1$-25s: $","Cost of Conduit Pipes") + costOfConduitPipes +
	               String.format("\n%1$-25s: $","Cost of Labor") + costOfLabor +
	               "\n== Total Cost of project ========="+
	               String.format("\n%1$-25s: $","Total Cost of project") + totalCost);
	   }
	}