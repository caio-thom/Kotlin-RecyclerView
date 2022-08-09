package br.com.fiap.nac02_caiothomaznogueira_3sib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var foods = mutableListOf<Food>(
        Food(R.drawable.ic_food_avocado, "Avocado",  10, 7.5, true),
        Food(R.drawable.ic_food_burger, "Burger", 0, 15.2, false),
        Food(R.drawable.ic_food_carrot, "Carrot", 0, 4.3, false),
        Food(R.drawable.ic_food_cheeseburger, "Cheeseburger",  2, 18.5, true),
        Food(R.drawable.ic_food_gyoza, "Gyoza", 0 , 8.9, false),
        Food(R.drawable.ic_food_hotdog, "Hotdog",  9, 8.6, true),
        Food(R.drawable.ic_food_lobster, "Lobster",  4, 40.5, true),
        Food(R.drawable.ic_food_noodle, "Noodle",  0, 4.6, false),
        Food(R.drawable.ic_food_rice, "Rice", 100, 5.8, true),
        Food(R.drawable.ic_food_shrimp, "Shirimp", 120, 10.6, true),
        Food(R.drawable.ic_food_steak, "Steak",  60, 25.6, true))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this )
        recyclerView.adapter = FoodAdapter(foods)

        val itemDecor = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        recyclerView.addItemDecoration(itemDecor)
    }
}
