package com.ecommerce.EcommerceUdemy.service;

import com.ecommerce.EcommerceUdemy.dto.Purchase;
import com.ecommerce.EcommerceUdemy.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
