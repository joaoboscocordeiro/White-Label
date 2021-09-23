package br.com.multalpha.aplicativos.v1.whitelabel.domain.type

/**
 * Created by João Bosco on 22/09/2021.
 * e-mail - Support: ti.junior@gmail.com
 */

sealed class ResultType<T> {
    data class Success<T>(val data: T) : ResultType<T>()
    data class Error<T>(val error: ErrorType) : ResultType<T>()
}
