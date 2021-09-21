package br.com.multalpha.aplicativos.v1.whitelabel.config.di

import br.com.multalpha.aplicativos.v1.whitelabel.config.Config
import br.com.multalpha.aplicativos.v1.whitelabel.config.ConfigImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

/**
 * Created by João Bosco on 21/09/2021.
 * e-mail - Support: ti.junior@gmail.com
 */

@Module
@InstallIn(ViewModelComponent::class)
interface ConfigModule {

    @Binds
    fun bindConfig(config: ConfigImpl): Config
}