package com.music.service.impl;

import com.music.dao.SongMapper;
import com.music.domain.Song;
import com.music.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService {
  @Autowired
  private SongMapper songMapper;

  @Override
  public boolean insertSelective(Song song) {
    return songMapper.insertSelective(song) > 0 ? true : false;
  }

  @Override
  public boolean deleteSong(Integer id) {
    return songMapper.deleteSong(id) > 0 ? true : false;
  }

  @Override
  public List<Song> allSong() {
    return songMapper.allSong();
  }

  @Override
  public List<Song> selectSingerId(Integer singerId) {
    return songMapper.selectSingerId(singerId);
  }

}
