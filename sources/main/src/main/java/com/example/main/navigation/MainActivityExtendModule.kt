package com.example.main.navigation

import com.example.core_api.MediatorEntry
import com.example.main_api.MainActivityMediator
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
interface MainActivityExtendModule {
    @Binds
    @Singleton
    @IntoMap
    @ClassKey(MainActivityMediator::class)
    fun bindMediator(mediator: MainActivityMediatorImpl) : MediatorEntry
}