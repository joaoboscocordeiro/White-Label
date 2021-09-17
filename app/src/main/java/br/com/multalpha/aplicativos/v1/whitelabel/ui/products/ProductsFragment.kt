package br.com.multalpha.aplicativos.v1.appbikes.ui.products

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import br.com.multalpha.aplicativos.v1.whitelabel.R
import br.com.multalpha.aplicativos.v1.whitelabel.databinding.FragmentProductsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProductsFragment : Fragment() {

    private var _binding: FragmentProductsBinding? = null
    private val binding get() = _binding!!

    //private val viewModel: ProductsViewModel by viewModels()

    //private val productsAdapter = ProductsAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProductsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setRecyclerView()
        setListeners()
        //observeNavBackStack()
        //observeVMEvents()
        getProducts()
    }

    private fun setRecyclerView() {
        binding.recyclerProducts.run {
            setHasFixedSize(true)
            //adapter = productsAdapter
        }
    }

    private fun setListeners() {
        with(binding) {
            swipeProducts.setOnRefreshListener {
                getProducts()
            }

            fabAdd.setOnClickListener {
                findNavController().navigate(R.id.action_productsFragment_to_addProductFragment)
            }
        }
    }

    private fun getProducts() {
        //viewModel.getProducts()
    }

    /*private fun observeNavBackStack() {
        findNavController().run {
            val navBackStackEntry = getBackStackEntry(R.id.productsFragment)
            val savedStateHandle = navBackStackEntry.savedStateHandle
            val observer = LifecycleEventObserver { _, event ->
                if (event == Lifecycle.Event.ON_RESUME && savedStateHandle.contains(PRODUCT_KEY)) {
                    val product = savedStateHandle.get<Product>(PRODUCT_KEY)
                    val oldList = productsAdapter.currentList
                    val newList = oldList.toMutableList().apply {
                        add(product)
                    }
                    productsAdapter.submitList(newList)
                    binding.recyclerProducts.smoothScrollToPosition(newList.size - 1)
                    savedStateHandle.remove<Product>(PRODUCT_KEY)
                }
            }

            navBackStackEntry.lifecycle.addObserver(observer)

            viewLifecycleOwner.lifecycle.addObserver(LifecycleEventObserver { _, event ->
                if (event == Lifecycle.Event.ON_DESTROY) {
                    navBackStackEntry.lifecycle.removeObserver(observer)
                }
            })
        }
    }*/

    /*private fun observeVMEvents() {
        viewModel.productsData.observe(viewLifecycleOwner) { products ->
            binding.swipeProducts.isRefreshing = false
            productsAdapter.submitList(products)
        }

        viewModel.addButtonVisibilityData.observe(viewLifecycleOwner) { visibility ->
            binding.fabAdd.visibility = visibility
        }
    }*/

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}