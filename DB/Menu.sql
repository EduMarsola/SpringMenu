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

insert into Item (ItemName, ItemQt) values ("Arroz", 10);
insert into Item (ItemName, ItemQt, PlaceId) values ("Banana", 70, 1);
insert into Item (ItemName, PlaceId) values ("sorvete", select PlaceId);
select * from Item;

insert into Place (PlaceName, aditionDate) values ("Teste", "2025-03-12");
select * from Place;

select * from Item join Place on Item.PlaceId = Place.PlaceId where Place.PlaceName="Teste";















