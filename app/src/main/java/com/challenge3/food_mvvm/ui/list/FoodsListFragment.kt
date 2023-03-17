package com.challenge3.food_mvvm.ui.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.challenge3.food_mvvm.R
import com.challenge3.food_mvvm.databinding.FragmentFoodsListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FoodsListFragment : Fragment() {
    private lateinit var binding: FragmentFoodsListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentFoodsListBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}