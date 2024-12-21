package com.example.core_api

inline fun <reified T : MediatorEntry> Destinations.find(): T =
    this[T::class.java] as T