package org.student;

import org.college.College;
import org.department.Department;
public class Student {
public void studentName() {
	System.out.println("My Name is Gayathri");
}
public void studentID() {
	System.out.println("The student id is 20");
}
public void studentDept() {
	System.out.println("The student depatment EEE ");
}
public static void main(String[] args) {
	College colg = new College();
	Department dept = new Department();
	Student stud = new Student();
	colg.collegeCode();
	colg.collegeName();
	colg.collegeRank();
	dept.deptName();
	stud.studentDept();
	stud.studentID();
	stud.studentName();
	
}

}
