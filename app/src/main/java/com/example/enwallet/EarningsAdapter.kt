package com.example.enwallet


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Expenses_Adapter(val earningsList: List<Earnings>): RecyclerView.Adapter<ExpensesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpensesViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.enwallet_list_item, parent, false)
        return ExpensesViewHolder(itemView)
    }
    override fun getItemCount(): Int {
        return earningsList.size
    }
    override fun onBindViewHolder(holder: ExpensesViewHolder, position: Int) {
        val contact = earningsList[position]

    }
}
class ExpensesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
}
