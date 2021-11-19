package com.music.dao;

import com.music.domain.Song;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table song
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table song
     *
     * @mbggenerated
     */
    int insert(Song record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table song
     *
     * @mbggenerated
     */
    int insertSelective(Song record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table song
     *
     * @mbggenerated
     */
    Song selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table song
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Song record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table song
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Song record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table song
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Song record);

    int deleteSong(Integer id);

    List<Song> allSong();

    List<Song> selectSingerId(Integer singerId);
}