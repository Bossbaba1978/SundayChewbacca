package com.upskill.java3;

public class Loops {
	


	public static void main(String[] args){
		//practiceForLoop();
		
	//	practiceWhileloop();
	
	//practiceDoWhileLoop();
		//practiceInfiniteLoop();
		
		practiceNestedLoop();
}
		public static void practiceForLoop(){
			int i;
			for ( i =1; i < 10; i++) {
				System.out.println("For Loops Number =" +i);
			}
		}
		
		public static void practiceWhileloop() {
			int i = 1;
			while(i<10) {
				System.out.println("While Loops Number = " +i);
				i++; 
			}
		

	}
		
		public static void practiceDoWhileLoop(){
			int i = 1;
			do {
				System.out.println("Do While Loops Number = " +i);
			}while (i<10);
		}
	
		public static void practiceInfiniteLoop() {
			int i;
			for (i =1; ; i++) {
				System.out.println("For Loops Number =" +i);
			}
		}

	public static void practiceNestedLoop() {
		int i;
		int j;
		for (i = 1; i<=10; i++) {
			for(j =1; j<=10; j++) {
				int multipicationTable = i * j;
				
				System.out.print(multipicationTable + "");
			}
			System.out.println("");
		}
		
	}
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}