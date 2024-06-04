package com.example.main.fragments.nutrition.mvi.state

import com.example.common.mvi.MviState
import com.example.main.fragments.nutrition.model.NutritionWithMealsUi

data class NutritionState(
    val date: String,
    val nutritionWithMealsUi: NutritionWithMealsUi
) : MviState
