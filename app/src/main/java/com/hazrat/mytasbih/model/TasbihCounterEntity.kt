package com.hazrat.mytasbih.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "tasbih_counter")
data class TasbihCounterEntity (
    @PrimaryKey
    val id: Int = 1,
    var totalCount: Int = 1,
    var tasbihCount:Int = 0
)