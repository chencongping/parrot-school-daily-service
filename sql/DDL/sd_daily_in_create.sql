drop table sd_daily_in;
CREATE TABLE `sd_daily_in` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `business_date` VARCHAR(255) DEFAULT NULL,
  `improvement` VARCHAR(2000) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `long_run` DOUBLE DEFAULT NULL,
  `other` VARCHAR(2000) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `praise` VARCHAR(2000) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `questions` INT NOT NULL,
  `short_run` VARCHAR(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tea` INT NOT NULL,
  `texts` VARCHAR(2000) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `words` INT NOT NULL,
  `createTime` VARCHAR(255) DEFAULT null,
  `updateTime` VARCHAR(255) DEFAULT null,
  `user_id` BIGINT NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci

DROP TABLE `sd_user_info`;
CREATE TABLE `sd_user_info` (
 `register_id` BIGINT NOT NULL AUTO_INCREMENT,
 `user_name` VARCHAR(255) NOT NULL,
 `nick_name` VARCHAR(255) NOT NULL,
 `email` VARCHAR(255) NOT NULL,
 `createTime` VARCHAR(255) DEFAULT null,
 `updateTime` VARCHAR(255) DEFAULT null,
PRIMARY KEY (`register_id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci