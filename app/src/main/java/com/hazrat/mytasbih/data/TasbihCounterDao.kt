package com.hazrat.mytasbih.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.hazrat.mytasbih.model.TasbihCounterEntity
import kotlinx.coroutines.flow.Flow


@Dao
interface TasbihCounterDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(tasbihCounterEntity: TasbihCounterEntity)


    @Query("SELECT * FROM tasbih_counter WHERE id = 1")
    fun getTasbih(): Flow<List<TasbihCounterEntity>>

    @Query("UPDATE tasbih_counter SET tasbihCount = 0 WHERE id = 1")
    suspend fun resetTasbihCount()

}
