package com.handson_1;

public class MemberShip {
	private int membershipId;
	private String membershipType;
	private int visitPerYear;
	private Customer customer;
	public MemberShip(int membershipId, String membershipType, int visitPerYear, Customer customer) {
		super();
		this.membershipId = membershipId;
		this.membershipType = membershipType;
		this.visitPerYear = visitPerYear;
		this.customer = customer;
	}
	public int getMembershipId() {
		return membershipId;
	}
	public void setMembershipId(int membershipId) {
		this.membershipId = membershipId;
	}
	public String getMembershipType() {
		return membershipType;
	}
	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}
	public int getVisitPerYear() {
		return visitPerYear;
	}
	public void setVisitPerYear(int visitPerYear) {
		this.visitPerYear = visitPerYear;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "MemberShip [membershipId=" + membershipId + ", membershipType=" + membershipType + ", visitPerYear="
				+ visitPerYear + ", customer=" + customer + "]";
	}
	
	

}
