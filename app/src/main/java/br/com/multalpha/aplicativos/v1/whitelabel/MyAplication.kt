package br.com.multalpha.aplicativos.v1.whitelabel

import android.app.Application
import com.google.firebase.FirebaseApp
import dagger.hilt.android.HiltAndroidApp

/**
 * Created by João Bosco on 20/09/2021.
 * e-mail - Support: ti.junior@gmail.com
 */

@HiltAndroidApp
class MyAplication : Application() {

    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)
    }
}