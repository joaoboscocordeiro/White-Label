package br.com.multalpha.aplicativos.v1.whitelabel.data.di

import br.com.multalpha.aplicativos.v1.whitelabel.data.GeneralErrorHandlerImpl
import br.com.multalpha.aplicativos.v1.whitelabel.domain.ErrorHandler
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by João Bosco on 22/09/2021.
 * e-mail - Support: ti.junior@gmail.com
 */

@Module
@InstallIn(SingletonComponent::class)
interface ErrorHandlerModule {

    @Singleton
    @Binds
    fun bindErrorHandler(errorHandler: GeneralErrorHandlerImpl): ErrorHandler
}