package com.gg.prototype.ui.dashboard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gg.prototype.R
import com.gg.prototype.model.Households
import kotlinx.android.synthetic.main.households_item_layout.view.*

/**
 * Created by gaurav
 */
class HouseholdsAdapter(private val householdsList:ArrayList<Households>): RecyclerView.Adapter<HouseholdsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.households_item_layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.image.setImageResource(householdsList[position].image)
        holder.name.text = householdsList[position].name
        holder.relation.text = householdsList[position].relation
    }

    override fun getItemCount(): Int {
        return householdsList.size
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val image = itemView.ivHouseHoldPic!!
        val name = itemView.tvHouseholdName!!
        val relation = itemView.tvHouseholdRelation!!
    }
}