package com.pakjivega.tsp.bean;

public class City {

	private String estate;
	private String cityname;
	//Distance to greenwich meridian
	private long longitude;
	//Distance to the ecuador
	private long latitude;
	public String getEstate() {
		return estate;
	}
	public void setEstate(String estate) {
		this.estate = estate;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public long getLongitude() {
		return longitude;
	}
	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}
	public long getLatitude() {
		return latitude;
	}
	public void setLatitude(long latitude) {
		this.latitude = latitude;
	} 
		
		
}
