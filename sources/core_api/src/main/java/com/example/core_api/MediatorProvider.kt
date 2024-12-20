package com.example.core_api

import dagger.internal.Provider

inline fun <reified T : MediatorEntry> Destinations.find(): T =
    this[T::class.java] as T

interface MediatorProvider {
    fun mediatorsMap(): Map<Class<*>, @JvmSuppressWildcards Provider<Any>>
}