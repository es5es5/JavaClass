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

-- �޴�(�̸�, ����)
create table feb06_kwon_menu(
	m_name varchar2(10 char) primary key,
	m_price number(5) not null
);

-- ������(���, ������)
create table feb06_kwon_from(
	f_name varchar2(10 char) primary key,
	f_where varchar2(10 char) not null
);

-- ���� �޴��� ���� ��� ����ִ���
create table feb06_kwon_include(
	i_no number(3) primary key,
	m_name varchar2(10 char) not null,   -- �޴���
	j_name varchar2(10 char) not null    -- ����
);

create sequence feb06_kwon_include_seq;

insert into feb06_kwon_include values(feb06_kwon_include_seq.nextval, '������', '��');
select * from feb06_kwon_from;

-- �Ұ���� ������
select f_where
from feb06_kwon_from
where f_name = '�Ұ��';

-- 1. �ʿ��� ������ � ���̺� �ֳ�
-- 2. ���� ����� ���� ������ subquery/join
-- 3. subquery�� ����� ������ ������ �ȵ� => join

-- 7000��¥�� �޴��� ���� : subquery
select j_name
from feb06_kwon_include
where m_name = (
	select m_name
	from feb06_kwon_menu
	where m_price = 7000
);

-- 3000�� �̻��� �޴��� ���� : subquery => join
--select j_name from feb06_kwon_include
--where m_name = (
--	select m_name
--	from feb06_kwon_menu
--	where m_price >= 3000
--);
select j_name
from feb06_kwon_menu, feb06_kwon_include
where feb06_kwon_menu.m_name = feb06_kwon_include.m_name
	and m_price >= 3000;

-- 7000��¥�� �޴��� ����, �޴���, ���� : join
select feb06_kwon_menu.m_name, m_price, j_name
from feb06_kwon_menu, feb06_kwon_include
where feb06_kwon_menu.m_name = feb06_kwon_include.m_name
	and m_price = 7000;
	
select m_name from feb06_kwon_include
where j_name = (
	select f_name
	from feb06_kwon_from
	where f_where = '�ѱ�'
);
	
-- ���������� ��� ���
select j_name from feb06_kwon_include where m_name = '��������';

-- �ѱ��� ��� �� �޴���(subquery => join)
select m_name from feb06_kwon_include, feb06_kwon_from
where j_name = f_name
	and f_where = '�ѱ�';

-- ���� ��� �޴��� ��� ���(subquery => join)
select j_name from feb06_kwon_menu, feb06_kwon_include
where feb06_kwon_menu.m_name = feb06_kwon_include.m_name
	and m_price = (
		select max(m_price)
		from feb06_kwon_menu
);
-- ���������� ���, ������ ���(subquery => join)
select f_name, f_where from feb06_kwon_from, feb06_kwon_include
where f_name = j_name and m_name = '��������';

-- ���� �� �޴��� ���, ������ ���
select f_name, f_where
from feb06_kwon_menu, feb06_kwon_from, feb06_kwon_include
where feb06_kwon_menu.m_name = feb06_kwon_include.m_name 
	and f_name = j_name
	and m_price = (
		select min(m_price)
		from feb06_kwon_menu
);

-- �̱��� ��� �� �޴���, ���� ���(subquery => join)
select feb06_kwon_menu.m_name, m_price
from feb06_kwon_menu, feb06_kwon_include, feb06_kwon_from
where feb06_kwon_menu.m_name = feb06_kwon_include.m_name 
	and j_name = f_name
	and f_where = '�̱�';

--------------------------------------------------------------------

create table feb06_product(
	p_no number(3) primary key,
	p_name varchar2(10 char) not null,
	p_price number(7) not null
);
create sequence feb06_product_seq;

create table feb06_shop(
	s_no number(3) primary key,
	s_floor number(3) not null,
	s_name varchar2(10 char) not null,
	s_size number(3) not null
);
create sequence feb06_shop_seq;

create table feb06_where(
	w_no number(3) primary key,
	w_p_no number(3) not null,
	w_s_no number(3) not null
);
create sequence feb06_where_seq;

-- ��ǰ�� �� ����
select count(p_no) from feb06_product;

-- ��ǰ ��հ�
select avg(p_price) from feb06_product;

-- ���� ��� ��ǰ �̸�
select p_name
from feb06_product
where p_price = (
	select max(p_price)
	from feb06_product
);

-- 10000��¥�� �����̽� ����� �������� �����ϳ�
select s_floor
from feb06_product, feb06_where, feb06_shop
where p_no = w_p_no and w_s_no = s_no 
	and p_price = 10000 and p_name = '�����̽�';

-- ���� �� ��ǰ�� ���� ���忡�� �ĳ�
select s_name
from feb06_product, feb06_where, feb06_shop
where p_no = w_p_no and w_s_no = s_no
	and p_price = (
		select min(p_price)	from feb06_product
);

-- ���� ū ���忡�� �Ĵ� ��ǰ�� ��հ���
select avg(p_price)
from feb06_product, feb06_where, feb06_shop
where p_no = w_p_no and w_s_no = s_no
	and s_size = (
		select max(s_size) from feb06_shop	
);

-- �������忡�� �Ĵ� ��ǰ��, ������ ���ݼ����� ����
select p_name, p_price
from feb06_product, feb06_where, feb06_shop
where p_no = w_p_no and w_s_no = s_no
	and s_name='����'
order by p_price;
	
-- ��ü ��ǰ��, ������ �̸� ������������ ����
select p_name, p_price
from feb06_product
order by p_name;

-- ��ü ��ǰ��, ������ �̸� ������������ ����
select p_name, p_price
from feb06_product
order by p_name desc;

-- ��ü ��ǰ��, ������ �̸� ������������ ����, �̸��� ������ ���� ��������
select p_name, p_price
from feb06_product
order by p_name, p_price desc;

-- ������ 150������ �����ϱ�
update feb06_product
set p_price = 150
where p_name = '����';
-- p_price *= 1.3�� �ȵ�
-- �����̽� ���� 30% �λ�
update feb06_product
set p_price = p_price * 1.3			
where p_name = '�����̽�';

-- ���� ��Ѱ� 20% ����
update feb06_product
set p_price = p_price * 0.8
where p_price = (
	select max(p_price)
	from feb06_product
);

-- �̸��� '��'���°� 1000�� �߰�
update feb06_product
set p_price = p_price + 1000
where p_name like '%��%';

-- ���� �� 10% ����
update feb06_product
set p_price = p_price * 0.9;

-- ��â�е� �����
delete from feb06_product
where p_name = '��â�е�';

-- ���� �����
delete from feb06_where
where w_p_no = (
	select p_no
	from feb06_product
	where p_name = '����'
);

delete from feb06_product
where p_name = '����';

select * from feb06_product;

