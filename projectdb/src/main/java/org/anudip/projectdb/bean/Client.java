package org.anudip.projectdb.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Client {
	@Id
	private Long clientId;  //autogenarated
	 private String clientName;  //
	 private String clientAddress; //
	 private String contactNo;  //
	 private String hotelId; //dropdown
	 private String accommodationId; //dropdown
	 private String checkInDate;
	 private String checkOutDate;
	 private String payStatus; //dropdown
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(Long clientId) {
		super();
		this.clientId = clientId;
	}
	public Client(Long clientId, String clientName, String clientAddress, String contactNo, String hotelId,
			String accommodationId, String checkInDate, String payStatus) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
		this.clientAddress = clientAddress;
		this.contactNo = contactNo;
		this.hotelId = hotelId;
		this.accommodationId = accommodationId;
		this.checkInDate = checkInDate;
		this.payStatus = payStatus;
	}
	public Long getClientId() {
		return clientId;
	}
	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientAddress() {
		return clientAddress;
	}
	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getAccommodationId() {
		return accommodationId;
	}
	public void setAccommodationId(String accommodationId) {
		this.accommodationId = accommodationId;
	}
	public String getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}
	public String getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public String getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
		
	 

}