package br.com.multalpha.aplicativos.v1.whitelabel.domain.usecase

import br.com.multalpha.aplicativos.v1.whitelabel.data.ProductRepository
import br.com.multalpha.aplicativos.v1.whitelabel.domain.ErrorHandler
import br.com.multalpha.aplicativos.v1.whitelabel.domain.model.Product
import br.com.multalpha.aplicativos.v1.whitelabel.domain.type.ResultType
import javax.inject.Inject

/**
 * Created by João Bosco on 17/09/2021.
 * e-mail - Support: ti.junior@gmail.com
 */
class GetProductUseCaseImpl @Inject constructor(
    private val productRepository: ProductRepository,
    private val errorHandler: ErrorHandler
) : GetProductUseCase {

    override suspend fun invoke(): ResultType<List<Product>> {
        return try {
            val products = productRepository.getProduct()
            ResultType.Success(products)
        } catch (throwable: Throwable) {
            val error = errorHandler.getError(throwable)
            ResultType.Error(error)
        }
    }
}