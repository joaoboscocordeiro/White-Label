package br.com.multalpha.aplicativos.v1.whitelabel.domain.usecase

import br.com.multalpha.aplicativos.v1.whitelabel.data.ProductRepository
import br.com.multalpha.aplicativos.v1.whitelabel.domain.model.Product

/**
 * Created by João Bosco on 17/09/2021.
 * e-mail - Support: ti.junior@gmail.com
 */
class GetProductUseCaseImpl(
    private val productRepository: ProductRepository
) : GetProductUseCase {

    override suspend fun invoke(): List<Product> {
        return productRepository.getProduct()
    }
}