package com.gg.prototype.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.gg.prototype.R
import com.gg.prototype.base.BaseActivity
import com.gg.prototype.ui.dashboard.DashboardActivity


class SplashActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.myLooper()!!).postDelayed({
            goToNext()
        },2000)
    }

    private fun goToNext() {
        openActivity(DashboardActivity::class.java)
    }


    private fun openActivity(activityName: Class<*>) {
        startActivity(Intent(this,activityName))
        finish()
    }
}