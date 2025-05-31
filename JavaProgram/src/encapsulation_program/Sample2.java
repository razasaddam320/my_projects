package encapsulation_program;

public class Sample2 {
	
	private String phone;
	private int price;
	private String colour;
	
	public void setphone(String phone) {
		this.phone=phone;
		System.out.println(" phone name "+phone);
	}
	
	public void setprice(int price) {
		this.price=price;
		System.out.println(" price "+price);
	}
	
	public void setcolour(String colour) {
		this.colour=colour;
		System.out.println(" colour is "+colour);
	}
	
	public String getphone() {
		return phone;
	}
	
	public int getprice() {
		return price;
	}
	
	public String getcolour() {
		return colour;
	}
	
	public static void main(String[] args) {
		Sample2 s = new Sample2();
		s.setphone("Iphone 14");
		s.setprice(60000);
		s.setcolour("white");
		
		System.out.println("phone name is "+s.getphone()); //it will go getphone() then return phone name
		System.out.println(s.getprice());
		System.out.println(s.getcolour());
		
	}

}
