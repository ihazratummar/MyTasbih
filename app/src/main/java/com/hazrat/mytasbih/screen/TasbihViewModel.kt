package com.hazrat.mytasbih.screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hazrat.mytasbih.data.TasbihRepository
import com.hazrat.mytasbih.model.TasbihCounterEntity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class TasbihViewModel @Inject constructor(
    private val repository: TasbihRepository,
): ViewModel() {

    val tasbihCounter: Flow<List<TasbihCounterEntity?>> = repository.getTasbih()

    fun insertTasbih(tasbihCounterEntity: TasbihCounterEntity){
        viewModelScope.launch {
            repository.insertTasbih(tasbihCounterEntity)
   }
        }
    }

}