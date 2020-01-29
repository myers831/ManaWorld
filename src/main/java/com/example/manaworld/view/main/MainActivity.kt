package com.example.manaworld.view.main

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.manaworld.R
import kotlinx.android.synthetic.main.activity_main.*
import android.view.MenuItem
import android.widget.LinearLayout
import com.example.manaworld.view.log.LogActivity

class MainActivity : AppCompatActivity(){

    private lateinit var viewAdapter: MainHolderViewAdapter

    private lateinit var mainData: Array<String>

    private lateinit var mainLayout: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // add back arrow to toolbar
        if (supportActionBar != null){
            supportActionBar!!.setDisplayHomeAsUpEnabled(true)
            supportActionBar!!.setDisplayShowHomeEnabled(true)
        }

        mainData = arrayOf("Zaidan Black", "Kain Black", "Ezra Black", "Phantom Seekers", "Iron Gaaurd", "Lira Black", "Winters")

        my_recycler_view.layoutManager = LinearLayoutManager(this)
        viewAdapter = MainHolderViewAdapter(this, mainData)
//        viewAdapter.setClickListener(this)
        my_recycler_view.adapter = viewAdapter

        mode1.setOnClickListener {
            val intent = Intent(this, LogActivity::class.java)
            startActivity(intent)
        }

        mode2.setOnClickListener {

        }

        mode3.setOnClickListener{

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
