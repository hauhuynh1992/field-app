package com.crayon.fieldapp.ui.screen.monitor.reportSales.detailTask.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.OrderResponse
import com.crayon.fieldapp.utils.setSingleClick
import java.text.DecimalFormat

class ManageOrderRVAdapter constructor(
    val items: ArrayList<OrderResponse>,
    val context: Context,
    val onItemClickListener: (OrderResponse) -> Unit = {}
) : RecyclerView.Adapter<ManageOrderRVAdapter.JobViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_order, parent, false)
        val holder = JobViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: JobViewHolder, position: Int) {
        val data = items[position]
        holder.txtOrderId.text = "Đơn hàng " + (position + 1).toString()
        holder.itemView.setSingleClick {
            onItemClickListener(data)
        }
        holder.txtLoadMore.visibility = View.GONE
        data.products?.let { mListProduct ->
            if (mListProduct.size <= 1) {
                holder.txtLoadMore.visibility = View.GONE
            } else {
                holder.txtLoadMore.visibility = View.VISIBLE
                holder.txtLoadMore.text = "Xem thêm " + (mListProduct.size - 1) + " sản phẩm"
            }

            if (mListProduct.size >= 1) {
                holder.txtProductName.text = mListProduct.get(0).name
                holder.txtQuality.text = mListProduct.get(0).quantity.toString()
            }

            val total = mListProduct.sumBy { it.price * it.quantity }
            val format = DecimalFormat("#,###")
            format.maximumFractionDigits = 0
            holder.txtTotal.text = format.format(total) + "vnd"
        }
    }

    inner class JobViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtOrderId: TextView
        var txtProductName: TextView
        var txtQuality: TextView
        var txtTotal: TextView
        var txtLoadMore: TextView
        var imgEdit: ImageView

        init {
            txtOrderId = itemView.findViewById(R.id.txt_order_id)
            txtProductName = itemView.findViewById(R.id.txt_name)
            txtQuality = itemView.findViewById(R.id.txt_quality)
            txtTotal = itemView.findViewById(R.id.txt_total)
            txtLoadMore = itemView.findViewById(R.id.txt_load_more)
            imgEdit = itemView.findViewById(R.id.img_edit)
        }

    }

    override fun getItemCount(): Int {
        return this.items.size
    }

    fun addAll(jobs: List<OrderResponse>) {
        items.addAll(jobs)
        notifyDataSetChanged()
    }

    fun clearAll() {
        items.clear()
        notifyDataSetChanged()
    }

}