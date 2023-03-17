package com.challenge3.food_mvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.challenge3.food_mvvm.data.model.ResponseFoodsList.Meal
import com.challenge3.food_mvvm.data.repository.FoodListRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FoodsListViewModel @Inject constructor(private val repository: FoodListRepository) :
    ViewModel() {

    private val _randomFoodData = MutableLiveData<List<Meal>>()
    val randomFoodData: LiveData<List<Meal>>
        get() = _randomFoodData

    fun loadRandomFood()= viewModelScope.launch(Dispatchers.IO) {
        repository.randomFood().collect{
           _randomFoodData.postValue(it.body()?.meals!!)
        }
    }
}