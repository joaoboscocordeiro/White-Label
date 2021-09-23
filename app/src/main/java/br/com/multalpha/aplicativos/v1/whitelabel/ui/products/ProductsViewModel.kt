package br.com.multalpha.aplicativos.v1.whitelabel.ui.products

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.multalpha.aplicativos.v1.whitelabel.R
import br.com.multalpha.aplicativos.v1.whitelabel.config.Config
import br.com.multalpha.aplicativos.v1.whitelabel.domain.model.Product
import br.com.multalpha.aplicativos.v1.whitelabel.domain.type.ErrorType
import br.com.multalpha.aplicativos.v1.whitelabel.domain.type.ResultType
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

    private val _viewStateData = MutableLiveData<ViewState>()
    val viewStateData: LiveData<ViewState> = _viewStateData

    private val _addButtonVisibilityData = MutableLiveData(config.addButtonVisibility)
    val addButtonVisibilityData: LiveData<Int> = _addButtonVisibilityData

    fun getProducts() = viewModelScope.launch {
        _viewStateData.value = when (val result = getProductUseCase()) {
            is ResultType.Success -> ViewState.ShowProducts(result.data)
            is ResultType.Error -> {
                ViewState.ShowError(
                    when (result.error) {
                        is ErrorType.AccessDenied -> R.string.products_error_access_denied
                        else -> R.string.products_error_unknown
                    }
                )
            }
        }
    }

    sealed class ViewState {
        class ShowProducts(val products: List<Product>) : ViewState()
        class ShowError(val messageResId: Int) : ViewState()
    }
}