package com.example.shoppinglist.domain

class AddShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun addShopList(ShopItem: shopItem) {
        shopListRepository.addShopList(ShopItem)
    }
}