
public class Hourly extends Employee{
	private int hoursWorked;
	public Hourly(String eName, String eAddress, String ePhone, String socSecNum, double payrate) {
		super(eName, eAddress, ePhone, socSecNum, payrate);
		hoursWorked = 0;
		}
public void addHours(int moreHours) {
  hoursWorked += moreHours;
}
public double pay() {
	double payment = payrate * hoursWorked;	
	return payment;
}

public String toString() {
   return super.toString()+ "Salary;"+pay();
}
}
