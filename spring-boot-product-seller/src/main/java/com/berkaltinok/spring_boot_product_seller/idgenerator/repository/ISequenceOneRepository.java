package com.berkaltinok.spring_boot_product_seller.idgenerator.repository;

import com.berkaltinok.spring_boot_product_seller.idgenerator.model.SequenceOne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISequenceOneRepository extends JpaRepository<SequenceOne, Long>
{
}
