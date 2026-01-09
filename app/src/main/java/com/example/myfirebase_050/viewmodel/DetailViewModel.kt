package com.example.myfirebase_050.viewmodel

import com.example.myfirebase_050.Siswa

sealed interface  StatusUIDetail {
    data class Success(val satusiswa: Siswa?) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}