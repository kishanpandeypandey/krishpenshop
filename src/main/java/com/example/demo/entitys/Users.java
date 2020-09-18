package com.example.demo.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="users")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private Long userId;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="user_number")
	private Long userNumber;
	
	@Column(name="user_email")
private String useremail;
	
	@Column(name="user_password")
	private String password;
	
	public Users() {}

	

	public Users(String userName, Long userNumber, String useremail, String password) {
		super();
		this.userName = userName;
		this.userNumber = userNumber;
		this.useremail = useremail;
		this.password = password;
	}





	public Long getUserId() {
		return userId;
	}



	public void setUserId(Long userId) {
		this.userId = userId;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public Long getUserNumber() {
		return userNumber;
	}



	public void setUserNumber(Long userNumber) {
		this.userNumber = userNumber;
	}



	public String getUseremail() {
		return useremail;
	}



	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", userNumber=" + userNumber + ", useremail="
				+ useremail + ", password=" + password + "]";
	}



	
	
	
	

}
