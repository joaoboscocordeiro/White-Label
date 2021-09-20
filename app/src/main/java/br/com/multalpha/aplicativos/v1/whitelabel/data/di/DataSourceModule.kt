package br.com.multalpha.aplicativos.v1.whitelabel.data.di

import br.com.multalpha.aplicativos.v1.whitelabel.data.FirebaseProductDataSource
import br.com.multalpha.aplicativos.v1.whitelabel.data.ProductDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by João Bosco on 20/09/2021.
 * e-mail - Support: ti.junior@gmail.com
 */

@Module
@InstallIn(SingletonComponent::class)
interface DataSourceModule {

    @Singleton
    @Binds
    fun bindProductDataSource(dataSouce: FirebaseProductDataSource): ProductDataSource
}