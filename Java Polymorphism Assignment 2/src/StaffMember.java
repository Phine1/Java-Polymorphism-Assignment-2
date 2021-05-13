

	abstract public class StaffMember{
	protected String name;
	protected String address;
	protected String phoneNumber;

	public StaffMember (String eName, String eAddress, String ePhone) {
	this.name=eName;
	this.address=eAddress;
	this.phoneNumber=ePhone;
	}
		
	public String toString()
	{
	return "Name:" +name+", Address:"+address+" , Phone:"+phoneNumber;
	}
    public abstract double pay();
   }
