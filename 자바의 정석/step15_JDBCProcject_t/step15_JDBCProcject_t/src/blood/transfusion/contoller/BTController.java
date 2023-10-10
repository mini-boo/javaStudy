package blood.transfusion.contoller;

import java.sql.SQLException;
import java.util.ArrayList;

import blood.transfusion.dto.BTProjectDTO;
import blood.transfusion.dto.DonorDTO;
import blood.transfusion.dto.RecipientDTO;
import blood.transfusion.exception.NotExistException;
import blood.transfusion.model.BTProjectDAO;
import blood.transfusion.model.BTService;
import blood.transfusion.model.DonorDAO;
import blood.transfusion.view.RunningEndView;

public class BTController {
	private static BTController instance = new BTController();
	private BTService service = BTService.getInstance();
	
	private BTController() {}
	
	public static BTController getInstance() {
		return instance;
	}
	
	// 모든 프로젝트 검색
	public void allBTProjects(){
		try{
			RunningEndView.projectListView(service.getAllBTProjects());
		}catch(SQLException s){
			s.printStackTrace();
			RunningEndView.showError("모든 프로젝트 검색시 에러 발생");
		}
	
	}
	
	// 특정 프로젝트 검색
	public void getBTProject(String btProjectName) {
		try {
			RunningEndView.projectView(service.getBTProject(btProjectName));
		} catch (SQLException | NotExistException e) {
			
		}
	}
	
	// 특정 프로젝트 업데이트
//		updateBTProject(String btProjectId, String btProjectContent)
		public void updateBTProjectPurpose(String btProjectId, String btProjectContent) {
			try {
				RunningEndView.allView(service.updateBTProjectPurpose(btProjectId, btProjectContent));
			} catch (SQLException | NotExistException e) {
				e.printStackTrace();
			}
		}
	
	// 특정 프로젝트 삭제
	public void deleteBTProject(String btProjectId) {
		try {
			RunningEndView.allView(service.deleteBTProject(btProjectId));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotExistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//특정 프로젝트 추가
	 public void newBTProject(BTProjectDTO btProject, DonorDTO donor, RecipientDTO recipient) {
			try {
				if (service.addDonor(donor) && service.addRecipient(recipient) && service.addBTProject(btProject)) {
					allBTProjects();
				}
			} catch (SQLException e) {
				e.printStackTrace();
				RunningEndView.showError("모든 프로젝트 검색시 에러 발생");
			}
		}
	
}
