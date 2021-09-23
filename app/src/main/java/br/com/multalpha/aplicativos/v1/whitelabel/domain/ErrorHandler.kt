package br.com.multalpha.aplicativos.v1.whitelabel.domain

import br.com.multalpha.aplicativos.v1.whitelabel.domain.type.ErrorType

/**
 * Created by João Bosco on 22/09/2021.
 * e-mail - Support: ti.junior@gmail.com
 */

interface ErrorHandler {

    fun getError(throwable: Throwable): ErrorType
}