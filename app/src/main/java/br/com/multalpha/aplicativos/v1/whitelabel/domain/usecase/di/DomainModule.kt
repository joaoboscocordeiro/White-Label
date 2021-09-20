package br.com.multalpha.aplicativos.v1.whitelabel.domain.usecase.di

import br.com.multalpha.aplicativos.v1.whitelabel.domain.usecase.*
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

/**
 * Created by João Bosco on 20/09/2021.
 * e-mail - Support: ti.junior@gmail.com
 */
@Module
@InstallIn(ViewModelComponent::class)
interface DomainModule {

    @Binds
    fun bindCreateProductUseCase(useCase: CreateProductUseCaseImpl): CreateProductUseCase

    @Binds
    fun bindGetProductsUseCase(useCase: GetProductUseCaseImpl): GetProductUseCase

    @Binds
    fun bindUploadImageUseCase(useCasa: UploadProductImageUseCaseImpl): UploadProductImageUseCase
}