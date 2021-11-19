/*
 Navicat MySQL Data Transfer

 Source Server         : admin
 Source Server Type    : MySQL
 Source Server Version : 50641
 Source Host           : localhost:3306
 Source Schema         : tp_music

 Target Server Type    : MySQL
 Target Server Version : 50641
 File Encoding         : 65001

 Date: 18/11/2021 16:58:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
BEGIN;
INSERT INTO `admin` VALUES (1, 'admin', '123');
INSERT INTO `admin` VALUES (2, 'admin1', '111');
COMMIT;

-- ----------------------------
-- Table structure for collect
-- ----------------------------
DROP TABLE IF EXISTS `collect`;
CREATE TABLE `collect` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(10) unsigned NOT NULL,
  `type` tinyint(4) NOT NULL,
  `song_id` int(10) unsigned DEFAULT NULL,
  `song_list_id` int(10) unsigned DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of collect
-- ----------------------------
BEGIN;
INSERT INTO `collect` VALUES (1, 1, 5, 5, 5, '2019-01-01 01:01:01');
COMMIT;

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(10) unsigned NOT NULL,
  `song_id` int(10) unsigned DEFAULT NULL,
  `song_list_id` int(10) unsigned DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `type` int(4) NOT NULL,
  `up` int(10) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment
-- ----------------------------
BEGIN;
INSERT INTO `comment` VALUES (1, 1, 1, 1, '里面乱乱糟糟\n我们别再闹了\n这个冬天已然很冷了\n我们靠在一起。好吗', '2020-10-11 11:11:11', 0, 0);
COMMIT;

-- ----------------------------
-- Table structure for consumer
-- ----------------------------
DROP TABLE IF EXISTS `consumer`;
CREATE TABLE `consumer` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(100) NOT NULL,
  `sex` int(4) DEFAULT NULL,
  `phone_num` char(15) DEFAULT NULL,
  `email` char(30) DEFAULT NULL,
  `birth` datetime DEFAULT NULL,
  `introduction` varchar(255) DEFAULT NULL,
  `location` varchar(45) DEFAULT NULL,
  `avator` varchar(255) DEFAULT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username_UNIQUE` (`username`),
  UNIQUE KEY `phone_num_UNIQUE` (`phone_num`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of consumer
-- ----------------------------
BEGIN;
INSERT INTO `consumer` VALUES (1, '老一', '123', 0, '13260009991', 'laoda@163.com', '2019-01-01 01:01:01', '老大好好吃饭', '河北', '/img/avatorImages/1556202448064L1.jpg', '2019-01-04 21:42:24', '2020-04-05 03:35:12');
INSERT INTO `consumer` VALUES (17, '老三更新', '12322', 1, '15761615111', 'eeee212hrke@163.com', '2019-01-01 03:02:02', '天冷防寒1', '北京1', '/img/header.jpg', '2021-11-15 15:53:06', '2021-11-16 11:10:54');
COMMIT;

-- ----------------------------
-- Table structure for singer
-- ----------------------------
DROP TABLE IF EXISTS `singer`;
CREATE TABLE `singer` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `sex` int(1) DEFAULT NULL,
  `pic` varchar(255) DEFAULT NULL,
  `birth` datetime DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `introduction` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of singer
-- ----------------------------
BEGIN;
INSERT INTO `singer` VALUES (1, '王力宏', 0, '/img/singerPic/zhangjie.jpg', '1982-12-20 18:50:07', '中国四川省', '华语歌坛新生代领军人物，偶像与实力兼具的超人气天王。2004年出道至今，已发行9张高品质唱片，唱片销量称冠内地群雄');
INSERT INTO `singer` VALUES (2, '周杰伦', 0, '/img/singerPic/zhangjie.jpg', '1979-01-08 17:29:15', '中国台湾', '著名歌手，音乐人，词曲创作人，编曲及制作人，MV及电影导演。新世纪华语歌坛领军人物，中国风歌曲始祖，被时代周刊誉为“亚洲猫王”，是2000年后亚洲流行乐坛最具革命性与指标性的创作歌手');
INSERT INTO `singer` VALUES (3, '许蔚', 1, '/img/header/xuwei.jpg', '1982-12-20 18:50:07', '中国湖北', '1990年5月30日出生于韩国首尔永登浦区，韩国女歌手');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
