package com.github.otr.academy.presentation.login_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource

import com.github.otr.academy.R
import com.github.otr.academy.presentation.theme.DEFAULT_VERTICAL_PADDING

/**
 *
 */
@Composable
fun LoginScreen(
    onBtnClickListener: () -> Unit,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            style = MaterialTheme.typography.h1,
            text = stringResource(R.string.login_screen_help_text)
        )

        Spacer(modifier = Modifier.height(DEFAULT_VERTICAL_PADDING * 4))

        Button(onClick = onBtnClickListener) {

            Text(
                text = stringResource(R.string.login_screen_test_account_button)
            )

        }

    }

}
