package com.edu.exaddfebrero.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.edu.exaddfebrero.data.CollectionDataRepository
import com.edu.exaddfebrero.domain.Collection

class CollectionViewModel(private val collectionDataRepository: CollectionDataRepository): ViewModel() {

    private val uiState = MutableLiveData<UiState>()
    private val _uiState: LiveData<UiState> get() = uiState!!

    fun loadCollections(){
        val collections = collectionDataRepository.getCollections()
        uiState.postValue(UiState(collections = collections))
    }

    data class UiState(
        val collections: List<Collection> = emptyList()
    )
}