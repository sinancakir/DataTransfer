package datatransportation.sinan.com.ui.data

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import datatransportation.sinan.com.R
import datatransportation.sinan.com.model.UserModelSerializable
import datatransportation.sinan.com.ui.MainActivity
import kotlinx.android.synthetic.main.activity_data_intent.*


class DataSerializableActivity : AppCompatActivity(), View.OnClickListener {

    private var userModel: UserModelSerializable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        title = "Data Serializable Activity"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_serializable)

        userModel = intent.extras.getSerializable("UserModelSerializable") as UserModelSerializable
        activity_data_txtData.text = "Name : " + (userModel as UserModelSerializable).name + "\nPhone : " + (userModel as UserModelSerializable).phone

        activity_data_btnBackToHome.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}

