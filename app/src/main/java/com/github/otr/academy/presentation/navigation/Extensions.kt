package com.github.otr.academy.presentation.navigation

import androidx.navigation.NavHostController

/**
 *
 */
fun NavHostController.navigateToCategoriesScreen() {
    this.navigate(ScreenState.CategoriesScreen.route)
}
