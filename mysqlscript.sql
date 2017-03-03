use hibnatedb;
create table interest (
bankId INT(10) unsigned not null,
userId INT(10) unsigned not null,
rate float(4,2)
);

drop table interest; commit;
insert into interest values( 5, 15, 2.5);
insert into interest values( 5, 16, 2.3);