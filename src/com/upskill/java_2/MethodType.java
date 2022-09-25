package com.upskill.java_2;

public class  MethodType {
	

	public static int hourlyIncome = 75;
	

	public static void main(String[] args) {
		
	
		MethodType obj = new MethodType();
		obj.annualIncomeVoid();
		
		weeklyIncomeStatic();
		System.out.println("my annualIncome = " + obj. monthlyIncomeReturn());

	}
	
	//void method
	public void annualIncomeVoid() {
		int annualIncome = hourlyIncome * 2000;
	System.out.println("My Annual Income = " + annualIncome);
	}

// static method
	public static void weeklyIncomeStatic(){
		int weeklyIncome = hourlyIncome * 40;
		System.out.println("My Weekly Income = " + weeklyIncome);
	}


//Return Type Method
public int monthlyIncomeReturn() {
	int monthlyIncome = hourlyIncome * 180;
	return monthlyIncome;
}
}