package main;

import java.util.ArrayList;

import dao.Student2DAO;
import dto.Student2DTO;

public class Student2Main {

	public static void main(String[] args) throws Exception {
		//명령행 매개변수 입력
		//박자바 park@c.com 01012345678 it공학 4.5(id - auto_increment, redate - default)
		//Student2DTO dto = new Student2DTO(args[0], args[1], args[2], args[3], Double.parseDouble(args[4]));
		
		Student2DAO dao = new Student2DAO();
		//int insertrows = dao.insertStudent2(dto);
		//System.out.println(insertrows + " 삽입 종료");
		
		//update major에 "it" 포함 레코드의 major "아이티"로 수정
		//dao.updateStudent2("it", "아이티");
		//dao.updateStudent2("아이티", "개어렵네");
		
		dao.deleteStudent2(5);//id 5번 학생 삭제
		
		Student2DTO [] arr = dao.selectStudent2();
		for (Student2DTO dto : arr) {
			if(dto != null) { //10개보다 많이 조회되어도 나머지 못가져온다 / 10개보다 적으면 null
				System.out.println(dto); // id - name - major
			}
		}
	}

}
