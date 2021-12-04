package com.greatlearning.oops;

public class DriverClass {
	public static void main(String args[]) {
		AdminDepartment adm = new AdminDepartment();
		
		HRDepartment hr = new HRDepartment();
		TechDepartment tech = new TechDepartment();
		
		// display AdminDepartment
		
		
		adm.getTodayWork="Complete your document submission";
		adm.getWorkDeadline="Complete by EOD";
		adm.isTodayAHoliday="today is not a Holiday";
		System.out.println("Welcome to Admin Department");
		System.out.println(adm.getTodaysWork());
		System.out.println(adm.getWorkDeadline());
		System.out.println(adm.istodayaHaliday());
		
		// display HR Department
		
		
		hr.teamLaunch="team Launch";
		hr.getTodayWork="Fill todays timesheet and mark your attendance";
		hr.getWorkDeadline="Complete by EOD";
		hr.isTodayAHoliday="today is not a holiday";
		
		System.out.println("Welcome to HR Department");
		System.out.println(hr.teamLaunch());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.istodayaHaliday());
		
		// Display tech department
		
		
		tech.getTodayWork="Complete coding of module1";
		tech.getWorkDeadline="Complete by EOD";
		tech.getTechStackInformation="Core java";
		tech.isTodayAHoliday="today is not a holiday";
		
		
		System.out.println("Welcome to Tech Department");
		
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.istodayaHaliday());
		
		
	}

}
