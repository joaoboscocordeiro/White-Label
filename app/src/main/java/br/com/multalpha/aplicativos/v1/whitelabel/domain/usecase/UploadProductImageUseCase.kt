package br.com.multalpha.aplicativos.v1.whitelabel.domain.usecase

import android.net.Uri

/**
 * Created by João Bosco on 13/09/2021.
 * e-mail - Support: ti.junior@gmail.com
 */

interface UploadProductImageUseCase {

    suspend operator fun invoke(imageUri: Uri): String
}