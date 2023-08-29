package com.a_code.moneyplanner.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.a_code.moneyplanner.R

@Composable
fun TableRow(label: String, hasArrow: Boolean = false, hasDestructive: Boolean = false) {
    Row(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 10.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        val textColor = if (hasDestructive) Color.Red else Color.White

        Text(
            text = label,
            style = MaterialTheme.typography.bodyLarge,
            color = textColor
        )
        if (hasArrow) {
            Icon(
                painterResource(id = R.drawable.arrow_right),
                contentDescription = "",
                tint = Color.LightGray,
                modifier = Modifier
                    .clickable { }
            )
        } else {
            Box {}
        }

    }
    Divider()
}