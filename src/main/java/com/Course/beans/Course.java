package com.Course.beans;

public class Course {
	
	    private String course_name;
	    private int course_number;
	    private String instructor_no;
	    private String course_image;
	    private String course_description;
		public String getCourse_name() {
			return course_name;
		}
		public void setCourse_name(String course_name) {
			this.course_name = course_name;
		}
		public int getCourse_number() {
			return course_number;
		}
		public String getInstructor_no() {
			return instructor_no;
		}
		public void setInstructor_no(String instructor_no) {
			this.instructor_no = instructor_no;
		}
		public void setCourse_number(int course_number) {
			this.course_number = course_number;
		}

		public String getCourse_image() {
			return course_image;
		}
		public void setCourse_image(String course_image) {
			this.course_image = course_image;
		}
		public String getCourse_description() {
			return course_description;
		}
		public void setCourse_description(String course_description) {
			this.course_description = course_description;
		}
	    
	 
	    }
