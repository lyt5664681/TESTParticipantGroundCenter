create table WFP_AF_USERINFO
(
  user_account          VARCHAR2(64) primary key,
  pri_key               VARCHAR2(32),
  system_code           VARCHAR2(32),
  system_belong_code    VARCHAR2(32),
  user_id               VARCHAR2(32),
  external_user_id      VARCHAR2(32),
  external_user_account VARCHAR2(64),
  person_type           VARCHAR2(32),
  user_name             VARCHAR2(64),
  given_name            VARCHAR2(64),
  province_code         VARCHAR2(32),
  province              VARCHAR2(32),
  unit_name             VARCHAR2(64),
  family_name           VARCHAR2(64),
  internal_org_code     VARCHAR2(64),
  external_org_code     VARCHAR2(64),
  phone_number          VARCHAR2(32),
  email_address         VARCHAR2(64),
  graduate_institution  VARCHAR2(64),
  position              VARCHAR2(32),
  level_code            VARCHAR2(32),
  us_level              VARCHAR2(16),
  is_associated         VARCHAR2(16),
  associate_user        VARCHAR2(32),
  work_order_number     VARCHAR2(16),
  company_id            VARCHAR2(32),
  company_code          VARCHAR2(32),
  company_name          VARCHAR2(32),
  org_id                VARCHAR2(32),
  org_code              VARCHAR2(64),
  org_name              VARCHAR2(128),
  parent_org_id         VARCHAR2(32),
  parent_org_code       VARCHAR2(64),
  parent_org_name       VARCHAR2(128),
  user_email            VARCHAR2(64),
  effective_start_date  VARCHAR2(32),
  effective_end_date    VARCHAR2(32),
  user_status           VARCHAR2(8),
  created_by            VARCHAR2(64),
  creation_date         VARCHAR2(64),
  last_update_by        VARCHAR2(64),
  last_update_date      VARCHAR2(64),
  last_update_login     VARCHAR2(128),
  attribute1            VARCHAR2(256),
  attribute2            VARCHAR2(256),
  attribute3            VARCHAR2(256),
  attribute4            VARCHAR2(256),
  attribute5            VARCHAR2(256),
  employee_number       VARCHAR2(32)
);
insert into wfp_af_userinfo (USER_ACCOUNT, PRI_KEY, SYSTEM_CODE, SYSTEM_BELONG_CODE, USER_ID, EXTERNAL_USER_ID, EXTERNAL_USER_ACCOUNT, PERSON_TYPE, USER_NAME, GIVEN_NAME, PROVINCE_CODE, PROVINCE, UNIT_NAME, FAMILY_NAME, INTERNAL_ORG_CODE, EXTERNAL_ORG_CODE, PHONE_NUMBER, EMAIL_ADDRESS, GRADUATE_INSTITUTION, POSITION, LEVEL_CODE, US_LEVEL, IS_ASSOCIATED, ASSOCIATE_USER, WORK_ORDER_NUMBER, COMPANY_ID, COMPANY_CODE, COMPANY_NAME, ORG_ID, ORG_CODE, ORG_NAME, PARENT_ORG_ID, PARENT_ORG_CODE, PARENT_ORG_NAME, USER_EMAIL, EFFECTIVE_START_DATE, EFFECTIVE_END_DATE, USER_STATUS, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, EMPLOYEE_NUMBER)
values ('jiangjingbo@sc.cmcc', 'WFP_1544150641_68039', 'WFP', null, '68039', null, null, 'inner', null, '江静波', null, null, null, '江', null, null, null, null, null, null, null, null, null, null, null, '10136', 'sc', '四川移动', '-1', '00380049001200000000000000000000T', '中国移动四川公司\甘孜州分公司\工会(TD)', null, null, null, 'jiangjingbo.gz@sc.chinamobile.com', '2000-01-01T00:00:01+08:00', null, '0', null, null, null, '2018-11-18T00:20:33+08:00', '-1', null, null, null, null, null, '38002642');

insert into wfp_af_userinfo (USER_ACCOUNT, PRI_KEY, SYSTEM_CODE, SYSTEM_BELONG_CODE, USER_ID, EXTERNAL_USER_ID, EXTERNAL_USER_ACCOUNT, PERSON_TYPE, USER_NAME, GIVEN_NAME, PROVINCE_CODE, PROVINCE, UNIT_NAME, FAMILY_NAME, INTERNAL_ORG_CODE, EXTERNAL_ORG_CODE, PHONE_NUMBER, EMAIL_ADDRESS, GRADUATE_INSTITUTION, POSITION, LEVEL_CODE, US_LEVEL, IS_ASSOCIATED, ASSOCIATE_USER, WORK_ORDER_NUMBER, COMPANY_ID, COMPANY_CODE, COMPANY_NAME, ORG_ID, ORG_CODE, ORG_NAME, PARENT_ORG_ID, PARENT_ORG_CODE, PARENT_ORG_NAME, USER_EMAIL, EFFECTIVE_START_DATE, EFFECTIVE_END_DATE, USER_STATUS, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, EMPLOYEE_NUMBER)
values ('jishu@js.cmcc', 'WFP_1544150773_130913', 'WFP', null, '130913', null, null, 'inner', null, '吉舒', null, null, null, '吉舒', null, null, null, null, null, null, null, null, null, null, null, '10131', 'js', '江苏公司', '-1', '00230032005500100000T', '江苏\泰州\财务部\预算核算组(TD)', null, null, null, 'jishu@js.chinamobile.com', '2000-01-01T00:00:01+08:00', null, '0', null, null, null, '2018-11-18T00:34:42+08:00', '-1', null, null, null, null, null, '23130691');

insert into wfp_af_userinfo (USER_ACCOUNT, PRI_KEY, SYSTEM_CODE, SYSTEM_BELONG_CODE, USER_ID, EXTERNAL_USER_ID, EXTERNAL_USER_ACCOUNT, PERSON_TYPE, USER_NAME, GIVEN_NAME, PROVINCE_CODE, PROVINCE, UNIT_NAME, FAMILY_NAME, INTERNAL_ORG_CODE, EXTERNAL_ORG_CODE, PHONE_NUMBER, EMAIL_ADDRESS, GRADUATE_INSTITUTION, POSITION, LEVEL_CODE, US_LEVEL, IS_ASSOCIATED, ASSOCIATE_USER, WORK_ORDER_NUMBER, COMPANY_ID, COMPANY_CODE, COMPANY_NAME, ORG_ID, ORG_CODE, ORG_NAME, PARENT_ORG_ID, PARENT_ORG_CODE, PARENT_ORG_NAME, USER_EMAIL, EFFECTIVE_START_DATE, EFFECTIVE_END_DATE, USER_STATUS, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, EMPLOYEE_NUMBER)
values ('lizemin@sc.cmcc', 'WFP_1544150670_139399', 'WFP', null, '139399', null, null, 'inner', null, '李泽民', null, null, null, '李', null, null, null, null, null, null, null, null, null, null, null, '10136', 'sc', '四川移动', '-1', '00380049001100030000000000000000', '中国移动四川公司\甘孜州分公司\纪检监察室\纪委委员', null, null, null, 'lizeming.gz@sc.chinamobile.com', '2000-01-01T00:00:01+08:00', null, '0', null, null, null, '2018-11-18T00:20:50+08:00', '-1', null, null, null, null, null, '38002678');

insert into wfp_af_userinfo (USER_ACCOUNT, PRI_KEY, SYSTEM_CODE, SYSTEM_BELONG_CODE, USER_ID, EXTERNAL_USER_ID, EXTERNAL_USER_ACCOUNT, PERSON_TYPE, USER_NAME, GIVEN_NAME, PROVINCE_CODE, PROVINCE, UNIT_NAME, FAMILY_NAME, INTERNAL_ORG_CODE, EXTERNAL_ORG_CODE, PHONE_NUMBER, EMAIL_ADDRESS, GRADUATE_INSTITUTION, POSITION, LEVEL_CODE, US_LEVEL, IS_ASSOCIATED, ASSOCIATE_USER, WORK_ORDER_NUMBER, COMPANY_ID, COMPANY_CODE, COMPANY_NAME, ORG_ID, ORG_CODE, ORG_NAME, PARENT_ORG_ID, PARENT_ORG_CODE, PARENT_ORG_NAME, USER_EMAIL, EFFECTIVE_START_DATE, EFFECTIVE_END_DATE, USER_STATUS, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, EMPLOYEE_NUMBER)
values ('tanghua@js.cmcc', 'WFP_1544150801_236059', 'WFP', null, '236059', null, null, 'inner', null, '唐华', null, null, null, '唐华', null, null, null, null, null, null, null, null, null, null, null, '10131', 'js', '江苏公司', '-1', '00230032005500000000T', '江苏\泰州\财务部(TD)', null, null, null, 'tanghua@js.chinamobile.com', '2000-01-01T00:00:01+08:00', null, '0', null, null, null, '2018-11-18T01:20:29+08:00', '-1', null, null, null, null, null, '23130098');

insert into wfp_af_userinfo (USER_ACCOUNT, PRI_KEY, SYSTEM_CODE, SYSTEM_BELONG_CODE, USER_ID, EXTERNAL_USER_ID, EXTERNAL_USER_ACCOUNT, PERSON_TYPE, USER_NAME, GIVEN_NAME, PROVINCE_CODE, PROVINCE, UNIT_NAME, FAMILY_NAME, INTERNAL_ORG_CODE, EXTERNAL_ORG_CODE, PHONE_NUMBER, EMAIL_ADDRESS, GRADUATE_INSTITUTION, POSITION, LEVEL_CODE, US_LEVEL, IS_ASSOCIATED, ASSOCIATE_USER, WORK_ORDER_NUMBER, COMPANY_ID, COMPANY_CODE, COMPANY_NAME, ORG_ID, ORG_CODE, ORG_NAME, PARENT_ORG_ID, PARENT_ORG_CODE, PARENT_ORG_NAME, USER_EMAIL, EFFECTIVE_START_DATE, EFFECTIVE_END_DATE, USER_STATUS, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, EMPLOYEE_NUMBER)
values ('wangpeng@js.cmcc', 'WFP_1544150787_184703', 'WFP', null, '184703', null, null, 'inner', null, '王鹏', null, null, null, '王鹏', null, null, null, null, null, null, null, null, null, null, null, '10131', 'js', '江苏公司', '-1', '00230029005500000000T', '江苏\盐城\计划财务部(TD)', null, null, null, 'wangpeng@js.chinamobile.com', '2000-01-01T00:00:01+08:00', null, '0', null, null, null, '2018-11-18T01:20:20+08:00', '-1', null, null, null, null, null, '23090112');

insert into wfp_af_userinfo (USER_ACCOUNT, PRI_KEY, SYSTEM_CODE, SYSTEM_BELONG_CODE, USER_ID, EXTERNAL_USER_ID, EXTERNAL_USER_ACCOUNT, PERSON_TYPE, USER_NAME, GIVEN_NAME, PROVINCE_CODE, PROVINCE, UNIT_NAME, FAMILY_NAME, INTERNAL_ORG_CODE, EXTERNAL_ORG_CODE, PHONE_NUMBER, EMAIL_ADDRESS, GRADUATE_INSTITUTION, POSITION, LEVEL_CODE, US_LEVEL, IS_ASSOCIATED, ASSOCIATE_USER, WORK_ORDER_NUMBER, COMPANY_ID, COMPANY_CODE, COMPANY_NAME, ORG_ID, ORG_CODE, ORG_NAME, PARENT_ORG_ID, PARENT_ORG_CODE, PARENT_ORG_NAME, USER_EMAIL, EFFECTIVE_START_DATE, EFFECTIVE_END_DATE, USER_STATUS, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, EMPLOYEE_NUMBER)
values ('zhangqinglian@js.cmcc', 'WFP_1544150733_45475', 'WFP', null, '45475', null, null, 'inner', null, '张青莲', null, null, null, '张', null, null, null, null, null, null, null, null, null, null, null, '10131', 'js', '江苏公司', '-1', '00230033005501200000T', '江苏\宿迁\计划财务部\核算管理组(TD)', null, null, null, 'zhangqinglian@js.chinamobile.com', '2000-01-01T00:00:01+08:00', null, '0', null, null, null, '2018-11-19T10:00:45+08:00', '-1', null, null, null, null, null, '23331896');

insert into wfp_af_userinfo (USER_ACCOUNT, PRI_KEY, SYSTEM_CODE, SYSTEM_BELONG_CODE, USER_ID, EXTERNAL_USER_ID, EXTERNAL_USER_ACCOUNT, PERSON_TYPE, USER_NAME, GIVEN_NAME, PROVINCE_CODE, PROVINCE, UNIT_NAME, FAMILY_NAME, INTERNAL_ORG_CODE, EXTERNAL_ORG_CODE, PHONE_NUMBER, EMAIL_ADDRESS, GRADUATE_INSTITUTION, POSITION, LEVEL_CODE, US_LEVEL, IS_ASSOCIATED, ASSOCIATE_USER, WORK_ORDER_NUMBER, COMPANY_ID, COMPANY_CODE, COMPANY_NAME, ORG_ID, ORG_CODE, ORG_NAME, PARENT_ORG_ID, PARENT_ORG_CODE, PARENT_ORG_NAME, USER_EMAIL, EFFECTIVE_START_DATE, EFFECTIVE_END_DATE, USER_STATUS, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, EMPLOYEE_NUMBER)
values ('zhongguoxiang@sc.cmcc', 'WFP_1544150643_68593', 'WFP', null, '68593', null, null, 'inner', null, '钟国祥', null, null, null, '钟', null, null, null, null, null, null, null, null, null, null, null, '10136', 'sc', '四川移动', '-1', '00380049001200000000000000000000', '中国移动四川公司\甘孜州分公司\工会', null, null, null, 'zhongguoxiang@sc.chinamobile.com', '2000-01-01T00:00:01+08:00', null, '0', null, null, null, '2018-11-18T00:20:33+08:00', '-1', null, null, null, null, null, '38002667');


commit;

create table WFP_AF_PERSONMANAGEMENT
(
  pm_id                      VARCHAR2(256) primary key,
  pm_role_id                 VARCHAR2(500),
  pm_role_name               VARCHAR2(500),
  pm_tenantid                VARCHAR2(50),
  pm_province_code           VARCHAR2(500),
  pm_city_code               VARCHAR2(500),
  pm_person_id               VARCHAR2(500) not null,
  pm_person_name             VARCHAR2(500) not null,
  pm_person_state            VARCHAR2(10) not null,
  pm_mechanism               VARCHAR2(4000),
  pm_business                VARCHAR2(4000),
  pm_createtime              DATE not null,
  attribute1                 VARCHAR2(500),
  attribute2                 VARCHAR2(500),
  attribute3                 VARCHAR2(500),
  attribute4                 VARCHAR2(500),
  attribute5                 VARCHAR2(500),
  pm_mechanism_code          VARCHAR2(4000),
  pm_business_code           VARCHAR2(4000),
  pm_approval_mechanism      CLOB,
  pm_approval_mechanism_code VARCHAR2(4000)
);

insert into wfp_af_personmanagement (PM_ID, PM_ROLE_ID, PM_ROLE_NAME, PM_TENANTID, PM_PROVINCE_CODE, PM_CITY_CODE, PM_PERSON_ID, PM_PERSON_NAME, PM_PERSON_STATE, PM_MECHANISM, PM_BUSINESS, PM_CREATETIME, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, PM_MECHANISM_CODE, PM_BUSINESS_CODE, PM_APPROVAL_MECHANISM, PM_APPROVAL_MECHANISM_CODE)
values ('789105', 'AAM206', '江苏-财务领导', 'AAM', '0023', null, 'tanghua@js.cmcc', '唐华', '1', null, null, to_date('15-09-2018 17:52:11', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, null, null, null, null, '<CLOB>', null);

insert into wfp_af_personmanagement (PM_ID, PM_ROLE_ID, PM_ROLE_NAME, PM_TENANTID, PM_PROVINCE_CODE, PM_CITY_CODE, PM_PERSON_ID, PM_PERSON_NAME, PM_PERSON_STATE, PM_MECHANISM, PM_BUSINESS, PM_CREATETIME, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, PM_MECHANISM_CODE, PM_BUSINESS_CODE, PM_APPROVAL_MECHANISM, PM_APPROVAL_MECHANISM_CODE)
values ('789108', 'AAM206', '江苏-财务领导', 'AAM', '0023', null, 'wangpeng@js.cmcc', '王鹏', '1', null, null, to_date('15-09-2018 17:52:11', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, null, null, null, null, '<CLOB>', null);

insert into wfp_af_personmanagement (PM_ID, PM_ROLE_ID, PM_ROLE_NAME, PM_TENANTID, PM_PROVINCE_CODE, PM_CITY_CODE, PM_PERSON_ID, PM_PERSON_NAME, PM_PERSON_STATE, PM_MECHANISM, PM_BUSINESS, PM_CREATETIME, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, PM_MECHANISM_CODE, PM_BUSINESS_CODE, PM_APPROVAL_MECHANISM, PM_APPROVAL_MECHANISM_CODE)
values ('789149', 'AAM209', '江苏-电子档案管理员', 'AAM', '0023', null, 'jishu@js.cmcc', '吉舒', '1', null, null, to_date('15-09-2018 17:52:11', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, null, null, null, null, '<CLOB>', null);

insert into wfp_af_personmanagement (PM_ID, PM_ROLE_ID, PM_ROLE_NAME, PM_TENANTID, PM_PROVINCE_CODE, PM_CITY_CODE, PM_PERSON_ID, PM_PERSON_NAME, PM_PERSON_STATE, PM_MECHANISM, PM_BUSINESS, PM_CREATETIME, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, PM_MECHANISM_CODE, PM_BUSINESS_CODE, PM_APPROVAL_MECHANISM, PM_APPROVAL_MECHANISM_CODE)
values ('789150', 'AAM208', '江苏-实体档案管理员', 'AAM', '0023', null, 'jishu@js.cmcc', '吉舒', '1', null, null, to_date('15-09-2018 17:52:11', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, null, null, null, null, '<CLOB>', null);

insert into wfp_af_personmanagement (PM_ID, PM_ROLE_ID, PM_ROLE_NAME, PM_TENANTID, PM_PROVINCE_CODE, PM_CITY_CODE, PM_PERSON_ID, PM_PERSON_NAME, PM_PERSON_STATE, PM_MECHANISM, PM_BUSINESS, PM_CREATETIME, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, PM_MECHANISM_CODE, PM_BUSINESS_CODE, PM_APPROVAL_MECHANISM, PM_APPROVAL_MECHANISM_CODE)
values ('789151', 'AAM209', '江苏-电子档案管理员', 'AAM', '0023', null, 'zhangqinglian@js.cmcc', '张青莲', '1', null, null, to_date('15-09-2018 17:52:11', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, null, null, null, null, '<CLOB>', null);

insert into wfp_af_personmanagement (PM_ID, PM_ROLE_ID, PM_ROLE_NAME, PM_TENANTID, PM_PROVINCE_CODE, PM_CITY_CODE, PM_PERSON_ID, PM_PERSON_NAME, PM_PERSON_STATE, PM_MECHANISM, PM_BUSINESS, PM_CREATETIME, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, PM_MECHANISM_CODE, PM_BUSINESS_CODE, PM_APPROVAL_MECHANISM, PM_APPROVAL_MECHANISM_CODE)
values ('789152', 'AAM208', '江苏-实体档案管理员', 'AAM', '0023', null, 'zhangqinglian@js.cmcc', '张青莲', '1', null, null, to_date('15-09-2018 17:52:11', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, null, null, null, null, '<CLOB>', null);

insert into wfp_af_personmanagement (PM_ID, PM_ROLE_ID, PM_ROLE_NAME, PM_TENANTID, PM_PROVINCE_CODE, PM_CITY_CODE, PM_PERSON_ID, PM_PERSON_NAME, PM_PERSON_STATE, PM_MECHANISM, PM_BUSINESS, PM_CREATETIME, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, PM_MECHANISM_CODE, PM_BUSINESS_CODE, PM_APPROVAL_MECHANISM, PM_APPROVAL_MECHANISM_CODE)
values ('789123', 'AAM204', '江苏-档案管理员', 'AAM', '0036', null, 'jishu@js.cmcc', '吉舒', '1', null, null, to_date('15-09-2018 17:52:11', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, null, null, null, null, '<CLOB>', null);

insert into wfp_af_personmanagement (PM_ID, PM_ROLE_ID, PM_ROLE_NAME, PM_TENANTID, PM_PROVINCE_CODE, PM_CITY_CODE, PM_PERSON_ID, PM_PERSON_NAME, PM_PERSON_STATE, PM_MECHANISM, PM_BUSINESS, PM_CREATETIME, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, PM_MECHANISM_CODE, PM_BUSINESS_CODE, PM_APPROVAL_MECHANISM, PM_APPROVAL_MECHANISM_CODE)
values ('789124', 'AAM204', '江苏-档案管理员', 'AAM', '0037', null, 'zhangqinglian@js.cmcc', '张青莲', '1', null, null, to_date('15-09-2018 17:52:11', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, null, null, null, null, '<CLOB>', null);

insert into wfp_af_personmanagement (PM_ID, PM_ROLE_ID, PM_ROLE_NAME, PM_TENANTID, PM_PROVINCE_CODE, PM_CITY_CODE, PM_PERSON_ID, PM_PERSON_NAME, PM_PERSON_STATE, PM_MECHANISM, PM_BUSINESS, PM_CREATETIME, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, PM_MECHANISM_CODE, PM_BUSINESS_CODE, PM_APPROVAL_MECHANISM, PM_APPROVAL_MECHANISM_CODE)
values ('878613', 'AAM482', '四川-部门领导', 'AAM', '0038', null, 'lizemin@sc.cmcc', '李泽民', '1', null, null, to_date('16-09-2018 19:17:57', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, null, null, null, null, '<CLOB>', null);

insert into wfp_af_personmanagement (PM_ID, PM_ROLE_ID, PM_ROLE_NAME, PM_TENANTID, PM_PROVINCE_CODE, PM_CITY_CODE, PM_PERSON_ID, PM_PERSON_NAME, PM_PERSON_STATE, PM_MECHANISM, PM_BUSINESS, PM_CREATETIME, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, PM_MECHANISM_CODE, PM_BUSINESS_CODE, PM_APPROVAL_MECHANISM, PM_APPROVAL_MECHANISM_CODE)
values ('878614', 'AAM482', '四川-部门领导', 'AAM', '0038', null, 'jiangjingbo@sc.cmcc', '江静波', '1', null, null, to_date('16-09-2018 19:17:57', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, null, null, null, null, '<CLOB>', null);

insert into wfp_af_personmanagement (PM_ID, PM_ROLE_ID, PM_ROLE_NAME, PM_TENANTID, PM_PROVINCE_CODE, PM_CITY_CODE, PM_PERSON_ID, PM_PERSON_NAME, PM_PERSON_STATE, PM_MECHANISM, PM_BUSINESS, PM_CREATETIME, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, PM_MECHANISM_CODE, PM_BUSINESS_CODE, PM_APPROVAL_MECHANISM, PM_APPROVAL_MECHANISM_CODE)
values ('878615', 'AAM482', '四川-部门领导', 'AAM', '0038', null, 'zhongguoxiang@sc.cmcc', '钟国祥', '1', null, null, to_date('16-09-2018 19:17:57', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, null, null, null, null, '<CLOB>', null);
commit;

create table WFP_AF_USERPOSITION
(
  position_id       INTEGER primary key,
  user_account      VARCHAR2(64),
  org_code          VARCHAR2(64),
  org_name          VARCHAR2(128),
  display_order     VARCHAR2(64),
  duty_code         VARCHAR2(128),
  duty_name         VARCHAR2(128),
  main_org          VARCHAR2(32),
  created_by        VARCHAR2(64),
  creation_date     VARCHAR2(64),
  last_update_by    VARCHAR2(64),
  last_update_date  VARCHAR2(64),
  last_update_login VARCHAR2(128),
  attribute1        VARCHAR2(256),
  attribute2        VARCHAR2(256),
  attribute3        VARCHAR2(256),
  attribute4        VARCHAR2(256),
  attribute5        VARCHAR2(256)
);
insert into wfp_af_userposition (POSITION_ID, USER_ACCOUNT, ORG_CODE, ORG_NAME, DISPLAY_ORDER, DUTY_CODE, DUTY_NAME, MAIN_ORG, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values (1151799, 'zhongguoxiang@sc.cmcc', '00380049001200000000000000000000', '中国移动四川公司\甘孜州分公司\工会', '00380049001200000000000000000000/2', '00380049001200000000000000000000-sc-0034', '中国移动四川公司\甘孜州分公司\工会-四川-党委书记', 'Y', null, null, null, null, null, null, null, null, null, null);

insert into wfp_af_userposition (POSITION_ID, USER_ACCOUNT, ORG_CODE, ORG_NAME, DISPLAY_ORDER, DUTY_CODE, DUTY_NAME, MAIN_ORG, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values (1168965, 'jiangjingbo@sc.cmcc', '00380049001200000000000000000000', '中国移动四川公司\甘孜州分公司\工会', '00380049001200000000000000000000/0', '00380049001200000000000000000000-sc-0034', '中国移动四川公司\甘孜州分公司\工会-四川-党委书记', 'Y', null, null, null, null, null, null, null, null, null, null);

insert into wfp_af_userposition (POSITION_ID, USER_ACCOUNT, ORG_CODE, ORG_NAME, DISPLAY_ORDER, DUTY_CODE, DUTY_NAME, MAIN_ORG, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values (1168981, 'jiangjingbo@sc.cmcc', '00380049001200000000000000000000T', '中国移动四川公司\甘孜州分公司\工会(TD)', '00380049001200000000000000000000T/0', '00380049001200000000000000000000T-sc-0034', '中国移动四川公司\甘孜州分公司\工会(TD)-四川-党委书记', 'N', null, null, null, null, null, null, null, null, null, null);

insert into wfp_af_userposition (POSITION_ID, USER_ACCOUNT, ORG_CODE, ORG_NAME, DISPLAY_ORDER, DUTY_CODE, DUTY_NAME, MAIN_ORG, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values (1197006, 'lizemin@sc.cmcc', '00380049001100000000000000000000', '中国移动四川公司\甘孜州分公司\纪检监察室', '00380049001100000000000000000000/0', '00380049001100000000000000000000-sc-0034', '中国移动四川公司\甘孜州分公司\纪检监察室-四川-党委书记', 'Y', null, null, null, null, null, null, null, null, null, null);

insert into wfp_af_userposition (POSITION_ID, USER_ACCOUNT, ORG_CODE, ORG_NAME, DISPLAY_ORDER, DUTY_CODE, DUTY_NAME, MAIN_ORG, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values (1197007, 'lizemin@sc.cmcc', '00380049001100030000000000000000', '中国移动四川公司\甘孜州分公司\纪检监察室\纪委委员', '00380049001100030000000000000000/0', '00380049001100030000000000000000-sc-0034', '中国移动四川公司\甘孜州分公司\纪检监察室\纪委委员-四川-党委书记', 'N', null, null, null, null, null, null, null, null, null, null);

insert into wfp_af_userposition (POSITION_ID, USER_ACCOUNT, ORG_CODE, ORG_NAME, DISPLAY_ORDER, DUTY_CODE, DUTY_NAME, MAIN_ORG, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values (1208066, 'zhangqinglian@js.cmcc', '00230033005501200000T', '江苏\宿迁\计划财务部\核算管理组(TD)', '00230033005501200000T/095', 'null', 'null', 'N', null, null, null, null, null, null, null, null, null, null);

insert into wfp_af_userposition (POSITION_ID, USER_ACCOUNT, ORG_CODE, ORG_NAME, DISPLAY_ORDER, DUTY_CODE, DUTY_NAME, MAIN_ORG, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values (1208048, 'zhangqinglian@js.cmcc', '00230033005501200000', '江苏\宿迁\计划财务部\核算管理组', '00230033005501200000/095', '00230033005501200000-js-0054', '江苏\宿迁\计划财务部\核算管理组-江苏-总工程师', 'Y', null, null, null, null, null, null, null, null, null, null);

insert into wfp_af_userposition (POSITION_ID, USER_ACCOUNT, ORG_CODE, ORG_NAME, DISPLAY_ORDER, DUTY_CODE, DUTY_NAME, MAIN_ORG, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values (1273234, 'wangpeng@js.cmcc', '00230029005500000000', '江苏\盐城\计划财务部', '00230029005500000000/025', '00230029005500000000-js-0052', '江苏\盐城\计划财务部-江苏-副秘书长', 'Y', null, null, null, null, null, null, null, null, null, null);

insert into wfp_af_userposition (POSITION_ID, USER_ACCOUNT, ORG_CODE, ORG_NAME, DISPLAY_ORDER, DUTY_CODE, DUTY_NAME, MAIN_ORG, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values (1273235, 'wangpeng@js.cmcc', '00230029005500000000T', '江苏\盐城\计划财务部(TD)', '00230029005500000000T/025', 'null', 'null', 'N', null, null, null, null, null, null, null, null, null, null);

insert into wfp_af_userposition (POSITION_ID, USER_ACCOUNT, ORG_CODE, ORG_NAME, DISPLAY_ORDER, DUTY_CODE, DUTY_NAME, MAIN_ORG, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values (1281619, 'jishu@js.cmcc', '00230032005500100000T', '江苏\泰州\财务部\预算核算组(TD)', '00230032005500100000T/108', 'null', 'null', 'N', null, null, null, null, null, null, null, null, null, null);

insert into wfp_af_userposition (POSITION_ID, USER_ACCOUNT, ORG_CODE, ORG_NAME, DISPLAY_ORDER, DUTY_CODE, DUTY_NAME, MAIN_ORG, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values (1281618, 'jishu@js.cmcc', '00230032005500100000', '江苏\泰州\财务部\预算核算组', '00230032005500100000/108', '00230032005500100000-js-0054', '江苏\泰州\财务部\预算核算组-江苏-总工程师', 'Y', null, null, null, null, null, null, null, null, null, null);

insert into wfp_af_userposition (POSITION_ID, USER_ACCOUNT, ORG_CODE, ORG_NAME, DISPLAY_ORDER, DUTY_CODE, DUTY_NAME, MAIN_ORG, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values (1277630, 'tanghua@js.cmcc', '00230032005500000000', '江苏\泰州\财务部', '00230032005500000000/020', '00230032005500000000-js-0053', '江苏\泰州\财务部-江苏-负责人', 'Y', null, null, null, null, null, null, null, null, null, null);

insert into wfp_af_userposition (POSITION_ID, USER_ACCOUNT, ORG_CODE, ORG_NAME, DISPLAY_ORDER, DUTY_CODE, DUTY_NAME, MAIN_ORG, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values (1277631, 'tanghua@js.cmcc', '00230032005500000000T', '江苏\泰州\财务部(TD)', '00230032005500000000T/020', 'null', 'null', 'N', null, null, null, null, null, null, null, null, null, null);
commit;

create table WFP_AF_ROLE
(
  ro_role_id         VARCHAR2(200) primary key,
  ro_processinstid   NUMBER(10),
  ro_role_name       VARCHAR2(256),
  ro_tenantid        VARCHAR2(256),
  ro_createtime      DATE,
  ro_business_system VARCHAR2(256),
  ro_rolestate       VARCHAR2(10),
  attribute1         VARCHAR2(100),
  attribute2         VARCHAR2(100),
  attribute3         VARCHAR2(100),
  attribute4         VARCHAR2(100),
  attribute5         VARCHAR2(100),
  po_reason          VARCHAR2(500),
  ro_id              VARCHAR2(256) not null
);
insert into wfp_af_role (RO_ROLE_ID, RO_PROCESSINSTID, RO_ROLE_NAME, RO_TENANTID, RO_CREATETIME, RO_BUSINESS_SYSTEM, RO_ROLESTATE, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, PO_REASON, RO_ID)
values ('AAM206', 0, '江苏-财务领导', 'AAM', to_date('14-09-2018 16:51:05', 'dd-mm-yyyy hh24:mi:ss'), '报账档案系统', '1', null, null, null, null, null, null, '206');

insert into wfp_af_role (RO_ROLE_ID, RO_PROCESSINSTID, RO_ROLE_NAME, RO_TENANTID, RO_CREATETIME, RO_BUSINESS_SYSTEM, RO_ROLESTATE, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, PO_REASON, RO_ID)
values ('AAM209', 0, '江苏-电子档案管理员', 'AAM', to_date('14-09-2018 16:51:53', 'dd-mm-yyyy hh24:mi:ss'), '报账档案系统', '1', null, null, null, null, null, null, '209');

insert into wfp_af_role (RO_ROLE_ID, RO_PROCESSINSTID, RO_ROLE_NAME, RO_TENANTID, RO_CREATETIME, RO_BUSINESS_SYSTEM, RO_ROLESTATE, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, PO_REASON, RO_ID)
values ('AAM482', 0, '四川-部门领导', 'AAM', to_date('08-08-2018 17:18:39', 'dd-mm-yyyy hh24:mi:ss'), '报账档案系统', '1', null, null, null, null, null, null, '602');
commit;

create table WFP_AF_ORGANIZATION
(
  org_code             VARCHAR2(64) primary key,
  pri_key              VARCHAR2(32),
  org_id               VARCHAR2(32),
  hr_org_code          VARCHAR2(64),
  org_name             VARCHAR2(256),
  company_code         VARCHAR2(32),
  company_name         VARCHAR2(128),
  city                 VARCHAR2(32),
  org_short_name       VARCHAR2(64),
  erporg_short_name    VARCHAR2(256),
  org_description      VARCHAR2(512),
  org_stylecode        VARCHAR2(32),
  org_style            VARCHAR2(32),
  org_level_code       VARCHAR2(16),
  org_level            VARCHAR2(32),
  supervisor_leader    VARCHAR2(128),
  main_principal       VARCHAR2(64),
  manager              VARCHAR2(32),
  manager_org_id       VARCHAR2(32),
  postal_address       VARCHAR2(128),
  postal_code          VARCHAR2(64),
  telephone_number     VARCHAR2(32),
  fax_number           VARCHAR2(64),
  display_order        VARCHAR2(64),
  org_status_code      VARCHAR2(32),
  org_status           VARCHAR2(32),
  parent_org_code      VARCHAR2(128),
  parent_org_name      VARCHAR2(128),
  classify_code        VARCHAR2(32),
  classify_name        VARCHAR2(32),
  department_manager   VARCHAR2(64),
  business_duty_code   VARCHAR2(32),
  business_duty        VARCHAR2(32),
  map_id               VARCHAR2(32),
  company_ccode        VARCHAR2(32),
  company_desp         VARCHAR2(128),
  cst_code             VARCHAR2(32),
  cdt_desp             VARCHAR2(128),
  operation_type_code  VARCHAR2(32),
  operation_type       VARCHAR2(32),
  assistant_principals VARCHAR2(512),
  created_by           VARCHAR2(64),
  creation_date        VARCHAR2(64),
  last_update_by       VARCHAR2(64),
  last_update_date     VARCHAR2(64),
  last_update_login    VARCHAR2(128),
  attribute1           VARCHAR2(256),
  attribute2           VARCHAR2(256),
  attribute3           VARCHAR2(256),
  attribute4           VARCHAR2(256),
  attribute5           VARCHAR2(256)
);
insert into wfp_af_organization (ORG_CODE, PRI_KEY, ORG_ID, HR_ORG_CODE, ORG_NAME, COMPANY_CODE, COMPANY_NAME, CITY, ORG_SHORT_NAME, ERPORG_SHORT_NAME, ORG_DESCRIPTION, ORG_STYLECODE, ORG_STYLE, ORG_LEVEL_CODE, ORG_LEVEL, SUPERVISOR_LEADER, MAIN_PRINCIPAL, MANAGER, MANAGER_ORG_ID, POSTAL_ADDRESS, POSTAL_CODE, TELEPHONE_NUMBER, FAX_NUMBER, DISPLAY_ORDER, ORG_STATUS_CODE, ORG_STATUS, PARENT_ORG_CODE, PARENT_ORG_NAME, CLASSIFY_CODE, CLASSIFY_NAME, DEPARTMENT_MANAGER, BUSINESS_DUTY_CODE, BUSINESS_DUTY, MAP_ID, COMPANY_CCODE, COMPANY_DESP, CST_CODE, CDT_DESP, OPERATION_TYPE_CODE, OPERATION_TYPE, ASSISTANT_PRINCIPALS, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values ('00000000000000000000', '299499_1', '299499', null, '中国移动集团有限公司', 'cmcc', '集团', null, '中国移动集团有限公司', '中国移动集团有限公司', null, '1', '公司', '1', '一级部门', null, null, null, null, null, null, null, null, '1', '0', '正常状态', null, null, 'UGORG', '上市审批组织', null, null, null, '299499', '011010', '中国移动通信集团公司', null, null, '0', '新增/修改', null, null, null, null, '2018-10-13T18:14:47', null, null, null, null, null, null);

insert into wfp_af_organization (ORG_CODE, PRI_KEY, ORG_ID, HR_ORG_CODE, ORG_NAME, COMPANY_CODE, COMPANY_NAME, CITY, ORG_SHORT_NAME, ERPORG_SHORT_NAME, ORG_DESCRIPTION, ORG_STYLECODE, ORG_STYLE, ORG_LEVEL_CODE, ORG_LEVEL, SUPERVISOR_LEADER, MAIN_PRINCIPAL, MANAGER, MANAGER_ORG_ID, POSTAL_ADDRESS, POSTAL_CODE, TELEPHONE_NUMBER, FAX_NUMBER, DISPLAY_ORDER, ORG_STATUS_CODE, ORG_STATUS, PARENT_ORG_CODE, PARENT_ORG_NAME, CLASSIFY_CODE, CLASSIFY_NAME, DEPARTMENT_MANAGER, BUSINESS_DUTY_CODE, BUSINESS_DUTY, MAP_ID, COMPANY_CCODE, COMPANY_DESP, CST_CODE, CDT_DESP, OPERATION_TYPE_CODE, OPERATION_TYPE, ASSISTANT_PRINCIPALS, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values ('00230000000000000000T', '404499_503', '404499', '23000000', '江苏有限公司(TD)', 'js', '江苏', '本部', '江苏有限公司(TD)', '江苏有限公司', null, '1', '公司', '1', '一级部门', null, 'wangjian@js.cmcc', null, null, null, null, null, null, '1011', '0', '正常状态', '00000000000000000000', '中国移动集团有限公司', 'TDORG', 'TD审批组织', null, null, null, null, '032310', '江苏省本部(TD)', null, null, '0', '新增/修改', null, null, null, null, '2018-10-13T18:14:47', null, null, null, null, null, null);

insert into wfp_af_organization (ORG_CODE, PRI_KEY, ORG_ID, HR_ORG_CODE, ORG_NAME, COMPANY_CODE, COMPANY_NAME, CITY, ORG_SHORT_NAME, ERPORG_SHORT_NAME, ORG_DESCRIPTION, ORG_STYLECODE, ORG_STYLE, ORG_LEVEL_CODE, ORG_LEVEL, SUPERVISOR_LEADER, MAIN_PRINCIPAL, MANAGER, MANAGER_ORG_ID, POSTAL_ADDRESS, POSTAL_CODE, TELEPHONE_NUMBER, FAX_NUMBER, DISPLAY_ORDER, ORG_STATUS_CODE, ORG_STATUS, PARENT_ORG_CODE, PARENT_ORG_NAME, CLASSIFY_CODE, CLASSIFY_NAME, DEPARTMENT_MANAGER, BUSINESS_DUTY_CODE, BUSINESS_DUTY, MAP_ID, COMPANY_CCODE, COMPANY_DESP, CST_CODE, CDT_DESP, OPERATION_TYPE_CODE, OPERATION_TYPE, ASSISTANT_PRINCIPALS, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values ('00380000000000000000000000000000', '348091_297', '348091', null, '四川有限公司', 'sc', '四川', '本部', '四川有限公司', '四川有限公司', null, '1', '公司', '1', '一级部门', null, null, null, null, null, null, null, null, '1024', '0', '正常状态', '00000000000000000000', '中国移动集团有限公司', 'UGORG', '上市审批组织', null, null, null, '348091', '303810', '中国移动通信集团四川有限公司', null, null, '0', '新增/修改', null, null, null, null, '2018-11-26T17:15:36', null, null, null, null, null, null);

insert into wfp_af_organization (ORG_CODE, PRI_KEY, ORG_ID, HR_ORG_CODE, ORG_NAME, COMPANY_CODE, COMPANY_NAME, CITY, ORG_SHORT_NAME, ERPORG_SHORT_NAME, ORG_DESCRIPTION, ORG_STYLECODE, ORG_STYLE, ORG_LEVEL_CODE, ORG_LEVEL, SUPERVISOR_LEADER, MAIN_PRINCIPAL, MANAGER, MANAGER_ORG_ID, POSTAL_ADDRESS, POSTAL_CODE, TELEPHONE_NUMBER, FAX_NUMBER, DISPLAY_ORDER, ORG_STATUS_CODE, ORG_STATUS, PARENT_ORG_CODE, PARENT_ORG_NAME, CLASSIFY_CODE, CLASSIFY_NAME, DEPARTMENT_MANAGER, BUSINESS_DUTY_CODE, BUSINESS_DUTY, MAP_ID, COMPANY_CCODE, COMPANY_DESP, CST_CODE, CDT_DESP, OPERATION_TYPE_CODE, OPERATION_TYPE, ASSISTANT_PRINCIPALS, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values ('00000000000000000000', '299499_1', '299499', null, '中国移动集团有限公司', 'cmcc', '集团', null, '中国移动集团有限公司', '中国移动集团有限公司', null, '1', '公司', '1', '一级部门', null, null, null, null, null, null, null, null, '1', '0', '正常状态', null, null, 'UGORG', '上市审批组织', null, null, null, '299499', '011010', '中国移动通信集团公司', null, null, '0', '新增/修改', null, null, null, null, '2018-10-13T18:14:47', null, null, null, null, null, null);

insert into wfp_af_organization (ORG_CODE, PRI_KEY, ORG_ID, HR_ORG_CODE, ORG_NAME, COMPANY_CODE, COMPANY_NAME, CITY, ORG_SHORT_NAME, ERPORG_SHORT_NAME, ORG_DESCRIPTION, ORG_STYLECODE, ORG_STYLE, ORG_LEVEL_CODE, ORG_LEVEL, SUPERVISOR_LEADER, MAIN_PRINCIPAL, MANAGER, MANAGER_ORG_ID, POSTAL_ADDRESS, POSTAL_CODE, TELEPHONE_NUMBER, FAX_NUMBER, DISPLAY_ORDER, ORG_STATUS_CODE, ORG_STATUS, PARENT_ORG_CODE, PARENT_ORG_NAME, CLASSIFY_CODE, CLASSIFY_NAME, DEPARTMENT_MANAGER, BUSINESS_DUTY_CODE, BUSINESS_DUTY, MAP_ID, COMPANY_CCODE, COMPANY_DESP, CST_CODE, CDT_DESP, OPERATION_TYPE_CODE, OPERATION_TYPE, ASSISTANT_PRINCIPALS, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values ('00230000000000000000T', '404499_503', '404499', '23000000', '江苏有限公司(TD)', 'js', '江苏', '本部', '江苏有限公司(TD)', '江苏有限公司', null, '1', '公司', '1', '一级部门', null, 'wangjian@js.cmcc', null, null, null, null, null, null, '1011', '0', '正常状态', '00000000000000000000', '中国移动集团有限公司', 'TDORG', 'TD审批组织', null, null, null, null, '032310', '江苏省本部(TD)', null, null, '0', '新增/修改', null, null, null, null, '2018-10-13T18:14:47', null, null, null, null, null, null);

insert into wfp_af_organization (ORG_CODE, PRI_KEY, ORG_ID, HR_ORG_CODE, ORG_NAME, COMPANY_CODE, COMPANY_NAME, CITY, ORG_SHORT_NAME, ERPORG_SHORT_NAME, ORG_DESCRIPTION, ORG_STYLECODE, ORG_STYLE, ORG_LEVEL_CODE, ORG_LEVEL, SUPERVISOR_LEADER, MAIN_PRINCIPAL, MANAGER, MANAGER_ORG_ID, POSTAL_ADDRESS, POSTAL_CODE, TELEPHONE_NUMBER, FAX_NUMBER, DISPLAY_ORDER, ORG_STATUS_CODE, ORG_STATUS, PARENT_ORG_CODE, PARENT_ORG_NAME, CLASSIFY_CODE, CLASSIFY_NAME, DEPARTMENT_MANAGER, BUSINESS_DUTY_CODE, BUSINESS_DUTY, MAP_ID, COMPANY_CCODE, COMPANY_DESP, CST_CODE, CDT_DESP, OPERATION_TYPE_CODE, OPERATION_TYPE, ASSISTANT_PRINCIPALS, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values ('00380000000000000000000000000000T', '404496_501', '404496', null, '四川有限公司(TD)', 'sc', '四川', '本部', '四川有限公司(TD)', '四川有限公司', null, '1', '公司', '2', '二级部门', null, null, null, null, null, null, null, null, '1024', '0', '正常状态', '00000000000000000000', '中国移动集团有限公司', 'TDORG', 'TD审批组织', null, null, null, null, '033810', '四川移动本部(TD)', null, null, '0', '新增/修改', null, null, null, null, '2018-10-13T18:14:47', null, null, null, null, null, null);

insert into wfp_af_organization (ORG_CODE, PRI_KEY, ORG_ID, HR_ORG_CODE, ORG_NAME, COMPANY_CODE, COMPANY_NAME, CITY, ORG_SHORT_NAME, ERPORG_SHORT_NAME, ORG_DESCRIPTION, ORG_STYLECODE, ORG_STYLE, ORG_LEVEL_CODE, ORG_LEVEL, SUPERVISOR_LEADER, MAIN_PRINCIPAL, MANAGER, MANAGER_ORG_ID, POSTAL_ADDRESS, POSTAL_CODE, TELEPHONE_NUMBER, FAX_NUMBER, DISPLAY_ORDER, ORG_STATUS_CODE, ORG_STATUS, PARENT_ORG_CODE, PARENT_ORG_NAME, CLASSIFY_CODE, CLASSIFY_NAME, DEPARTMENT_MANAGER, BUSINESS_DUTY_CODE, BUSINESS_DUTY, MAP_ID, COMPANY_CCODE, COMPANY_DESP, CST_CODE, CDT_DESP, OPERATION_TYPE_CODE, OPERATION_TYPE, ASSISTANT_PRINCIPALS, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values ('00230033000000000000T', '316817_659', '316817', '23330000', '江苏\宿迁分公司(TD)', 'js', '江苏', '宿迁', '宿迁分公司', '江苏\宿迁分公司(TD)', null, '1', '公司', '2', '二级部门', null, null, null, null, null, null, null, null, '740', '0', '正常状态', '00230000000000000000T', '江苏有限公司(TD)', 'TDORG', 'TD审批组织', null, null, null, null, '032333', '宿迁分公司(TD)', null, null, '0', '新增/修改', null, null, null, null, '2018-11-26T17:15:35', null, null, null, null, null, null);

insert into wfp_af_organization (ORG_CODE, PRI_KEY, ORG_ID, HR_ORG_CODE, ORG_NAME, COMPANY_CODE, COMPANY_NAME, CITY, ORG_SHORT_NAME, ERPORG_SHORT_NAME, ORG_DESCRIPTION, ORG_STYLECODE, ORG_STYLE, ORG_LEVEL_CODE, ORG_LEVEL, SUPERVISOR_LEADER, MAIN_PRINCIPAL, MANAGER, MANAGER_ORG_ID, POSTAL_ADDRESS, POSTAL_CODE, TELEPHONE_NUMBER, FAX_NUMBER, DISPLAY_ORDER, ORG_STATUS_CODE, ORG_STATUS, PARENT_ORG_CODE, PARENT_ORG_NAME, CLASSIFY_CODE, CLASSIFY_NAME, DEPARTMENT_MANAGER, BUSINESS_DUTY_CODE, BUSINESS_DUTY, MAP_ID, COMPANY_CCODE, COMPANY_DESP, CST_CODE, CDT_DESP, OPERATION_TYPE_CODE, OPERATION_TYPE, ASSISTANT_PRINCIPALS, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values ('00230032000000000000T', '316085_293', '316085', '23320000', '江苏\泰州分公司(TD)', 'js', '江苏', '泰州', '泰州分公司', '江苏\泰州分公司(TD)', null, '1', '公司', '2', '二级部门', null, null, null, null, null, null, null, null, '640', '0', '正常状态', '00230000000000000000T', '江苏有限公司(TD)', 'TDORG', 'TD审批组织', null, null, null, null, '032332', '泰州分公司(TD)', null, null, '0', '新增/修改', null, null, null, null, '2018-11-26T17:15:37', null, null, null, null, null, null);

insert into wfp_af_organization (ORG_CODE, PRI_KEY, ORG_ID, HR_ORG_CODE, ORG_NAME, COMPANY_CODE, COMPANY_NAME, CITY, ORG_SHORT_NAME, ERPORG_SHORT_NAME, ORG_DESCRIPTION, ORG_STYLECODE, ORG_STYLE, ORG_LEVEL_CODE, ORG_LEVEL, SUPERVISOR_LEADER, MAIN_PRINCIPAL, MANAGER, MANAGER_ORG_ID, POSTAL_ADDRESS, POSTAL_CODE, TELEPHONE_NUMBER, FAX_NUMBER, DISPLAY_ORDER, ORG_STATUS_CODE, ORG_STATUS, PARENT_ORG_CODE, PARENT_ORG_NAME, CLASSIFY_CODE, CLASSIFY_NAME, DEPARTMENT_MANAGER, BUSINESS_DUTY_CODE, BUSINESS_DUTY, MAP_ID, COMPANY_CCODE, COMPANY_DESP, CST_CODE, CDT_DESP, OPERATION_TYPE_CODE, OPERATION_TYPE, ASSISTANT_PRINCIPALS, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values ('00380049000000000000000000000000', '325968_235', '325968', '38400000', '甘孜州分公司', 'sc', '四川', '甘孜', '甘孜州分公司', '甘孜州分公司', null, '1', '公司', '1', '一级部门', null, null, null, null, null, null, null, null, '216', '0', '正常状态', '00380000000000000000000000000000', '四川有限公司', 'UGORG', '上市审批组织', null, null, null, '325968', '303840', '中国移动通信集团四川有限公司甘孜分公司', null, null, '0', '新增/修改', null, null, null, null, '2018-11-26T17:15:38', null, null, null, null, null, null);

insert into wfp_af_organization (ORG_CODE, PRI_KEY, ORG_ID, HR_ORG_CODE, ORG_NAME, COMPANY_CODE, COMPANY_NAME, CITY, ORG_SHORT_NAME, ERPORG_SHORT_NAME, ORG_DESCRIPTION, ORG_STYLECODE, ORG_STYLE, ORG_LEVEL_CODE, ORG_LEVEL, SUPERVISOR_LEADER, MAIN_PRINCIPAL, MANAGER, MANAGER_ORG_ID, POSTAL_ADDRESS, POSTAL_CODE, TELEPHONE_NUMBER, FAX_NUMBER, DISPLAY_ORDER, ORG_STATUS_CODE, ORG_STATUS, PARENT_ORG_CODE, PARENT_ORG_NAME, CLASSIFY_CODE, CLASSIFY_NAME, DEPARTMENT_MANAGER, BUSINESS_DUTY_CODE, BUSINESS_DUTY, MAP_ID, COMPANY_CCODE, COMPANY_DESP, CST_CODE, CDT_DESP, OPERATION_TYPE_CODE, OPERATION_TYPE, ASSISTANT_PRINCIPALS, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values ('00380000000000000000000000000000', '348091_297', '348091', null, '四川有限公司', 'sc', '四川', '本部', '四川有限公司', '四川有限公司', null, '1', '公司', '1', '一级部门', null, null, null, null, null, null, null, null, '1024', '0', '正常状态', '00000000000000000000', '中国移动集团有限公司', 'UGORG', '上市审批组织', null, null, null, '348091', '303810', '中国移动通信集团四川有限公司', null, null, '0', '新增/修改', null, null, null, null, '2018-11-26T17:15:36', null, null, null, null, null, null);

insert into wfp_af_organization (ORG_CODE, PRI_KEY, ORG_ID, HR_ORG_CODE, ORG_NAME, COMPANY_CODE, COMPANY_NAME, CITY, ORG_SHORT_NAME, ERPORG_SHORT_NAME, ORG_DESCRIPTION, ORG_STYLECODE, ORG_STYLE, ORG_LEVEL_CODE, ORG_LEVEL, SUPERVISOR_LEADER, MAIN_PRINCIPAL, MANAGER, MANAGER_ORG_ID, POSTAL_ADDRESS, POSTAL_CODE, TELEPHONE_NUMBER, FAX_NUMBER, DISPLAY_ORDER, ORG_STATUS_CODE, ORG_STATUS, PARENT_ORG_CODE, PARENT_ORG_NAME, CLASSIFY_CODE, CLASSIFY_NAME, DEPARTMENT_MANAGER, BUSINESS_DUTY_CODE, BUSINESS_DUTY, MAP_ID, COMPANY_CCODE, COMPANY_DESP, CST_CODE, CDT_DESP, OPERATION_TYPE_CODE, OPERATION_TYPE, ASSISTANT_PRINCIPALS, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values ('00380049001100000000000000000000', '327908_205', '327908', '38406700', '甘孜州分公司\纪检监察室', 'sc', '四川', '甘孜', '纪检监察室', '甘孜州分公司\纪检监察室', null, '2', '部门', '2', '二级部门', null, 'lizemin@sc.cmcc', null, null, null, null, null, null, '10', '0', '正常状态', '00380049000000000000000000000000', '甘孜州分公司', 'UGORG', '上市审批组织', null, null, null, '327908', '303840', '中国移动通信集团四川有限公司甘孜分公司', '303840014000', '四川甘孜分公司纪检监察室', '0', '新增/修改', null, null, null, null, '2018-11-26T17:15:36', null, null, null, null, null, null);

insert into wfp_af_organization (ORG_CODE, PRI_KEY, ORG_ID, HR_ORG_CODE, ORG_NAME, COMPANY_CODE, COMPANY_NAME, CITY, ORG_SHORT_NAME, ERPORG_SHORT_NAME, ORG_DESCRIPTION, ORG_STYLECODE, ORG_STYLE, ORG_LEVEL_CODE, ORG_LEVEL, SUPERVISOR_LEADER, MAIN_PRINCIPAL, MANAGER, MANAGER_ORG_ID, POSTAL_ADDRESS, POSTAL_CODE, TELEPHONE_NUMBER, FAX_NUMBER, DISPLAY_ORDER, ORG_STATUS_CODE, ORG_STATUS, PARENT_ORG_CODE, PARENT_ORG_NAME, CLASSIFY_CODE, CLASSIFY_NAME, DEPARTMENT_MANAGER, BUSINESS_DUTY_CODE, BUSINESS_DUTY, MAP_ID, COMPANY_CCODE, COMPANY_DESP, CST_CODE, CDT_DESP, OPERATION_TYPE_CODE, OPERATION_TYPE, ASSISTANT_PRINCIPALS, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values ('00230029000000000000T', '316381_441', '316381', '23290000', '江苏\盐城分公司(TD)', 'js', '江苏', '盐城', '盐城分公司', '江苏\盐城分公司(TD)', null, '1', '公司', '2', '二级部门', null, null, null, null, null, null, null, null, '680', '0', '正常状态', '00230000000000000000T', '江苏有限公司(TD)', 'TDORG', 'TD审批组织', null, null, null, null, '032329', '盐城分公司(TD)', null, null, '0', '新增/修改', null, null, null, null, '2018-11-26T17:15:36', null, null, null, null, null, null);

insert into wfp_af_organization (ORG_CODE, PRI_KEY, ORG_ID, HR_ORG_CODE, ORG_NAME, COMPANY_CODE, COMPANY_NAME, CITY, ORG_SHORT_NAME, ERPORG_SHORT_NAME, ORG_DESCRIPTION, ORG_STYLECODE, ORG_STYLE, ORG_LEVEL_CODE, ORG_LEVEL, SUPERVISOR_LEADER, MAIN_PRINCIPAL, MANAGER, MANAGER_ORG_ID, POSTAL_ADDRESS, POSTAL_CODE, TELEPHONE_NUMBER, FAX_NUMBER, DISPLAY_ORDER, ORG_STATUS_CODE, ORG_STATUS, PARENT_ORG_CODE, PARENT_ORG_NAME, CLASSIFY_CODE, CLASSIFY_NAME, DEPARTMENT_MANAGER, BUSINESS_DUTY_CODE, BUSINESS_DUTY, MAP_ID, COMPANY_CCODE, COMPANY_DESP, CST_CODE, CDT_DESP, OPERATION_TYPE_CODE, OPERATION_TYPE, ASSISTANT_PRINCIPALS, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values ('00230032005500000000T', '316101_301', '316101', '23325500', '江苏\泰州\财务部(TD)', 'js', '江苏', '泰州', '财务部', '江苏\泰州\财务部(TD)', null, '2', '部门', '3', '三级部门', null, 'liugx@js.cmcc', null, null, null, null, null, null, '040', '0', '正常状态', '00230032000000000000T', '江苏\泰州分公司(TD)', 'TDORG', 'TD审批组织', null, null, null, null, '032332', '泰州分公司(TD)', '032332019000', '泰州财务部', '0', '新增/修改', null, null, null, null, '2018-11-26T17:15:36', null, null, null, null, null, null);

insert into wfp_af_organization (ORG_CODE, PRI_KEY, ORG_ID, HR_ORG_CODE, ORG_NAME, COMPANY_CODE, COMPANY_NAME, CITY, ORG_SHORT_NAME, ERPORG_SHORT_NAME, ORG_DESCRIPTION, ORG_STYLECODE, ORG_STYLE, ORG_LEVEL_CODE, ORG_LEVEL, SUPERVISOR_LEADER, MAIN_PRINCIPAL, MANAGER, MANAGER_ORG_ID, POSTAL_ADDRESS, POSTAL_CODE, TELEPHONE_NUMBER, FAX_NUMBER, DISPLAY_ORDER, ORG_STATUS_CODE, ORG_STATUS, PARENT_ORG_CODE, PARENT_ORG_NAME, CLASSIFY_CODE, CLASSIFY_NAME, DEPARTMENT_MANAGER, BUSINESS_DUTY_CODE, BUSINESS_DUTY, MAP_ID, COMPANY_CCODE, COMPANY_DESP, CST_CODE, CDT_DESP, OPERATION_TYPE_CODE, OPERATION_TYPE, ASSISTANT_PRINCIPALS, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values ('00380049000000000000000000000000T', '325970_236', '325970', '38400000', '甘孜州分公司(TD)', 'sc', '四川', '甘孜', '甘孜州分公司', '甘孜州分公司(TD)', null, '1', '公司', '1', '一级部门', null, null, null, null, null, null, null, null, '216', '0', '正常状态', '00380000000000000000000000000000T', '四川有限公司(TD)', 'TDORG', 'TD审批组织', null, null, null, null, '033840', '甘孜分公司(TD)', null, null, '0', '新增/修改', null, null, null, null, '2018-11-26T17:15:38', null, null, null, null, null, null);

insert into wfp_af_organization (ORG_CODE, PRI_KEY, ORG_ID, HR_ORG_CODE, ORG_NAME, COMPANY_CODE, COMPANY_NAME, CITY, ORG_SHORT_NAME, ERPORG_SHORT_NAME, ORG_DESCRIPTION, ORG_STYLECODE, ORG_STYLE, ORG_LEVEL_CODE, ORG_LEVEL, SUPERVISOR_LEADER, MAIN_PRINCIPAL, MANAGER, MANAGER_ORG_ID, POSTAL_ADDRESS, POSTAL_CODE, TELEPHONE_NUMBER, FAX_NUMBER, DISPLAY_ORDER, ORG_STATUS_CODE, ORG_STATUS, PARENT_ORG_CODE, PARENT_ORG_NAME, CLASSIFY_CODE, CLASSIFY_NAME, DEPARTMENT_MANAGER, BUSINESS_DUTY_CODE, BUSINESS_DUTY, MAP_ID, COMPANY_CCODE, COMPANY_DESP, CST_CODE, CDT_DESP, OPERATION_TYPE_CODE, OPERATION_TYPE, ASSISTANT_PRINCIPALS, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values ('00380049000000000000000000000000', '325968_235', '325968', '38400000', '甘孜州分公司', 'sc', '四川', '甘孜', '甘孜州分公司', '甘孜州分公司', null, '1', '公司', '1', '一级部门', null, null, null, null, null, null, null, null, '216', '0', '正常状态', '00380000000000000000000000000000', '四川有限公司', 'UGORG', '上市审批组织', null, null, null, '325968', '303840', '中国移动通信集团四川有限公司甘孜分公司', null, null, '0', '新增/修改', null, null, null, null, '2018-11-26T17:15:38', null, null, null, null, null, null);

insert into wfp_af_organization (ORG_CODE, PRI_KEY, ORG_ID, HR_ORG_CODE, ORG_NAME, COMPANY_CODE, COMPANY_NAME, CITY, ORG_SHORT_NAME, ERPORG_SHORT_NAME, ORG_DESCRIPTION, ORG_STYLECODE, ORG_STYLE, ORG_LEVEL_CODE, ORG_LEVEL, SUPERVISOR_LEADER, MAIN_PRINCIPAL, MANAGER, MANAGER_ORG_ID, POSTAL_ADDRESS, POSTAL_CODE, TELEPHONE_NUMBER, FAX_NUMBER, DISPLAY_ORDER, ORG_STATUS_CODE, ORG_STATUS, PARENT_ORG_CODE, PARENT_ORG_NAME, CLASSIFY_CODE, CLASSIFY_NAME, DEPARTMENT_MANAGER, BUSINESS_DUTY_CODE, BUSINESS_DUTY, MAP_ID, COMPANY_CCODE, COMPANY_DESP, CST_CODE, CDT_DESP, OPERATION_TYPE_CODE, OPERATION_TYPE, ASSISTANT_PRINCIPALS, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values ('00230033005500000000T', '316829_665', '316829', '23335500', '江苏\宿迁\计划财务部(TD)', 'js', '江苏', '宿迁', '计划财务部', '江苏\宿迁\计划财务部(TD)', null, '2', '部门', '3', '三级部门', null, 'tianmingxiao@js.cmcc', null, null, null, null, null, null, '080', '0', '正常状态', '00230033000000000000T', '江苏\宿迁分公司(TD)', 'TDORG', 'TD审批组织', null, null, null, null, '032333', '宿迁分公司(TD)', '032333005000', '宿迁计划财务部', '0', '新增/修改', null, null, null, null, '2018-11-26T17:15:38', null, null, null, null, null, null);

insert into wfp_af_organization (ORG_CODE, PRI_KEY, ORG_ID, HR_ORG_CODE, ORG_NAME, COMPANY_CODE, COMPANY_NAME, CITY, ORG_SHORT_NAME, ERPORG_SHORT_NAME, ORG_DESCRIPTION, ORG_STYLECODE, ORG_STYLE, ORG_LEVEL_CODE, ORG_LEVEL, SUPERVISOR_LEADER, MAIN_PRINCIPAL, MANAGER, MANAGER_ORG_ID, POSTAL_ADDRESS, POSTAL_CODE, TELEPHONE_NUMBER, FAX_NUMBER, DISPLAY_ORDER, ORG_STATUS_CODE, ORG_STATUS, PARENT_ORG_CODE, PARENT_ORG_NAME, CLASSIFY_CODE, CLASSIFY_NAME, DEPARTMENT_MANAGER, BUSINESS_DUTY_CODE, BUSINESS_DUTY, MAP_ID, COMPANY_CCODE, COMPANY_DESP, CST_CODE, CDT_DESP, OPERATION_TYPE_CODE, OPERATION_TYPE, ASSISTANT_PRINCIPALS, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values ('00230032000000000000T', '316085_293', '316085', '23320000', '江苏\泰州分公司(TD)', 'js', '江苏', '泰州', '泰州分公司', '江苏\泰州分公司(TD)', null, '1', '公司', '2', '二级部门', null, null, null, null, null, null, null, null, '640', '0', '正常状态', '00230000000000000000T', '江苏有限公司(TD)', 'TDORG', 'TD审批组织', null, null, null, null, '032332', '泰州分公司(TD)', null, null, '0', '新增/修改', null, null, null, null, '2018-11-26T17:15:37', null, null, null, null, null, null);

insert into wfp_af_organization (ORG_CODE, PRI_KEY, ORG_ID, HR_ORG_CODE, ORG_NAME, COMPANY_CODE, COMPANY_NAME, CITY, ORG_SHORT_NAME, ERPORG_SHORT_NAME, ORG_DESCRIPTION, ORG_STYLECODE, ORG_STYLE, ORG_LEVEL_CODE, ORG_LEVEL, SUPERVISOR_LEADER, MAIN_PRINCIPAL, MANAGER, MANAGER_ORG_ID, POSTAL_ADDRESS, POSTAL_CODE, TELEPHONE_NUMBER, FAX_NUMBER, DISPLAY_ORDER, ORG_STATUS_CODE, ORG_STATUS, PARENT_ORG_CODE, PARENT_ORG_NAME, CLASSIFY_CODE, CLASSIFY_NAME, DEPARTMENT_MANAGER, BUSINESS_DUTY_CODE, BUSINESS_DUTY, MAP_ID, COMPANY_CCODE, COMPANY_DESP, CST_CODE, CDT_DESP, OPERATION_TYPE_CODE, OPERATION_TYPE, ASSISTANT_PRINCIPALS, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values ('00230029005500000000T', '316401_451', '316401', '23295500', '江苏\盐城\计划财务部(TD)', 'js', '江苏', '盐城', '计划财务部', '江苏\盐城\计划财务部(TD)', null, '2', '部门', '3', '三级部门', null, null, null, null, null, null, null, null, '040', '0', '正常状态', '00230029000000000000T', '江苏\盐城分公司(TD)', 'TDORG', 'TD审批组织', null, null, null, null, '032329', '盐城分公司(TD)', '032329023000', '盐城计划财务部', '0', '新增/修改', null, null, null, null, '2018-11-26T17:15:35', null, null, null, null, null, null);

insert into wfp_af_organization (ORG_CODE, PRI_KEY, ORG_ID, HR_ORG_CODE, ORG_NAME, COMPANY_CODE, COMPANY_NAME, CITY, ORG_SHORT_NAME, ERPORG_SHORT_NAME, ORG_DESCRIPTION, ORG_STYLECODE, ORG_STYLE, ORG_LEVEL_CODE, ORG_LEVEL, SUPERVISOR_LEADER, MAIN_PRINCIPAL, MANAGER, MANAGER_ORG_ID, POSTAL_ADDRESS, POSTAL_CODE, TELEPHONE_NUMBER, FAX_NUMBER, DISPLAY_ORDER, ORG_STATUS_CODE, ORG_STATUS, PARENT_ORG_CODE, PARENT_ORG_NAME, CLASSIFY_CODE, CLASSIFY_NAME, DEPARTMENT_MANAGER, BUSINESS_DUTY_CODE, BUSINESS_DUTY, MAP_ID, COMPANY_CCODE, COMPANY_DESP, CST_CODE, CDT_DESP, OPERATION_TYPE_CODE, OPERATION_TYPE, ASSISTANT_PRINCIPALS, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values ('00230032005500000000T', '316101_301', '316101', '23325500', '江苏\泰州\财务部(TD)', 'js', '江苏', '泰州', '财务部', '江苏\泰州\财务部(TD)', null, '2', '部门', '3', '三级部门', null, 'liugx@js.cmcc', null, null, null, null, null, null, '040', '0', '正常状态', '00230032000000000000T', '江苏\泰州分公司(TD)', 'TDORG', 'TD审批组织', null, null, null, null, '032332', '泰州分公司(TD)', '032332019000', '泰州财务部', '0', '新增/修改', null, null, null, null, '2018-11-26T17:15:36', null, null, null, null, null, null);

insert into wfp_af_organization (ORG_CODE, PRI_KEY, ORG_ID, HR_ORG_CODE, ORG_NAME, COMPANY_CODE, COMPANY_NAME, CITY, ORG_SHORT_NAME, ERPORG_SHORT_NAME, ORG_DESCRIPTION, ORG_STYLECODE, ORG_STYLE, ORG_LEVEL_CODE, ORG_LEVEL, SUPERVISOR_LEADER, MAIN_PRINCIPAL, MANAGER, MANAGER_ORG_ID, POSTAL_ADDRESS, POSTAL_CODE, TELEPHONE_NUMBER, FAX_NUMBER, DISPLAY_ORDER, ORG_STATUS_CODE, ORG_STATUS, PARENT_ORG_CODE, PARENT_ORG_NAME, CLASSIFY_CODE, CLASSIFY_NAME, DEPARTMENT_MANAGER, BUSINESS_DUTY_CODE, BUSINESS_DUTY, MAP_ID, COMPANY_CCODE, COMPANY_DESP, CST_CODE, CDT_DESP, OPERATION_TYPE_CODE, OPERATION_TYPE, ASSISTANT_PRINCIPALS, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values ('00230032005500100000T', '318897_699', '318897', null, '江苏\泰州\财务部\预算核算组(TD)', 'js', '江苏', '泰州', '预算核算组', '江苏\泰州\财务部\预算核算组(TD)', null, '2', '部门', '4', '四级部门', 'liugx@js.cmcc', 'xuexm@js.cmcc', null, null, null, null, null, null, '350', '0', '正常状态', '00230032005500000000T', '江苏\泰州\财务部(TD)', 'TDORG', 'TD审批组织', null, null, null, null, '032332', '泰州分公司(TD)', '032332019000', '泰州财务部', '0', '新增/修改', null, null, null, null, '2018-11-26T14:19:12', null, null, null, null, null, null);

insert into wfp_af_organization (ORG_CODE, PRI_KEY, ORG_ID, HR_ORG_CODE, ORG_NAME, COMPANY_CODE, COMPANY_NAME, CITY, ORG_SHORT_NAME, ERPORG_SHORT_NAME, ORG_DESCRIPTION, ORG_STYLECODE, ORG_STYLE, ORG_LEVEL_CODE, ORG_LEVEL, SUPERVISOR_LEADER, MAIN_PRINCIPAL, MANAGER, MANAGER_ORG_ID, POSTAL_ADDRESS, POSTAL_CODE, TELEPHONE_NUMBER, FAX_NUMBER, DISPLAY_ORDER, ORG_STATUS_CODE, ORG_STATUS, PARENT_ORG_CODE, PARENT_ORG_NAME, CLASSIFY_CODE, CLASSIFY_NAME, DEPARTMENT_MANAGER, BUSINESS_DUTY_CODE, BUSINESS_DUTY, MAP_ID, COMPANY_CCODE, COMPANY_DESP, CST_CODE, CDT_DESP, OPERATION_TYPE_CODE, OPERATION_TYPE, ASSISTANT_PRINCIPALS, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values ('00230033005501200000T', '314669_585', '314669', null, '江苏\宿迁\计划财务部\核算管理组(TD)', 'js', '江苏', null, '核算管理组', '江苏\宿迁\计划财务部\核算管理组(TD)', null, '2', '部门', '4', '四级部门', 'tianmingxiao@js.cmcc', null, null, null, null, null, null, null, '320', '0', '正常状态', '00230033005500000000T', '江苏\宿迁\计划财务部(TD)', 'TDORG', 'TD审批组织', null, null, null, null, '032333', '宿迁分公司(TD)', '032333005000', '宿迁计划财务部', '0', '新增/修改', null, null, null, null, '2018-11-26T14:19:07', null, null, null, null, null, null);

insert into wfp_af_organization (ORG_CODE, PRI_KEY, ORG_ID, HR_ORG_CODE, ORG_NAME, COMPANY_CODE, COMPANY_NAME, CITY, ORG_SHORT_NAME, ERPORG_SHORT_NAME, ORG_DESCRIPTION, ORG_STYLECODE, ORG_STYLE, ORG_LEVEL_CODE, ORG_LEVEL, SUPERVISOR_LEADER, MAIN_PRINCIPAL, MANAGER, MANAGER_ORG_ID, POSTAL_ADDRESS, POSTAL_CODE, TELEPHONE_NUMBER, FAX_NUMBER, DISPLAY_ORDER, ORG_STATUS_CODE, ORG_STATUS, PARENT_ORG_CODE, PARENT_ORG_NAME, CLASSIFY_CODE, CLASSIFY_NAME, DEPARTMENT_MANAGER, BUSINESS_DUTY_CODE, BUSINESS_DUTY, MAP_ID, COMPANY_CCODE, COMPANY_DESP, CST_CODE, CDT_DESP, OPERATION_TYPE_CODE, OPERATION_TYPE, ASSISTANT_PRINCIPALS, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values ('00380049001100030000000000000000', '338416_459', '338416', null, '纪委委员', 'sc', '四川', '甘孜', '纪委委员', '纪委委员', null, '2', '部门', '2', '二级部门', 'lizemin@sc.cmcc', 'xiaoli@sc.cmcc', null, null, null, null, null, null, '00', '0', '正常状态', '00380049001100000000000000000000', '甘孜州分公司\纪检监察室', 'UGORG', '上市审批组织', null, null, null, '338416', '303840', '中国移动通信集团四川有限公司甘孜分公司', '303840014000', '四川甘孜分公司纪检监察室', '0', '新增/修改', null, null, null, null, '2018-11-26T14:35:20', null, null, null, null, null, null);

insert into wfp_af_organization (ORG_CODE, PRI_KEY, ORG_ID, HR_ORG_CODE, ORG_NAME, COMPANY_CODE, COMPANY_NAME, CITY, ORG_SHORT_NAME, ERPORG_SHORT_NAME, ORG_DESCRIPTION, ORG_STYLECODE, ORG_STYLE, ORG_LEVEL_CODE, ORG_LEVEL, SUPERVISOR_LEADER, MAIN_PRINCIPAL, MANAGER, MANAGER_ORG_ID, POSTAL_ADDRESS, POSTAL_CODE, TELEPHONE_NUMBER, FAX_NUMBER, DISPLAY_ORDER, ORG_STATUS_CODE, ORG_STATUS, PARENT_ORG_CODE, PARENT_ORG_NAME, CLASSIFY_CODE, CLASSIFY_NAME, DEPARTMENT_MANAGER, BUSINESS_DUTY_CODE, BUSINESS_DUTY, MAP_ID, COMPANY_CCODE, COMPANY_DESP, CST_CODE, CDT_DESP, OPERATION_TYPE_CODE, OPERATION_TYPE, ASSISTANT_PRINCIPALS, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values ('00380049001200000000000000000000', '327912_207', '327912', '38406800', '甘孜州分公司\工会', 'sc', '四川', '甘孜', '工会', '甘孜州分公司\工会', null, '2', '部门', '2', '二级部门', null, 'zhongguoxiang@sc.cmcc', null, null, null, null, null, null, '11', '0', '正常状态', '00380049000000000000000000000000', '甘孜州分公司', 'UGORG', '上市审批组织', null, null, null, '327912', '303840', '中国移动通信集团四川有限公司甘孜分公司', '303840016000', '四川甘孜分公司工会', '0', '新增/修改', null, null, null, null, '2018-11-26T17:15:37', null, null, null, null, null, null);

insert into wfp_af_organization (ORG_CODE, PRI_KEY, ORG_ID, HR_ORG_CODE, ORG_NAME, COMPANY_CODE, COMPANY_NAME, CITY, ORG_SHORT_NAME, ERPORG_SHORT_NAME, ORG_DESCRIPTION, ORG_STYLECODE, ORG_STYLE, ORG_LEVEL_CODE, ORG_LEVEL, SUPERVISOR_LEADER, MAIN_PRINCIPAL, MANAGER, MANAGER_ORG_ID, POSTAL_ADDRESS, POSTAL_CODE, TELEPHONE_NUMBER, FAX_NUMBER, DISPLAY_ORDER, ORG_STATUS_CODE, ORG_STATUS, PARENT_ORG_CODE, PARENT_ORG_NAME, CLASSIFY_CODE, CLASSIFY_NAME, DEPARTMENT_MANAGER, BUSINESS_DUTY_CODE, BUSINESS_DUTY, MAP_ID, COMPANY_CCODE, COMPANY_DESP, CST_CODE, CDT_DESP, OPERATION_TYPE_CODE, OPERATION_TYPE, ASSISTANT_PRINCIPALS, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5)
values ('00380049001200000000000000000000T', '327914_208', '327914', '38406800', '甘孜州分公司\工会(TD)', 'sc', '四川', '甘孜', '工会', '甘孜州分公司\工会(TD)', null, '2', '部门', '2', '二级部门', null, 'zhongguoxiang@sc.cmcc', null, null, null, null, null, null, '11', '0', '正常状态', '00380049000000000000000000000000T', '甘孜州分公司(TD)', 'TDORG', 'TD审批组织', null, null, null, null, null, null, null, null, '0', '新增/修改', null, null, null, null, '2018-11-26T17:15:37', null, null, null, null, null, null);

commit;
select * from WFP_AF_ORGANIZATION

--cap_user
insert into cap_user (OPERATOR_ID, TENANT_ID, USER_ID, PASSWORD, INVALDATE, USER_NAME, AUTHMODE, STATUS, UNLOCKTIME, MENUTYPE, LASTLOGIN, ERRCOUNT, STARTDATE, ENDDATE, VALIDTIME, MACCODE, IPADDRESS, EMAIL, CREATEUSER, CREATETIME)
values (1001, 'default', 'jishu@js.cmcc', 'k2xvHUmCHWw=', null, '吉舒', 'local', '1', sysdate, 'default', sysdate, null, to_date('27-03-2019', 'dd-mm-yyyy'), null, '', '', '', '', 'sysadmin', sysdate);

insert into cap_user (OPERATOR_ID, TENANT_ID, USER_ID, PASSWORD, INVALDATE, USER_NAME, AUTHMODE, STATUS, UNLOCKTIME, MENUTYPE, LASTLOGIN, ERRCOUNT, STARTDATE, ENDDATE, VALIDTIME, MACCODE, IPADDRESS, EMAIL, CREATEUSER, CREATETIME)
values (1002, 'default', 'wangpeng@js.cmcc', 'k2xvHUmCHWw=', null, '王鹏', 'local', '1', sysdate, 'default', sysdate, null, to_date('27-03-2019', 'dd-mm-yyyy'), null, '', '', '', '', 'sysadmin', sysdate);

insert into cap_user (OPERATOR_ID, TENANT_ID, USER_ID, PASSWORD, INVALDATE, USER_NAME, AUTHMODE, STATUS, UNLOCKTIME, MENUTYPE, LASTLOGIN, ERRCOUNT, STARTDATE, ENDDATE, VALIDTIME, MACCODE, IPADDRESS, EMAIL, CREATEUSER, CREATETIME)
values (1021, 'default', 'tanghua@js.cmcc', 'k2xvHUmCHWw=', null, '唐华', 'local', '1', sysdate, 'default', sysdate, null, to_date('28-03-2019', 'dd-mm-yyyy'), null, '', '', '', '', 'sysadmin', sysdate);

insert into cap_user (OPERATOR_ID, TENANT_ID, USER_ID, PASSWORD, INVALDATE, USER_NAME, AUTHMODE, STATUS, UNLOCKTIME, MENUTYPE, LASTLOGIN, ERRCOUNT, STARTDATE, ENDDATE, VALIDTIME, MACCODE, IPADDRESS, EMAIL, CREATEUSER, CREATETIME)
values (1022, 'default', 'zhangqinglian@js.cmcc', 'k2xvHUmCHWw=', null, '张青莲', 'local', '1', sysdate, 'default', sysdate, null, to_date('28-03-2019', 'dd-mm-yyyy'), null, '', '', '', '', 'sysadmin', sysdate);



commit;

