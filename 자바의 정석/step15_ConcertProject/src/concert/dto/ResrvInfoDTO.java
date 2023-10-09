package concert.dto;

import java.sql.Date;

public class ResrvInfoDTO {
	private int ticketno;
	private String concertid;
	private String userid;
	private Date resrvdate;
	private String resrvseat;
	
	public ResrvInfoDTO() {};
	
	public ResrvInfoDTO(int ticketno, String concertid, String userid, Date resrvdate, String resrvseat) {
		super();
		this.ticketno = ticketno;
		this.concertid = concertid;
		this.userid = userid;
		this.resrvdate = resrvdate;
		this.resrvseat = resrvseat;
	}
	
	public int getTicketno() {
		return ticketno;
	}
	public void setTicketno(int ticketno) {
		this.ticketno = ticketno;
	}
	public String getConcertid() {
		return concertid;
	}
	public void setConcertid(String concertid) {
		this.concertid = concertid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public Date getResrvdate() {
		return resrvdate;
	}
	public void setResrvdate(Date resrvdate) {
		this.resrvdate = resrvdate;
	}
	public String getResrvseat() {
		return resrvseat;
	}
	public void setResrvseat(String resrvseat) {
		this.resrvseat = resrvseat;
	}

	@Override
	public String toString() {
		return "ResrvInfoDTO [ticketno=" + ticketno + ", concertid=" + concertid + ", userid=" + userid + ", resrvdate="
				+ resrvdate + ", resrvseat=" + resrvseat + "]";
	}
	
	
}
