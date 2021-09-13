package br.com.multalpha.aplicativos.v1.whitelabel.domain.model

/**
 * Created by João Bosco on 13/09/2021.
 * e-mail - Support: ti.junior@gmail.com
 */

data class Product(
    val id: String = "",
    val description: String = "",
    val price: Double = 0.0,
    var imageUrl: String = ""
)