package me.dean.android.material.design.learning.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.ksoichiro.android.observablescrollview.ObservableScrollViewCallbacks
import com.github.ksoichiro.android.observablescrollview.ScrollState
import com.github.ksoichiro.android.observablescrollview.ScrollUtils
import kotlinx.android.synthetic.main.fragment_dates_detail4.*
import me.dean.android.material.design.learning.R


class DatesDetailFragment4 : Fragment(), ObservableScrollViewCallbacks {
    private val mParallaxImageHeight by lazy { resources.getDimensionPixelSize(R.dimen.parallax_image_height) }


    override fun onScrollChanged(scrollY: Int, firstScroll: Boolean, dragging: Boolean) {
        //val baseColor = resources.getColor(R.color.bar_color)
        val alpha = Math.min(1f, scrollY.toFloat() / mParallaxImageHeight)
        //toolbar2.setBackgroundColor(ScrollUtils.getColorWithAlpha(alpha, baseColor))
        toolbar2.alpha = alpha
        titleText.alpha = 1f - alpha
    }

    override fun onDownMotionEvent() {
    }

    override fun onUpOrCancelMotionEvent(scrollState: ScrollState?) {
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_dates_detail4, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toolbar.setNavigationIcon(R.drawable.top_bar_close_icon)
        toolbar2.setNavigationIcon(R.drawable.top_bar_close_icon)
        scrollView.setScrollViewCallbacks(this)
        scrollView.setBackgroundColor(ScrollUtils.getColorWithAlpha(0f, resources.getColor(R.color.bar_color)))
        toolbar2.alpha = 0f
        toolbar2.title = "Participate to a funny dance class️"
        toolbar2.subtitle = "12/10/2018 at 18h"
    }

    companion object {
        fun newInstance(): DatesDetailFragment {
            return DatesDetailFragment()
        }
    }
}