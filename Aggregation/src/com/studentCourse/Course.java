package com.studentCourse;

public class Course {
	private String branch;
	private long mobNum;

	public Course(String branch, long mobNum) {
		this.branch = branch;
		this.mobNum = mobNum;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public long getMobNum() {
		return mobNum;
	}

	public void setMobNum(long mobNum) {
		this.mobNum = mobNum;
	}

	@Override
	public String toString() {
		return "Course [branch=" + branch + ", mobNum=" + mobNum + "]";
	}

}
