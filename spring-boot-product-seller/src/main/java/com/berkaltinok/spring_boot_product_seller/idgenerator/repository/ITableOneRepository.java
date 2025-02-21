package com.berkaltinok.spring_boot_product_seller.idgenerator.repository;

import com.berkaltinok.spring_boot_product_seller.idgenerator.model.TableOne;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ITableOneRepository extends JpaRepository<TableOne, Long>
{
}
