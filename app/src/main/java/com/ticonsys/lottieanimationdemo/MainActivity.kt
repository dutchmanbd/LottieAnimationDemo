package com.ticonsys.lottieanimationdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RawRes
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShipAnimation.setOnClickListener {
            navigateMainActivity(R.raw.ship)
        }

        btnQrCode1.setOnClickListener {
            navigateMainActivity(R.raw.qr_code_1)
        }

        btnQrCode2.setOnClickListener {
            navigateMainActivity(R.raw.qr_code_2)
        }
    }

    private fun navigateMainActivity(@RawRes animationId: Int){
        Intent(this, AnimationPlayerActivity::class.java).let {
            it.putExtra(Constant.INTENT_ANIMATION_ID, animationId)
            startActivity(it)
        }
    }
}