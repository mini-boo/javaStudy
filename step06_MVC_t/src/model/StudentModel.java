package model;

import java.util.ArrayList;

import model.domain.Student;

public class StudentModel {
	
	// DB 역할
//	private static Student[] allData = new Student[5];
	private static ArrayList<Student> allData = new ArrayList<Student>();
	
	// 가상의 데이터 저장
	static {
//		allData[0] = new Student("Java", 26);
//		allData[1] = new Student("Python", 30);
//		allData[2] = new Student("C++", 38);
		
		allData.add(new Student("Java", 26));
		allData.add(new Student("Python", 30));
		allData.add(new Student("C++", 38));
	}
	
	//변수 타입 Student, 배열 이름 : allData
	
	// 모든 학생 검색
	public static ArrayList<Student> getAll() {
		return allData;
	}
	
	// 한 학생의 정보만 검색
	public static Student getOne(String name) {
	 for(Student student : allData) {
		 if(student.getName().equals(name)) {
			 return student;
		 }
	 }
		return null;
	}
	
	
	// 저장 메소드
	public static boolean insert(Student student) {
			 return allData.add(student);
	}
		
	
	// 삭제 메소드
	public static boolean delete(String name) {
		for(Student student : allData) {
			 if(student.getName().equals(name)) {
			return allData.remove(name);
		}
	}
	return false;
	}

	// 수정 : 이름으로 검색 -> 학생의 이름이 있다면 -> 한살 추가 // updateAge
	public static Student updateAge(String name) {
	    for (Student student : allData) {
	        if (student.getName().equals(name)) {
	            student.setAge(student.getAge() + 1); // 학생의 나이를 1 증가시킴
	            return student; // 증가된 학생 정보 반환
	        }
	    }
	    return null; // 이름이 일치하는 학생이 없을 경우 null 반환
	}
}













