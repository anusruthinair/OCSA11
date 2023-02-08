package tyss.ooo0;

public class Food extends Swiggy {
	
	String fname;
	double price;
	String location;
	
	public void food1()
	{
		System.out.println("From child class");
	}
	
	Food(String accName,String pwd,long phoneNo,String fname,double price,String location)
	{
		super(accName,pwd,phoneNo);
		this.fname=fname;
		this.price=price;
		this.location=location;
	}
	
	public void printDetails1()
	{
		System.out.println(accName);
		System.out.println(pwd);
		System.out.println(phoneNo);
		System.out.println(fname);
		System.out.println(price);
		System.out.println(location);
	}
	
	
	public static void main(String[] args) {
		Food f=new Food("Nithin","840nithin",797678,"Biryani",250.56,"Murgespalya");
		f.printDetails1();
		f.swiggy1();
		f.food1();
		
	}

}
