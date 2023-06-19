package com.github.otr.academy.presentation.navigation

/**
 *
 */
sealed class ScreenState(
    val route: String
) {

    companion object {

        private const val LOGIN_SCREEN_ROUTE: String = "login_screen"
        private const val CATEGORIES_SCREEN_ROUTE: String = "categories_screen"
        private const val BASE_TRACK_SCREEN_ROUTE: String = "track_screen"
        private const val TRACK_SCREEN_ROUTE: String = "$BASE_TRACK_SCREEN_ROUTE/{track_id}"

    }

    object LoginScreen: ScreenState(route = LOGIN_SCREEN_ROUTE)

    object CategoriesScreen : ScreenState(route = CATEGORIES_SCREEN_ROUTE)

    object TrackScreen : ScreenState(route = TRACK_SCREEN_ROUTE) {

        fun routeWithArgs(trackId: Int): String {
            return "$BASE_TRACK_SCREEN_ROUTE/$trackId"
        }

    }

}
