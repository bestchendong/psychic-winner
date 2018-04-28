/*
Navicat MySQL Data Transfer

Source Server         : 201开发环境
Source Server Version : 50720
Source Host           : 172.30.0.201:3306
Source Database       : ucenter

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-01-19 16:17:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for uc_user
-- ----------------------------
DROP TABLE IF EXISTS `uc_user`;
CREATE TABLE `uc_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `nickname` varchar(50) DEFAULT NULL,
  `phone` varchar(11) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `user_type` tinyint(1) DEFAULT '0' COMMENT '用户类型： 0：普通用户',
  `enable` tinyint(1) DEFAULT '1' COMMENT '用户状态: 1：有效  0:失效',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `certification` tinyint(1) DEFAULT '0' COMMENT '0:未认证 1：已实名认证',
  PRIMARY KEY (`user_id`),
  KEY `phone` (`phone`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of uc_user
-- ----------------------------
INSERT INTO `uc_user` VALUES ('1', 'chen', '18366112588', '', '0', '1', 'c81e728d9d4c2f636f067f89cc14862c', '0');
INSERT INTO `uc_user` VALUES ('3', 'a123456', '13271279565', null, '0', '1', 'af8f9dffa5d420fbc249141645b962ee', '0');

-- ----------------------------
-- Table structure for uc_user_address
-- ----------------------------
DROP TABLE IF EXISTS `uc_user_address`;
CREATE TABLE `uc_user_address` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `province` varchar(10) DEFAULT NULL,
  `city` varchar(10) DEFAULT NULL,
  `district` varchar(10) DEFAULT NULL,
  `street` varchar(10) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `isdefault` tinyint(1) DEFAULT '0' COMMENT '1:表示默认地址 0:表示普通地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of uc_user_address
-- ----------------------------

-- ----------------------------
-- Table structure for uc_user_info
-- ----------------------------
DROP TABLE IF EXISTS `uc_user_info`;
CREATE TABLE `uc_user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `sex` char(1) DEFAULT NULL,
  `id_card` char(18) DEFAULT NULL,
  `photo_front` varchar(50) DEFAULT NULL,
  `photo_back` varchar(50) DEFAULT NULL,
  `province` varchar(10) DEFAULT NULL,
  `city` varchar(10) DEFAULT NULL,
  `district` varchar(10) DEFAULT NULL,
  `street` varchar(10) DEFAULT NULL,
  `name` varchar(10) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `userid` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of uc_user_info
-- ----------------------------
