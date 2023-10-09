package concert.dto;


public class UserInfoDTO {
	private String userid; 		// 사용자 id
	private String username; 	// 사용자 이름
	private int userage; 		// 사용자 나이
	private String usergender; 	// 사용자 성
	private String useraddress; // 사용자 주소
	
	public UserInfoDTO() {}

	public UserInfoDTO(String userid, String username, int userage, String usergender, String useraddress) {
		super();
		this.userid = userid;
		this.username = username;
		this.userage = userage;
		this.usergender = usergender;
		this.useraddress = useraddress;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getUserage() {
		return userage;
	}

	public void setUserage(int userage) {
		this.userage = userage;
	}

	public String getUsergender() {
		return usergender;
	}

	public void setUsergender(String usergender) {
		this.usergender = usergender;
	}

	public String getUseraddress() {
		return useraddress;
	}

	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}

	@Override
	public String toString() {
		return "UserInfoDTO [userid=" + userid + ", username=" + username + ", userage=" + userage + ", usergender="
				+ usergender + ", useraddress=" + useraddress + "]";
	}
	
	
}
