package com.example.shoppinglist.domain

interface ShopListRepository {

    fun addShopList(ShopItem: shopItem)

    fun editShopList(ShopItem: shopItem)

    fun getIdShopList(ShopItem: Int)

    fun removeShopList(ShopItem: shopItem)

    fun getShopList(): List<shopItem>
}