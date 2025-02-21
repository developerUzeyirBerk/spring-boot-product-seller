package com.berkaltinok.spring_boot_product_seller.service;

import com.berkaltinok.spring_boot_product_seller.model.Role;
import com.berkaltinok.spring_boot_product_seller.model.User;

import java.util.Optional;

public interface UserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}
