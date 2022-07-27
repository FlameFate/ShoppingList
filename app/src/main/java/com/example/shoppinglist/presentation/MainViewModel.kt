package com.example.shoppinglist.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoppinglist.data.ShopListRepositoryImpl
import com.example.shoppinglist.domain.EditShopListUseCase
import com.example.shoppinglist.domain.GetShopListUseCase
import com.example.shoppinglist.domain.RemoveShopListUseCase
import com.example.shoppinglist.domain.shopItem

class MainViewModel : ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopListUseCase = RemoveShopListUseCase(repository)
    private val editShopListUseCase = EditShopListUseCase(repository)

    val shoplist = MutableLiveData<List<shopItem>>()

    fun getShopList(){
        val list = getShopListUseCase.getShopList()
        shoplist.value = list
    }
    fun deleteShopItem(shopItem: shopItem){
        deleteShopListUseCase.removeShopList(shopItem)
        getShopList()
    }

    fun changeEnabledStatus(shopItem: shopItem){
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopListUseCase.editShopList(newItem)
        getShopList()
    }

}