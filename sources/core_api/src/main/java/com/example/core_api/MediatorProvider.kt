package com.example.core_api

interface MediatorProvider {
    fun mediatorsMap(): Map<Class<out MediatorEntry>, @JvmSuppressWildcards MediatorEntry>
}