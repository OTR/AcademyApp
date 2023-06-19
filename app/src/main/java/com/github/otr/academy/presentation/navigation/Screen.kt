package com.github.otr.academy.presentation.navigation

/**
 *
 */
sealed class Screen(
    val route: String
) {

    companion object {

        private const val LOGIN_SCREEN_ROUTE: String = "login_screen"
        private const val CATEGORIES_SCREEN_ROUTE: String = "categories_screen"

        private const val BASE_TRACK_SCREEN_ROUTE: String = "track_screen"
        const val TRACK_SCREEN_ID_KEY: String = "track_id"
        private const val TRACK_SCREEN_ROUTE: String = "$BASE_TRACK_SCREEN_ROUTE/{$TRACK_SCREEN_ID_KEY}"

    }

    object Login: Screen(route = LOGIN_SCREEN_ROUTE)

    object Categories : Screen(route = CATEGORIES_SCREEN_ROUTE)

    object Track : Screen(route = TRACK_SCREEN_ROUTE) {

        fun routeWithArgs(trackId: Int): String {
            return "$BASE_TRACK_SCREEN_ROUTE/$trackId"
        }

    }

}
