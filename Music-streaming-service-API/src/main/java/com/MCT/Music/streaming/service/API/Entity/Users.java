package com.MCT.Music.streaming.service.API.Entity;

import java.util.ArrayList;
import java.util.List;
import com.MCT.Music.streaming.service.API.Entity.Song;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	
	private String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Email
	private String email;
	
	private String password;
	
	@OneToMany (cascade = CascadeType.ALL)
	private List<Song> playList = new ArrayList<>();
//	

	
	public List<Song> getPlayList() {
		return playList;
	}

	public void setPlayList(List<Song> plaList) {
		this.playList = plaList;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @param name
	 * @param email
	 * @param password
	 */
	public Users(String name, @Email String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}

	

	

	

	


	



}
