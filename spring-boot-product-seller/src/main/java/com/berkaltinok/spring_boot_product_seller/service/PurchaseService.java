package com.berkaltinok.spring_boot_product_seller.service;

import com.berkaltinok.spring_boot_product_seller.model.Purchase;
import com.berkaltinok.spring_boot_product_seller.repository.projection.PurchaseItem;

import java.util.List;

public interface PurchaseService
{
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findPurchaseItemOfUser(Long userId);
}
