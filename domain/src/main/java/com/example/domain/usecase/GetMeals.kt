package com.example.domain.usecase

import com.example.domain.repo.MealsRepo

class GetMeals (private val mealsRepo:MealsRepo ){
    //to call the fun by name of class only
   suspend  operator fun invoke ()=mealsRepo.getMealsFromRemote()
}