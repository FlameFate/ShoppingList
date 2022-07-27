package com.example.shoppinglist.domain

import com.example.shoppinglist.domain.shopItem as shopItem

class GetIdShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getIdShopList(shopitemid: Int) :shopItem{
        return shopListRepository.getIdShopList(shopitemid)
    }

}