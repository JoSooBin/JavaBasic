-- 성적테이블
create table sungjuk(
    sjno    int auto_increment, -- 일련번호 기본키 만들기
    name    varchar(10) not null,
     kor    int,
     eng    int,
     mat   int,
     tot    int,
     mean   decimal (5,1),
     grd    char(3),
     regdate timestamp default current_timestamp(),
     primary key(sjno)
);

-- 성적추가
insert into sungjuk(name,kor,eng,mat,tot,mean,grd)
values ('혜교',99,98,99,298,99.5,'수');

-- 성적조회
select sjno,name,kor,eng,mat,regdate from sungjuk;

-- 성적 상세조회
select * from sungjuk where sjno =1;

-- 성적수정
update sungjuk set kor=100, eng=99, mat=78
where sjno=1;

-- 성적삭제
delete from sungjuk where sjno =1;

-- 사원추가
select employee_id, last_name,email,job_id,manager_id,department_id
from employess;

-- 사원 상세조회

