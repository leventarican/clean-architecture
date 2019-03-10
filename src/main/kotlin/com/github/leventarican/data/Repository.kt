package com.github.leventarican.data

import com.github.leventarican.domain.ProgrammingLanguage
import com.github.leventarican.framework.Database

class Repository(database: Database) {

    private val database: Database = database

    fun getProgrammingLanguage(id: Int): ProgrammingLanguage {
        return database.getProgrammingLanguage(id)
    }
}