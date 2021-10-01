package br.com.multalpha.aplicativos.v1.whitelabel.data

import android.net.Uri
import br.com.multalpha.aplicativos.v1.whitelabel.domain.model.Product

/**
 * Created by João Bosco on 13/09/2021.
 * e-mail - Support: ti.junior@gmail.com
 */

interface ProductDataSource {

    suspend fun getProduct(): List<Product>

    suspend fun uploadProductImage(imageUri: Uri): String

    suspend fun createProduct(product: Product): Product

    suspend fun deleteProduct(id: String)
}