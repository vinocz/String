package day3;

public class UseHospital {
	public static void main(String[]args) {
		Hospital hospital1=new Hospital();
		hospital1.name="apollo";
		hospital1.location="chennai";
		hospital1.isAvail=true;
		
		Hospital hospital2=new Hospital();
		hospital2.name="kauvery";
		hospital2.location="chenai";
		hospital2.isAvail=false;
		
		Hospital hospital3=new Hospital();
		hospital3.name="sims";
		hospital3.location="chennai";
		hospital3.isAvail=true;
		
		String name1=hospital1.name.toUpperCase();
		String name2=hospital2.name.toUpperCase();
		String name3=hospital3.name.toUpperCase();
		
		int lenghth1=hospital1.location.length();
		int length2=hospital2.location.length();
		int length3=hospital3.location.length();
		String check="check1";
		boolean check1=hospital1.name.equals("hospital2.name");
		
		System.out.println(name1+hospital1.location+hospital1.isAvail);
		System.out.println(hospital2.name+hospital2.location+hospital2.isAvail);
		System.out.println(hospital3.name+hospital3.location+hospital3.isAvail);
		
		
		
		
		
		
		
		
	}

}
