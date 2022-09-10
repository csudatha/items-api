package com.ucs.sts.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Item {

	private int itemID;
	private String partNumber;
	private String color;
	private String weight;
	
	@Autowired
	private Attachment attachment;
	
	public Item() {
		System.out.println("New Item Object Created");
	}
	
	@Override
	public String toString() {
		return "Item [itemID=" + itemID + ", partNumber=" + partNumber + ", color=" + color + ", weight=" + weight
				+ "]";
	}
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String changeColor() {
		System.out.println("Invoked method Change Color");
		System.out.println("Checking Attachment "+attachment.getFileSize());		
		return "Invoked method Change Color";
	}
}
