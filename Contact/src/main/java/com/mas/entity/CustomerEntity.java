package com.mas.entity;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "cus")
public class CustomerEntity {
	@Id
	private String customer_id;
	private String customer_Name;
	private String customer_Email;
	private Integer mobile;
	@Column(name = "ACTIVE_FALG")
	private Character active_Falg ;
	private Date created_Date ;
	private Date update_Date ;
	private String created_By;
	private String update_By;
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_Name() {
		return customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}
	public String getCustomer_Email() {
		return customer_Email;
	}
	public void setCustomer_Email(String customer_Email) {
		this.customer_Email = customer_Email;
	}
	public Integer getMobile() {
		return mobile;
	}
	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}
	
	public Character getActive_Falg() {
		return active_Falg;
	}
	public void setActive_Falg(Character active_Falg) {
		this.active_Falg = active_Falg;
	}
	public Date getCreated_Date() {
		return created_Date;
	}
	public void setCreated_Date(Date created_Date) {
		this.created_Date = created_Date;
	}
	public Date getUpdate_Date() {
		return update_Date;
	}
	public void setUpdate_Date(Date update_Date) {
		this.update_Date = update_Date;
	}
	public String getCreated_By() {
		return created_By;
	}
	public void setCreated_By(String created_By) {
		this.created_By = created_By;
	}
	public String getUpdate_By() {
		return update_By;
	}
	public void setUpdate_By(String update_By) {
		this.update_By = update_By;
	}
	@Override
	public String toString() {
		return "CustomerEntity [customer_id=" + customer_id + ", customer_Name=" + customer_Name + ", customer_Email="
				+ customer_Email + ", mobile=" + mobile + ", active_Falg=" + active_Falg + ", created_Date="
				+ created_Date + ", update_Date=" + update_Date + ", created_By=" + created_By + ", update_By="
				+ update_By + "]";
	}
	public CustomerEntity(String customer_id, String customer_Name, String customer_Email, Integer mobile,
			Character active_Falg, Date created_Date, Date update_Date, String created_By, String update_By) {
		super();
		this.customer_id = customer_id;
		this.customer_Name = customer_Name;
		this.customer_Email = customer_Email;
		this.mobile = mobile;
		this.active_Falg = active_Falg;
		this.created_Date = created_Date;
		this.update_Date = update_Date;
		this.created_By = created_By;
		this.update_By = update_By;
	}
	public CustomerEntity() {
		super();
	}
	
	
	

}
