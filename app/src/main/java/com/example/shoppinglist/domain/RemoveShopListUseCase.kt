package com.example.shoppinglist.domain

class RemoveShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun removeShopList(ShopItem: shopItem) {
        shopListRepository.removeShopList(ShopItem)
    }

}