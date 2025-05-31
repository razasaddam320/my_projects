package singletonClass;

public class Browser {
	
	private static Browser browser;

	private Browser() {

	}

	public  static synchronized Browser getInstance() {
		

		if(browser==null) {
			browser = new Browser();
		}
		return browser;

	}
	
	public void displayMsg() {
		System.out.println("Browser info");
	}
}
