
public class Commission extends Hourly {
    double totalSales;
    double commissionRate;
	public Commission(String eName, String eAddress, String ePhone, String socSecNum, double payrate, double commRate) {
		super(eName, eAddress, ePhone, socSecNum, payrate);
		this.commissionRate = commRate;
	}
public void addSales(double totalSales) {	
	this.totalSales = totalSales;
}
 public double pay() {
	 double payment = super.pay()+(commissionRate*totalSales);
	 return payment;
	 }
public String toString() {
	return super.toString()+ ", Total Sale:"+totalSales;
}
}



