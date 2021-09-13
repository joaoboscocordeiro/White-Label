package br.com.multalpha.aplicativos.v1.whitelabel.domain.usecase

import android.net.Uri
import br.com.multalpha.aplicativos.v1.whitelabel.domain.model.Product

/**
 * Created by João Bosco on 13/09/2021.
 * e-mail - Support: ti.junior@gmail.com
 */

interface CreateProductUseCase {

    suspend operator fun invoke(description: String, price: Double, imageUri: Uri): Product
}