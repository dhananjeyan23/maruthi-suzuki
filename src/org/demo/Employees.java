package org.demo;

public class Employees {
	String ename1="Subramanian";
	String ename2="vijaya";

	//create the 1st method empName
		private void empName1() {
		System.out.println("employeename : "+ename1);
		}
		private void empName2() {
			System.out.println("employeename : "+ename2);
			}
		//create the main method 
				public static void main(String[] args) {
				//classname objrefname = new classname()
					Employees ei1 = new Employees();
					ei1.empName1();
					ei1.empName2();

}
}
