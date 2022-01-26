package com.example.ipz_smirnov.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ipz_smirnov.CustomRecyclerAdapter
import com.example.ipz_smirnov.R

class GalleryFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_gallery, container, false)

        val recyclerView: RecyclerView = root.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(root.context)
        recyclerView.adapter = CustomRecyclerAdapter(getStudyList(), getYearsList())


        return root
    }

    private fun getStudyList(): List<String> {
        return this.resources.getStringArray((R.array.study_names)).toList()
    }

    private fun getYearsList(): List<String> {
        return this.resources.getStringArray((R.array.study_years)).toList()
    }
}