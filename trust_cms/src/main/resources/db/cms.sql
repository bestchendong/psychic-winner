/*
Navicat MySQL Data Transfer

Source Server         : 201
Source Server Version : 50720
Source Host           : 172.30.0.201:3306
Source Database       : cms

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-01-19 16:18:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `cms_article_category`
-- ----------------------------
DROP TABLE IF EXISTS `cms_article_category`;
CREATE TABLE `cms_article_category` (
  `c_category_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '内容分类ID 主键',
  `c_site_code` varchar(50) DEFAULT NULL COMMENT '站点Code',
  `c_site_id` bigint(11) DEFAULT NULL COMMENT '外链站点ID',
  `c_pid` bigint(11) DEFAULT NULL COMMENT '分类父ID',
  `c_category_code` varchar(30) DEFAULT NULL COMMENT '分类Code',
  `c_category_name` varchar(20) DEFAULT NULL COMMENT '分类名称',
  `c_category_status` int(11) DEFAULT NULL COMMENT '分类状态1启用0禁用',
  `c_category_describe` varchar(128) DEFAULT NULL COMMENT '描述',
  `c_category_image` varchar(128) DEFAULT NULL COMMENT '分类图片-病虫害分类',
  `c_category_level` int(11) DEFAULT NULL COMMENT '级别',
  PRIMARY KEY (`c_category_id`),
  KEY `fk_c_category_index` (`c_category_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8 COMMENT='文章分类表';

-- ----------------------------
-- Records of cms_article_category
-- ----------------------------
INSERT INTO `cms_article_category` VALUES ('1', null, '1', '0', 'trust_insect_pests', '病虫害', '1', '病虫害', null, '0');
INSERT INTO `cms_article_category` VALUES ('2', null, '1', '1', 'trust_fruits', '水果', '1', '水果', '1', '1');
INSERT INTO `cms_article_category` VALUES ('3', null, '1', '1', 'trust_vegetables', '蔬菜', '1', '蔬菜', 'sdf', '1');
INSERT INTO `cms_article_category` VALUES ('4', null, '1', '3', 'trust_eggplant', '茄子', '1', '茄子', 'http://sdfsddsf', '2');
INSERT INTO `cms_article_category` VALUES ('5', null, '1', '0', 'trust_policie_regulations', '政策法规', '1', '政策法规', null, '0');
INSERT INTO `cms_article_category` VALUES ('6', null, '1', '0', 'trust_notice', '通告通知', '1', '通告通知', null, '0');
INSERT INTO `cms_article_category` VALUES ('7', null, '1', '0', 'trust_agricultural_news', '农业要闻 ', '1', '农业要闻 ', null, '0');
INSERT INTO `cms_article_category` VALUES ('8', null, '1', '1', 'trust_foodstuff', '粮食', '1', '粮食', null, '1');
INSERT INTO `cms_article_category` VALUES ('9', null, '1', '8', 'trust_rice', '水稻', '1', '水稻', '/images/categoryicon/rice.jpg', '2');
INSERT INTO `cms_article_category` VALUES ('10', null, '1', '8', 'trust_corn', '玉米', '1', '玉米', 'http://a3.att.hudong.com/14/06/01100000000000144725062390717_s.jpg', '2');
INSERT INTO `cms_article_category` VALUES ('11', null, '1', '8', 'trust_soybean', '大豆', '1', '大豆', 'http://img3.imgtn.bdimg.com/it/u=1839890710,1128574319&fm=27&gp=0.jpg', '2');
INSERT INTO `cms_article_category` VALUES ('12', null, '1', '8', 'trust_potato', '土豆', '1', '土豆', 'https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=875794995,3804135974&fm=27&gp=0.jpg', '2');
INSERT INTO `cms_article_category` VALUES ('13', null, '1', '8', 'trust_wheat', '小麦', '1', '小麦', 'https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=352104019,435620879&fm=27&gp=0.jpg', '2');
INSERT INTO `cms_article_category` VALUES ('14', null, '1', '3', 'trust_cabbage', '白菜', '1', '白菜', 'https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=1632378669,365143755&fm=200&gp=0.jpg', '2');
INSERT INTO `cms_article_category` VALUES ('15', null, '1', '3', 'trust_celery', '芹菜', '1', '芹菜', 'https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=2072407249,4043361413&fm=200&gp=0.jpg', '2');
INSERT INTO `cms_article_category` VALUES ('16', null, '1', '3', 'trust_leek', '韭菜', '1', '韭菜', 'https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=4175614938,2209724772&fm=200&gp=0.jpg', '2');
INSERT INTO `cms_article_category` VALUES ('17', null, '1', '2', 'trust_cucumber', '黄瓜', '1', '黄瓜', 'https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=2810738625,3840137700&fm=200&gp=0.jpg', '2');
INSERT INTO `cms_article_category` VALUES ('18', null, '1', '3', 'trust_tomatoes', '西红柿', '1', '西红柿', 'https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=2574228127,1380978462&fm=27&gp=0.jpg', '2');
INSERT INTO `cms_article_category` VALUES ('19', null, '1', '3', 'trust_coriander', '香菜', '1', '香菜', 'https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=553511838,345089461&fm=27&gp=0.jpg', '2');
INSERT INTO `cms_article_category` VALUES ('20', null, '1', '3', 'trust_pepper', '辣椒', '1', '辣椒', 'https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1033102099,1953604548&fm=27&gp=0.jpg', '2');
INSERT INTO `cms_article_category` VALUES ('21', null, '1', '2', 'trust_apple', '苹果', '1', '苹果', 'https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1765309443,3451229734&fm=27&gp=0.jpg', '2');
INSERT INTO `cms_article_category` VALUES ('22', null, '1', '2', 'trust_pear', '梨', '1', '梨', 'https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2699318873,1681512015&fm=27&gp=0.jpg', '2');
INSERT INTO `cms_article_category` VALUES ('23', null, '1', '2', 'trust_peach', '桃子', '1', '桃子', 'https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=3589700750,2859617462&fm=27&gp=0.jpg', '2');
INSERT INTO `cms_article_category` VALUES ('24', null, '1', '2', 'trust_plum', '李子', '1', '李子', 'https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=1818151856,552105654&fm=200&gp=0.jpg', '2');
INSERT INTO `cms_article_category` VALUES ('25', null, '1', '2', 'trusst_cherry', '樱桃', '1', '樱桃', 'https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1217106861,1716458552&fm=27&gp=0.jpg', '2');
INSERT INTO `cms_article_category` VALUES ('26', null, '1', '2', 'trust_strawberry', '草莓', '1', '草莓', 'https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3212958040,4045121590&fm=27&gp=0.jpg', '2');
INSERT INTO `cms_article_category` VALUES ('27', null, '1', '2', 'trust_dates', '大枣', '1', '大枣', 'https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=101350338,3102920586&fm=27&gp=0.jpg', '2');

-- ----------------------------
-- Table structure for `cms_article_content`
-- ----------------------------
DROP TABLE IF EXISTS `cms_article_content`;
CREATE TABLE `cms_article_content` (
  `c_article_content_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '主键 文章ID ',
  `c_article_id` bigint(11) DEFAULT NULL,
  `c_article_content` varchar(512) DEFAULT NULL COMMENT '文章内容',
  `c_content_index` int(11) DEFAULT NULL COMMENT '文章内容排序字段',
  `c_content_type` int(11) DEFAULT NULL COMMENT '内容类型：1文字 2 图片',
  PRIMARY KEY (`c_article_content_id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cms_article_content
-- ----------------------------
INSERT INTO `cms_article_content` VALUES ('1', '1', '经过过去五年的发展，中国经济已经进入由“高速增长”转向“高质量发展”的新阶段。今年前三季度，中国GDP增速6.9%，已连续九个季度保持在6.7%—6.9%的运行区间内；更重要的是，经济结构正在不断优化，就业目标超额完成，企业景气度多项指标创近5年新高……', '1', '1');
INSERT INTO `cms_article_content` VALUES ('2', '1', '　2018年，是决胜全面建成小康社会、实施“十三五”规划承上启下的关键一年。未来，中国还要基本实现社会主义现代化，全面建成社会主义现代化强国。发展任务艰巨、情况复杂，更需要冷静地看大局、明大势，坚持稳中求进工作总基调。', '2', '1');
INSERT INTO `cms_article_content` VALUES ('3', '1', 'https://rmrbcmsonline.oss-cn-beijing.aliyuncs.com/upload/ueditor/image/20171218/1513571375895818.jpg', '3', '2');
INSERT INTO `cms_article_content` VALUES ('4', '1', '党的十九大报告，把全面深化改革总目标纳入习近平新时代中国特色社会主义思想范畴，把坚持全面深化改革作为构成新时代坚持和发展中国特色社会主义的基本方略的重要内容之一，已经展示了中国全面深化改革前所未有的决心和力度，传递出中国改革正朝着领域更广、举措更多、力度更强的新阶段迈进的强烈信号。', '4', '1');
INSERT INTO `cms_article_content` VALUES ('5', '2', '为筛选中低海拔地区种植的玉米新品种，确保粮食生产增产增收。近日， 镇康县农业局在勐捧镇召开2017年全国基层体系玉米实验示范基地新品种展示 观摩及培训会议。', '1', '1');
INSERT INTO `cms_article_content` VALUES ('6', '2', '参会人员有市农业技术推广站副站长段鸿飞（研究员）、 玉米首席专家李学智（研究员），勐捧镇分管农业副镇长，镇康县农业局分管副局长， 县乡两级农业科技人员，当地玉米种植户代表共60余人，现场观摩会上，与会人员 首先参观了玉米品种展示，玉米指导专家对全国基层体系相关业务知识做详细讲解； 随后进行了全国基层体系项目业务工作培训', '2', '1');
INSERT INTO `cms_article_content` VALUES ('7', '2', 'http://images.tmtpost.com/uploads/images/2017/12/20171219134335256.jpeg', '3', '2');
INSERT INTO `cms_article_content` VALUES ('8', '2', 'T-EDGE汽车科技指数奖项是钛媒体首度在今年的 BTAwards 年度创新评选中首度设立的榜单。该奖项评选，结合智能驾驶、车载互联、新能源、新材料等维度，并通过数据分析、实车测评、技术研究、概念追踪、美学展望、品牌监测数据加权计算所得出的汽车前沿科技概念应用权威榜单，将全球最前沿的科技方向，结合各个细分领域展开的T-EDGE汽车科技指数奖项。旨在对全球汽车出行资本趋势研究，多维度展示当下汽车科技生态历史和现况。', '4', '1');
INSERT INTO `cms_article_content` VALUES ('12', '386', '据苹果公司透露，从今年2月28日起，中国内地的iCloud服务将转由云上贵州公司负责运营。', '1', '1');
INSERT INTO `cms_article_content` VALUES ('13', '386', '也就是说，从当天起，云上贵州公司将负责iCloud在中国内地的运营，并将拥有与iCloud中国内地用户的法律和财务关系。', '2', '1');
INSERT INTO `cms_article_content` VALUES ('14', '386', '“对于这些变动，我们希望对顾客保持透明。”苹果公司在接受人民日报客户端记者采访时表示，自1月10日起的七周内，苹果将通过电子邮件和推送通知的方式，告知用户这一消息。', '3', '1');
INSERT INTO `cms_article_content` VALUES ('15', '386', '据介绍，将Apple ID的国家或地区设置为中国的用户将在这次转变的影响范围内。', '4', '1');
INSERT INTO `cms_article_content` VALUES ('16', '386', '苹果公司环境、政策和社会事务副总裁丽萨·杰克逊表示，“中国的用户喜欢使用iCloud来安全地存储照片、视频、文档和应用程序，并在所有设备上保持同步更新，相信新的合作关系，将通过减少延迟和提高可靠性改善中国iCloud用户的体验。', '5', '1');
INSERT INTO `cms_article_content` VALUES ('17', '386', '云上贵州大数据产业发展有限公司于2014年11月经贵州省人民政府批准成立，注册资金23500万元，由贵州省大数据发展管理局履行出资人职责，贵州省国有企业监事会进行监管。', '6', '1');
INSERT INTO `cms_article_content` VALUES ('18', '386', 'http://trust-dev-warehouse.oss-cn-hangzhou.aliyuncs.com/article/images/20180110a2a00692-e230-4a61-b55d-ed8409459d76u_47991405,451913998_fm_173_s_655038C64F1321C85D6BCC910300509B_w_402_h_267_img.JPEG', '7', '2');
INSERT INTO `cms_article_content` VALUES ('21', '387', '对对对对对对多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多', '1', '1');
INSERT INTO `cms_article_content` VALUES ('22', '387', 'http://trust-dev-warehouse.oss-cn-hangzhou.aliyuncs.com/article/images/20180116a30e19d6-c7c7-4169-a557-ef65c188c775QQ截图20171222173257.png', '2', '2');
INSERT INTO `cms_article_content` VALUES ('23', '387', '对对对对对对多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多', '3', '1');
INSERT INTO `cms_article_content` VALUES ('24', '388', '顶顶顶顶', '1', '1');
INSERT INTO `cms_article_content` VALUES ('25', '388', '对对对', '2', '1');
INSERT INTO `cms_article_content` VALUES ('26', '390', '胜多负少多付多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多', '1', '1');
INSERT INTO `cms_article_content` VALUES ('27', '390', '水电费付付付付付付付付付付付付付付付付付付付付付付付付付付', '2', '1');
INSERT INTO `cms_article_content` VALUES ('28', '390', '水电费付付付付付付付付付付付付付付付付付付付付付付付', '3', '1');
INSERT INTO `cms_article_content` VALUES ('29', '391', '额外若无无无无无无但事实上所所所所所所所所所所所所所所所所所所所所所所所所所所所所所所所所所所所所所所所所所所所所所所所', '1', '1');
INSERT INTO `cms_article_content` VALUES ('30', '391', '水电费付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付', '2', '1');
INSERT INTO `cms_article_content` VALUES ('31', '391', '呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃', '3', '1');
INSERT INTO `cms_article_content` VALUES ('32', '392', '对对对对对对多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多', '1', '1');
INSERT INTO `cms_article_content` VALUES ('33', '392', '反反复复付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付', '2', '1');

-- ----------------------------
-- Table structure for `cms_article_info`
-- ----------------------------
DROP TABLE IF EXISTS `cms_article_info`;
CREATE TABLE `cms_article_info` (
  `c_article_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '文章主键ID 自增',
  `c_article_category_id` bigint(11) DEFAULT NULL COMMENT '分类ID',
  `c_article_creator` bigint(11) DEFAULT NULL COMMENT '创建人',
  `c_template_id` bigint(11) DEFAULT NULL COMMENT '文章显示渲染模板ID',
  `c_site_code` varchar(50) DEFAULT NULL COMMENT '站点Code',
  `c_site_id` bigint(11) DEFAULT NULL COMMENT '站点ID',
  `c_article_title` varchar(50) DEFAULT NULL COMMENT '标题',
  `c_article_poster` varchar(256) DEFAULT NULL COMMENT '海报图片',
  `c_article_author` varchar(50) DEFAULT NULL COMMENT '作者',
  `c_article_createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `c_article_updatetime` datetime DEFAULT NULL COMMENT '更新时间',
  `c_article_releaseid` bigint(11) DEFAULT NULL,
  `c_article_release_time` datetime DEFAULT NULL COMMENT '发布时间',
  `c_article_origanal_release_time` datetime DEFAULT NULL COMMENT '原文发布时间',
  `c_article_push_time` double DEFAULT NULL COMMENT '推送时间',
  `c_article_status` int(11) DEFAULT NULL COMMENT '状态1:未审核 2:已审核未发布3：已发布0：审核不通过',
  `c_article_amount` int(11) DEFAULT NULL COMMENT '浏览量',
  `c_article_priority` bigint(11) DEFAULT NULL COMMENT '优先级0:置顶1：推荐',
  `c_article_label` bigint(11) DEFAULT NULL COMMENT '标签',
  `c_article_keyword` varchar(128) DEFAULT NULL COMMENT '关键字',
  `c_article_resource` varchar(50) DEFAULT NULL COMMENT '文章来源',
  `c_article_resource_url` varchar(128) DEFAULT NULL COMMENT '来源地址',
  `c_article_subtitle` varchar(64) DEFAULT NULL COMMENT '副标题',
  `c_article_des` varchar(256) DEFAULT NULL COMMENT '描述',
  `c_article_small_image` varchar(128) DEFAULT NULL COMMENT '小图',
  `c_article_large_image` varchar(128) DEFAULT NULL COMMENT '大图',
  `c_article_commentarie` int(11) DEFAULT NULL COMMENT '评论数',
  `c_article_collect` int(11) DEFAULT NULL COMMENT '收藏数',
  `c_article_type` int(11) DEFAULT NULL COMMENT '来源类型',
  `c_article_category_code` varchar(36) DEFAULT NULL COMMENT '分类Code',
  `c_article_creator_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`c_article_id`),
  KEY `fk_article_category_info` (`c_article_category_id`) USING BTREE,
  KEY `fk_article_category_code` (`c_article_category_code`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=394 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cms_article_info
-- ----------------------------
INSERT INTO `cms_article_info` VALUES ('1', '1', '1', '1', '0001', '1', '十九大后，习近平对中国经济给出8大论断', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', '2018-01-16 19:28:16', null, '1', '102', '1', '1', '小康、增长', '人民日报', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', 'http://www.chinanews.com/gn/2017/12-中国每年的中央经济工作会议，都是国内外关注的焦点。', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('2', '1', '1', '1', '0001', '1', '镇康县农业局在勐捧召开2017年全国基层体系玉米新产品展示观摩及培训会', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', '2018-01-16 19:28:25', null, '1', '34', '1', '1', '小康、增长', '浙江新华网', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', '十九大后，习近平对中国经济给出8大论断', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('3', '1', '1', '1', '0001', '1', '镇康县农业局在勐捧召开2017年全国基层体系玉米新产品展示观摩及培训会', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', '2018-01-24 19:28:28', null, '1', '1345', '1', '1', '小康、增长', '浙江新华网', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', '十九大后，习近平对中国经济给出8大论断', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('7', '1', '1', '1', '0001', '1', '镇康县农业局在勐捧召开2017年全国基层体系玉米新产品展示观摩及培训会', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', '2017-12-01 19:28:31', null, '1', '1', '1', '1', '小康、增长', '1浙江新华网', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', '十九大后，习近平对中国经济给出8大论断', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('8', '1', '1', '1', '0001', '1', '镇康县农业局在勐捧召开2017年全国基层体系玉米新产品展示观摩及培训会', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '1', '134', '1', '1', '11小康、增长', '浙江新华网', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', '十九大后，习近平对中国经济给出8大论断', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('9', '1', '1', '1', '0001', '1', '镇康县农业局在勐捧召开2017年全国基层体系玉米新产品展示观摩及培训会', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '1', '165', '1', '1', '11小康、增长', '浙江新华网', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', '十九大后，习近平对中国经济给出8大论断', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('12', '1', '1', '1', '0001', '1', '镇康县农业局在勐捧召开2017年全国基层体系玉米新产品展示观摩及培训会', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '1', '1', '1', '1', '小康、增长', '人民日报', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', '十九大后，习近平对中国经济给出8大论断', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('13', '1', '1', '1', '0001', '1', '镇康县农业局在勐捧召开2017年全国基层体系玉米新产品展示观摩及培训会', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '2', '134', '1', '1', '小康、增长', '人民日报', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', '十九大后，习近平对中国经济给出8大论断', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('14', '1', '1', '1', '0001', '1', '农业要闻', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', '2018-01-24 19:28:34', null, '2', '134', '1', '1', '11小康、增长', '人民日报', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', '十九大后，习近平对中国经济给出8大论断', '1', '1', '1', '1', '1', 'trust_cabbage', null);
INSERT INTO `cms_article_info` VALUES ('15', '1', '1', '1', '0001', '1', '镇康县农业局在勐捧召开2017年全国基层体系玉米新产品展示观摩及培训会', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '2', '1', '1', '1', '小康、增长', '人民日报', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', '十九大后，习近平对中国经济给出8大论断', '1', '1', '1', '1', '1', 'trust_agricultural_news', null);
INSERT INTO `cms_article_info` VALUES ('17', '1', '1', '1', '0001', '1', '十九大后，习近平对中国经济给出8大论断', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '1', '102', '1', '1', '小康、增长', '人民日报', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', 'http://www.chinanews.com/gn/2017/12-中国每年的中央经济工作会议，都是国内外关注的焦点。', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('18', '1', '1', '1', '0001', '1', '公告通知', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '1', '34', '1', '1', '小康、增长', '浙江新华网', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', '十九大后，习近平对中国经济给出8大论断', '1', '1', '1', '1', '1', 'trust_notice', null);
INSERT INTO `cms_article_info` VALUES ('19', '1', '1', '1', '0001', '1', '镇康县农业局在勐捧召开2017年全国基层体系玉米新产品展示观摩及培训会', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '1', '165', '1', '1', '11小康、增长', '浙江新华网', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', '十九大后，习近平对中国经济给出8大论断', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('20', '1', '1', '1', '0001', '1', '十九大后，习近平对中国经济给出8大论断', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '1', '102', '1', '1', '小康、增长', '人民日报', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', 'http://www.chinanews.com/gn/2017/12-中国每年的中央经济工作会议，都是国内外关注的焦点。', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('21', '1', '1', '1', '0001', '1', '镇康县农业局在勐捧召开2017年全国基层体系玉米新产品展示观摩及培训会', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '1', '34', '1', '1', '小康、增长', '浙江新华网', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', '十九大后，习近平对中国经济给出8大论断', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('22', '1', '1', '1', '0001', '1', '镇康县农业局在勐捧召开2017年全国基层体系玉米新产品展示观摩及培训会', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '1', '165', '1', '1', '11小康、增长', '浙江新华网', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', '十九大后，习近平对中国经济给出8大论断', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('23', '1', '1', '1', '0001', '1', '十九大后，习近平对中国经济给出8大论断', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '1', '102', '1', '1', '小康、增长', '人民日报', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', 'http://www.chinanews.com/gn/2017/12-中国每年的中央经济工作会议，都是国内外关注的焦点。', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('24', '1', '1', '1', '0001', '1', '镇康县农业局在勐捧召开2017年全国基层体系玉米新产品展示观摩及培训会', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '1', '34', '1', '1', '小康、增长', '浙江新华网', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', '十九大后，习近平对中国经济给出8大论断', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('25', '1', '1', '1', '0001', '1', '镇康县农业局在勐捧召开2017年全国基层体系玉米新产品展示观摩及培训会', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '1', '165', '1', '1', '11小康、增长', '浙江新华网', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', '十九大后，习近平对中国经济给出8大论断', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('26', '1', '1', '1', '0001', '1', '十九大后，习近平对中国经济给出8大论断', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '1', '102', '1', '1', '小康、增长', '人民日报', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', 'http://www.chinanews.com/gn/2017/12-中国每年的中央经济工作会议，都是国内外关注的焦点。', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('27', '1', '1', '1', '0001', '1', '镇康县农业局在勐捧召开2017年全国基层体系玉米新产品展示观摩及培训会', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '1', '34', '1', '1', '小康、增长', '浙江新华网', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', '十九大后，习近平对中国经济给出8大论断', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('28', '1', '1', '1', '0001', '1', '镇康县农业局在勐捧召开2017年全国基层体系玉米新产品展示观摩及培训会', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '2', '165', '1', '1', '11小康、增长', '浙江新华网', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', '十九大后，习近平对中国经济给出8大论断', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('29', '1', '1', '1', '0001', '1', '十九大后，习近平对中国经济给出8大论断', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '1', '102', '1', '1', '小康、增长', '人民日报', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', 'http://www.chinanews.com/gn/2017/12-中国每年的中央经济工作会议，都是国内外关注的焦点。', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('30', '1', '1', '1', '0001', '1', '镇康县农业局在勐捧召开2017年全国基层体系玉米新产品展示观摩及培训会', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '1', '34', '1', '1', '小康、增长', '浙江新华网', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', '十九大后，习近平对中国经济给出8大论断', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('31', '1', '1', '1', '0001', '1', '镇康县农业局在勐捧召开2017年全国基层体系玉米新产品展示观摩及培训会', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '1', '165', '1', '1', '11小康、增长', '浙江新华网', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', '十九大后，习近平对中国经济给出8大论断', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('32', '1', '1', '1', '0001', '1', '镇康县农业局在勐捧召开2017年全国基层体系玉米新产品展示观摩及培训会', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '1', '165', '1', '1', '11小康、增长', '浙江新华网', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', '十九大后，习近平对中国经济给出8大论断', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('33', '1', '1', '1', '0001', '1', '镇康县农业局在勐捧召开2017年全国基层体系玉米新产品展示观摩及培训会', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '1', '34', '1', '1', '小康、增长', '浙江新华网', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', '十九大后，习近平对中国经济给出8大论断', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('34', '1', '1', '1', '0001', '1', '十九大后，习近平对中国经济给出8大论断', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '1', '102', '1', '1', '小康、增长', '人民日报', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', 'http://www.chinanews.com/gn/2017/12-中国每年的中央经济工作会议，都是国内外关注的焦点。', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('35', '1', '1', '1', '0001', '1', '镇康县农业局在勐捧召开2017年全国基层体系玉米新产品展示观摩及培训会', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '1', '165', '1', '1', '11小康、增长', '浙江新华网', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', '十九大后，习近平对中国经济给出8大论断', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('36', '1', '1', '1', '0001', '1', '镇康县农业局在勐捧召开2017年全国基层体系玉米新产品展示观摩及培训会', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '1', '34', '1', '1', '小康、增长', '浙江新华网', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', '十九大后，习近平对中国经济给出8大论断', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('40', '1', '1', '1', '0001', '1', '十九大后，习近平对中国经济给出8大论断', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '1', '102', '1', '1', '小康、增长', '人民日报', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', 'http://www.chinanews.com/gn/2017/12-中国每年的中央经济工作会议，都是国内外关注的焦点。', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('41', '1', '1', '1', '0001', '1', '镇康县农业局在勐捧召开2017年全国基层体系玉米新产品展示观摩及培训会', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '1', '165', '1', '1', '11小康、增长', '浙江新华网', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', '十九大后，习近平对中国经济给出8大论断', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('42', '1', '1', '1', '0001', '1', '镇康县农业局在勐捧召开2017年全国基层体系玉米新产品展示观摩及培训会', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '1', '34', '1', '1', '小康、增长', '浙江新华网', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', '十九大后，习近平对中国经济给出8大论断', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('43', '1', '1', '1', '0001', '1', '十九大后，习近平对中国经济给出8大论断', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '1', '102', '1', '1', '小康、增长', '人民日报', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', 'http://www.chinanews.com/gn/2017/12-中国每年的中央经济工作会议，都是国内外关注的焦点。', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('44', '1', '1', '1', '0001', '1', '镇康县农业局在勐捧召开2017年全国基层体系玉米新产品展示观摩及培训会', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '1', '165', '1', '1', '11小康、增长', '浙江新华网', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', '十九大后，习近平对中国经济给出8大论断', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('45', '1', '1', '1', '0001', '1', '镇康县农业局在勐捧召开2017年全国基层体系玉米新产品展示观摩及培训会', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '1', '34', '1', '1', '小康、增长', '浙江新华网', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', '十九大后，习近平对中国经济给出8大论断', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('376', '1', '1', '1', '0001', '1', '十九大后，习近平对中国经济给出8大论断', '/images/timg.png', '11', '2017-12-13 14:58:38', '2017-12-20 14:58:41', '1', '2017-12-06 14:58:45', null, null, '1', '102', '1', '1', '小康、增长', '人民日报', 'http://www.chinanews.com/gn/2017/12-19/8403572.shtml', '十九大后，习近平对中国经济给出8大论断', 'http://www.chinanews.com/gn/2017/12-中国每年的中央经济工作会议，都是国内外关注的焦点。', '1', '1', '1', '1', '1', 'trust_policie_regulations', null);
INSERT INTO `cms_article_info` VALUES ('386', '1', '14', null, '0000001', '1', '中国内地的iCloud服务将转由国内公司负责运营', 'http://trust-dev-warehouse.oss-cn-hangzhou.aliyuncs.com/article/images/20180110fc0c849d-2397-4435-ab17-55657d575040下载.jpg', '张意轩', '2018-01-10 11:04:39', null, null, null, null, null, '1', null, null, null, null, '人民日报客户端', null, null, 'trust_policie_regulations', null, null, null, null, '1', 'trust_policie_regulations', '杨长兵');
INSERT INTO `cms_article_info` VALUES ('387', '1', '14', null, '0000001', '1', '测试数据', 'http://trust-dev-warehouse.oss-cn-hangzhou.aliyuncs.com/article/images/2018011641ce087f-d4a8-4347-9237-33c9c23d6576QQ截图20171222173257.png', '李四', '2018-01-16 10:48:12', null, null, null, null, null, '1', null, null, null, null, '睿思特', null, null, 'trust_policie_regulations', null, null, null, null, '1', 'trust_policie_regulations', '杨长兵');
INSERT INTO `cms_article_info` VALUES ('388', '1', '14', null, '0000001', '1', '测试11', '', '是', '2018-01-16 19:17:45', null, null, null, null, null, '1', null, null, null, null, '是是是', null, null, 'trust_policie_regulations', null, null, null, null, '1', 'trust_policie_regulations', '杨长兵');

-- ----------------------------
-- Table structure for `cms_article_operate_log`
-- ----------------------------
DROP TABLE IF EXISTS `cms_article_operate_log`;
CREATE TABLE `cms_article_operate_log` (
  `cms_operate_log_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '修改日志主键ID 自增',
  `cms_site_code` varchar(50) DEFAULT NULL COMMENT '站点Code',
  `cms_site_id` bigint(11) DEFAULT NULL COMMENT '站点ID',
  `cms_user_name` varchar(20) DEFAULT NULL COMMENT '修改人名字冗余字段 ',
  `cms_resources_name` varchar(64) DEFAULT NULL COMMENT '操作文章资源名称',
  `cms_operate_date` datetime DEFAULT NULL COMMENT '创建时间',
  `cms_article_id` bigint(11) DEFAULT NULL COMMENT '操作文章ID',
  `cms_artcile_name` varchar(128) DEFAULT NULL COMMENT '操作文章标题',
  `cms_user_id` bigint(11) DEFAULT NULL COMMENT '操作用户ID',
  `cms_operate_explain` varchar(128) DEFAULT NULL COMMENT '操作说明',
  PRIMARY KEY (`cms_operate_log_id`),
  KEY `fk_cms_index_revise` (`cms_operate_log_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='文字内容修改日志表';

-- ----------------------------
-- Records of cms_article_operate_log
-- ----------------------------
INSERT INTO `cms_article_operate_log` VALUES ('1', '2', '2', '张三', '修改了文章内容', '2018-01-10 22:20:38', '1', '习大大说经济', '2', '2');
INSERT INTO `cms_article_operate_log` VALUES ('2', '2', '2', '李四', '修改了标题', '2018-01-25 09:10:56', '1', 'dddd', '1', '2');
INSERT INTO `cms_article_operate_log` VALUES ('3', '2', '2', '王五', '修改了状态', '2018-01-16 09:11:33', '386', 'dddd', '3', '2');

-- ----------------------------
-- Table structure for `cms_content_template`
-- ----------------------------
DROP TABLE IF EXISTS `cms_content_template`;
CREATE TABLE `cms_content_template` (
  `c_content_template_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '主键 自增文章内容模板ID',
  `c_template_name` varchar(50) DEFAULT NULL COMMENT '内容模板名称',
  `c_template_createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `c_site_code` varchar(50) DEFAULT NULL COMMENT '站点Code',
  `id_deault` tinyint(4) DEFAULT '0' COMMENT '是否默认，全局只允许1个默认 1：默认 0：否',
  PRIMARY KEY (`c_content_template_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cms_content_template
-- ----------------------------
INSERT INTO `cms_content_template` VALUES ('1', '默认模板 ', '2017-12-12 20:29:54', '1', '1');

-- ----------------------------
-- Table structure for `cms_picture_library`
-- ----------------------------
DROP TABLE IF EXISTS `cms_picture_library`;
CREATE TABLE `cms_picture_library` (
  `c_picture_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '图片ID主键自增',
  `c_creator_id` bigint(11) NOT NULL COMMENT '上传人',
  `c_creator_name` varchar(20) DEFAULT NULL COMMENT '上传人姓名',
  `c_site_id` bigint(11) DEFAULT NULL COMMENT '站点ID',
  `c_site_code` varchar(50) DEFAULT NULL COMMENT '站点Code',
  `c_picture_name` varchar(50) DEFAULT NULL COMMENT '图片名称',
  `c_picture_url` varchar(255) DEFAULT NULL COMMENT '图片Url',
  `c_picture_size` varchar(50) DEFAULT NULL COMMENT '图片尺寸',
  `c_picture_describe` varchar(255) DEFAULT NULL COMMENT '图片描述',
  `c_picture_category_name` varchar(50) DEFAULT NULL COMMENT '分类名称',
  `c_picture_category_code` varchar(32) DEFAULT NULL COMMENT '分类编码',
  `c_picture_format` varchar(255) DEFAULT NULL COMMENT '图片格式',
  `c_create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`c_picture_id`),
  KEY `fk_c_picture_index` (`c_picture_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='图片库表';

-- ----------------------------
-- Records of cms_picture_library
-- ----------------------------

-- ----------------------------
-- Table structure for `cms_price_quotes`
-- ----------------------------
DROP TABLE IF EXISTS `cms_price_quotes`;
CREATE TABLE `cms_price_quotes` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '具体县区的价格行情元数据',
  `news_id` bigint(11) unsigned DEFAULT '0' COMMENT '新闻id',
  `crops_name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '品种',
  `price_low` float(10,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '最低价单位kg',
  `price_high` float(10,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '最高价单位kg',
  `price_large` float(10,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '大宗价',
  `trading_volume` float(10,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '交易量单位吨',
  `source` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '来源',
  `released_at` date DEFAULT NULL COMMENT '公布日期',
  `city` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '城市',
  `category` tinyint(4) DEFAULT '1' COMMENT '1-蔬菜',
  `created_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `ref_url` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '来源网址',
  `sys_code` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '系统编码',
  `category_code` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '分类编码',
  PRIMARY KEY (`id`),
  KEY `released_at` (`released_at`) USING BTREE,
  KEY `crops` (`crops_name`) USING BTREE,
  KEY `news_id` (`news_id`) USING BTREE,
  KEY `category_code` (`category_code`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of cms_price_quotes
-- ----------------------------
INSERT INTO `cms_price_quotes` VALUES ('1', '1', '白菜', '1.00', '2.00', '3.00', '22.00', '44', '2017-12-13', '001', '11', '2017-12-13 17:31:45', '111', '001', 'dbc');
INSERT INTO `cms_price_quotes` VALUES ('2', '1', '白菜', '3.00', '4.00', '4.00', '4.00', '44', '2017-12-15', '001', '1', '2017-12-13 17:32:59', 'eee', '002', 'dbc');
INSERT INTO `cms_price_quotes` VALUES ('3', '3', '芹菜', '1.00', '3.00', '4.00', '5.00', '5', '2017-12-21', '001', '1', '2017-12-26 17:33:25', 'rr', '009', 'qc');
INSERT INTO `cms_price_quotes` VALUES ('4', '2', '香菜', '44.00', '44.00', '44.00', '44.00', 'we', '2017-12-28', '001', '11', '2017-12-19 17:34:14', 'ttt', '009', 'xc');
INSERT INTO `cms_price_quotes` VALUES ('5', '2', '香菜', '4.00', '4.00', '4.00', '0.00', '0', '2017-12-29', '001', '1', '2017-12-12 17:36:35', 'ff', '009', 'xc');

-- ----------------------------
-- Table structure for `cms_site`
-- ----------------------------
DROP TABLE IF EXISTS `cms_site`;
CREATE TABLE `cms_site` (
  `c_site_id` bigint(11) NOT NULL AUTO_INCREMENT,
  `c_site_name` varchar(50) DEFAULT NULL COMMENT '频道名字',
  `c_site_code` varchar(20) DEFAULT NULL COMMENT '频道编码',
  `c_site_status` int(11) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`c_site_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cms_site
-- ----------------------------

-- ----------------------------
-- Table structure for `cms_template_resources`
-- ----------------------------
DROP TABLE IF EXISTS `cms_template_resources`;
CREATE TABLE `cms_template_resources` (
  `c_template_resource_id` bigint(11) NOT NULL AUTO_INCREMENT,
  `c_template_id` bigint(11) NOT NULL COMMENT '模板ID',
  `c_template_path` varchar(128) DEFAULT NULL COMMENT '模板存储路径',
  `c_template_access_type` varchar(50) DEFAULT NULL COMMENT '客户端类型 pc_terminal:  mobile_terminal :bigscreen_terminal',
  PRIMARY KEY (`c_template_resource_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cms_template_resources
-- ----------------------------
INSERT INTO `cms_template_resources` VALUES ('1', '1', '/contenttemp/default/mobile', 'mobile');
INSERT INTO `cms_template_resources` VALUES ('2', '1', '/contenttemp/default/pc', 'pc');

-- ----------------------------
-- Table structure for `cms_user`
-- ----------------------------
DROP TABLE IF EXISTS `cms_user`;
CREATE TABLE `cms_user` (
  `c_user_id` bigint(11) NOT NULL,
  `c_user_name` varchar(20) DEFAULT NULL COMMENT '用户名',
  `c_password` varchar(20) DEFAULT NULL COMMENT '密码',
  `c_user_realname` varchar(20) DEFAULT NULL COMMENT '真实名字',
  PRIMARY KEY (`c_user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cms_user
-- ----------------------------

-- ----------------------------
-- Table structure for `rnt_version`
-- ----------------------------
DROP TABLE IF EXISTS `rnt_version`;
CREATE TABLE `rnt_version` (
  `version_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '版本ID主键',
  `sys_name` varchar(50) DEFAULT NULL COMMENT '系统名称 1:IOS 2:Android 3：Backstage:运营后台',
  `version_num` varchar(50) DEFAULT NULL COMMENT '版本号',
  `application_market` varchar(50) DEFAULT NULL COMMENT '应用市场',
  `download_url` varchar(128) DEFAULT NULL COMMENT '下载链接',
  `version_des` varchar(128) DEFAULT NULL COMMENT '版本描述',
  `sys_code` varchar(30) DEFAULT NULL COMMENT '系统编码',
  `status` tinyint(4) DEFAULT NULL COMMENT '版本状态',
  `publish_time` datetime DEFAULT NULL COMMENT '发布时间',
  PRIMARY KEY (`version_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rnt_version
-- ----------------------------
INSERT INTO `rnt_version` VALUES ('1', 'Android', '1.0.2.2', '豌豆荚', 'http://wandoujia.com/resource/ruinongtong.apk', '睿农通，时刻关心您的，农民的掌上管家.', null, null, null);
INSERT INTO `rnt_version` VALUES ('2', 'IOS', '1.01.1', '苹果应用市场', 'http://wandoujia.com/resource/ruinongtong.apk', '睿农通，时刻关心您的，农民的掌上管家.', null, null, null);
