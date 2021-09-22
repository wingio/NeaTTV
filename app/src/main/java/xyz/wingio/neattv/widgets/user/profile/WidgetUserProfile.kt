package xyz.wingio.neattv.widgets.user.profile

import android.R.color
import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.drawee.generic.RoundingParams
import com.facebook.drawee.interfaces.DraweeController
import com.facebook.drawee.view.SimpleDraweeView
import com.facebook.imagepipeline.request.ImageRequest
import kotlinx.android.synthetic.main.profile_header.view.*
import xyz.wingio.neattv.R
import xyz.wingio.neattv.databinding.UserProfileBinding
import xyz.wingio.neattv.models.user.User


class WidgetUserProfile(ctx: Context) : ConstraintLayout(ctx) {
    var binding: UserProfileBinding

    init {
        LayoutInflater.from(ctx).inflate(R.layout.profile_header, this)
        binding = UserProfileBinding(this, username_text)
        val roundingParams = RoundingParams.fromCornersRadius(5f)
        roundingParams.roundAsCircle = true
        avatar.hierarchy.roundingParams = roundingParams
        avatar.setImageURI("https://static-cdn.jtvnw.net/jtv_user_pictures/823de8bd-e951-4675-9772-d728f81a1ee3-profile_image-300x300.png")
        banner.setImageURI("https://static-cdn.jtvnw.net/jtv_user_pictures/5040002e-d359-4e02-9c7c-460e876eaf70-profile_banner-480.png")
    }

    fun setUser(user: User){
        binding.usernameView.text = user.username
    }

}