package dk.malone.dafl.scorekeeper.activity

import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import dk.malone.dafl.scorekeeper.databinding.ActivityDaflBinding

/**
 * Main activity for all fragments
 */
class DaflActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDaflBinding

    override fun onCreate(savedInstanceState: Bundle?,) {
        super.onCreate(savedInstanceState)

        // Remove the title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE)

        binding = ActivityDaflBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}