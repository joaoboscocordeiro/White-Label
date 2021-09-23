package br.com.multalpha.aplicativos.v1.whitelabel.data

import br.com.multalpha.aplicativos.v1.whitelabel.domain.ErrorHandler
import br.com.multalpha.aplicativos.v1.whitelabel.domain.type.ErrorType
import com.google.firebase.firestore.FirebaseFirestoreException
import javax.inject.Inject

/**
 * Created by João Bosco on 22/09/2021.
 * e-mail - Support: ti.junior@gmail.com
 */

class GeneralErrorHandlerImpl @Inject constructor(): ErrorHandler {

    override fun getError(throwable: Throwable): ErrorType {
        return when (throwable) {
            is FirebaseFirestoreException -> {
                if (throwable.code == FirebaseFirestoreException.Code.PERMISSION_DENIED) {
                    ErrorType.AccessDenied
                } else ErrorType.Unknown
            }
            else -> ErrorType.Unknown
        }
    }
}