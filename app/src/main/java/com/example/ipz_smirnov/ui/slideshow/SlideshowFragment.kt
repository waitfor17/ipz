package com.example.ipz_smirnov.ui.slideshow

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.ipz_smirnov.R

class SlideshowFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_slideshow, container, false)
        val btnf: Button? = root.findViewById(R.id.link_link)
        if (btnf != null) {
            btnf.setOnClickListener {
                val uris = Uri.parse("https://portfolio.rgsu.net/")
                val intents = Intent(Intent.ACTION_VIEW, uris)
                val b = Bundle()
                b.putBoolean("new_window", true)
                intents.putExtras(b)
                context?.startActivity(intents)
            }
        }
        return root
    }
}