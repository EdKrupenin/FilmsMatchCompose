package com.example.core_imp

import com.example.core_api.NetworkProvider
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component (
    modules = [NetworkModule::class]
)
interface NetworkComponent : NetworkProvider