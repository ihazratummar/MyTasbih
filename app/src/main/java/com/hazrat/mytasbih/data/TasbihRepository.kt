package com.hazrat.mytasbih.data

import com.hazrat.mytasbih.model.TasbihCounterEntity
import kotlinx.coroutines.flow.Flow

interface TasbihRepository {

    suspend fun insertTasbih(tasbihCounterEntity: TasbihCounterEntity)

    fun getTasbih(): Flow<List<TasbihCounterEntity?>>

    suspend fun resetTasbihCount()
}