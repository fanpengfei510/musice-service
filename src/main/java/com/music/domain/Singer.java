package com.music.domain;

import java.util.Date;

public class Singer {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column singer.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column singer.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column singer.sex
     *
     * @mbggenerated
     */
    private Integer sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column singer.pic
     *
     * @mbggenerated
     */
    private String pic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column singer.birth
     *
     * @mbggenerated
     */
    private Date birth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column singer.location
     *
     * @mbggenerated
     */
    private String location;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column singer.introduction
     *
     * @mbggenerated
     */
    private String introduction;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column singer.id
     *
     * @return the value of singer.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column singer.id
     *
     * @param id the value for singer.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column singer.name
     *
     * @return the value of singer.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column singer.name
     *
     * @param name the value for singer.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column singer.sex
     *
     * @return the value of singer.sex
     *
     * @mbggenerated
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column singer.sex
     *
     * @param sex the value for singer.sex
     *
     * @mbggenerated
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column singer.pic
     *
     * @return the value of singer.pic
     *
     * @mbggenerated
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column singer.pic
     *
     * @param pic the value for singer.pic
     *
     * @mbggenerated
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column singer.birth
     *
     * @return the value of singer.birth
     *
     * @mbggenerated
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column singer.birth
     *
     * @param birth the value for singer.birth
     *
     * @mbggenerated
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column singer.location
     *
     * @return the value of singer.location
     *
     * @mbggenerated
     */
    public String getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column singer.location
     *
     * @param location the value for singer.location
     *
     * @mbggenerated
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column singer.introduction
     *
     * @return the value of singer.introduction
     *
     * @mbggenerated
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column singer.introduction
     *
     * @param introduction the value for singer.introduction
     *
     * @mbggenerated
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}