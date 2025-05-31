package singletonClass;

public class Print_Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser.getInstance().displayMsg();
		
		Browser x = Browser.getInstance();
		Browser y = Browser.getInstance();
		
		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
	}

}
