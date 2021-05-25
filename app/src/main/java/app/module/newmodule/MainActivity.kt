package app.module.newmodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.module.logmodule.LogModule

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LogModule.logD("")

    }
}