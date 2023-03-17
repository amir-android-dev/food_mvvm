package com.challenge3.food_mvvm.data.repository

import com.challenge3.food_mvvm.data.model.ResponseFoodsList
import com.challenge3.food_mvvm.data.server.ApiServices
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.Response

import javax.inject.Inject

class FoodListRepository @Inject constructor(private val api: ApiServices) {

    suspend fun randomFood(): Flow<Response<ResponseFoodsList>> {
        return flow {
            emit(api.foodRandom())
        }.flowOn(Dispatchers.IO)
    }
}