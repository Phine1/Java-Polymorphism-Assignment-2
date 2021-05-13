
 class Staff{
	StaffMember[]stafflist;

public Staff() {
stafflist = new StaffMember[8];
stafflist[0]= new Executive ("Jonas", "34 Sekondi", "23499932","55666552262", 4.5);
stafflist[1]= new Employee ("James","783 Takoradi", "243287363","55566634443",3.2);
stafflist[2]= new Employee ("Kofi", "762 Anaji", "232762645","55566643445244",3.2);
stafflist[3]= new Hourly ("Anita", "379 Kojokrom","2233987987","55566635532",3.2);
stafflist[4]= new Volunteer("Sarah", " Windy Ridge","22237648726");
stafflist[5]= new Volunteer("Samuel", "Shama", "22237978272");
stafflist[6]= new Commission("Phinehas","376 Butumagyabu","2233487564","5555666667466", 6.25,0.2);
stafflist[7]= new Commission("Fred","313 Adiembra","2223356665636","55556666354253", 9.75,0.15);

((Commission)stafflist[6]).addHours(35);
((Commission)stafflist[6]).addSales(400);
((Commission)stafflist[7]).addHours(40);
((Commission)stafflist[7]).addSales(950);
  
}

public void payday() {
	double amount;
	for (int count=0; count < stafflist.length; count++)
	{
	System.out.println (stafflist[count]);
	amount = stafflist[count].pay(); 
	if (amount == 0.0)
	System.out.println ("Thank you for your Service. See you another time!");
	else
	System.out.println ("Paid: " + amount);
	System.out.println ("--------------END---------------");
	}
}
}

