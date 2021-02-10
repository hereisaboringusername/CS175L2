public class ExamplesOfCode {
import java.util.Scanner;

	public static void main (String [] args)  {
		Scanner in = new Scanner(System. in);
	
	//This code illustrates creation of variables
	int length = 0;
	int width = 0;
	int height = 0;
	int numWindows = 0;
	int lengthWindow = 0;
	int heightWindow = 0;
	int widthWindow = 0; 
    int surfaceAreaWindow = 0; 
    double totalOfwindow = 0; 
	int normalSideSqFt = 0;
	int peakSideSqFt = 0;
    int numDoors = 0;
	int lengthDoor = 0;
	int heightDoor = 0; 
	int widthDoor = 0;
    double totalOfdoor = 0;
    int surfaceAreaDoor = 0;
    double SqFtToPaint = 0; 
	double costPerSqFt = 0;
    double CostToPaint = 0;
    
    System.out.println("Please enter the cost per square foot :");
    costPerSqFt = in.nextInt();
	System.out.println("Please enter the length of the house:"); 
	length = in.nextInt();
	System.out.println("Please enter the  width of the  house:");
	width = in.nextInt();
	System.out.println(" Please enter the height of the  house:");
	height = in.nextInt();
    System.out.println("Please enter the  number of windows:");
 	numWindows = in.nextInt();
	System.out.println("Please enter the  length of the window:");
	lengthWindow = in.nextInt();
	System.out.println("Please enter the  height of the  window:");
	heightWindow = in.nextInt();
    System.out.println("Please enter the number of doors :");
    numDoors = in.nextInt();
    System.out.println("Please enter the length of the  door : ");
    lengthDoor = in.nextInt();
    System.out.println("Please enter the width of the door : ");
    heightDoor = in.nextInt();
    System.out.println("Please enter the cost per Square Foot: ");
    costPerSqFt = in.nextDouble(); 
    normalSideSqFt = length * width * 2 ;
    peakSideSqFt= length * width  + (length *(height-width * 2)/2);
    totalOfdoor = lengthDoor * widthDoor * numDoors; 
    totalOfwindow = lengthWindow * widthWindow * numWindows;
    SqFtToPaint = (normalSideSqFt + peakSideSqFt )-(totalOfdoor + totalOfwindow); 
    System.out.println("Your total paintable surface area is 2684 square feet : ");
    CostToPaint =  SqFtToPaint  * costPerSqFt;
    System.out.println("The cost to paint the house is:" + "CostToPaint :");
	}

	
}
