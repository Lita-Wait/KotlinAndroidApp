package com.example.lesson2.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson2.Item
import com.example.lesson2.R
import com.example.lesson2.adapters.ItemAdapter

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_home, container,false)
        val data = listOf(
            Item("Спокойным", R.drawable.calm_icon),
            Item("Расслабленным", R.drawable.relax_icon),
            Item("Сосредоточенным", R.drawable.focus_icon),
            Item("Взволнованным", R.drawable.anxious_icon),
            Item("Спокойным", R.drawable.calm_icon),
            Item("Расслабленным", R.drawable.relax_icon),
            Item("Сосредоточенным", R.drawable.focus_icon),
            Item("Взволнованным", R.drawable.anxious_icon)
        )

        val recyclerView:RecyclerView = root.findViewById(R.id.firstRecycler)
        recyclerView.adapter = ItemAdapter(requireContext(),data)

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()

    }
}