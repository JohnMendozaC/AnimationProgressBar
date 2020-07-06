package com.lupesoft.animationprogressbar

import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.ViewPropertyAnimator
import android.view.animation.DecelerateInterpolator
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.progressbar.*

class MainActivity : AppCompatActivity() {

    var isTablet = false
    private var vAnimate: ViewPropertyAnimator? = null
    private var progressNumber: Int = 1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showMenuOptions(progressNumber)

        previous.setOnClickListener {
            if (progressNumber in 2..8) {
                progressNumber -= 1
                showMenuOptions(progressNumber)
            } else if (progressNumber == 1) {
                Toast.makeText(applicationContext, "no puede seguir atras", Toast.LENGTH_LONG)
                    .show()
            }
        }

        next.setOnClickListener {
            if (progressNumber in 1..7) {
                progressNumber += 1
                showMenuOptions(progressNumber)
            } else if (progressNumber == 7) {
                Toast.makeText(applicationContext, "no puede seguir adelante", Toast.LENGTH_LONG)
                    .show()
            }
        }

    }


    fun showMenuOptions(type: Int) {
        when (type) {
            1 -> {
                ovalOne.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_oval_ring))
                ovalTwo.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_oval))
                setProgressPercentage(0)

            }
            2 -> {
                ovalOne.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_oval_fill_ring))
                ovalTwo.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_oval_ring))
                setProgressPercentage(70)
                ovalThree.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_oval))
                setLeftMarginAnimation(0, clProgress)
            }
            3 -> {
                ovalOne.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_oval_fill_ring))
                ovalTwo.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_oval_fill_ring))
                ovalThree.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_oval_ring))
                ovalFour.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_oval))
                setProgressPercentage(135)
                if (!isTablet)
                    setLeftMarginAnimation(-64, clProgress)
            }
            4 -> {
                ovalOne.setImageDrawable(
                    ContextCompat.getDrawable(
                        this,
                        R.drawable.ic_oval_fill_ring
                    )
                )
                ovalTwo.setImageDrawable(
                    ContextCompat.getDrawable(
                        this,
                        R.drawable.ic_oval_fill_ring
                    )
                )
                ovalThree.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_oval_ring))
                ovalFour.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_oval))
                setProgressPercentage(135)
                if (!isTablet)
                    setLeftMarginAnimation(-64, clProgress)
            }
            5 -> {
                ovalOne.setImageDrawable(
                    ContextCompat.getDrawable(
                        this,
                        R.drawable.ic_oval_fill_ring
                    )
                )
                ovalTwo.setImageDrawable(
                    ContextCompat.getDrawable(
                        this,
                        R.drawable.ic_oval_fill_ring
                    )
                )
                ovalThree.setImageDrawable(
                    ContextCompat.getDrawable(
                        this,
                        R.drawable.ic_oval_fill_ring
                    )
                )
                ovalFour.setImageDrawable(
                    ContextCompat.getDrawable(
                        this,
                        R.drawable.ic_oval_ring
                    )
                )
                ovalFive.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_oval))
                setProgressPercentage(200)
                if (!isTablet)
                    setLeftMarginAnimation(-164, clProgress)
            }
            6 -> {
                ovalOne.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_oval_fill_ring))
                ovalTwo.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_oval_fill_ring))
                ovalThree.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_oval_fill_ring))
                ovalFour.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_oval_fill_ring))
                ovalFive.setImageDrawable(
                    ContextCompat.getDrawable(
                        this,
                        R.drawable.ic_oval_ring
                    )
                )
                ovalFinal.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_oval))
                setProgressPercentage(264)
                if (!isTablet)
                    setLeftMarginAnimation(-264, clProgress)
            }
            7 -> {
                ovalOne.setImageDrawable(
                    ContextCompat.getDrawable(
                        this,
                        R.drawable.ic_oval_fill_ring
                    )
                )
                ovalTwo.setImageDrawable(
                    ContextCompat.getDrawable(
                        this,
                        R.drawable.ic_oval_fill_ring
                    )
                )
                ovalThree.setImageDrawable(
                    ContextCompat.getDrawable(
                        this,
                        R.drawable.ic_oval_fill_ring
                    )
                )
                ovalFour.setImageDrawable(
                    ContextCompat.getDrawable(
                        this,
                        R.drawable.ic_oval_fill_ring
                    )
                )
                ovalFive.setImageDrawable(
                    ContextCompat.getDrawable(
                        this,
                        R.drawable.ic_oval_fill_ring
                    )
                )
                ovalFinal.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_oval_ring))
                setProgressPercentage(329)
                if (!isTablet)
                    setLeftMarginAnimation(-342, clProgress)
            }
            8 -> {
                ovalOne.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_oval_fill_ring))
                ovalTwo.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_oval_fill_ring))
                ovalThree.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_oval_fill_ring))
                ovalFour.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_oval_fill_ring))
                ovalFive.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_oval_fill_ring))
                ovalFinal.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_oval_ring))
                setProgressPercentage(329)
                if (!isTablet)
                    setLeftMarginAnimation(-342, clProgress)
            }
        }
    }

    private fun setProgressPercentage(value: Int) {
        val anim = ObjectAnimator.ofInt(vertical_progressbar, "progress", value)
        anim.duration = 800
        anim.interpolator = DecelerateInterpolator()
        anim.start()
    }

    fun setLeftMarginAnimation(value: Int, constraint: ConstraintLayout) {
        val d = resources.displayMetrics.density
        val margin = (value * d)// margin in pixels
        vAnimate = constraint.animate()
            .x(margin)
            .setDuration(500)
        vAnimate?.start()
    }


}