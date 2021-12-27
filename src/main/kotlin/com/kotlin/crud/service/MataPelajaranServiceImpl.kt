package com.kotlin.crud.service

import com.kotlin.crud.entity.MataPelajaran
import com.kotlin.crud.repository.MataPelajaranRepository
import org.springframework.stereotype.Service

@Service
class MataPelajaranServiceImpl(
    val mataPelajaranRepository: MataPelajaranRepository): MataPelajaranService {

    override fun findAllMataPelajaran(): List<MataPelajaran> {
        return mataPelajaranRepository.findAll();
    }
}