package com.berkaltinok.spring_boot_product_seller.idgenerator.repository;

import com.berkaltinok.spring_boot_product_seller.idgenerator.model.DefaultOne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDefaultOneRepository extends JpaRepository<DefaultOne,Long>

{
}
