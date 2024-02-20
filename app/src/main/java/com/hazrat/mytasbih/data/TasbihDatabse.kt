package com.hazrat.mytasbih.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.hazrat.mytasbih.model.TasbihCounterEntity

@Database(entities = [TasbihCounterEntity::class], version = 7)
abstract class TasbihDatabase: RoomDatabase() {

    abstract fun tasbihCounterDao(): TasbihCounterDao

}