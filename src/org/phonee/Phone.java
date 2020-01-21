package org.phonee;

public class Phone {
	public void phoneInfo(String s){
		System.out.println("phone name" +s);
	}
	public void phoneInfo(int i, String a){
	System.out.println("mobile " +i);
	System.out.println("mobile version" +a);
	
}
public void phoneInfo(String a, int i){
	System.out.println("mobile baseband version" +a);
	System.out.println("mobile RAM"+i);
}
public static void main(String[] args){
	Phone e=new Phone ();
	e.phoneInfo("redme a7");
	e.phoneInfo(6789," 8.1.0.o11019");
	e.phoneInfo("moly.lr2a.r2.mv", 2);

}
}
