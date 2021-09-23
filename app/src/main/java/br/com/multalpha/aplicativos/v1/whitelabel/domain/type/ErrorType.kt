package br.com.multalpha.aplicativos.v1.whitelabel.domain.type

/**
 * Created by João Bosco on 22/09/2021.
 * e-mail - Support: ti.junior@gmail.com
 */

sealed class ErrorType {
    object AccessDenied : ErrorType()
    object Unknown : ErrorType()
}
