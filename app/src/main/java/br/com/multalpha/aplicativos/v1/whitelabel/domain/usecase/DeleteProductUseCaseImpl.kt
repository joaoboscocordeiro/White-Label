package br.com.multalpha.aplicativos.v1.whitelabel.domain.usecase

import br.com.multalpha.aplicativos.v1.whitelabel.data.ProductRepository
import javax.inject.Inject

/**
 * Created by João Bosco on 28/09/2021.
 * e-mail - Support: ti.junior@gmail.com
 */

class DeleteProductUseCaseImpl @Inject constructor(
    private val productRepository: ProductRepository
) : DeleteProductUseCase{

    override suspend fun invoke(id: String) {
        return productRepository.deleteProduct(id)
    }
}