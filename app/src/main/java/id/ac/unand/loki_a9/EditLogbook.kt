package id.ac.unand.loki_a9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EditLogbook : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_logbook)

        val btn : Button = findViewById (R.id.button3)
        btn.setOnClickListener {
            intent = Intent(this, Logbook::class.java)
            startActivity(intent)
        }
    }
}