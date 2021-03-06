package com.cryptoprices.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.cryptoprices.R
import com.cryptoprices.model.Coin

class PricesAdapter : androidx.recyclerview.widget.RecyclerView.Adapter<PricesAdapter.ViewHolder>() {

    var mItems: List<Coin?>
            = ArrayList()

    private lateinit var mContext: Context

    fun PricesAdapter(item: List<Coin?>, ctx: Context){
        this.mItems = item
        this.mContext = ctx
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(p0.context)
        return ViewHolder(layoutInflater.inflate(R.layout.row_prices, p0, false))
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val coin = mItems[position]
        holder.rowText1.text = coin?.name
        holder.rowText2.text = coin?.mSymbol
    }


    override fun getItemCount(): Int {
       return mItems.size
    }



    class ViewHolder(view: View): androidx.recyclerview.widget.RecyclerView.ViewHolder(view){
        val rowText1 = view.findViewById(R.id.row_text_1) as TextView
        val rowText2 = view.findViewById(R.id.row_text_2) as TextView

    }

}