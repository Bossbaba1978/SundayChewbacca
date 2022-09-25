package com.upskill.java_6;

public class Singletone {
	private Singletone() {

}


private static Singletone SingletoneObj = new Singletone();

public static Singletone getInstance() {
	return SingletoneObj;
	
}
protected static void upskill() {
	System.out.println("Upskill method from Singletone Class");
}
}