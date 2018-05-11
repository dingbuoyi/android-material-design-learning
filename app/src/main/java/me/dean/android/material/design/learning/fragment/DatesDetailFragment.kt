package me.dean.android.material.design.learning.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_dates_detail.*
import me.dean.android.material.design.learning.R


class DatesDetailFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_dates_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toolbar.setNavigationIcon(R.drawable.top_bar_close_icon)
        toolbar.title = "Ride Waves in Portugal"
    }

    companion object {
        fun newInstance(): DatesDetailFragment {
            return DatesDetailFragment()
        }
    }
}