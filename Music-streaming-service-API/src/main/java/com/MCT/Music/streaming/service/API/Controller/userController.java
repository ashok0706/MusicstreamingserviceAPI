package com.MCT.Music.streaming.service.API.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.MCT.Music.streaming.service.API.Entity.Song;
import com.MCT.Music.streaming.service.API.Entity.Users;
import com.MCT.Music.streaming.service.API.Service.userService;

import antlr.collections.List;

@RestController
@RequestMapping("/user")
public class userController {
	
	@Autowired
	userService userService;
	
	
	@PostMapping("/registration")
	public String regitration( @RequestParam("name") String name, @RequestParam ("email") String email, @RequestParam("password" ) String password) {
		
		 Users user= new Users(name, email, password);
		return userService.save(user);
	}
	
	@GetMapping("/getList/{username}")
	public Iterable<Song> name(@RequestParam("username") String username ){
	return userService.getlist(username);
	}
	
	@PostMapping("/addSongById/{Songid}/{username}")
	public String  list(@RequestParam("songId") String songId,  @RequestParam("") String username) {
       return userService.addtolist(songId, username);
	}

	@DeleteMapping("/removeSongByld/{songid}/{username}")
	public String removesong(@RequestParam("songid") String songid , @RequestParam("username") String username) {
		return userService.remove(songid, username);
	}
	
}
