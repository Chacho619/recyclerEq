package com.example.recyclereq

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclereq.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.eqRecycler.layoutManager = LinearLayoutManager(this)

        val eqList = mutableListOf<Earthquake>()
        eqList.add(Earthquake("1", "RUSIA", 4.3, 324234L, -4545.54,342.3434))
        eqList.add(Earthquake("2", "MEXICO", 7.8, 324234L, -4545.54,342.3434))
        eqList.add(Earthquake("3", "ARGENTINA", 6.5, 324234L, -4545.54,342.3434))
        eqList.add(Earthquake("4", "CHILE", 5.8, 324234L, -4545.54,342.3434))
        eqList.add(Earthquake("5", "ECUADOR", 6.9, 324234L, -4545.54,342.3434))
        eqList.add(Earthquake("6", "CHINA", 8.0, 324234L, -4545.54,342.3434))
        eqList.add(Earthquake("7", "JAPON", 5.1, 324234L, -4545.54,342.3434))
        val adapter = EqAdapter()
        binding.eqRecycler.adapter = adapter
        adapter.submitList(eqList)

    }
}