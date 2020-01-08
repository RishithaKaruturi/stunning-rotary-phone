package com.deloitte.thirdmvn.hibthird.entity;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class AadharCard
{
    @Id
	int aid;
    @Column(name = "issue_auth")
    String issue_auth;
    @Column(name = "issue_date")
    Date issue_date;
    @OneToOne(mappedBy = "acard")
    Person person;
    public AadharCard() {}
	public AadharCard(int aid, String issue_auth, Date issue_date) {
		this.aid = aid;
		this.issue_auth = issue_auth;
		this.issue_date = issue_date;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getIssue_auth() {
		return issue_auth;
	}
	public void setIssue_auth(String issue_auth) {
		this.issue_auth = issue_auth;
	}
	public java.sql.Date getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(java.sql.Date issue_date) {
		this.issue_date = issue_date;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
}
