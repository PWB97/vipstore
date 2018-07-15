/*
 Navicat Premium Data Transfer

 Source Server         : Aliyun
 Source Server Type    : MySQL
 Source Server Version : 50556
 Source Host           : 47.94.103.151:3306
 Source Schema         : vipstore

 Target Server Type    : MySQL
 Target Server Version : 50556
 File Encoding         : 65001

 Date: 12/07/2018 09:10:45
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for vipstore_invited
-- ----------------------------
DROP TABLE IF EXISTS `vipstore_invited`;
CREATE TABLE `vipstore_invited` (
  `userId` int(10) DEFAULT NULL COMMENT '推荐人\r\n',
  `loginName` varchar(255) DEFAULT NULL COMMENT '被推荐人',
  KEY `FK_Relationship_8` (`userId`),
  KEY `FK_Relationship_9` (`loginName`),
  CONSTRAINT `FK_Relationship_8` FOREIGN KEY (`userId`) REFERENCES `vipstore_user` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of vipstore_invited
-- ----------------------------
BEGIN;
INSERT INTO `vipstore_invited` VALUES (10004, 'admin');
COMMIT;

-- ----------------------------
-- Table structure for vipstore_news
-- ----------------------------
DROP TABLE IF EXISTS `vipstore_news`;
CREATE TABLE `vipstore_news` (
  `newsId` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(40) NOT NULL,
  `content` varchar(1000) NOT NULL,
  `createTime` varchar(255) NOT NULL,
  PRIMARY KEY (`newsId`)
) ENGINE=InnoDB AUTO_INCREMENT=300010 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of vipstore_news
-- ----------------------------
BEGIN;
INSERT INTO `vipstore_news` VALUES (300007, '12.12', '1212', '2017-11-11');
INSERT INTO `vipstore_news` VALUES (300009, '6.18活动', '最低减80%', '2018-6-18');
COMMIT;

-- ----------------------------
-- Table structure for vipstore_order
-- ----------------------------
DROP TABLE IF EXISTS `vipstore_order`;
CREATE TABLE `vipstore_order` (
  `orderId` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) NOT NULL,
  `createTime` datetime DEFAULT NULL,
  `serialNumber` varchar(255) DEFAULT NULL,
  `cost` float(10,2) DEFAULT NULL,
  PRIMARY KEY (`orderId`)
) ENGINE=InnoDB AUTO_INCREMENT=200039 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of vipstore_order
-- ----------------------------
BEGIN;
INSERT INTO `vipstore_order` VALUES (200001, 10003, '2018-07-06 10:06:23', '', 170.00);
INSERT INTO `vipstore_order` VALUES (200002, 10004, '2018-07-01 10:12:59', NULL, 1.00);
INSERT INTO `vipstore_order` VALUES (200032, 10001, '2018-07-09 11:44:54', 'eb0654fe-aff9-4045-8e93-ff53ea3d17e4', 205.00);
INSERT INTO `vipstore_order` VALUES (200035, 10001, '2018-07-09 16:18:30', '3afbe6da-70a3-4fa1-84e9-104c363f905c', 600.00);
INSERT INTO `vipstore_order` VALUES (200038, 10000, '2018-07-10 14:48:50', '6bd45ffa-44f5-4e30-aa74-b6c1399355c8', 321.00);
COMMIT;

-- ----------------------------
-- Table structure for vipstore_order_detail
-- ----------------------------
DROP TABLE IF EXISTS `vipstore_order_detail`;
CREATE TABLE `vipstore_order_detail` (
  `orderId` int(11) NOT NULL,
  `productId` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `cost` float(11,0) NOT NULL,
  `orderDetailId` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`orderDetailId`),
  KEY `FK_Relationship_5` (`productId`),
  KEY `FK_Relationship_6` (`orderId`),
  CONSTRAINT `FK_Relationship_5` FOREIGN KEY (`productId`) REFERENCES `vipstore_product` (`productId`),
  CONSTRAINT `FK_Relationship_6` FOREIGN KEY (`orderId`) REFERENCES `vipstore_order` (`orderId`)
) ENGINE=InnoDB AUTO_INCREMENT=583 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of vipstore_order_detail
-- ----------------------------
BEGIN;
INSERT INTO `vipstore_order_detail` VALUES (200001, 100004, 3, 639, 0);
INSERT INTO `vipstore_order_detail` VALUES (200001, 100001, 1, 1, 3);
INSERT INTO `vipstore_order_detail` VALUES (200032, 100003, 5, 105, 569);
INSERT INTO `vipstore_order_detail` VALUES (200032, 2000003, 5, 100, 570);
INSERT INTO `vipstore_order_detail` VALUES (200035, 100011, 5, 500, 573);
INSERT INTO `vipstore_order_detail` VALUES (200035, 100021, 2, 100, 574);
INSERT INTO `vipstore_order_detail` VALUES (200038, 100011, 1, 100, 579);
INSERT INTO `vipstore_order_detail` VALUES (200038, 100003, 1, 21, 580);
INSERT INTO `vipstore_order_detail` VALUES (200038, 100011, 1, 100, 581);
INSERT INTO `vipstore_order_detail` VALUES (200038, 120010, 10, 100, 582);
COMMIT;

-- ----------------------------
-- Table structure for vipstore_product
-- ----------------------------
DROP TABLE IF EXISTS `vipstore_product`;
CREATE TABLE `vipstore_product` (
  `productId` int(11) NOT NULL AUTO_INCREMENT COMMENT '产品号',
  `productName` varchar(20) NOT NULL,
  `productDescription` varchar(1024) DEFAULT NULL COMMENT '类别',
  `productPrice` float NOT NULL,
  `productStock` int(11) NOT NULL COMMENT '库存',
  `productIsDelete` bit(1) NOT NULL,
  `productPath` varchar(255) DEFAULT NULL,
  `productOrigin` varchar(255) DEFAULT NULL,
  `productType` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`productId`),
  KEY `FK_Relationship_10` (`productName`),
  KEY `productPath` (`productPath`)
) ENGINE=InnoDB AUTO_INCREMENT=2000013 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of vipstore_product
-- ----------------------------
BEGIN;
INSERT INTO `vipstore_product` VALUES (100001, '苹果', '水果', 20, 70, b'0', '5b053959Ne9dd2a53.jpg', '四川', '1');
INSERT INTO `vipstore_product` VALUES (100003, '梨', '水果', 21, 49, b'0', '5adef3e6N3b3d085a.jpg', '四川', '1');
INSERT INTO `vipstore_product` VALUES (100004, '西瓜', '水果', 20, 1229, b'1', '577b79f2N8ab2bc6d.jpg', '四川', '1');
INSERT INTO `vipstore_product` VALUES (100011, '胡萝卜', '新鲜可口', 100, 983, b'0', '8f72c933-b816-438e-a8fd-b07428003e6f.jpg', '新疆', '2');
INSERT INTO `vipstore_product` VALUES (100021, '牛肉', '新鲜进口牛肉', 50, 98, b'0', '3ff576cd-a4f7-41a5-9ec7-50e35637446c.png', '日本', '4');
INSERT INTO `vipstore_product` VALUES (120010, '哈密瓜', '新鲜可口，必备水果之一', 10, 140, b'0', 'e5f048d8-39b8-42c1-9e4c-95ea1b9e1646.jpg', '新疆', '1');
INSERT INTO `vipstore_product` VALUES (2000003, '五花肉', '新鲜的五花肉，价格实惠', 20, 175, b'0', 'e2768d09-656c-4b37-99ac-048fc014812e.jpg', '本地', '4');
INSERT INTO `vipstore_product` VALUES (2000006, '鱼', '新鲜', 100, 100, b'1', '05201701-b990-4780-b469-5ea7a0a0d74f.jpg', '本地', '3');
INSERT INTO `vipstore_product` VALUES (2000012, '芒果', '12121', 12, 12121, b'1', '87e877cb-914e-4f53-8364-2a4d5b588500.jpg', '本地', '1');
COMMIT;

-- ----------------------------
-- Table structure for vipstore_tmpcart
-- ----------------------------
DROP TABLE IF EXISTS `vipstore_tmpcart`;
CREATE TABLE `vipstore_tmpcart` (
  `productId` int(11) NOT NULL,
  `userId` int(11) NOT NULL,
  `quantity` int(11) DEFAULT NULL,
  KEY `FK_Relationship_2` (`userId`),
  KEY `FK_Relationship_3` (`productId`),
  CONSTRAINT `FK_Relationship_3` FOREIGN KEY (`productId`) REFERENCES `vipstore_product` (`productId`),
  CONSTRAINT `FK_Relationship_2` FOREIGN KEY (`userId`) REFERENCES `vipstore_user` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of vipstore_tmpcart
-- ----------------------------
BEGIN;
INSERT INTO `vipstore_tmpcart` VALUES (100004, 10003, 5);
INSERT INTO `vipstore_tmpcart` VALUES (100001, 10002, 11);
COMMIT;

-- ----------------------------
-- Table structure for vipstore_user
-- ----------------------------
DROP TABLE IF EXISTS `vipstore_user`;
CREATE TABLE `vipstore_user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `loginName` varchar(255) NOT NULL,
  `userName` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `sex` int(11) NOT NULL,
  `identityCode` varchar(60) NOT NULL,
  `email` varchar(80) DEFAULT NULL,
  `mobile` varchar(11) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `vipCode` varchar(255) DEFAULT NULL,
  `vipCodeUseTime` int(11) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`userId`),
  KEY `loginName` (`loginName`)
) ENGINE=InnoDB AUTO_INCREMENT=10040 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of vipstore_user
-- ----------------------------
BEGIN;
INSERT INTO `vipstore_user` VALUES (10000, 'admin', 'admin', '1234', 1, '00000001', '111110@qq.com', '111110', 0, '1a1a1a0a', 1, '成都');
INSERT INTO `vipstore_user` VALUES (10001, '0001', '张三', '111', 1, '00000002', '111111@qq.com', '111111', 1, '1a1a1a1a', 7, '重庆');
INSERT INTO `vipstore_user` VALUES (10002, '0002', '李四', '123456', 0, '00000002', '111112@qq.com', '111112', 1, '1a1a1a2a', 3, '成都');
INSERT INTO `vipstore_user` VALUES (10003, '0003', '王五', '123456', 1, '00000003', '111113@qq.com', '111113', 1, '1a1a1a3a', 1, '成都');
INSERT INTO `vipstore_user` VALUES (10004, '0004', '赵六', '1234', 0, '00000004', '111114@qq.com', '111114', 1, '1a1a1a4a', 1, '重庆');
INSERT INTO `vipstore_user` VALUES (10029, '3126391', '张san', '1234', 1, '1432423', '214324', NULL, 1, 'sJdLEHSz', 2, NULL);
INSERT INTO `vipstore_user` VALUES (10031, 'HinatsuruAi', 'lh', '123', 0, '510181xxxx', '2222222@qq.com', '12345678901', 1, 'AVzl5Tu2', 0, '成都');
INSERT INTO `vipstore_user` VALUES (10032, '0006', 'alex', '123', 1, '510181xxxx', '2222222@qq.com', '12345678901', 1, 'u7pDzM82', 0, '成都');
INSERT INTO `vipstore_user` VALUES (10036, '2121221', '111', '111', 1, '12121212', '1395428693@qq.com', '21212', 1, 'gccxumEI', 0, '成都');
INSERT INTO `vipstore_user` VALUES (10037, 'hyl', 'alex', '123456', 1, '510181xxxx', '1111111@qq.com', '12345678901', 1, '6Pg8SX3p', 0, '成都');
INSERT INTO `vipstore_user` VALUES (10038, 'gxa', 'foria', '123', 1, '510181xxxx', '1366254987@qq.com', '15508819683', 1, 't98ZaLNR', 0, '成都');
INSERT INTO `vipstore_user` VALUES (10039, 'xh', 'xiaohao', '123', 1, '510181xxxxxx', '12345@qq.com', '12454566', 1, 'ujHsZTqj', 0, 'cd');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
