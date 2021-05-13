
public class Employee extends StaffMember{

	protected String socialSecurityNumber;
    protected double payrate;
	public Employee(String eName, String eAddress, String ePhone, String socSecNum, double payrate) {
		super(eName, eAddress, ePhone);
	this.socialSecurityNumber=socSecNum;
	this.payrate=payrate;
	}
	public String toString() {
		return  "Name:" +name+", Address:"+address+" , Phone:"+phoneNumber+", Social Security Number:"+socialSecurityNumber+", Payrate:"+payrate;
	}
    public double pay() {
    	return payrate;
    }
}

	

