package com.github.otr.academy.domain.entitiy

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

/**
 *
 */
@Entity(tableName = "categories")
data class Category(

    @PrimaryKey
    @ColumnInfo(name = "category_id")
    val id: Int,

    @ColumnInfo(name = "category_title")
    val title: String,

    @ColumnInfo(name = "category_description")
    val description: String,

    @Ignore
    val trackIds: List<Int>,

    @ColumnInfo // TODO: is this column really needed?
    val tracksCount: Int

)
