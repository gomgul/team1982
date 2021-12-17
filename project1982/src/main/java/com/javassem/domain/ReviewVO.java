package com.javassem.domain;

public class ReviewVO {
	private int userNum;
	private String self_review;
	private String shopNum;
	
	public int getUserNum() {
		return userNum;
	}
	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}
	public String getSelf_review() {
		return self_review;
	}
	public void setSelf_review(String self_review) {
		this.self_review = self_review;
	}
	public String getShopNum() {
		return shopNum;
	}
	public void setShopNum(String shopNum) {
		this.shopNum = shopNum;
	}
}
