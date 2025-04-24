package com.example.mindfit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import com.example.mindfit.ui.theme.MindFitTheme

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Configuración para usar Compose en AppCompatActivity
        setContentView(
            ComposeView(this).apply {
                setContent {
                    MindFitTheme {
                        WelcomeScreen()
                    }
                }
            }
        )
    }
}

@Composable
fun WelcomeScreen() {
    Text("¡Bienvenido a MindFit!")
}

@Preview
@Composable
fun PreviewWelcomeScreen() {
    MindFitTheme {
        WelcomeScreen()
    }
}