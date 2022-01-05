package com.kotlin.crud.service

import com.kotlin.crud.entity.MataPelajaran
import com.kotlin.crud.repository.MataPelajaranRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class MataPelajaranServiceImpl(
    val mataPelajaranRepository: MataPelajaranRepository): MataPelajaranService {

    override fun findAllMataPelajaran(): List<MataPelajaran> {
        return mataPelajaranRepository.findAll();
    }

    override fun findMataPelajaranById(id: Long): Optional<MataPelajaran> {
        return mataPelajaranRepository.findById(id)
    }

    override fun createNewMataPelajaran(payload: MataPelajaran): MataPelajaran {
        return mataPelajaranRepository.save(payload)
    }

    override fun updateMataPelajaran(id: Long, payload: MataPelajaran): Optional<MataPelajaran> {
        val mataPelajaranById = mataPelajaranRepository.findById(id)

        mataPelajaranById.map { result ->
            val mataPelajaranUpdate: MataPelajaran =  result.copy(
                namaMataPelajaran = payload.namaMataPelajaran,
                deskripsiMataPelajaran = payload.deskripsiMataPelajaran
            )

            mataPelajaranRepository.save(mataPelajaranUpdate)
        }

        return mataPelajaranById
    }

    override fun deleteMataPelajaran(id: Long) {
        val mataPelajaranById = mataPelajaranRepository.findById(id)

        mataPelajaranById.map { result ->
            mataPelajaranRepository.delete(result)
        }
    }
}