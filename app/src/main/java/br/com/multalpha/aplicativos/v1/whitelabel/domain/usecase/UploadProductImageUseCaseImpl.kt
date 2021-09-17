package br.com.multalpha.aplicativos.v1.whitelabel.domain.usecase

import android.net.Uri
import br.com.multalpha.aplicativos.v1.whitelabel.data.ProductRepository

/**
 * Created by João Bosco on 17/09/2021.
 * e-mail - Support: ti.junior@gmail.com
 */

class UploadProductImageUseCaseImpl(
    private val productRepository: ProductRepository
) : UploadProductImageUseCase {

    override suspend fun invoke(imageUri: Uri): String {
        return productRepository.uploadProductImage(imageUri)
    }
}