package com.abuabu.pemesanantiket.database

import androidx.room.Database
import com.abuabu.pemesanantiket.model.ModelDatabase
import androidx.room.RoomDatabase
import com.abuabu.pemesanantiket.database.dao.DatabaseDao


@Database(entities = [ModelDatabase::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun databaseDao(): DatabaseDao?
}