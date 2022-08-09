package br.com.fiap.nac02_caiothomaznogueira_3sib

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter (private val dataSet: List<Food>): RecyclerView.Adapter<FoodAdapter.ViewHolder>(){

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val imageViewPerfil: ImageView
        val textViewUser: TextView
        val textViewDate: TextView
        val textViewTitle: TextView
        val imageButtonFavorite: ImageButton

        init {
            imageViewPerfil = view.findViewById(R.id.img_Food)
            textViewUser = view.findViewById(R.id.txtName)
            textViewDate = view.findViewById(R.id.txtPrice)
            textViewTitle = view.findViewById(R.id.txtQuantity)
            imageButtonFavorite = view.findViewById(R.id.btn_But)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_foodlist, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val food = dataSet[position]

        holder.imageViewPerfil.setImageResource(food.image)
        holder.textViewUser.text = food.name
        holder.textViewTitle.text = ("estoque: "  + food.quantity.toString())
        holder.textViewDate.text= ("R$: " + food.price.toString()+ "\npor unidade ")

        if(food.stock){
            holder.imageButtonFavorite.setImageResource(R.drawable.ic_buy_true)
            holder.textViewTitle.setTextColor(Color.parseColor("#2E8B57"))
        }
        else{
            holder.imageButtonFavorite.setImageResource(R.drawable.ic_buy_false)
            holder.textViewTitle.setTextColor(Color.parseColor("#BF0A30"))

        }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}