package deasmp.com.futballclub

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.view.ViewManager
import android.widget.FrameLayout
import deasmp.com.futballclub.R.array.club_image
import deasmp.com.futballclub.R.array.club_name
import org.jetbrains.anko.*
import org.jetbrains.anko.custom.ankoView
import org.jetbrains.anko.recyclerview.v7.recyclerView
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivity : AppCompatActivity() {

    private var items: MutableList<Item> = mutableListOf()

    inline fun ViewManager.customFrameLayout(theme: Int = 0, init: FrameLayout.() -> Unit): FrameLayout {
        return ankoView({ FrameLayout(it) }, theme = theme, init = init)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        MainActivityUI(mAdapter = RecyclerViewAdapter(this, items)).setContentView(this)

       // val list = findViewById<RecyclerView>(R.id.club_list)
        initData()

//        list.layoutManager = LinearLayoutManager(this)
//        list.adapter = RecyclerViewAdapter(this, items)
//        club_list.layoutManager = LinearLayoutManager(this)
//        club_list.adapter = RecyclerViewAdapter(this, items)
    }

    private fun initData(){
//        val name = resources.getStringArray(R.array.club_name)
//        val image = resources.obtainTypedArray(R.array.club_image)

        val name = resources.getStringArray(club_name)
        val image = resources.obtainTypedArray(club_image)
        items.clear()
        for (i in name.indices) {
            items.add(Item(name[i],
                    image.getResourceId(i, 0)))


        }

    }

    fun onClick(v : View) {
        when(items.size){
            0 -> {
                startActivity(Intent(this, ProfilClub::class.java))
                finish()
            }
            1 -> {
                startActivity(Intent(this, ProfilClub::class.java))
                finish()
            }
            2 -> {
                startActivity(Intent(this, ProfilClub::class.java))
                finish()
            }

        }
    }
    class MainActivityUI (val mAdapter: RecyclerViewAdapter): AnkoComponent<MainActivity> {
        override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
            verticalLayout {

//                imageView(R.drawable.img_madrid).lparams(width = matchParent) {
//                    padding = dip(20)
//                    margin = dip(15)
//                }
//
//                val name = editText() {
//                    hint = "Who is your name?"
//                }
//
//                button("Say Hello")

                recyclerView{
                    layoutManager = LinearLayoutManager(ctx)
                    adapter = mAdapter

                    onClick {


                        }
                    }
                }


            }
        }
    }
}
