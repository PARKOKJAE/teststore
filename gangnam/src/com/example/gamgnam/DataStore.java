package com.example.gamgnam;

public class DataStore {
	private String photoPath;
	private String storeName;
	private String description;
	
	public DataStore()
	{
		photoPath = null;
		storeName = null;
		description = null;
	}
	
	public DataStore(String photoPath, String storeName, String description)
	{
		this.photoPath = photoPath;
		this.storeName = storeName;
		this.description = description;
	}
	
	public String getPhotoPath() {
		return photoPath;
	}
	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
