package br.com.multalpha.aplicativos.v1.whitelabel.domain.usecase

import android.net.Uri
import br.com.multalpha.aplicativos.v1.whitelabel.data.ProductRepository
import br.com.multalpha.aplicativos.v1.whitelabel.domain.model.Product
import java.util.*

/**
 * Created by João Bosco on 17/09/2021.
 * e-mail - Support: ti.junior@gmail.com
 */

class CreateProductUseCaseImpl(
    private val uploadProductImageUseCase: UploadProductImageUseCase,
    private val productRepository: ProductRepository
) : CreateProductUseCase {

    override suspend fun invoke(description: String, price: Double, imageUri: Uri): Product {
        return try {
            val imageUrl = uploadProductImageUseCase(imageUri)
            val product = Product(UUID.randomUUID().toString(), description, price, imageUrl)
            productRepository.createProduct(product)
        } catch (e: Exception) {
            throw e
        }
    }
}