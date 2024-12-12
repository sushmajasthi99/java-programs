package Oops;

public class Student {
	    private int student_id;
	    private String student_name;
	    private String grade;

	    public Student(int student_id, String student_name, String grade) {
	        this.student_id = student_id;
	        this.student_name = student_name;
	        this.grade = grade;
	    }

	    public int getStudent_id() {
	        return student_id;
	    }

	    public void setStudent_id(int student_id) {
	        this.student_id = student_id;
	    }

	    public String getStudent_name() {
	        return student_name;
	    }

	    public void setStudent_name(String student_name) {
	        this.student_name = student_name;
	    }

	    public String getGrade() {
	        return grade;
	    }

	    public void setGrade(String grade) {
	        this.grade = grade;
	    }
	    public static String addGrade(int marks){
	        if (marks >= 90) {
	            return "A+";
	        } else if (marks >= 80) {
	            return "A";
	        } else if (marks >= 70) {
	            return "B+";
	        } else if (marks >= 60) {
	            return "B";
	        } else if (marks >= 50) {
	            return "C";
	        } else {
	            return "Fail";
	        }
	    }

	    public static void main(String[] args) {
	        Student s = new Student(1,"sushma","A+");
	        System.out.println("Student Id: "+s.getStudent_id());
	        System.out.println("Student Name: "+s.getStudent_name());
	        System.out.println("Student Grade: "+s.getGrade());
	        System.out.println("Grade: "+Student.addGrade(90));
	    }
	}