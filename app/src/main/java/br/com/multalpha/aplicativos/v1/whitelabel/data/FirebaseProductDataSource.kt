package br.com.multalpha.aplicativos.v1.whitelabel.data

import android.net.Uri
import br.com.multalpha.aplicativos.v1.appbikes.util.COLLECTION_PRODUCTS
import br.com.multalpha.aplicativos.v1.appbikes.util.COLLECTION_ROOT
import br.com.multalpha.aplicativos.v1.whitelabel.BuildConfig
import br.com.multalpha.aplicativos.v1.whitelabel.domain.model.Product
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import kotlin.coroutines.suspendCoroutine

/**
 * Created by João Bosco on 13/09/2021.
 * e-mail - Support: ti.junior@gmail.com
 */

class FirebaseProductDataSource(
    firebaseFirestore: FirebaseFirestore,
    firebaseStorage: FirebaseStorage
) : ProductDataSource {

    private val documentReference = firebaseFirestore
        .document("$COLLECTION_ROOT/${BuildConfig.FIREBASE_FLAVOR_COLLECTION}/")

    private val storageReference = firebaseStorage.reference

    override suspend fun getProduct(): List<Product> {
        return suspendCoroutine { continuation ->
            val productsReference = documentReference.collection(COLLECTION_PRODUCTS)
            productsReference.get().addOnSuccessListener { documents ->
                val products = mutableListOf<Product>()
                for (document in documents) {
                    document.toObject(Product::class.java).run {
                        products.add(this)
                    }
                }

                continuation.resumeWith(Result.success(products))
            }

            productsReference.get().addOnFailureListener { exception ->
                continuation.resumeWith(Result.failure(exception))
            }
        }
    }

    override suspend fun uploadProductImage(imageUri: Uri): String {
        TODO("Not yet implemented")
    }

    override suspend fun createProduct(product: Product): Product {
        TODO("Not yet implemented")
    }
}