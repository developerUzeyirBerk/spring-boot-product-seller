package com.berkaltinok.spring_boot_product_seller.repository;


import com.berkaltinok.spring_boot_product_seller.model.Role;
import com.berkaltinok.spring_boot_product_seller.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long >
{
    // findBy + fieldName
    Optional<User>findByUsername(String username);

    @Modifying
    @Query("update User set role= :role where username= :username")
    void  updateUserRole(@Param("username") String username, @Param("role")Role role);
}
