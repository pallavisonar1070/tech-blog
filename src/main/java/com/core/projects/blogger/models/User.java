package com.core.projects.blogger.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@SuppressWarnings("unused")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "username", nullable = false, length=100)
	private String name;
	@Column(name = "email", nullable = false, length=150)
	private String email;
	@Column(name = "password", nullable = false, length=150)
	private String password;
	@Column(name = "about", nullable = false, length=250)
	private String about;
}
