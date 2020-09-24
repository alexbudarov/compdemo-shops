package com.sample.shops.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.sample.shops.entity.Customer;

@UiController("shops_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class CustomerBrowse extends MasterDetailScreen<Customer> {
}