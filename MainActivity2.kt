import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val openNewActivity2 : Button = findViewById(R.id.button2)
        openNewActivity2.setOnClickListener{
            val intent1 = Intent(this, MainActivity :: class.java)
            startActivity(intent1)
        }


    }
}
