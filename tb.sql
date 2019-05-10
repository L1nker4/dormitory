# 权限表
create table tb_permission
(
    pid  int(11)      not null auto_increment,
    name varchar(255) not null default '',
    url  varchar(255)          default '',
    primary key (pid)
) engine = InnoDB;

insert into tb_permission values ('1','add','');
insert into tb_permission values ('2','delete','');
insert into tb_permission values ('3','edit','');
insert into tb_permission values ('4','query','');

-- 角色表 --
create table tb_role (
                      rid int (11) not null auto_increment,
                      rname varchar (255) not null default '',
                      primary key (rid)
) engine = InnoDB;

insert into tb_role values ('1','admin');
insert into tb_role values ('2','manager');


-- 权限、角色关系表 --
create table tb_permission_role (
                                 rid int (11) not null,
                                 pid int (11) not null,
                                 key idx_rid(rid),
                                 key idx_pid(pid)
) engine = InnoDB default charset = utf8;

insert into tb_permission_role values ('1','1');
insert into tb_permission_role values ('1','2');
insert into tb_permission_role values ('1','3');
insert into tb_permission_role values ('1','4');
insert into tb_permission_role values ('2','1');
insert into tb_permission_role values ('2','4');

-- 用户、角色关系表 --
create table tb_manager_role (
                           mid int (11) not null,
                           rid int (11) not null,
                           key idx_uid(mid),
                           key idx_rid(rid)
) engine = InnoDB;

insert into tb_manager_role values (1,1);
