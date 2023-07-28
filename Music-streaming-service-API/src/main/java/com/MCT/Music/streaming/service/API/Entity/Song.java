package com.MCT.Music.streaming.service.API.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import antlr.collections.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Song {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer songId;
    @NotNull
	private String songName;
	@NotEmpty
	private String album;
	
	
	


	/**
	 * @param songId
	 * @param songName
	 * @param album
	 */
//	public Song(Integer songId, String songName, String album) {
//		super();
//		this.songId = songId;
//		this.songName = songName;
//		this.album = album;
//	}
	//	private
	public Integer getSongId() {
		return songId;
	}
	public void setSongId(Integer songId) {
		this.songId = songId;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	
	
	
	
	
}
