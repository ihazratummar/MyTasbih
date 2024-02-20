package com.hazrat.mytasbih.di

import android.app.Application
import androidx.room.Room
import com.hazrat.mytasbih.data.TasbihDatabase
import com.hazrat.mytasbih.data.TasbihRepository
import com.hazrat.mytasbih.data.TasbihRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideTasbihDatabase(app:Application): TasbihDatabase{
        return Room.databaseBuilder(
            app,
            TasbihDatabase::class.java,
            "tasbih_db"
        ).fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun provideTasbihRepository(database: TasbihDatabase): TasbihRepository{
        return TasbihRepositoryImpl(database.tasbihCounterDao())
    }

}