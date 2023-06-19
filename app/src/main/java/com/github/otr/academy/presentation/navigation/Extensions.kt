package com.github.otr.academy.presentation.navigation

import androidx.navigation.NavHostController

/**
 * Pop everything up to and including the "categories" destination off
 * the back stack before navigating to the "categories" destination
 */
fun NavHostController.navigateToCategoriesScreen() {
    this.navigate(Screen.Categories.route) {
//        popUpTo(Screen.Login.route) { inclusive = true }
    }
}
