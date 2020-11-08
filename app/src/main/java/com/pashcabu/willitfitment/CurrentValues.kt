package com.pashcabu.willitfitment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.pashcabu.willitfitment.fragments.CurrentValuesFragment

class CurrentValues : FragmentActivity() {

    private lateinit var viewPager:ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_current_values)
        viewPager = findViewById(R.id.current_vp)
        val pagerAdapter = ScreenSlidePagerAdapter(this)
        viewPager.adapter = pagerAdapter

    }

    override fun onBackPressed() {
        if (viewPager.currentItem==0){
            super.onBackPressed()
        }
        else{
            viewPager.currentItem=viewPager.currentItem-1
        }
    }
private inner class ScreenSlidePagerAdapter(fa:FragmentActivity) : FragmentStateAdapter(fa){
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            1-> CurrentValuesFragment("Rear")
            else -> CurrentValuesFragment("Front")
        }
    }

}
}

