package datatransportation.sinan.com.ui.data

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import datatransportation.sinan.com.R
import datatransportation.sinan.com.model.UserModelParcelable
import datatransportation.sinan.com.ui.MainActivity
import kotlinx.android.synthetic.main.activity_data_intent.*

class DataParcelableActivity : AppCompatActivity(), View.OnClickListener {


    private var userModel: UserModelParcelable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_parcelable)

        userModel = intent.extras.getParcelable("UserModelParcelable") as UserModelParcelable
        activity_data_txtData.text = "Name : " + (userModel as UserModelParcelable).name + "\nPhone : " + (userModel as UserModelParcelable).phone
        activity_data_btnBackToHome.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
