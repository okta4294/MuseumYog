package com.example.museumyog.component

import com.example.museumyog.R
import com.example.museumyog.component.SharedVariables.anak
import com.example.museumyog.component.SharedVariables.checked
import com.example.museumyog.component.SharedVariables.checked1
import com.example.museumyog.component.SharedVariables.dewasa
import com.example.museumyog.component.SharedVariables.family
import com.example.museumyog.component.SharedVariables.mhs
import com.example.museumyog.component.SharedVariables.student
import com.example.museumyog.component.SharedVariables.weekend

data class tiket(
    val id:Int,
    val title: String,
    val banyak: Int,
    val ket : String
)

fun getDummyList(): List<tiket> {
    return listOf(
        tiket(1,"Anak", anak, ""+if(weekend) "weekend" else "Weekdays"),
        tiket(2,"Dewasa", dewasa,""+if(weekend) "weekend" else "Weekdays"),
        tiket(3,"Mahasiswa", mhs,""+if(weekend) "weekend" else "Weekdays"),
        tiket(4,"Family", if(checked) 1 else 0,""+if(weekend) "weekend" else "Weekdays"),
        tiket(5,"Students", if(checked1) 1 else 0,""+if(weekend) "weekend" else "Weekdays")
    )
}
data class bank(
    val id:Int,
    val gambar : Int
)
fun getDummybankList(): List<bank> {
    return listOf(
        bank(1, R.drawable.bank_jogja),
        bank(2,R.drawable.bca),
        bank(3,R.drawable.bni),
        bank(4,R.drawable.mandiri)
    )
}