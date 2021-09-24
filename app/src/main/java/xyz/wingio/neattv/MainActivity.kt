package xyz.wingio.neattv

import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.drawee.interfaces.DraweeController
import com.facebook.imagepipeline.request.ImageRequest
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.splash_layout.*
import xyz.wingio.neattv.models.user.User
import xyz.wingio.neattv.utilities.Logger
import xyz.wingio.neattv.widgets.user.profile.WidgetUserProfile


class MainActivity : AppCompatActivity() {
   val logger : Logger = Logger("NeaTTV")
   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Fresco.initialize(this)
        setContentView(R.layout.splash_layout)
       var profile : WidgetUserProfile = WidgetUserProfile(this)
       profile.setUser(User("IamWing"))
        addContentView(profile, ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT))
       window.clearFlags(Window.FEATURE_ACTION_BAR)
       supportActionBar?.hide()
    }
}