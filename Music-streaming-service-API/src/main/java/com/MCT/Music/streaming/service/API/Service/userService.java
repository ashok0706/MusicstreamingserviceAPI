package com.MCT.Music.streaming.service.API.Service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MCT.Music.streaming.service.API.Entity.Song;
import com.MCT.Music.streaming.service.API.Entity.Users;
import com.MCT.Music.streaming.service.API.Repository.SongRepo;
import com.MCT.Music.streaming.service.API.Repository.UserRepo;

@Service
public class userService {
	
	@Autowired
	UserRepo userRepo;
	Users user;
	SongRepo songRepo;
	Song song;

	public Iterable<Song> getlist(String username) {
		   user = userRepo.findByName(username);
		return  user.getPlayList();
	}

	public String addtolist(String songId, String username) {
		
		try {
			user = userRepo.findByName(username);
			song  = songRepo.findById(Integer.parseInt(songId)).get();
			
		} catch (Exception e) {
			
			if(user ==null && song == null) return  "Details Not found";
		}
		
	     user.getPlayList().add(song);
     	  userRepo.save(user);
		return "Succes fully added to The PlayList";
	}

	public String remove(String songid, String username) {
		try {
			user = userRepo.findByName(username);
			song  = songRepo.findById(Integer.parseInt(songid)).get();
		} catch (Exception e) {
			if(user ==null && song == null) return  "Details Not found";
		}		
		
		  user.getPlayList().remove(Integer.parseInt(songid));
		  userRepo.save(user);
		 return  "Succes fully removed" ;
	}

	public String save(Users user2) {
		try {
			userRepo.save(user2);
			return "success fully User Account Created" ;
		} catch (Exception e) {
			return "Somithing yhave entered Wrong";
		}
	  
	}
	
	

}
