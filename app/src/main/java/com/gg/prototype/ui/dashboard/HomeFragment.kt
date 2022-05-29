package com.gg.prototype.ui.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.gg.prototype.R
import com.gg.prototype.model.Birthdays
import com.gg.prototype.model.Households
import kotlinx.android.synthetic.main.fragment_home.*


/**
 * Created by gaurav
 */
class HomeFragment : Fragment() {
    private var houseHoldList = ArrayList<Households>()
    private var birthdayList = ArrayList<Birthdays>()

    companion object {
        fun newInstance() = HomeFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initHouseholdsAdapter()
        initBirthdayAdapter()
    }

    private fun initHouseholdsAdapter() {
        houseHoldList.clear()
        val households1 = Households("Rachel Thomas","Wife",R.drawable.ic_dummy_two)
        houseHoldList.add(households1)
        val households2 = Households("Aby Thomas","Sister",R.drawable.ic_profile_dummy)
        houseHoldList.add(households2)
        val households3 = Households("Robin Thomas","Brother",R.drawable.ic_dummy_one)
        houseHoldList.add(households3)

        rcvHouseholdsList.layoutManager = LinearLayoutManager(activity,LinearLayoutManager.HORIZONTAL, false)
        rcvHouseholdsList.isNestedScrollingEnabled = false
        rcvHouseholdsList.itemAnimator = DefaultItemAnimator()
        rcvHouseholdsList.setHasFixedSize(true)
        rcvHouseholdsList.adapter = HouseholdsAdapter(houseHoldList)
    }

    private fun initBirthdayAdapter() {
        birthdayList.clear()
        val birthday1 = Birthdays("Aby Thomas","May 27 2022,Friday ",R.drawable.ic_profile_dummy)
        birthdayList.add(birthday1)
        val birthday2 = Birthdays("Aby Thomas","May 28 2022,Saturday",R.drawable.ic_profile_dummy)
        birthdayList.add(birthday2)
        val birthday3 = Birthdays("Aby Thomas","May 29 2022,Sunday",R.drawable.ic_profile_dummy)
        birthdayList.add(birthday3)

        rcvBirthdaysList.layoutManager = LinearLayoutManager(activity,LinearLayoutManager.HORIZONTAL, false)
        rcvBirthdaysList.isNestedScrollingEnabled = false
        rcvBirthdaysList.itemAnimator = DefaultItemAnimator()
        rcvBirthdaysList.setHasFixedSize(true)
        rcvBirthdaysList.adapter = BirthdaysAdapter(birthdayList)
    }
}