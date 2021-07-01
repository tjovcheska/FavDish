package com.tutorials.eu.favdish.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.tutorials.eu.favdish.R

// TODO Step 3: Rename the NotificationsFragment to RandomDishFragment. Remove the unused code and ViewModel Class.
class RandomDishFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_random_dish, container, false)
        val textView: TextView = root.findViewById(R.id.text_notifications)
        textView.text = "Random Dish Fragment"
        return root
    }
}