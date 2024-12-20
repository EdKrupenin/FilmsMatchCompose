package com.example.core_api

import retrofit2.Retrofit

interface NetworkProvider {
    fun provideRetrofit() : Retrofit
}