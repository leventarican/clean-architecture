package com.github.leventarican.usecase

import com.github.leventarican.entity.Entity

interface UseCase {
    fun getEntityFromRepository(): Entity
}