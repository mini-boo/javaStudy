package concert.dto;

public class Customer {
	private String userId; //유저 아이디
	private String userName; //유저 이름
	private int userAge; //유저 나이
	private String userSeat; //유저 예매좌석
	private Boolean deposit; //입금 여부

public Customer() {}

public Customer(String userId, String userName, int userAge, String userSeat, Boolean deposit) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.userAge = userAge;
	this.userSeat = userSeat;
	this.deposit = deposit;
}

public String getUserId() {
	return userId;
}

public void setUserId(String userId) {
	this.userId = userId;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public int getUserAge() {
	return userAge;
}

public void setUserAge(int userAge) {
	this.userAge = userAge;
}

public String getUserSeat() {
	return userSeat;
}

public void setUserSeat(String userSeat) {
	this.userSeat = userSeat;
}

public Boolean getDeposit() {
	return deposit;
}

public void setDeposit(Boolean deposit) {
	this.deposit = deposit;
}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[아이디 : ");
		builder.append(userId);
		builder.append(", 이름 : ");
		builder.append(userName);
		builder.append(", 나이 : ");
		builder.append(userAge);
		builder.append(", 예매좌석 : ");
		builder.append(userSeat);
		builder.append(", 입금내역 : ");
		builder.append(deposit);
		return builder.toString();
	}


}

