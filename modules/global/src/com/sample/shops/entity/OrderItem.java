package com.sample.shops.entity;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.SystemLevel;
import com.sample.prods.entity.Product;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.UUID;

@Table(name = "SHOPS_ORDER_ITEM")
@Entity(name = "shops_OrderItem")
public class OrderItem extends StandardEntity {
    private static final long serialVersionUID = -1890771512108844871L;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ORDER_ID")
    @NotNull
    private Order order;

    @SystemLevel
    @Column(name = "PRODUCT_ID", nullable = false)
    private UUID productId;

    @Transient
    @MetaProperty(related = "productId")
    private Product product;

    @Column(name = "COUNT_", nullable = false)
    @NotNull
    @Positive
    private Integer count;

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}