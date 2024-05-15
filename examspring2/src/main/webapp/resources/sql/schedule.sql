drop table schedule CASCADE CONSTRAINTS;
create table schedule(
	scheduleId varchar2(15) primary key, 
	scheduleUserId varchar2(20) constraint schedule_fk references member(id),
	scheduleDay date,
	title varchar2(100),
	category varchar2(20),
	boss varchar2(50),
	place varchar2(100),
	content varchar2(20),
	state varchar2(20) default '미완료'
);

create sequence schedule_seq;

INSERT INTO SCHEDULE VALUES (1, '282djdid', '2024-04-14', '부서확장협의', '회의', null, null, null, '완료');
INSERT INTO SCHEDULE VALUES (2, '282djdid', '2024-05-14', '부서확장임원발표회', '발표', null, null, null, '미완료');
INSERT INTO SCHEDULE VALUES (3, '282djdid', '2024-06-12', '혁신지구 탐방 - 울산', '출장', null, null, null, '미완료');

commit;