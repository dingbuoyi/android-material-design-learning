package com.github.siyamed.shapeimageview;

import android.content.Context;
import android.util.AttributeSet;

import com.github.siyamed.shapeimageview.shader.ShaderHelper;
import com.github.siyamed.shapeimageview.shader.SvgShader;

import me.dean.android.material.design.learning.R;

public class DiamondImageRoundCornerView extends ShaderImageView {

    public DiamondImageRoundCornerView(Context context) {
        super(context);
    }

    public DiamondImageRoundCornerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DiamondImageRoundCornerView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public ShaderHelper createImageViewHelper() {
        return new SvgShader(R.raw.imgview_diamond_round_corner);
    }
}

