package com.gg.prototype.ui.dashboard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gg.prototype.R
import com.gg.prototype.model.Birthdays
import kotlinx.android.synthetic.main.birthdays_item_layout.view.*

/**
 * Created by gaurav
 */
class BirthdaysAdapter(private val birthdayList:ArrayList<Birthdays>): RecyclerView.Adapter<BirthdaysAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.birthdays_item_layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.image.setImageResource(birthdayList[position].image)
        holder.name.text = birthdayList[position].name
        holder.date.text = birthdayList[position].date

        if(position%2 == 0) {
            holder.subIcon.visibility = View.GONE
            holder.bulr.visibility = View.VISIBLE
            holder.name.alpha = 0.5f
            holder.date.alpha = 0.5f
        }else{
            holder.subIcon.visibility = View.VISIBLE
            holder.bulr.visibility = View.GONE
            holder.name.alpha = 1f
            holder.date.alpha = 1f
        }
    }

    override fun getItemCount(): Int {
        return birthdayList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val image = itemView.ivBirthdayPic!!
        val name = itemView.tvBirthdayName!!
        val date = itemView.tvBirthdayDate!!
        val subIcon = itemView.flSubIcon!!
        val bulr = itemView.ivBlurPic!!
    }
}