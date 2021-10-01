package br.com.multalpha.aplicativos.v1.whitelabel.domain.usecase

/**
 * Created by João Bosco on 28/09/2021.
 * e-mail - Support: ti.junior@gmail.com
 */

interface DeleteProductUseCase {

    suspend operator fun invoke(id: String)
}