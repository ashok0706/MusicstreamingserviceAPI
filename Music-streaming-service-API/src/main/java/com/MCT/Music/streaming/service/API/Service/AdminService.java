package com.MCT.Music.streaming.service.API.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MCT.Music.streaming.service.API.Entity.Song;
import com.MCT.Music.streaming.service.API.Repository.SongRepo;

@Service
public class AdminService {
	
	@Autowired
	SongRepo songRepo;

	public Iterable<Song> getall() {
		
		return songRepo.findAll();
	}

	public String save(List<Song> song) {
		  songRepo.saveAll(song);
		return "Succesfully added to the List";
	}

	public String delate(String id) {
	try {
		songRepo.deleteById(Integer.parseInt(id));
		return "successfuulydeleted";
		
	} catch (Exception e) {
		return "No Data Exist"; 
	}
		
	}

	public String update(Song song) {
		try {
			songRepo.save(song);
			return "Song Succesfully updated";
		} catch (Exception e) {
			return "NO Data Exist";
		}
		
	}

}
