package com.teamcute.bang.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_user")
public class UserEntity {
	@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int userid;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String email;
    
    public UserEntity(){
    	//default
    }

	

	public UserEntity(int userid, String username, String password, String firstname, String lastname, String email) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}



	public int getUserid() {
		return userid;
	}
	/* you cannot set a userid
	public void setUserid(int userid) {
		this.userid = userid;
	}**/

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
    
	
    
}	
