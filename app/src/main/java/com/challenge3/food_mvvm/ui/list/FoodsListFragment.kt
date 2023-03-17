package com.challenge3.food_mvvm.ui.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import coil.load
import com.challenge3.food_mvvm.databinding.FragmentFoodsListBinding
import com.challenge3.food_mvvm.viewmodel.FoodsListViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FoodsListFragment : Fragment() {
    private lateinit var binding: FragmentFoodsListBinding

    //other
    private val viewModel: FoodsListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentFoodsListBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            //random Food
            viewModel.loadRandomFood()
            viewModel.randomFoodData.observe(viewLifecycleOwner) {
                it[0].let { meal ->
                    headerImg.load(meal.strMealThumb) {
                        crossfade(500)
                        crossfade(true)
                    }
                }
            }
        }
    }


}