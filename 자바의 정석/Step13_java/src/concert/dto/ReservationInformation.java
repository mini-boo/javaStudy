package concert.dto;

public class ReservationInformation {
	private String reservationDate; //예매 날짜
	
	public ReservationInformation() {}
	
	public ReservationInformation(String reservationDate) {
		this.reservationDate = reservationDate;
	}
	
	public String getReservationDate() {
		return reservationDate;
	}
	
	public void setReservationDate(String reservationDate) {
		this.reservationDate = reservationDate;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[예매날짜 : ");
		builder.append(reservationDate);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
}
