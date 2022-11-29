package com.ecommerce.EcommerceUdemy.dao;

import com.ecommerce.EcommerceUdemy.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByEmail(String theEmail);

}
