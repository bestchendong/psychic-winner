/*
Navicat MySQL Data Transfer

Source Server         : db.dev
Source Server Version : 50720
Source Host           : db.dev.trust.com:3306
Source Database       : admin

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-02-02 13:55:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin_department
-- ----------------------------
DROP TABLE IF EXISTS `admin_department`;
CREATE TABLE `admin_department` (
  `department_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '部门id',
  `name` varchar(20) DEFAULT NULL COMMENT '部门名称',
  `pid` int(10) DEFAULT '0' COMMENT '父级部门id',
  `seq` int(10) DEFAULT '0' COMMENT '排序',
  `icon` varchar(100) DEFAULT NULL COMMENT '部门图标',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `address` varchar(200) DEFAULT NULL COMMENT '部门地址',
  `code` varchar(50) DEFAULT NULL COMMENT '部门编码',
  `system_id` int(10) DEFAULT NULL,
  `level` int(10) DEFAULT '1' COMMENT '部门层级，最高层级为1',
  PRIMARY KEY (`department_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin_department
-- ----------------------------

-- ----------------------------
-- Table structure for admin_manager
-- ----------------------------
DROP TABLE IF EXISTS `admin_manager`;
CREATE TABLE `admin_manager` (
  `manager_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '账号id',
  `manager_name` varchar(20) NOT NULL COMMENT '账号名称',
  `password` varchar(100) DEFAULT '123456' COMMENT '密码',
  `system_id` int(10) NOT NULL DEFAULT '1' COMMENT '所属系统id',
  `real_name` varchar(20) DEFAULT NULL COMMENT '真实姓名',
  `phone_number` varchar(20) DEFAULT NULL COMMENT '电话号码',
  `status` int(2) NOT NULL DEFAULT '1' COMMENT '账户状态，1：启用；0：禁用。',
  `department_id` int(10) DEFAULT NULL COMMENT '所属部门',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `create_time` datetime DEFAULT NULL COMMENT '账号创建时间',
  `last_login_time` datetime DEFAULT NULL COMMENT '最后登录时间',
  `is_delete` int(2) NOT NULL DEFAULT '0' COMMENT '是否被删除，0：未删除；1：已删除；',
  PRIMARY KEY (`manager_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin_manager
-- ----------------------------
INSERT INTO `admin_manager` VALUES ('1', 'root', 'e00acc2848aa48aaae46e046e20e882e', '1', 'root', '13100001111', '1', '5', 'yangchangbing@tr-ag.com', '2018-01-08 11:41:00', null, '0');

-- ----------------------------
-- Table structure for admin_manager_role
-- ----------------------------
DROP TABLE IF EXISTS `admin_manager_role`;
CREATE TABLE `admin_manager_role` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `manager_id` int(10) NOT NULL,
  `role_id` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin_manager_role
-- ----------------------------
INSERT INTO `admin_manager_role` VALUES ('1', '1', '1');

-- ----------------------------
-- Table structure for admin_menu
-- ----------------------------
DROP TABLE IF EXISTS `admin_menu`;
CREATE TABLE `admin_menu` (
  `menu_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '自增长',
  `name` varchar(20) NOT NULL,
  `system_id` int(10) DEFAULT NULL COMMENT '所属系统',
  `parent_id` int(10) NOT NULL DEFAULT '0' COMMENT '0:表示根节点',
  `level` int(10) DEFAULT NULL COMMENT '(菜单)1:一级 2:二级 3：三级 4:四级 ',
  `url` varchar(200) DEFAULT '',
  `icon` varchar(200) DEFAULT '',
  `menu_key` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin_menu
-- ----------------------------
INSERT INTO `admin_menu` VALUES ('1', '账户', '1', '0', '1', '', '/mgt/images/user.png', null);
INSERT INTO `admin_menu` VALUES ('2', '配置', '1', '0', '1', '', '/mgt/images/user.png', null);
INSERT INTO `admin_menu` VALUES ('3', '账户管理', '1', '1', '2', null, null, null);
INSERT INTO `admin_menu` VALUES ('4', '系统配置', '1', '2', '2', null, null, null);
INSERT INTO `admin_menu` VALUES ('5', '角色信息', '1', '3', '3', null, null, null);
INSERT INTO `admin_menu` VALUES ('6', '部门信息', '1', '3', '3', null, null, null);
INSERT INTO `admin_menu` VALUES ('7', '账户信息', '1', '3', '3', null, null, null);
INSERT INTO `admin_menu` VALUES ('8', '角色列表', '1', '5', '4', '/mgt/role/manage/list?pageNo=1&pageSize=10&systemId=1', null, 'admin:role:manage:list');
INSERT INTO `admin_menu` VALUES ('9', '部门列表', '1', '6', '4', '/mgt/department/manage/list?pageNo=1&pageSize=10&systemId=1', '', 'admin:department:manage:list');
INSERT INTO `admin_menu` VALUES ('10', '账号列表', '1', '7', '4', '/mgt/manager/manage/list?pageNo=1&pageSize=10&systemId=1', null, 'admin:manager:manage:list');
INSERT INTO `admin_menu` VALUES ('11', '操作权限', '1', '4', '3', '', '', null);
INSERT INTO `admin_menu` VALUES ('12', '操作列表', '1', '11', '4', '/mgt/operation/manage/list', '', 'admin:operation:manage:list');
INSERT INTO `admin_menu` VALUES ('13', '菜单权限', '1', '4', '3', '', '', null);
INSERT INTO `admin_menu` VALUES ('14', '菜单列表', '1', '13', '4', '', '', null);

-- ----------------------------
-- Table structure for admin_operation
-- ----------------------------
DROP TABLE IF EXISTS `admin_operation`;
CREATE TABLE `admin_operation` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '操作id',
  `name` varchar(20) DEFAULT NULL COMMENT '操作名称',
  `menu_id` int(10) DEFAULT NULL COMMENT '所属菜单id',
  `operation_id` varchar(100) DEFAULT '' COMMENT '用于权限控制的key',
  `system_id` int(10) DEFAULT NULL COMMENT '系统id',
  PRIMARY KEY (`id`),
  KEY `page_id` (`menu_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin_operation
-- ----------------------------
INSERT INTO `admin_operation` VALUES ('1', '新增角色', '8', 'admin:role:add', '1');
INSERT INTO `admin_operation` VALUES ('2', '页面权限', '8', 'admin:role:authmenu', '1');
INSERT INTO `admin_operation` VALUES ('3', '操作权限', '8', 'admin:role:authopn', '1');
INSERT INTO `admin_operation` VALUES ('4', '编辑角色', '8', 'admin:role:edit', '1');
INSERT INTO `admin_operation` VALUES ('5', '删除角色', '8', 'admin:role:delete', '1');
INSERT INTO `admin_operation` VALUES ('6', '新增部门', '9', 'admin:dep:add', '1');
INSERT INTO `admin_operation` VALUES ('7', '编辑部门', '9', 'admin:dep:edit', '1');
INSERT INTO `admin_operation` VALUES ('8', '删除部门', '9', 'admin:dep:delete', '1');
INSERT INTO `admin_operation` VALUES ('9', '新增账户', '10', 'admin:manager:add', '1');
INSERT INTO `admin_operation` VALUES ('10', '修改账户', '10', 'admin:manager:edit', '1');
INSERT INTO `admin_operation` VALUES ('11', '账户详情', '10', 'admin:manager:detail', '1');
INSERT INTO `admin_operation` VALUES ('12', '删除账户', '10', 'admin:manager:delete', '1');
INSERT INTO `admin_operation` VALUES ('13', '增加操作', '12', 'admin:opn:add', '1');
INSERT INTO `admin_operation` VALUES ('14', '删除操作', '12', 'admin:opn:delete', '1');

-- ----------------------------
-- Table structure for admin_role
-- ----------------------------
DROP TABLE IF EXISTS `admin_role`;
CREATE TABLE `admin_role` (
  `role_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `name` varchar(50) DEFAULT NULL COMMENT '角色名称',
  `system_id` int(10) NOT NULL COMMENT '所属的系统id',
  `status` int(2) NOT NULL DEFAULT '1' COMMENT '角色状态，1：启用，0：禁用',
  `description` varchar(200) DEFAULT NULL COMMENT '角色描述',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin_role
-- ----------------------------
INSERT INTO `admin_role` VALUES ('1', '管理员', '1', '1', '最大权限角色');

-- ----------------------------
-- Table structure for admin_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `admin_role_menu`;
CREATE TABLE `admin_role_menu` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `role_id` int(10) NOT NULL,
  `menu_id` int(10) NOT NULL,
  `system_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin_role_menu
-- ----------------------------
INSERT INTO `admin_role_menu` VALUES ('1', '1', '1', '1');
INSERT INTO `admin_role_menu` VALUES ('2', '1', '2', '1');
INSERT INTO `admin_role_menu` VALUES ('3', '1', '3', '1');
INSERT INTO `admin_role_menu` VALUES ('4', '1', '4', '1');
INSERT INTO `admin_role_menu` VALUES ('5', '1', '5', '1');
INSERT INTO `admin_role_menu` VALUES ('6', '1', '6', '1');
INSERT INTO `admin_role_menu` VALUES ('7', '1', '7', '1');
INSERT INTO `admin_role_menu` VALUES ('8', '1', '8', '1');
INSERT INTO `admin_role_menu` VALUES ('9', '1', '9', '1');
INSERT INTO `admin_role_menu` VALUES ('10', '1', '10', '1');
INSERT INTO `admin_role_menu` VALUES ('11', '1', '11', '1');
INSERT INTO `admin_role_menu` VALUES ('12', '1', '12', '1');
INSERT INTO `admin_role_menu` VALUES ('13', '1', '13', '1');
INSERT INTO `admin_role_menu` VALUES ('14', '1', '14', '1');

-- ----------------------------
-- Table structure for admin_role_operation
-- ----------------------------
DROP TABLE IF EXISTS `admin_role_operation`;
CREATE TABLE `admin_role_operation` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `operation_id` int(10) DEFAULT NULL,
  `role_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin_role_operation
-- ----------------------------
INSERT INTO `admin_role_operation` VALUES ('1', '1', '1');
INSERT INTO `admin_role_operation` VALUES ('2', '2', '1');
INSERT INTO `admin_role_operation` VALUES ('3', '3', '1');
INSERT INTO `admin_role_operation` VALUES ('4', '4', '1');
INSERT INTO `admin_role_operation` VALUES ('5', '5', '1');
INSERT INTO `admin_role_operation` VALUES ('6', '6', '1');
INSERT INTO `admin_role_operation` VALUES ('7', '7', '1');
INSERT INTO `admin_role_operation` VALUES ('8', '8', '1');
INSERT INTO `admin_role_operation` VALUES ('9', '9', '1');
INSERT INTO `admin_role_operation` VALUES ('10', '10', '1');
INSERT INTO `admin_role_operation` VALUES ('11', '11', '1');
INSERT INTO `admin_role_operation` VALUES ('12', '12', '1');
INSERT INTO `admin_role_operation` VALUES ('13', '13', '1');
INSERT INTO `admin_role_operation` VALUES ('14', '14', '1');

-- ----------------------------
-- Table structure for admin_system
-- ----------------------------
DROP TABLE IF EXISTS `admin_system`;
CREATE TABLE `admin_system` (
  `system_id` int(5) NOT NULL AUTO_INCREMENT,
  `system_des` varchar(255) DEFAULT NULL,
  `system_name` varchar(20) NOT NULL,
  PRIMARY KEY (`system_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin_system
-- ----------------------------
INSERT INTO `admin_system` VALUES ('1', 'rnt', '睿农通后台管理系统');
