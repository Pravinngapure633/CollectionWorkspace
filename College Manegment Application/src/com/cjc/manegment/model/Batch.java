package com.cjc.manegment.model;

public class Batch {

		private int batchId;
		private String batchName;
		private Faculty faculty;
		
		
		public int getBatchId() {
			return batchId;
		}
		public void setBatchId(int batchId) {
			this.batchId = batchId;
		}
		public String getBatchName() {
			return batchName;
		}
		public void setBatchName(String batchName) {
			this.batchName = batchName;
		}
		public Faculty getFaculty() {
			return faculty;
		}
		public void setFaculty(Faculty faculty) {
			this.faculty = faculty;
		}
		
		
}
