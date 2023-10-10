package blood.transfusion.view;

import blood.transfusion.contoller.BTController;
import blood.transfusion.dto.BTProjectDTO;
import blood.transfusion.dto.DonorDTO;
import blood.transfusion.dto.RecipientDTO;

public class RunningStartView {

	public static void main(String[] args) {
		BTController controller = BTController.getInstance();
	
		
		
		System.out.println("=====모든 프로젝트 검색=====");
		controller.allBTProjects();
		
		System.out.println();
		
		System.out.println("=====하나의 프로젝트 검색=====");
		//controller.getBTProject("A-");
		
		System.out.println();	
		
		//새 프로젝트 저장
		 System.out.println("=====새 프로젝트 저장=====");
		controller.newBTProject(new BTProjectDTO("A+","bt4","donor4","recipient4","A+형간의 수혈"),
								new DonorDTO("donor4","헌혈4",26,"M","A+","검사"),
								new RecipientDTO("recipient4","수혈4",31,"M","A+","질병"));
		
		System.out.println();
		
		// 존재하는 프로젝트 수정
		// 특정 프로젝트 업데이트
				System.out.println("=====특정 프로젝트 수정=====");
				controller.updateBTProjectPurpose("B-", "B+형간의 수혈");
				controller.getBTProject("B-");
		
		
		System.out.println();
		
		System.out.println("=====특정 프로젝트 삭제=====");
		controller.deleteBTProject("A-");
		controller.getBTProject("A-");
		
	}
}
