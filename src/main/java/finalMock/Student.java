package finalMock;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private int sId;
	@Column(nullable=false)
	private String sName;
	@Lob
	private byte[]arr;
	@CreationTimestamp
	private Date objectCreationTime;
	private double sPer;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public byte[] getArr() {
		return arr;
	}
	public void setArr(byte[] arr) {
		this.arr = arr;
	}
	public Date getObjectCreationTime() {
		return objectCreationTime;
	}
	public void setObjectCreationTime(Date objectCreationTime) {
		this.objectCreationTime = objectCreationTime;
	}
	public double getsPer() {
		return sPer;
	}
	public void setsPer(double sPer) {
		this.sPer = sPer;
	}
	
	
	

}
