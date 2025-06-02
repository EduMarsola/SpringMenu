create database EnxutaURL;
use EnxutaURL;
create table URLs(
	URL_ID integer not null auto_increment,
    URL_original text,
    URL_short text,
    URL_QRCode blob,
    primary key(URL_ID)
);

insert into URLs (URL_original, URL_short) values ('originalURL','compactURL');
select URL_original from URLs where URL_short = 'compactURL';
select * from URLs;
truncate table URLs;