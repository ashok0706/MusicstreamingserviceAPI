package com.MCT.Music.streaming.service.API.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MCT.Music.streaming.service.API.Entity.Song;

@Repository
public interface SongRepo extends JpaRepository<Song, Integer>{

}
