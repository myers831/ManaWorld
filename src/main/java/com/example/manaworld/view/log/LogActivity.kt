package com.example.manaworld.view.log

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.manaworld.R

class LogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log)

        // add back arrow to toolbar
        if (supportActionBar != null){
            supportActionBar!!.setDisplayHomeAsUpEnabled(true)
            supportActionBar!!.setDisplayShowHomeEnabled(true)
        }
    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount > 0) {
            supportFragmentManager.popBackStack()
        } else {
            super.onBackPressed()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // handle arrow click here
        if (item.itemId === android.R.id.home) {
            finish() // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item)
    }
}
