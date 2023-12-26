package com.test.currencyconvertertask

import android.app.Application
import com.test.currencyconvertertask.di.repositoryModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(
                listOf(
                    repositoryModule,
                )
            )
        }
    }
}