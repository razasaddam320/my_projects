package encapsulation_program;

public class Sample {
	
	private String phone_name ="one plus 12";
	private int price = 55000;
	private String colour = "olive green";
	
	public void setmobile_name(String phone_name) {
		this.phone_name=phone_name;
		
	}
	
	public void setprice(int price) {
		this.price=price;
		
	}
	
	public void setcolour(String colour) {
		this.colour=colour;
	}
	
	public String getphone_name() {
		return phone_name;
		
	}
	
	public int getprice() {
		return price;
		
	}
	
	public String getcolour() {
		return colour;
	}
	
	public static void main(String[] args) {
		
		Sample s = new Sample();
		
		System.out.println(s.getphone_name());
		System.out.println(s.getcolour());
		System.out.println(s.getprice());
	}
}
