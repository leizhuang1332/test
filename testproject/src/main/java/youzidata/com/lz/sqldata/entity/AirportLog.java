package youzidata.com.lz.sqldata.entity;

import java.io.Serializable;

public class AirportLog implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	private String id;
	
	private String flno;
	
	private String event;
	
	private String createTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFlno() {
		return flno;
	}

	public void setFlno(String flno) {
		this.flno = flno;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
}
