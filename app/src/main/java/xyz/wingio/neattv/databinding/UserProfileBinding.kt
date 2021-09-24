package xyz.wingio.neattv.databinding

import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.facebook.drawee.view.SimpleDraweeView

data class UserProfileBinding(
    val a : ConstraintLayout,
    val b : TextView,
    val c : SimpleDraweeView,
    val d : SimpleDraweeView,
    val e : TextView,
    val f : TextView
) {
    fun getRoot() : ConstraintLayout{
        return a
    }
}