package deasmp.com.futballclub

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.ViewManager
import android.widget.FrameLayout
import org.jetbrains.anko.*
import org.jetbrains.anko.custom.ankoView

class ProfilClub : AppCompatActivity(){

    inline fun ViewManager.customFrameLayout(theme: Int = 0, init: FrameLayout.() -> Unit): FrameLayout {
        return ankoView({ FrameLayout(it) }, theme = theme, init = init)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ProfilClubUI().setContentView(this)

    }



    class ProfilClubUI (): AnkoComponent<ProfilClub> {
        override fun createView(ui: AnkoContext<ProfilClub>) = with(ui) {
            verticalLayout {

                imageView(R.drawable.img_madrid).lparams(width = matchParent) {
                    padding = dip(20)
                    margin = dip(15)
                }

                val name = editText() {
                    hint = "Who is your name?"
                }

                button("Say Hello")




            }
        }
    }
}