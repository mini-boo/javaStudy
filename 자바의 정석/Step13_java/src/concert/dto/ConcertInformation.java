package concert.dto;


public class ConcertInformation {
	private String concertName; //콘서트 이름
	private String concertID;//콘서트 ID
	private String concertDate; //콘서트 날짜
	private String concertPlace; //콘서트 장소
	private Customer customer; //고객
	private ReservationInformation reservationInformation;//예매내역
	
	
	public ConcertInformation() {}

		public ConcertInformation(String concertName, String concertID, String concertDate, String concertPlace, Customer customer, ReservationInformation reservationInformation) {
			this.concertName = concertName;
			this.concertID = concertID;
			this.concertDate = concertDate;
			this.concertPlace = concertPlace;
			this.customer = customer;
			this.reservationInformation = reservationInformation;
	}
		
		public String getConcertName() {
			return concertName;
		}
		
		public void setConcertName(String concertName) {
			this.concertName = concertName;
		}
		
		public String getConcertID() {
			return concertID;
		}
		
		public void setConcertID(String concertID) {
			this.concertID = concertID;
		}
		
		public String getConcertDate() {
			return concertDate;
		}
		
		public void setConcertDate(String concertDate) {
			this.concertDate = concertDate;
		}
		
		public String getConcertPlace() {
			return concertPlace;
		}
		
		public void setConcertPlace(String concertPlace) {
			this.concertPlace = concertPlace;
		}
		
		public Customer getCustomer() {
			return customer;
		}
		
		public void setCustomer(Customer customer) {
			this.customer = customer;
		}
		
		public ReservationInformation getReservationInformation() {
			return reservationInformation;
		}
		
		public void setReservationInformation(ReservationInformation reservationInformation) {
			this.reservationInformation = reservationInformation;
		}
		
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("[콘서트 이름 : ");
			builder.append(concertName);
			builder.append(", 콘서트 ID : ");
			builder.append(concertID);
			builder.append(", 콘서트 날짜 : ");
			builder.append(concertDate);
			builder.append(", 콘서트 장소 : ");
			builder.append(concertPlace);
			builder.append(", 고객 : ");
			builder.append(customer);
			builder.append(", 예매내역 : ");
			builder.append(reservationInformation);
			builder.append("]");
			return builder.toString();
			
		}
	
}
