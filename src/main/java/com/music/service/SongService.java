package com.music.service;

import com.music.domain.Song;

import java.util.List;

public interface SongService {
  boolean insertSelective(Song song);

  boolean deleteSong(Integer id);

  List<Song> allSong();

  List<Song> selectSingerId(Integer singerId);
}
