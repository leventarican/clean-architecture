package com.github.leventarican.framework

import com.github.leventarican.domain.ProgrammingLanguage

class InMemoryDatabase : Database {

    private val programmingLanguages = mutableListOf<ProgrammingLanguage>()

    init {
        programmingLanguages.add(ProgrammingLanguage(0, "kotlin"))
        programmingLanguages.add(ProgrammingLanguage(1, "java"))
        programmingLanguages.add(ProgrammingLanguage(2, "cpp"))
    }

    override fun getProgrammingLanguage(id: Int): ProgrammingLanguage {
        return if (id in 0..programmingLanguages.size) programmingLanguages[id] else ProgrammingLanguage(-1, "not defined")
    }
}