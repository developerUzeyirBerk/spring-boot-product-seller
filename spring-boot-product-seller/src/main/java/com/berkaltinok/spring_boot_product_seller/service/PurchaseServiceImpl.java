package com.berkaltinok.spring_boot_product_seller.service;

import com.berkaltinok.spring_boot_product_seller.model.Purchase;
import com.berkaltinok.spring_boot_product_seller.repository.PurchaseRepository;
import com.berkaltinok.spring_boot_product_seller.repository.projection.PurchaseItem;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService
{
    private final PurchaseRepository purchaseRepository;

    public PurchaseServiceImpl(PurchaseRepository purchaseRepository)
    {
        this.purchaseRepository = purchaseRepository;
    }
    @Override
    public Purchase savePurchase(Purchase purchase)
    {
        purchase.setPurchaseTime(LocalDateTime.now());
        return purchaseRepository.save(purchase);
    }
    @Override
    public List<PurchaseItem> findPurchaseItemOfUser(Long userId)
    {
        return purchaseRepository.findAllPurchasesOfUser(userId);
    }
}
