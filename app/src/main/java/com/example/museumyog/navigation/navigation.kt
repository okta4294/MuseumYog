package com.example.museumyog.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.museumyog.presentation.informationkoleksi
import com.example.museumyog.presentation.informationpage
import com.example.museumyog.presentation.review

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = "information") {

        composable(route = "information") {
            informationpage(navController)
        }
        composable(route = "koleksi") {
            informationkoleksi(navController)
        }
        composable(route = "review") {
            review(navController)
        }

    }
}