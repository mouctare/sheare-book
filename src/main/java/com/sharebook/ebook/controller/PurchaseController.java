package com.sharebook.ebook.controller;

import com.sharebook.ebook.model.Purchase;
import com.sharebook.ebook.service.PurchaseServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/purchage")
public class PurchaseController {

    @Autowired
    private PurchaseServiceInterface purchageService;

    @PostMapping
    public ResponseEntity<?> savePurchage(@RequestBody Purchase purchage){
        return new ResponseEntity<>(purchageService.savePurchase(purchage), HttpStatus.CREATED);
    }

    @GetMapping("{userId}")
    public ResponseEntity<?> getAllPurchasesOfUser(@PathVariable Long userId){
        return ResponseEntity.ok(purchageService.findAllPurchasesOfUser(userId));
    }
}
