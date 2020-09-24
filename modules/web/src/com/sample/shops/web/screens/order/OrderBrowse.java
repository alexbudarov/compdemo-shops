package com.sample.shops.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.sample.shops.entity.Order;

@UiController("shops_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
@LoadDataBeforeShow
public class OrderBrowse extends StandardLookup<Order> {
}