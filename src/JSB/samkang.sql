alter table 제품 add constraint primary key (제품번호);
alter table 주문항목 add constraint primary key (주문번호,제품번호);
alter table 주문항목 add constraint foreign key (제품번호) references 제품(제품번호);
alter table 운송 add constraint primary key (운송ID);
alter table 직원 add constraint primary key (인사번호);
alter table 주문 add constraint primary key (주문번호);
alter table 고객 add constraint primary key (고객번호);
alter table 주문항목 add constraint foreign key (주문번호) references 주문(주문번호);
alter table 운송 add constraint foreign key (주문번호) references 주문(주문번호);
alter table 주문 add constraint foreign key (인사번호) references 직원(인사번호);
alter table 주문 add constraint foreign key (고객번호) references 고객(고객번호);

-- 고객-주문-주문항목-제품 inner join
select * from 고객 c join 주문 o using (고객번호) join 주문항목 d using (주문번호)
join 제품 p using (제품번호);

create view CODP as
    select * from 고객 c join 주문 o using (고객번호) join 주문항목 d using (주문번호)
                   join 제품 p using (제품번호);

select * from CODP;

-- 운송-주문-직원 inner join
select * from 운송 s join 주문 o using (주문번호) join 직원 e using (인사번호);

create view SOE as select * from 운송 s join 주문 o using (주문번호) join 직원 e using (인사번호);

select * from SOE;