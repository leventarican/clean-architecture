package com.github.leventarican.presentation

import com.github.leventarican.data.Repository
import com.github.leventarican.framework.InMemoryDatabase
import com.github.leventarican.usecases.JvmProgrammingLanguages

class Console {

    var repository: Repository = Repository(InMemoryDatabase())

    fun run() {
        click(0)
    }

    private fun click(id: Int) {
        when (id) {
            0 -> {
                println("button 0 clicked: ${JvmProgrammingLanguages(repository).getJvmProgrammingLanguages()}")
            }
            else -> {
                println("button does not exist")
            }
        }
    }
}
