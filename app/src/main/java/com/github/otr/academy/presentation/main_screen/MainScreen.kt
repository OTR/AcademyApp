package com.github.otr.academy.presentation.main_screen

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

import com.github.otr.academy.presentation.navigation.AppNavGraph

/**
 *
 */
@Composable
fun MainScreen() {

    val navHostController: NavHostController = rememberNavController()

    AppNavGraph(navHostController)

}
