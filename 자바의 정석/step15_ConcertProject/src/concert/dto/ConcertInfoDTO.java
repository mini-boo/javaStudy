package concert.dto;

import java.sql.Date;

public class ConcertInfoDTO {
	private String concertid; 	// 콘서트 id
	private String concertname; 	// 콘서트 이름
	private Date concertdate; 		// 콘서트 날짜
	private String concerthall; 	// 수혈자
	private int concertprice; 		// 콘서트 가격
	
	
	public ConcertInfoDTO() {}
	
	public ConcertInfoDTO(String concertid, String concertname, Date concertdate, String concerthall,
			int concertprice) {
		super();
		this.concertid = concertid;
		this.concertname = concertname;
		this.concertdate = concertdate;
		this.concerthall = concerthall;
		this.concertprice = concertprice;
	}

	public String getConcertid() {
		return concertid;
	}
	
	public void setConcertid(String concertid) {
		this.concertid = concertid;
	}
	
	public String getConcertname() {
		return concertname;
	}
	
	public void setConcertname(String concertname) {
		this.concertname = concertname;
	}
	
	public Date getConcertdate() {
		return concertdate;
	}
	
	public void setConcertdate(Date concertdate) {
		this.concertdate = concertdate;
	}
	
	public String getConcerthall() {
		return concerthall;
	}
	
	public void setConcerthall(String concerthall) {
		this.concerthall = concerthall;
	}
	
	public int getConcertprice() {
		return concertprice;
	}
	
	public void setConcertprice(int concertprice) {
		this.concertprice = concertprice;
	}
	
	@Override
	public String toString() {
		return "ConcertInfoDTO [concertid=" + concertid + ", concertname=" + concertname + ", concertdate="
				+ concertdate + ", concerthall=" + concerthall + ", concertprice=" + concertprice + "]";
	}
	
	
	
	
	
	
}
