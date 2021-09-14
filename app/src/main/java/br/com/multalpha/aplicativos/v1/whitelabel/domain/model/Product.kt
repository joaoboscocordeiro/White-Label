package br.com.multalpha.aplicativos.v1.whitelabel.domain.model

import android.os.Parcelable
import com.google.firebase.firestore.PropertyName
import kotlinx.parcelize.Parcelize

/**
 * Created by João Bosco on 13/09/2021.
 * e-mail - Support: ti.junior@gmail.com
 */

@Parcelize
data class Product(
    val id: String = "",
    val description: String = "",
    val price: Double = 0.0,
    @get:PropertyName("image_url")
    @set:PropertyName("image_url")
    var imageUrl: String = ""
) : Parcelable