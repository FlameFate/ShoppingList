package com.example.shoppinglist.domain

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopList(): List<shopItem> {
        return shopListRepository.getShopList()
    }

}