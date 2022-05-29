package com.gg.prototype.ui.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.gg.prototype.R
import com.gg.prototype.base.BaseActivity
import kotlinx.android.synthetic.main.activity_dashboard.*


class DashboardActivity : BaseActivity() {
    lateinit var homeFragment: HomeFragment
    lateinit var familyFragment: FamilyFragment
    lateinit var activityFragment: ActivityFragment
    lateinit var contributionFragment: ContributionFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        homeFragment = HomeFragment.newInstance()
        familyFragment = FamilyFragment.newInstance()
        activityFragment = ActivityFragment.newInstance()
        contributionFragment = ContributionFragment.newInstance()

        setCurrentFragment(homeFragment)

        initBottomNav()
    }

    private fun initBottomNav() {
        bNavView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.menu_home -> setCurrentFragment(homeFragment)
                R.id.menu_family -> setCurrentFragment(familyFragment)
                R.id.menu_activity -> setCurrentFragment(activityFragment)
                R.id.menu_contribution -> setCurrentFragment(contributionFragment)
            }
            true
        }
    }

    private fun setCurrentFragment(fragment: Fragment) {
       supportFragmentManager.beginTransaction().apply {
           replace(R.id.flContainer,fragment)
           commit()
       }
    }
}