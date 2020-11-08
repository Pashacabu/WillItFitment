package com.pashcabu.willitfitment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.pashcabu.willitfitment.R

class CurrentValuesFragment(whichAxis:String): Fragment() {

    private val axis : String = whichAxis
    private lateinit var tvLabel:TextView


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.current_fragment, container, false)
        tvLabel = view.findViewById(R.id.axis_label)
        tvLabel.text=axis
        return view
    }
}