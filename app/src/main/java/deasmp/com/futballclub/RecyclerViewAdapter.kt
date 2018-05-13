package deasmp.com.futballclub

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_list.view.*

class RecyclerViewAdapter(private val context: Context, private val items: List<Item>)
    : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>()
{
//    val adapter = RecyclerViewAdapter(context, items){
//        startActivity<ProfilClub>("name" to "${name}", "image" to image)
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items[position])
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

//        val name = view.findViewById<TextView>(R.id.name)
//        private val image = view.findViewById<ImageView>(R.id.image)


        fun bindItem(items: Item) {
            itemView.name.text = items.name
            Glide.with(itemView.context).load(items.image).into(itemView.image)
            itemView.setOnClickListener(){
                Log.d("test", "Berhasil" +" "+items.name)
                val context = itemView.context
                val intent = Intent(context, ProfilClub::class.java)
                intent.putExtra("name", items.name)
                intent.putExtra("image", items.image)
                intent.putExtra("description", items.description)
                context.startActivity(intent)

            }
        }
    }
}