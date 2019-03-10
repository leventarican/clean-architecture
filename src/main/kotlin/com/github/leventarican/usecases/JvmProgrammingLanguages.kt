package com.github.leventarican.usecases

import com.github.leventarican.data.Repository

class JvmProgrammingLanguages constructor(repository: Repository) {

    private val repository = repository

    fun getJvmProgrammingLanguages() : String {
        val kotlin = repository.getProgrammingLanguage(0)
        val java = repository.getProgrammingLanguage(1)
        val notdefined = repository.getProgrammingLanguage(9)

        return "jvm programming languages: ${kotlin.name}, ${java.name}, ${notdefined.name}."
    }
}