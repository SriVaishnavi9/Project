package com.hexa.model;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  
@Entity  
@Table(name="Management")  
public class Hotel {
@Id
@Column
	private int hotelid;
@Column
	private String name;
@Column
	private int phoneno;
public int getHotelid() {
	return hotelid;
}
public void setHotelId(int hotelid) {
	this.hotelid = hotelid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Hotel [hotelid=" + hotelid + ", name=" + name + ", phoneno=" + phoneno + "]";
}
public int getPhoneno() {
	return phoneno;
}
public void setPhoneno(int phoneno) {
	this.phoneno = phoneno;
}
}
