package com.a_code.moneyplanner.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.a_code.moneyplanner.R

@Composable
fun TableRow(
    label: String,
    modifier: Modifier = Modifier,
    hasArrow: Boolean = false,
    hasDestructive: Boolean = false,
    content: (@Composable RowScope.() -> Unit)? = null
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
    ) {
        val textColor = if (hasDestructive) Color.Red else MaterialTheme.colorScheme.background

        Text(
            text = label,
            style = MaterialTheme.typography.bodyLarge,
            color = textColor,
            fontFamily = FontFamily(Font(R.font.font_main_regular)),
            modifier = modifier
                .padding(horizontal = 16.dp, vertical = 16.dp)
        )
        if (hasArrow) {
            Icon(
                painterResource(id = R.drawable.arrow_right),
                contentDescription = "",
                tint = Color.LightGray,
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 10.dp)
            )
        } else {
            Box {}
        }

        if (content != null) {
            content()
        }

    }
}
