package com.example.lab_week_04

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

val TABS_FIXED = listOf(
    R.string.starbucks_title to R.string.starbucks_desc,
    R.string.janjijiwa_title to R.string.janjijiwa_desc,
    R.string.kopikenangan_title to R.string.kopikenangan_desc,
)

class CafeAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle,
    private val context: Context
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return TABS_FIXED.size
    }

    override fun createFragment(position: Int): Fragment {
        val (titleRes, descRes) = TABS_FIXED[position]
        val title = context.getString(titleRes)
        val desc = context.getString(descRes)
        return CafeDetailFragment.newInstance(title, desc)
    }
}
