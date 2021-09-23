package br.com.multalpha.aplicativos.v1.whitelabel.domain.usecase

import br.com.multalpha.aplicativos.v1.whitelabel.domain.model.Product
import br.com.multalpha.aplicativos.v1.whitelabel.domain.type.ResultType

/**
 * Created by João Bosco on 13/09/2021.
 * e-mail - Support: ti.junior@gmail.com
 */

interface GetProductUseCase {

    suspend operator fun invoke(): ResultType<List<Product>>
}