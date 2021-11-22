package com.hoaxify.ws.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data //getter setterlar geldi-outlinedan bak
@Entity//bunun bir tablo olduğunu belirttik
public class User {
	@Id//pk için
	@GeneratedValue//hibernate pk'nın içini otomatik doldurur
	private String id;//pk
	private String userName;
	private String displayName;
	private String password;
	public String getUserName() {
		return userName;
	}
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", displayName=" + displayName + ", password=" + password + "]";
	}
}
