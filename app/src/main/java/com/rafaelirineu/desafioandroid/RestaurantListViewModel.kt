/*package com.rafaelirineu.desafioandroid

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class RestaurantListViewModel (

private val repository: RestaurantListRepository): ViewModel(){

    val restaurantes = MutableLiveData<List<Restaurant>>()

    class ListaPersonagemViewModelFactory(
        private val repository: RestaurantListRepository
    ): ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return RestaurantListViewModel(repository) as T
        }
    }
}
}*/