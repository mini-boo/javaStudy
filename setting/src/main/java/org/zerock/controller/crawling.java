package org.zerock.controller;

import java.io.FileWriter;
import java.io.PrintWriter;

import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;

public class crawling {
	public static void main(String[] args) {
		//SSAFY 공지사항 제목 크롤링해서 파일로 저장하기
		
		try {
			
			String fileName = "C:/JavaWorkspace/crawling.txt";
			FileWriter fw = new FileWriter(fileName, true);
			PrintWriter out = new PrintWriter(fw, true);
			
			String URL = "https://www.ssafy.com/ksp/servlet/swp.board.controller.SwpBoardServlet";
			
			Elements elements = doc.select(".notice_list .board_td li");
			for(Element element : elements) {
				out.println(element.txt());
			}//for end
		 System.out.println("텍스트 파일 완성!");
		} catch(Exception e){
			System.out.println("크롤링 실패 : " +e);
		}
	}
}
