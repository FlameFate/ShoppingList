package com.example.shoppinglist.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.shoppinglist.domain.ShopListRepository
import com.example.shoppinglist.domain.shopItem
import java.lang.RuntimeException

object ShopListRepositoryImpl : ShopListRepository {

    private val shoplist = mutableListOf<shopItem>()
private val shopListLD = MutableLiveData<List<shopItem>>()
    private var autoIncrementId = 0


    init{
     for (i in 0 until 10){
         val item = shopItem("Name $i", i, true)
         addShopList(item)
     }
    }

    override fun addShopList(ShopItem: shopItem) {
        if (ShopItem.id == shopItem.Undefined_ID) {
            ShopItem.id = autoIncrementId++
        }
        shoplist.add(ShopItem)
        updatelist()
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
        updatelist()
    }

    override fun getShopList(): LiveData<List<shopItem>> {
        return shopListLD
    }

private fun updatelist(){
    shopListLD.value = shoplist.toList()

}}