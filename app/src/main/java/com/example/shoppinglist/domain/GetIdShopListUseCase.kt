package com.example.shoppinglist.domain

class GetIdShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getIdShopList(shopitemid: Int) {
        return shopListRepository.getIdShopList(shopitemid)
    }

}