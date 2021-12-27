package com.kotlin.crud.entity

import javax.persistence.*

@Entity
@Table(name = "mata_pelajaran")
data class MataPelajaran(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") val id: Long,
    @Column(name = "name") val namaMataPelajaran: String,
    @Column(name = "description") val deskripsiMataPelajaran: String
)