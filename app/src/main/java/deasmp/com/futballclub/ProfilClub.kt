package deasmp.com.futballclub

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class ProfilClub : AppCompatActivity(){

//    inline fun ViewManager.customFrameLayout(theme: Int = 0, init: FrameLayout.() -> Unit): FrameLayout {
//        return ankoView({ FrameLayout(it) }, theme = theme, init = init)
//    }
    lateinit var textTitle : TextView
    lateinit var textDescription : TextView
    lateinit var img_club : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil_club)
        //ProfilClubUI().setContentView(this)

//        verticalLayout{
//             = dip(16)
//            textTitle = textView(){
//                gravity = "center"
//            }
//        }
//
        val name: String = intent.getStringExtra("name")
        val image: Int = intent.getIntExtra("image", 0)
        val description = intent.getStringExtra("description")
        //textTitle.text = name


//
        textTitle = findViewById<TextView>(R.id.title)
        img_club = findViewById<ImageView>(R.id.imgView_club)
        textDescription = findViewById<TextView>(R.id.description_tv)

        //val name: String = intent.getStringExtra("name")


        textTitle.setText(name)
        Glide.with(this).load(image).into(img_club)
        textDescription.setText(description)









        //Toast.makeText(this, "Congrat" + name, Toast.LENGTH_LONG).show()


    }



//    class ProfilClubUI (): AnkoComponent<ProfilClub> {
//        override fun createView(ui: AnkoContext<ProfilClub>) = with(ui) {
//            verticalLayout {
//
////                imageView(R.drawable.img_madrid).lparams(width = 30, height = 30) {
////                    padding = dip(20)
////                    margin = dip(15)
////                }
//
//                var textTitle = textView()
//                val intent = intent
//                name = intent.getStringExtra("name")
//                nameTextView.text = name
//
//                button("Say Hello")
//
//
//
//
//            }
//        }
//    }
}