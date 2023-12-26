package com.test.currencyconvertertask.core.repository

import com.test.currencyconvertertask.core.domain.CurrencyDomain

interface CurrencyRepository {
    fun getAllCurrency(): List<CurrencyDomain>
    fun updateData()
}