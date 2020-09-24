package com.sample.shops.web.screens.orderitem;

import com.haulmont.cuba.gui.screen.*;
import com.sample.shops.entity.OrderItem;

@UiController("shops_OrderItem.edit")
@UiDescriptor("order-item-edit.xml")
@EditedEntityContainer("orderItemDc")
@LoadDataBeforeShow
public class OrderItemEdit extends StandardEditor<OrderItem> {
}