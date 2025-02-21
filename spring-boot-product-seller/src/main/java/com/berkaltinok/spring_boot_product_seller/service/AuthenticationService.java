package com.berkaltinok.spring_boot_product_seller.service;

import com.berkaltinok.spring_boot_product_seller.model.User;

public interface AuthenticationService
{
    User signInAndReturnJWT(User signInRequest);
}
