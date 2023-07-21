package com.infigeek.bytes.ui.theme.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.infigeek.bytes.ui.theme.model.Note

@Database(entities = [
  Note::class], version = 1)
abstract class NotesDatabase : RoomDatabase() {
    abstract fun NotesDao(): NotesDao

}