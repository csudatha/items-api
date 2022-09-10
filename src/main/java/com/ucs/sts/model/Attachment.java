package com.ucs.sts.model;

import org.springframework.stereotype.Component;

@Component
public class Attachment {

	private String fileName;
	private int fileSize;
	public Attachment() {
		System.out.println("New Attachment Object created");
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public int getFileSize() {
		return fileSize;
	}
	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}
}
