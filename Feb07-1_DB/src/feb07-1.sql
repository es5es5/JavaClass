-- drop table 테이블명 cascade constraint purge;
drop table feb07_tour cascade constraint purge;
create table feb07_tour (
	t_name varchar2(10 char) not null,
	t_phone varchar2(20 char) primary key,
	t_room number(5) not null
);

insert into feb07_tour values('홍길동', '010-1111-1111', 101);
insert into feb07_tour values('김길동', '010-2222-2222', 101);
insert into feb07_tour values('최길동', '010-3333-3333', 1101);
insert into feb07_tour values('박길동', '010-4444-4444', 201);
insert into feb07_tour values('홍길동', '010-5555-5555', 301);

drop table feb07_room cascade constraint purge;
create table feb07_room (
	r_room number(6) primary key,
	r_building varchar2(10 char) not null,
	r_floor number(4) not null
);

insert into feb07_room values(101, '본관', 1);
insert into feb07_room values(201, '본관', 2);
insert into feb07_room values(1101, '본관', 11);
insert into feb07_room values(1211, '별관', 12);
insert into feb07_room values(1311, '별관', 13);

create table feb07_spot (
	s_what varchar2(10 char) primary key,
	s_spot varchar2(10 char) not null
);

insert into FEB07_spot values('배', '인천');
insert into FEB07_spot values('버스', '고터');
insert into FEB07_spot values('기차', '서울역');
insert into FEB07_spot values('비행기', '인천');

create table feb07_damdang (
	d_no number(3) primary key,
	d_phone varchar2(15 char) not null,
	d_damdang varchar2(10 char) not null
);

create sequence feb07_damdang_seq;
select * from feb07_damdang;
drop table feb07_damdang cascade constraint purge;
insert into feb07_damdang values(feb07_damdang_seq.nextval, '010-1111-1111', '비행기');
insert into feb07_damdang values(feb07_damdang_seq.nextval, '010-6666-6666', '비행기');
insert into feb07_damdang values(feb07_damdang_seq.nextval, '010-6666-6666', '배');
insert into feb07_damdang values(feb07_damdang_seq.nextval, '010-6666-6666', '버스');
insert into feb07_damdang values(feb07_damdang_seq.nextval, '010-6666-6666', '기차');
insert into feb07_damdang values(feb07_damdang_seq.nextval, '010-7777-7777', '기차');

insert into feb07_tour values('제갈길동', '010-6666-6666', 1311);
insert into feb07_tour values('홍길동', '010-7777-7777', 1211);
delete from feb07_tour where t_phone = '010-6666-6666';

select r_room, r_building, r_floor from feb07_room, feb07_tour where t_room=r_room and t_name='제갈길동';

select t_name, t_phone from feb07_tour,feb07_room where t_room=r_room and r_building != '본관' order by t_name;

update feb07_room
set r_building = '신관'
where r_building = '별관';

-- 1211호에 근무하는 홍길동이 담당하는
-- 교통수단명, 집결지(교통수단 가나다 순으로)

select s_what, s_spot
from feb07_tour, feb07_damdang, feb07_spot
where t_phone = d_phone and d_damdang = s_what
and t_name = '홍길동' and t_room=1211

-- 비행기에서 진짜 신발 벗어야하는지 물어보려면
-- 어디로 전화해야 하나(폰 번호 1234 순으로)

select t_phone from feb07_tour, feb07_damdang
where t_phone=d_phone and d_damdang='비행기';

-- 버스타고 여행 다녀왔더니
-- 냄새가 너무 나서 따지려면
-- 무슨 건물 몇 층 몇 호 누구한테 찾아가야 하나
-- 사람 이름 가나다 순

select t_name, r_room, r_building, r_floor
from feb07_tour, feb07_room, feb07_damdang
where t_phone = d_phone and t_room=r_room and d_damdang='버스' order by t_name;

-- 여행 출발하는 날 서울역에 갔더니
-- 담당자가 안나와있음
-- 무슨 건물 몇 층 몇 호 누구한테
-- 찾아가서 따져야 하나(낮은 층 순으로)

select t_name, r_room, r_building, r_floor
from feb07_tour, feb07_room, feb07_damdang, feb07_spot
where t_phone = d_phone and t_room=r_room and d_damdang=s_what
and s_spot='서울역' order by r_floor;

-- 제갈길동의 이름을 제갈길동(요주의 인물)로 수정
-- 문자열 붙이기 concat(a,b)
update feb07_tour
set t_name=concat(t_name, '(요주의)')
where t_name='제갈길동';

--문자열 바꾸기
-- replace(내용, 바꿀거, 바꿀내용)
update feb07_tour
set t_name = replace(t_name, '요', 'ㅂ')
where t_name ='제갈길동(요주의)';

-- 제갈길동이 근무하는 건물을 신관2로 수정

update feb07_room
set r_building = '신관2'
where r_building = (select r_building from feb07_tour, feb07_room where t_name ='제갈길동');


-- 1211호 홍길동의 전화번호
select t_phone
from feb07_tour
where t_name ='홍길동' and t_room=1211;

--1211호 홍길동이 담당하는 교통수단들 (join xxx)
select d_damdang
from feb07_damdang
where d_phone in
(select t_phone from feb07_tour where t_name = '홍길동');

-- subquery 무조건 하나만 나와야 xx
-- subquery해서 여러개 나오는거 다 적용해서 처리하려면 in 사용
-- update 를 subquery로 할 때 in 사용하셈


-- 1211호 홍길동이 사고를 쳐서
-- 걔가 담당하는 교통수단들은 다 서울역에서 모이는걸로

update FEB07_spot
set s_spot = '서울역'
where s_what in (
select d_damdang
from feb07_damdang
where d_phone in (
select t_phone from feb07_tour where t_name = '홍길동'
)
);

-- 본관이 아닌 곳에서 근무하는 사람들은 이름 뒤에 ㅅ 붙이는걸로

update feb07_tour
set t_name =concat(t_name, 'ㅅ')
where t_room in (select r_room from feb07_room where r_building != '본관');

-- 본관에서 근무하는 사람들이 담당하는 교통수단은 모이는 장소를 본관으로

update feb07_spot
set s_spot = '본관'
where s_what in 
(select d_damdang from feb07_damdang where d_phone in
(select t_phone from feb07_tour where t_room in 
(select r_room from feb07_room where r_building='본관'
)
)
);

select * from feb07_spot;

insert into feb07_room values(501,'본관',5);