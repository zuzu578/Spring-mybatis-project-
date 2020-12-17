create table SpringLogin(
    idnumber varchar2(30)not null primary key,
    userid varchar2(30) not null ,
    userpasscode varchar2(20) not null
);



create sequence idnumber start with 1;
INSERT INTO SpringLogin
VALUES(idnumber.NEXTVAL, 'lms1872', '123qwe');
select*from SpringLogin;
commit;