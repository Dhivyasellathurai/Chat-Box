package com.web.chatbox.entity;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
@Getter
@Setter
public class User {
	@Id
	private String nickName;
	private String fullName;
	private Status status;
}
