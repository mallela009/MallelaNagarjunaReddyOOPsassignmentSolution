package com.greatlearning.oops;

public class SuperDepartment {
	String departmentName;
	String getTodayWork;
	String getWorkDeadline;
	String isTodayAHoliday;
	String teamLaunch;
	String getTechStackInformation;
	public String departmentName() {
		return departmentName;
		
	}
	public String gettodayWork() {
		return getTodayWork;
	}
	public String getworkDeadline() {
		return getWorkDeadline;
	}
	public String istodayaHaliday() {
		return isTodayAHoliday;
	}

}
class AdminDepartment extends SuperDepartment{
 public String departmentName() {
	 return departmentName;
 }
 public String getTodaysWork() {
	 return getTodayWork;
 }
 public String getWorkDeadline() {
	 return getWorkDeadline;
 }
}
class HRDepartment extends SuperDepartment{
	public String departmentName() {
		return departmentName;
	}
	public String getTodaysWork() {
		return getTodayWork;
	}
	public String getWorkDeadline() {
		return getWorkDeadline;
	}
	public String teamLaunch() {
		return teamLaunch;
		
	}
	
}
class TechDepartment extends SuperDepartment{
	public String departmentName() {
		return departmentName;
	}
	public String getTodaysWork() {
		return getTodayWork;
	}
	public String getWorkDeadline() {
		return getWorkDeadline;
	}
	public String getTechStackInformation() {
		return getTechStackInformation;
	}
}
