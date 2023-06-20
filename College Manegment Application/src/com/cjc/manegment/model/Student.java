package com.cjc.manegment.model;

public class Student {
	
		private int studentId;
		private String studentName;
		private Batch batch;
		
		
		public int getStudentId() {
			return studentId;
		}
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public Batch getBatch() {
			return batch;
		}
		public void setBatch(Batch batch) {
			this.batch = batch;
		}
		
		

}
