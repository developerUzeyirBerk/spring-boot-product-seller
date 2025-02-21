package com.berkaltinok.spring_boot_product_seller.idgenerator.repository;

import com.berkaltinok.spring_boot_product_seller.idgenerator.model.IdentityOne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdentityOneRepository extends JpaRepository<IdentityOne, Long>
{
}
