package com.test.currencyconvertertask.di

import com.test.currencyconvertertask.core.repository.CurrencyRepository
import com.test.currencyconvertertask.core.repository.CurrencyRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    single<CurrencyRepository> { CurrencyRepositoryImpl() }
}