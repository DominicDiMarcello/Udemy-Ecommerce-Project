package com.ecommerce.EcommerceUdemy.dto;

import com.ecommerce.EcommerceUdemy.entity.Address;
import com.ecommerce.EcommerceUdemy.entity.Customer;
import com.ecommerce.EcommerceUdemy.entity.Order;
import com.ecommerce.EcommerceUdemy.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;

    private Address shippingAddress;

    private Address billingAddress;

    private Order order;

    private Set<OrderItem> orderItems;
}

