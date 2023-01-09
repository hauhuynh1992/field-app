package com.crayon.fieldapp.ui.screen.detailTask.reportCompetitor.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.utils.setSingleClick

class ReportCompetitorRVAdapter constructor(
    val items: ArrayList<String>,
    val context: Context,
    val onItemClick: (String) -> Unit = {},
    val onImageClick: (String) -> Unit = {}
) :
    RecyclerView.Adapter<ReportCompetitorRVAdapter.GroupViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_competitor, parent, false)
        val holder = GroupViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        val data = items[position]
        holder.txtCustomerId.text = "Hoạt động " + (position + 1)

        holder.itemView.setSingleClick {
            onItemClick(data)
        }

        holder.cvImage1?.setSingleClick {
            onImageClick(data)
        }

    }

    inner class GroupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtCustomerId: TextView
        var txtName: TextView
        var txtType: TextView
        var txtDate: TextView
        var txtGift: TextView
        var cvImage1: CardView
        var cvImage2: CardView
        var cvImage3: CardView

        init {
            txtCustomerId = itemView.findViewById(R.id.txt_customer_num)
            txtName = itemView.findViewById(R.id.txt_name)
            txtType = itemView.findViewById(R.id.txt_type)
            txtDate = itemView.findViewById(R.id.txt_date)
            txtGift = itemView.findViewById(R.id.txt_note)
            cvImage1 = itemView.findViewById(R.id.cv_image1)
            cvImage2 = itemView.findViewById(R.id.cv_image2)
            cvImage3 = itemView.findViewById(R.id.cv_image3)
        }
    }

    override fun getItemCount(): Int {
        return this.items.size
    }

    fun clearData() {
        items.clear()
        notifyDataSetChanged()
    }

}