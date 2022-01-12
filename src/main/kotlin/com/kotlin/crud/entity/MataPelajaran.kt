package com.kotlin.crud.entity

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.*

@Entity
@Table(name = "mata_pelajaran")
data class MataPelajaran(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") val id: Long?,
    @Column(name = "name") @JsonProperty("nama_mata_pelajaran") var namaMataPelajaran: String,
    @Column(name = "description") @JsonProperty("deskripsi_mata_pelajaran") var deskripsiMataPelajaran: String
)