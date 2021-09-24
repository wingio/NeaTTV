package xyz.wingio.neattv.widgets.user.profile

import android.R.color
import android.content.Context
import android.graphics.Typeface
import android.net.Uri
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.StyleSpan
import android.text.style.TextAppearanceSpan
import android.text.style.TypefaceSpan
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.drawee.generic.RoundingParams
import com.facebook.drawee.interfaces.DraweeController
import com.facebook.drawee.view.SimpleDraweeView
import com.facebook.imagepipeline.request.ImageRequest
import com.google.android.material.resources.TextAppearance
import kotlinx.android.synthetic.main.profile_header.view.*
import xyz.wingio.neattv.R
import xyz.wingio.neattv.databinding.UserProfileBinding
import xyz.wingio.neattv.models.user.User
import java.lang.StringBuilder


class WidgetUserProfile(ctx: Context) : ConstraintLayout(ctx) {
    var binding: UserProfileBinding

    init {
        LayoutInflater.from(ctx).inflate(R.layout.profile_header, this)
        binding = UserProfileBinding(this, username_text, avatar, banner, user_status, user_bio)
        val roundingParams = RoundingParams.fromCornersRadius(5f)
        roundingParams.roundAsCircle = true
        avatar.hierarchy.roundingParams = roundingParams
        avatar.setImageURI("https://static-cdn.jtvnw.net/jtv_user_pictures/823de8bd-e951-4675-9772-d728f81a1ee3-profile_image-300x300.png")
        banner.setImageURI("https://static-cdn.jtvnw.net/jtv_user_pictures/5040002e-d359-4e02-9c7c-460e876eaf70-profile_banner-480.png")
    }

    fun setUser(user: User){
        binding.b.text = user.username
        var userstatus : StringBuilder = StringBuilder().append(this.resources.getText(R.string.last_stream)).append(" Aug 19, 2019")
        var span : SpannableStringBuilder = SpannableStringBuilder(userstatus)
        span.setSpan(StyleSpan(Typeface.BOLD), this.resources.getText(R.string.last_stream).length, userstatus.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        binding.e.text = span

        binding.f.visibility = View.VISIBLE
        binding.f.text = ":)"
    }

}