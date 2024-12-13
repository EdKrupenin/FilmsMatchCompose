package com.example.core_factory

import com.example.core_api.NetworkProvider
import com.example.core_imp.DaggerNetworkComponent

object CoreProviderFactory {
    fun createNetworkBuilder() : NetworkProvider{
        return DaggerNetworkComponent.builder().build()
    }
}