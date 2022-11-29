package com.ecommerce.EcommerceUdemy.service;

import com.ecommerce.EcommerceUdemy.dto.PaymentInfo;
import com.ecommerce.EcommerceUdemy.dto.Purchase;
import com.ecommerce.EcommerceUdemy.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
