-- �ּ�
-- ���̺�/CRUD ���õ� SQL��, ����Ŭ ��ɾ� �ȵ�(desc FEB05_KWON_LOC;)
-- alt + s : Ŀ���� �ִ� �� �� ����
-- alt + x : ��� �����Ȱ� ����

-- drop table ���̺�� cascade constraint purge;

create table feb06_kwon_student(
	s_no number(3) primary key,
	s_name varchar2(10 char) not null,
	s_gender char(1 char) not null,
	s_birthday date not null,
	s_addr varchar2(10 char) not null,
	s_c_no number(2) not null
);

create sequence feb06_kwon_student_seq;

insert into feb06_kwon_student values(
	feb06_kwon_student_seq.nextval, 
	'�ֱ浿','��',
	to_date('1999-03-11','YYYY-MM-DD'),
	'��õ',	1
);
	
create table feb06_kwon_class(
	c_no number(2) primary key,
	c_title varchar2(10 char) not null,
	c_size number(3) not null
);

insert into feb06_kwon_class values(4, '���̺긮������', 18);

select * from feb06_kwon_student;
select * from feb06_kwon_class;

commit

-- �л� ��ü ����
select *
from feb06_kwon_student;

-- ���￡ ��� �л��� �� ��
select count(s_no)
from feb06_kwon_student
where s_addr = '����';

-- ������ ��� ������
select avg(c_size) from feb06_kwon_class;






-- ���� � �л��� ���� ���� ��� �ֳ�
select c_title 
from feb06_kwon_class 
where c_no = ( 
	select s_c_no
	from feb06_kwon_student
	where s_birthday = (
		select max(s_birthday)
		from feb06_kwon_student
	)
);

select c_title
from feb06_kwon_student, feb06_kwon_class
where s_c_no = c_no and s_birthday = (
	select max(s_birthday)
	from feb06_kwon_student
);

-- ���� ���� �����忡�� ������� �л� �̸�, �����
select s_name, c_title
from feb06_kwon_student, feb06_kwon_class
where s_c_no = c_no and c_size = (
	select min(c_size)
	from feb06_kwon_class
);




-- �޴� ���̺�(�̸�, ����)
create table f06_menu (
	m_name varchar2(10 char) primary key,
	m_price number(5) not null
);

-- ������(���, ������)
create table f06_from (
	f_name varchar2(10 char) primary key, -- ����
	f_where varchar2(10 char) not null -- ������
);

-- ���� �޴��� ���� ��� ��� �ִ��� ������ �� ���̺�(�޴���, ����)
create table f06_include(
	i_no number(3) primary key,
	m_name varchar2(10 char) not null, -- �޴���
	j_name varchar2(10 char) not null -- ����
);

create sequence f06_include_seq;

insert into f06_menu values('��������', 5000);
insert into f06_menu values('��������', 6000);
insert into f06_menu values('�Ұ�ⵤ��', 7000);
insert into f06_menu values('�Ұ����', 5000);
insert into f06_menu values('��ä���', 3000);
insert into f06_menu values('�������', 4000);

insert into f06_from values('�������', '�̱���');
insert into f06_from values('�Ұ��', 'ȣ�ֻ�');
insert into f06_from values('��', '������');

insert into f06_include values(f06_include_seq.nextval, '��������', '�������');
insert into f06_include values(f06_include_seq.nextval, '��������', '�������');
insert into f06_include values(f06_include_seq.nextval, '��������', '��');
insert into f06_include values(f06_include_seq.nextval, '�Ұ�ⵤ��', '�Ұ��');
insert into f06_include values(f06_include_seq.nextval, '�Ұ�ⵤ��', '��');
insert into f06_include values(f06_include_seq.nextval, '��ä���', '��');
insert into f06_include values(f06_include_seq.nextval, '�������', '�������');
insert into f06_include values(f06_include_seq.nextval, '�������', '��');
insert into f06_include values(f06_include_seq.nextval, '�Ұ����', '��');
insert into f06_include values(f06_include_seq.nextval, '�Ұ����', '�Ұ��');

select * from f06_menu;
select * from f06_from;
select * from f06_include;


-- ���������� ��� ���
select j_name from f06_include where m_name = '��������';

-- �ѱ��� ��� �� �޴���
select m_name from f06_from, f06_include where j_name = f_name and f_where = '������';

-- ���� ��� �޴��� ��� ���
select j_name from f06_include

-- ���������� ���, ������ ���


-- ���� �� �޴��� ���, ������ ���
select f_name, f_where
from f06_menu, f06_include, f06_from
where f06_menu.m_name = f06_include.m_name
	and j_name = f_name
	and m_price = (select min(m_price) from f06_menu
	);

-- �̱��� ��� �� �޴�, ����
select f06_menu.m_name, m_price
from f06_menu, f06_include, f06_from
where f06_menu.m_name = f06_include.m_name
	and j_name = f_name
	and f_where = '�̱�';

-- 1. �ʿ��� ������ � ���̺� �ֳ�
-- 2. ���� ����� ���� ������ sub/join
-- 3. subquery�� ����� ������ ������ �ȵ� => join���� �ϼ�..

-- 7000��¥�� �޴��� ���� by subquery
select j_name
from f06_include
where m_name = (
	select m_name
	from f06_menu
	where m_price = 7000
);

-- 7000��¥�� �޴��� ����, �޴���, ���� by Join
select f06_menu.m_name, m_price, j_name
from f06_menu, f06_include
where f06_menu.m_name = f06_include.m_name and m_price = 7000;

-- 5000�� �̻��� �޴��� ���� subquery
-- ������ ��ȣ �ӿ� �������� ������ subquery�� �Ұ���

select j_name
from f06_include
where m_name = (
	select m_name
	from f06_menu
	where m_price >= 5000
);

-- join ���� ��
select f06_menu.m_name, j_name
from f06_menu, f06_include
where f06_menu.m_name = f06_include.m_name
and m_price >=5000;
