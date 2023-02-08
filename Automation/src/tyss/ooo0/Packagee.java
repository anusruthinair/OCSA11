package tyss.ooo0;

public class Packagee extends Swiggy {
	
	String packageName;
	double kg;
	double price;
	
	public void package1()
	{
		System.out.println("From Child Class");
	}
	
	Packagee(String accName,String pwd,long phoneNo,String packageName,double kg,double price)
	{
		super(accName,pwd,phoneNo);
		this.packageName=packageName;
		this.kg=kg;
		this.price=price;
	}
	
	public void printDetails2()
	{
		System.out.println(accName);
		System.out.println(pwd);
		System.out.println(phoneNo);
		System.out.println(packageName);
		System.out.println(kg);
		System.out.println(price);
	}
	
	public static void main(String[] args) {
		Packagee p=new Packagee("Himanshu","not840Himanshu",5678,"Clothes",10.5,5.5);
		
		p.printDetails2();
		p.swiggy1();
		p.package1();
		}
	
	

}
