package com.ticonsys.lottieanimationdemo

import android.animation.Animator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.animation.Animation
import kotlinx.android.synthetic.main.activity_animation_player.*

class AnimationPlayerActivity : AppCompatActivity() {

    companion object{
        private const val TAG = "AnimationPlayerActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_player)

        val rawId = intent.getIntExtra(Constant.INTENT_ANIMATION_ID, R.raw.ship)
        lottieAnimationView.setAnimation(rawId)
        lottieAnimationView.playAnimation()
        //lottieAnimationView.repeatCount = 2
        lottieAnimationView.addAnimatorListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animator: Animator?) {

            }

            override fun onAnimationEnd(animator: Animator?) {
                Log.d(TAG, "onAnimationEnd: ")
                finish()
            }

            override fun onAnimationCancel(animator: Animator?) {

            }

            override fun onAnimationRepeat(animator: Animator?) {

            }

        })
    }
}

