package uz.iskandarbek.change_color_fragments

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.iskandarbek.change_color_fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .replace(R.id.mycontainer, ChangeFragment())
            .commit()
    }

    override fun onResume() {
        super.onResume()
        if (MyColor.color != "") {
            binding.main.setBackgroundColor(Color.parseColor(MyColor.color))
        }
    }
}
