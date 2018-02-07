-- drop table ���̺�� cascade constraint purge;
drop table feb07_tour cascade constraint purge;
create table feb07_tour (
	t_name varchar2(10 char) not null,
	t_phone varchar2(20 char) primary key,
	t_room number(5) not null
);

insert into feb07_tour values('ȫ�浿', '010-1111-1111', 101);
insert into feb07_tour values('��浿', '010-2222-2222', 101);
insert into feb07_tour values('�ֱ浿', '010-3333-3333', 1101);
insert into feb07_tour values('�ڱ浿', '010-4444-4444', 201);
insert into feb07_tour values('ȫ�浿', '010-5555-5555', 301);

drop table feb07_room cascade constraint purge;
create table feb07_room (
	r_room number(6) primary key,
	r_building varchar2(10 char) not null,
	r_floor number(4) not null
);

insert into feb07_room values(101, '����', 1);
insert into feb07_room values(201, '����', 2);
insert into feb07_room values(1101, '����', 11);
insert into feb07_room values(1211, '����', 12);
insert into feb07_room values(1311, '����', 13);

create table feb07_spot (
	s_what varchar2(10 char) primary key,
	s_spot varchar2(10 char) not null
);

insert into FEB07_spot values('��', '��õ');
insert into FEB07_spot values('����', '����');
insert into FEB07_spot values('����', '���￪');
insert into FEB07_spot values('�����', '��õ');

create table feb07_damdang (
	d_no number(3) primary key,
	d_phone varchar2(15 char) not null,
	d_damdang varchar2(10 char) not null
);

create sequence feb07_damdang_seq;
select * from feb07_damdang;
drop table feb07_damdang cascade constraint purge;
insert into feb07_damdang values(feb07_damdang_seq.nextval, '010-1111-1111', '�����');
insert into feb07_damdang values(feb07_damdang_seq.nextval, '010-6666-6666', '�����');
insert into feb07_damdang values(feb07_damdang_seq.nextval, '010-6666-6666', '��');
insert into feb07_damdang values(feb07_damdang_seq.nextval, '010-6666-6666', '����');
insert into feb07_damdang values(feb07_damdang_seq.nextval, '010-6666-6666', '����');
insert into feb07_damdang values(feb07_damdang_seq.nextval, '010-7777-7777', '����');

insert into feb07_tour values('�����浿', '010-6666-6666', 1311);
insert into feb07_tour values('ȫ�浿', '010-7777-7777', 1211);
delete from feb07_tour where t_phone = '010-6666-6666';

select r_room, r_building, r_floor from feb07_room, feb07_tour where t_room=r_room and t_name='�����浿';

select t_name, t_phone from feb07_tour,feb07_room where t_room=r_room and r_building != '����' order by t_name;

update feb07_room
set r_building = '�Ű�'
where r_building = '����';

-- 1211ȣ�� �ٹ��ϴ� ȫ�浿�� ����ϴ�
-- ������ܸ�, ������(������� ������ ������)

select s_what, s_spot
from feb07_tour, feb07_damdang, feb07_spot
where t_phone = d_phone and d_damdang = s_what
and t_name = 'ȫ�浿' and t_room=1211

-- ����⿡�� ��¥ �Ź� ������ϴ��� �������
-- ���� ��ȭ�ؾ� �ϳ�(�� ��ȣ 1234 ������)

select t_phone from feb07_tour, feb07_damdang
where t_phone=d_phone and d_damdang='�����';

-- ����Ÿ�� ���� �ٳ�Դ���
-- ������ �ʹ� ���� ��������
-- ���� �ǹ� �� �� �� ȣ �������� ã�ư��� �ϳ�
-- ��� �̸� ������ ��

select t_name, r_room, r_building, r_floor
from feb07_tour, feb07_room, feb07_damdang
where t_phone = d_phone and t_room=r_room and d_damdang='����' order by t_name;

-- ���� ����ϴ� �� ���￪�� ������
-- ����ڰ� �ȳ�������
-- ���� �ǹ� �� �� �� ȣ ��������
-- ã�ư��� ������ �ϳ�(���� �� ������)

select t_name, r_room, r_building, r_floor
from feb07_tour, feb07_room, feb07_damdang, feb07_spot
where t_phone = d_phone and t_room=r_room and d_damdang=s_what
and s_spot='���￪' order by r_floor;

-- �����浿�� �̸��� �����浿(������ �ι�)�� ����
-- ���ڿ� ���̱� concat(a,b)
update feb07_tour
set t_name=concat(t_name, '(������)')
where t_name='�����浿';

--���ڿ� �ٲٱ�
-- replace(����, �ٲܰ�, �ٲܳ���)
update feb07_tour
set t_name = replace(t_name, '��', '��')
where t_name ='�����浿(������)';

-- �����浿�� �ٹ��ϴ� �ǹ��� �Ű�2�� ����

update feb07_room
set r_building = '�Ű�2'
where r_building = (select r_building from feb07_tour, feb07_room where t_name ='�����浿');


-- 1211ȣ ȫ�浿�� ��ȭ��ȣ
select t_phone
from feb07_tour
where t_name ='ȫ�浿' and t_room=1211;

--1211ȣ ȫ�浿�� ����ϴ� ������ܵ� (join xxx)
select d_damdang
from feb07_damdang
where d_phone in
(select t_phone from feb07_tour where t_name = 'ȫ�浿');

-- subquery ������ �ϳ��� ���;� xx
-- subquery�ؼ� ������ �����°� �� �����ؼ� ó���Ϸ��� in ���
-- update �� subquery�� �� �� in ����ϼ�


-- 1211ȣ ȫ�浿�� ��� �ļ�
-- �°� ����ϴ� ������ܵ��� �� ���￪���� ���̴°ɷ�

update FEB07_spot
set s_spot = '���￪'
where s_what in (
select d_damdang
from feb07_damdang
where d_phone in (
select t_phone from feb07_tour where t_name = 'ȫ�浿'
)
);

-- ������ �ƴ� ������ �ٹ��ϴ� ������� �̸� �ڿ� �� ���̴°ɷ�

update feb07_tour
set t_name =concat(t_name, '��')
where t_room in (select r_room from feb07_room where r_building != '����');

-- �������� �ٹ��ϴ� ������� ����ϴ� ��������� ���̴� ��Ҹ� ��������

update feb07_spot
set s_spot = '����'
where s_what in 
(select d_damdang from feb07_damdang where d_phone in
(select t_phone from feb07_tour where t_room in 
(select r_room from feb07_room where r_building='����'
)
)
);

select * from feb07_spot;

insert into feb07_room values(501,'����',5);