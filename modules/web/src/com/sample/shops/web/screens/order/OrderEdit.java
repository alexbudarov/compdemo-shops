package com.sample.shops.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.sample.shops.entity.Order;

@UiController("shops_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {
}