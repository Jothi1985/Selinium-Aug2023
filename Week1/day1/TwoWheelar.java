package week1.day1;

public class TwoWheelar {
	int noOfWheels=4;
	short noOfMirrors=3;
	long chassisNumber=1256699955l;
	boolean isPunctured = true;
	String bikeName="test";
	double runningKM=20000.89;



	public static void main(String[] args) {
		TwoWheelar two = new TwoWheelar();
		System.out.println("noOfWheels:"+two.noOfWheels);
		System.out.println("noOfMirrors:"+two.noOfMirrors);
		System.out.println("chassisNumber:"+two.chassisNumber);
		System.out.println("isPunctured:"+two.isPunctured);
		System.out.println("bikeName:"+two.bikeName);
		System.out.println("runningKM:"+two.runningKM);
		
		

	}

}



/*Assignment 3
Create a class for TwoWheeler and declare below variables with appropriate values
int noOfWheels
short noOfMirrors
long chassisNumber
boolean isPunctured
String bikeName
double runningKM
create object for TwoWheeler and call all the variables inside main method and print the values.*/