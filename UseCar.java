package day3;

public class UseCar {
	public static void main(String[]args)
	{
		Car car1=new Car();
		car1.brand="bmw";
		car1.price=40000;
		car1.ispetrol=false;
		
		Car car2=new Car();
		car2.brand="tata";
		car2.price=300000;
		car2.ispetrol=true;
		
		Car car3=new Car();
		car3.brand="swift";
		car3.price=200000;
		car3.ispetrol=true;
		
		int length1=car1.brand.length();
		int length2=car2.brand.length();
		int length=car3.brand.length();
		
		int totalprice=(car1.price+car2.price+car3.price);
		
		String name1=(car1.brand).toUpperCase();
		String name2=car2.brand.toUpperCase();
		String name3=car3.brand.toUpperCase();
		
		System.out.println(name1+""+car1.price+""+car1.ispetrol);
		System.out.println(name2+""+car2.price+""+car2.ispetrol);
		System.out.println(name3+""+car3.price+""+car3.ispetrol);
		
		
		
		
		
		
		
		
		
	}

}
