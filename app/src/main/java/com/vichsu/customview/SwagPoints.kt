package com.vichsu.customview

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.core.content.ContextCompat
import androidx.lifecycle.LiveData

class SwagPoints @JvmOverloads constructor(context: Context,attrs: AttributeSet) : View(context,attrs) {


    init {
        init(context,attrs)
        //Dimen

    }



    private fun init(context: Context,attrs: AttributeSet){

        val density = resources.displayMetrics.density

//        <attr name="points" format="integer"/>
//        <attr name="max" format="integer"/>
//        <attr name="min" format="integer"/>
//        <attr name="step" format="integer"/>
//
//        <attr name="indicatorIcon" format="reference"/>
//
//        <attr name="progressWidth" format="dimension"/>
//        <attr name="progressColor" format="color"/>
//
//        <attr name="arcWidth" format="dimension"/>
//        <attr name="arcColor" format="color"/>
//
//        <attr name="textSize" format="dimension"/>
//        <attr name="textColor" format="color"/>
//
//        <attr name="clockwise" format="boolean"/>
//        <attr name="enabled" format="boolean"/>

        // Colors
        val arcColor = ContextCompat.getColor(context,R.color.color_arc)
        val progressColor = ContextCompat.getColor(context,R.color.color_progress)
        val textColor = ContextCompat.getColor(context,R.color.color_text)

        val progressWidth :Int
        val arcWidth:Int
        val textSize:Int

        val indicatorIcon = ContextCompat.getDrawable(context,R.drawable.indicator)

        /////開始把變數跟typeArray串起來
        val typeArray = context.obtainStyledAttributes(attrs,R.styleable.SwagPoints,0,0)

        val newIndicatorIcon = typeArray.getDrawable(R.styleable.SwagPoints_indicatorIcon)







    }


}


