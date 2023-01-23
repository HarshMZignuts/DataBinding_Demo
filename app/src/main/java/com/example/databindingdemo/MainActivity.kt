package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.model.MyName
import com.example.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private val myName : MyName = MyName("Harsh Mistry")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.myname = myName // here first myname is from layout data veriable and second myName is object of Myname Data class

        binding.btnAdd.setOnClickListener {

            addnick(it)
        }

    }
    fun addnick(view: View)
    {

        binding.apply {
            myName.nickname = etName.text.toString()
            invalidateAll()
//            binding.tvName.text = binding.etName.text.toString()
//            binding.etName.visibility = View.GONE
//            binding.btnAdd.visibility = View.GONE


        }
    }
}