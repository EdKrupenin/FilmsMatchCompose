package com.example.filmsmatch

import android.app.Application
import com.example.core_api.AppProvider
import com.example.core_api.ApplicationComponentProvider
import com.example.core_api.NetworkProvider
import com.example.core_factory.CoreProviderFactory
import dagger.Component

@Component(
    dependencies = [AppProvider::class, NetworkProvider::class]
)
interface ApplicationComponent : ApplicationComponentProvider {
    companion object {
        fun init(application: Application) : ApplicationComponent =
            DaggerApplicationComponent.builder()
                .appProvider(ApplicationContextComponent.create(application))
                .networkProvider(CoreProviderFactory.createNetworkBuilder())
                .build()
    }
}