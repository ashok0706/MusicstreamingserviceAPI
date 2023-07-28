package com.MCT.Music.streaming.service.API.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MCT.Music.streaming.service.API.Entity.Song;
import com.MCT.Music.streaming.service.API.Service.AdminService;


@RestController
@RequestMapping("/Admin")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@GetMapping("/getall")
	
	public Iterable<Song> getall(){
		return adminService.getall();
	}
	
	@PostMapping("/addsong")
	public String save(@RequestBody List<Song> song) {
		
		return adminService.save(song);
	}
	
	@DeleteMapping("/deletesongbyId")
	public String delete(@RequestParam("Id") String Id) {
		
		return adminService.delate(Id);
	}
	
	@PutMapping("/updatesong")
	public String updatedelete(Song song) {
		
		return adminService.update(song);
	}

}
