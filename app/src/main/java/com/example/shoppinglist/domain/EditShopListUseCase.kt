package com.example.shoppinglist.domain

class EditShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun editShopList(ShopItem: shopItem) {
        shopListRepository.editShopList(ShopItem)
    }
}