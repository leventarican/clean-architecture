package com.github.leventarican.framework

import com.github.leventarican.domain.ProgrammingLanguage

interface Database {
    fun getProgrammingLanguage(id: Int) : ProgrammingLanguage
}