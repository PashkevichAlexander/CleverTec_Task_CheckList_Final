drop
database if exists shopOrder;
create
database ShopOrder;
use
shopOrder;

create table basketOrder
(
    id        int,
    firstName varchar(20),
    cost      double,
    discount  varchar(50)
);

insert
basketOrder(id, firstName, cost, discount)
values
 (1, 'milk', 100, 'DISCOUNT_ALLOWED'),
 (2, 'meat', 80, 'DISCOUNT_ALLOWED'),
 (3, 'potato', 70, 'DISCOUNT_ALLOWED'),
 (4, 'kotleta', 150, 'DISCOUNT_ALLOWED'),
 (5, 'pureshka', 445, 'DISCOUNT_ALLOWED'),
 (6,' vodka', 353, 'DISCOUNT_FORBIDDEN'),
 (7, 'sigarets', 888, 'DISCOUNT_FORBIDDEN'),
 (8, 'tea', 250, 'DISCOUNT_ALLOWED'),
 (9, 'bread', 74, 'DISCOUNT_ALLOWED'),
 (10, 'cola', 232, 'DISCOUNT_FORBIDDEN');


create table discountCard
(
    id              int,
    typeOfDiscount  varchar(50),
    valueOfDiscount int
);

insert
discountCard(id, typeOfDiscount, valueOfDiscount)
 values
 (1, 'Children Discount', 10),
 (2, 'Grand Discount', 10),
 (3, 'Social Discount', 10);


create table userDiscountId
(
    discountId int,
    userId     int
);

insert
userDiscountId(discountId, userId)
 values
 (1,11),(1,12),(1,13),(1,14),
 (2,21),(2,22),(2,23),(2,24),
 (3,31),(3,32),(3,33),(3,34)
 ;