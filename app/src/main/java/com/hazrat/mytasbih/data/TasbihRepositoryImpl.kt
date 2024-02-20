package com.hazrat.mytasbih.data

import com.hazrat.mytasbih.model.TasbihCounterEntity
import kotlinx.coroutines.flow.Flow

class TasbihRepositoryImpl(
    private val dao: TasbihCounterDao
): TasbihRepository {
    override suspend fun insertTasbih(tasbihCounterEntity: TasbihCounterEntity) {
        dao.insert(tasbihCounterEntity)
    }

    override fun getTasbih(): Flow<List<TasbihCounterEntity?>> {
       return dao.getAllTasbihCounter()
    }


}