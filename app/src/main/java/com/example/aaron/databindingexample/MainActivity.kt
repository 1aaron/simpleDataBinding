package com.example.aaron.databindingexample

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.aaron.databindingexample.data.User
import com.example.aaron.databindingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val user = User("Kuma",23)
        binding.setVariable(BR.user,user)
        binding.executePendingBindings()
    }
}
