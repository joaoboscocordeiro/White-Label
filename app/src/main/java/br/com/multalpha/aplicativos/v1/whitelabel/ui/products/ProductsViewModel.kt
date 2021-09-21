package br.com.multalpha.aplicativos.v1.whitelabel.ui.products

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.multalpha.aplicativos.v1.whitelabel.config.Config
import br.com.multalpha.aplicativos.v1.whitelabel.domain.model.Product
import br.com.multalpha.aplicativos.v1.whitelabel.domain.usecase.GetProductUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Created by João Bosco on 20/09/2021.
 * e-mail - Support: ti.junior@gmail.com
 */

@HiltViewModel
class ProductsViewModel @Inject constructor(
    private val getProductUseCase: GetProductUseCase,
    config: Config
) : ViewModel() {

    private val _productsData = MutableLiveData<List<Product>>()
    val productsData: LiveData<List<Product>> = _productsData

    private val _addButtonVisibilityData = MutableLiveData(config.addButtonVisibility)
    val addButtonVisibilityData: LiveData<Int> = _addButtonVisibilityData

    fun getProducts() = viewModelScope.launch {
        try {
            val products = getProductUseCase()
            _productsData.value = products
        } catch (e: Exception) {
            // TODO: implementar liveData para notificar a view depois
            Log.d("ProductsViewModel", e.toString())
        }
    }
}