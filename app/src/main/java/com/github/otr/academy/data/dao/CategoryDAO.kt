package com.github.otr.academy.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.github.otr.academy.domain.entitiy.Category

/**
 *
 */
//@Dao
//interface CategoryDAO {
//
//    @Insert
//    fun insert(vararg categories: Category)
//
//    @Query("SELECT * FROM categories;")
//    fun getAllCategories(): List<Category>
//
//    @Query("SELECT * FROM categories WHERE id = :categoryId LIMIT 1;")
//    fun getCategoryById(categoryId: Int): Category
//
//    @Query("SELECT title as first, tracks_count as second FROM categories;")
//    fun getAllTitlesAndTrackCount(): List<StringIntPair>
//
//    @Delete
//    fun delete(category: Category)
//
//    @Query("DELETE FROM categories;")
//    fun deleteAll()
//
//}
