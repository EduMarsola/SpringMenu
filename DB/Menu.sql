create database Menu;
use Menu;
create table Item(
	ItemId integer not null auto_increment,
    ItemName text,
    ItemQt integer,
    PlaceId text,
    aditionDate date,
    primary key(ItemId)
);

create table Place(
	PlaceId integer not null auto_increment,
    PlaceName text,
    aditionDate date,
    primary key(PlaceId)
);

drop table Item;
drop table Place; 

insert into Item () values ();