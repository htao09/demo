create table mem_member
(
   id                    BIGINT(20)       NOT NULL AUTO_INCREMENT    COMMENT '主键ID',
   user_id              varchar(50) comment '用户id',
   login_id             varchar(50) comment '登录id',
   login_pwd            varchar(50) comment '登录密码',
   user_name            varchar(50) comment '姓名',
   nick_name            varchar(50) comment '昵称',
   mobile               varchar(50) comment '手机，唯一',
  create_by             VARCHAR(36)      DEFAULT NULL               COMMENT '创建人',
  create_time           TIMESTAMP        NULL DEFAULT CURRENT_TIMESTAMP                COMMENT '创建时间',
  update_by             VARCHAR(36)      DEFAULT NULL               COMMENT '更新人',
  update_time           TIMESTAMP        NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
   primary key (id)
);