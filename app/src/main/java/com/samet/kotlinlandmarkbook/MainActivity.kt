package com.samet.kotlinlandmarkbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.samet.kotlinlandmarkbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var landmarkList: ArrayList<LandMark>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList= ArrayList<LandMark>()

        //Data
        val pisa = LandMark("Pisa","İtaly",R.drawable.pisa)
        val colosseum = LandMark("Colosseum","İtaly",R.drawable.colosseum)
        val eiffel= LandMark("Eiffel","France",R.drawable.eiffel)
        val londonbridge=LandMark("London Bridge","UK",R.drawable.londonbridge)

        landmarkList.add(pisa)
        landmarkList.add(colosseum)
        landmarkList.add(eiffel)
        landmarkList.add(londonbridge)


        binding.recyclerView.layoutManager=LinearLayoutManager(this )
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter=landmarkAdapter

       /*
        //Adapter : Layout ile datayı birbirne bağlayan kullanıcıya göstermeye yarayan yapı

        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkList.map { landMark ->landMark.name  })

        binding.listView.adapter=adapter
        binding.listView.onItemClickListener= AdapterView.OnItemClickListener { parent, view, position, id ->
          val intent = Intent(MainActivity@this,DetailsActivity::class.java)
            intent.putExtra("landmark",landmarkList.get(position))
            startActivity(intent)

        }
        */
    }
}