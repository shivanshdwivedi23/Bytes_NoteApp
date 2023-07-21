package com.infigeek.bytes.ui.theme

import android.os.Build
import androidx.annotation.RequiresApi
import com.infigeek.bytes.ui.theme.model.Note

object Constants {
const val NAVIGATION_NOTES_LIST = "notesList"
const val NAVIGATION_NOTES_CREATE = "notesCreated"
const val NAVIGATION_NOTE_DETAIL = "noteDetail/{noteId}"
const val NAVIGATION_NOTE_EDIT= "noteEdit/{noteId}"
const val NAVIGATION_NOTE_ID_Argument = "noteId"
const val TABLE_NAME = "Notes"
const val DATABASE_NAME = "NotesDatabase"

    fun noteDetailNavigation(noteId : Int) = "noteDetail/$noteId"
    fun noteEditNavigation(noteId : Int) = "noteEdit/$noteId"


    fun List<Note>?.orPlaceHolderList(): List<Note> {
        @RequiresApi(Build.VERSION_CODES.O)
        fun placeHolderList(): List<Note> {
            return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                listOf(Note(id = 0, title = "No Notes Found", note = "Please create a note.", dateUpdated = ""))
            } else {
                TODO("VERSION.SDK_INT < O")
            }
        }
        return if (!this.isNullOrEmpty()){
            this
        } else placeHolderList()
    }

    val noteDetailPlaceHolder = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        Note(note = "Cannot find note details", id = 0, title = "Cannot find note details")
    } else {
        TODO("VERSION.SDK_INT < O")
    }
}