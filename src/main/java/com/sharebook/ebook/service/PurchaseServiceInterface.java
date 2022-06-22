package com.sharebook.ebook.service;

import com.sharebook.ebook.model.Purchase;

import java.util.List;

public interface PurchaseServiceInterface {

    Purchase savePurchase(Purchase purchase);

    List<Purchase> findAllPurchasesOfUser(Long userId);
}
