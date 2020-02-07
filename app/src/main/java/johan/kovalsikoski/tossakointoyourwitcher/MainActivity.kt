package johan.kovalsikoski.tossakointoyourwitcher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val viewModel by inject<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv.setOnClickListener {
            tv.text = viewModel.returnClick()
        }

        tv.setOnLongClickListener {
            tv.text = viewModel.returnLongClick()
            true
        }

    }
}
