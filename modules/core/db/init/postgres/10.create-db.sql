-- begin SHOPS_ORDER
create table SHOPS_ORDER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TOTAL decimal(19, 2),
    CUSTOMER_ID uuid not null,
    --
    primary key (ID)
)^
-- end SHOPS_ORDER
-- begin SHOPS_CUSTOMER
create table SHOPS_CUSTOMER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end SHOPS_CUSTOMER
-- begin SHOPS_ORDER_ITEM
create table SHOPS_ORDER_ITEM (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ORDER_ID uuid not null,
    PRODUCT_ID uuid not null,
    COUNT_ integer not null,
    --
    primary key (ID)
)^
-- end SHOPS_ORDER_ITEM
