package com.example.shoppinglist.data

import com.example.shoppinglist.domain.ShopListRepository
import com.example.shoppinglist.domain.shopItem
import java.lang.RuntimeException

object ShopListRepositoryImpl : ShopListRepository {

    private val shoplist = mutableListOf<shopItem>()

    private var autoIncrementId = 0

    override fun addShopList(ShopItem: shopItem) {
        if (ShopItem.id == shopItem.Undefined_ID) {
            ShopItem.id = autoIncrementId++
        }
        shoplist.add(ShopItem)
    }

    override fun editShopList(ShopItem: shopItem) {
        val oldelement = getIdShopList(ShopItem.id)
        shoplist.remove(oldelement)
        addShopList(ShopItem)
    }

    override fun getIdShopList(shopitemid: Int): shopItem {
        return shoplist.find { it.id == shopitemid }
            ?: throw RuntimeException("Element $shopitemid not found ")
    }


    override fun removeShopList(ShopItem: shopItem) {
        shoplist.remove(ShopItem)
    }

    override fun getShopList(): List<shopItem> {
        return shoplist.toList()
    }

}