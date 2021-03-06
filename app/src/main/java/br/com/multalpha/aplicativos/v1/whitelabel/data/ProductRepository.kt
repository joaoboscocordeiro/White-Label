package br.com.multalpha.aplicativos.v1.whitelabel.data

import android.net.Uri
import br.com.multalpha.aplicativos.v1.whitelabel.domain.model.Product
import javax.inject.Inject

/**
 * Created by João Bosco on 13/09/2021.
 * e-mail - Support: ti.junior@gmail.com
 */
class ProductRepository @Inject constructor(
    private val dataSource: ProductDataSource
) {

    suspend fun getProduct(): List<Product> = dataSource.getProduct()

    suspend fun uploadProductImage(imageUri: Uri): String = dataSource.uploadProductImage(imageUri)

    suspend fun createProduct(product: Product): Product = dataSource.createProduct(product)

    suspend fun deleteProduct(id: String) = dataSource.deleteProduct(id)
}