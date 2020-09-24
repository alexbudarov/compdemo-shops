-- begin PRODS_PRODUCT
create table PRODS_PRODUCT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CATEGORY_ID uuid not null,
    PRICE decimal(19, 2),
    --
    primary key (ID)
)^
-- end PRODS_PRODUCT
-- begin PRODS_PRODUCT_CATEGORY
create table PRODS_PRODUCT_CATEGORY (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    ALLOWED_FOR_CHILDREN boolean,
    --
    primary key (ID)
)^
-- end PRODS_PRODUCT_CATEGORY
