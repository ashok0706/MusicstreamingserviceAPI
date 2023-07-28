package com.MCT.Music.streaming.service.API.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MCT.Music.streaming.service.API.Entity.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer>{

    public 	Users findByName(String username);

}
