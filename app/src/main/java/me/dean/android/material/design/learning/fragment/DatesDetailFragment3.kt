package me.dean.android.material.design.learning.fragment

import android.os.Bundle
import android.support.design.widget.AppBarLayout
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_dates_detail3.*
import me.dean.android.material.design.learning.R


class DatesDetailFragment3 : Fragment(), AppBarLayout.OnOffsetChangedListener {

    override fun onOffsetChanged(appBarLayout: AppBarLayout?, verticalOffset: Int) {
        val maxScroll = appBarLayout!!.totalScrollRange
        val percentage = Math.abs(verticalOffset).toFloat() / maxScroll.toFloat()
        println("percentage : $percentage")
        if (percentage == 1f) {
            userAvatarImage.visibility = View.GONE
        } else if (percentage < 1f && percentage > 0f) {
            userAvatarImage.visibility = View.VISIBLE
            userAvatarImage.alpha = 1f - percentage
        }
        userAvatarImage.animate().translationY(verticalOffset.toFloat()).setDuration(0).start()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_dates_detail3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toolbar.setNavigationIcon(R.drawable.top_bar_close_icon)
        appbarLayout.addOnOffsetChangedListener(this)
    }

    companion object {
        fun newInstance(): DatesDetailFragment {
            return DatesDetailFragment()
        }
    }
}