package com.github.otr.academy.domain.entitiy

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 *
 */
@Entity(tableName = "categories")
data class Category(

    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Int,

    @ColumnInfo(name = "title")
    val title: String,

    @ColumnInfo(name = "description")
    val description: String,

    // FIXME: Cannot figure out how to save this field into database.
    //  You can consider adding a type converter for it.
    val trackIds: List<Int>,

    @ColumnInfo(name = "tracks_count") // TODO: is this column really needed?
    val tracksCount: Int

)
