package com.example.shoppinglist.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {

    fun addShopList(ShopItem: shopItem)

    fun editShopList(ShopItem: shopItem)

    fun getIdShopList(ShopItem: Int) :shopItem

    fun removeShopList(ShopItem: shopItem)

    fun getShopList(): LiveData<List<shopItem>>
}