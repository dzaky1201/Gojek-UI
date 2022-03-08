package com.dzakyhdr.gojekui.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dzakyhdr.gojekui.R
import com.dzakyhdr.gojekui.data.menu.Menu
import com.dzakyhdr.gojekui.databinding.ItemMenuBinding

class MenuAdapter : RecyclerView.Adapter<MenuAdapter.ViewHolder>() {

    private val data = ArrayList<Menu>()

    fun setData(newData: List<Menu>?) {
        if (newData == null) return
        data.clear()
        data.addAll(newData)
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent, false)
        )


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val listData = data[position]
        holder.bind(listData)
    }

    override fun getItemCount(): Int = data.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemMenuBinding.bind(itemView)

        fun bind(menu: Menu) {
            binding.title.text = menu.title
            binding.logo.setImageResource(menu.logo)
        }
    }
}