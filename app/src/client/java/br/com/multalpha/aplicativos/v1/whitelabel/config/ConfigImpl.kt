package br.com.multalpha.aplicativos.v1.whitelabel.config

import android.view.View
import javax.inject.Inject

/**
 * Created by João Bosco on 21/09/2021.
 * e-mail - Support: ti.junior@gmail.com
 */

class ConfigImpl @Inject constructor(): Config {

    override val addButtonVisibility: Int = View.GONE
}