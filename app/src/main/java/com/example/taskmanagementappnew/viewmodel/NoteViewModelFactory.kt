package com.example.taskmanagementappnew.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.taskmanagementappnew.model.Note
import com.example.taskmanagementappnew.repository.NoteRepository

class NoteViewModelFactory(val app:Application,private val noteRepository: NoteRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NoteViewModel(app,noteRepository) as T
    }
}