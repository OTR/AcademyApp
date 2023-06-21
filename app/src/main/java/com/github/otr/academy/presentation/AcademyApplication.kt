package com.github.otr.academy.presentation

import android.app.Application
import androidx.room.Room
import com.github.otr.academy.data.database.AppDatabase

/**
 *
 */
class AcademyApplication : Application() {

    val database: AppDatabase by lazy {
        Room.databaseBuilder(
            context = this,
            klass = AppDatabase::class.java,
            name = "academy_app.db"
        )
            .allowMainThreadQueries() // TODO: For testing purposes only?
            .build()
    }

}
