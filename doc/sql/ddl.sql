drop index Index_cod_no on ssm_user;

drop table if exists ssm_user;

/*==============================================================*/
/* Table: ssm_user 用户信息表                                             */
/*==============================================================*/
create table ssm_user
(
   cod_id               int not null auto_increment comment '主键',
   cod_no               varchar(64) comment '唯一标识',
   txt_name             varchar(64) comment '姓名',
   cod_sex              int comment '性别',
   dat_birthday         date comment '出生日期',
   primary key (cod_id)
);

alter table ssm_user comment '用户信息表';

/*==============================================================*/
/* Index: Index_cod_no                                          */
/*==============================================================*/
create unique index Index_cod_no on ssm_user
(
   cod_no
);
