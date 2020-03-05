package com.github.leventarican.repository

import com.github.leventarican.entity.Entity

interface Repository {
    fun getEntityFromDataSource(): Entity
}