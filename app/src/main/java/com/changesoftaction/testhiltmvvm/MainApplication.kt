package com.changesoftaction.testhiltmvvm

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

    }
}