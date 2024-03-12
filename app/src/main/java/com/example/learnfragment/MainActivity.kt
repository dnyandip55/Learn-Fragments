package com.example.learnfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun loadCalci(view: View) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainerView,CalculatorFragment())
            .commit()

    }
    fun loadDummy(view: View) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainerView,DummyToast())
            .commit()

    }

    fun loadTeam(view: View) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainerView,RecyclerFragment())
            .commit()
    }

    fun fragmentCommunication(view: View) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainerView,InputFragment())
            .commit()
    }

    override fun onBackPressed() {
        if(supportFragmentManager.backStackEntryCount>0){
            supportFragmentManager.popBackStack()
        }else{
            super.onBackPressed()
        }

    }
}