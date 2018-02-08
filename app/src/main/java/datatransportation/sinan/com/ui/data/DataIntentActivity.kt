package datatransportation.sinan.com.ui.data

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import datatransportation.sinan.com.R
import datatransportation.sinan.com.ui.MainActivity
import kotlinx.android.synthetic.main.activity_data_intent.*

class DataIntentActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Data Intent Activity"
        setContentView(R.layout.activity_data_intent)

        val name = intent.getStringExtra("Name")
        val phone = intent.getStringExtra("Phone")
        activity_data_txtData.text = "Name : "+name + "\nPhone : " + phone

        activity_data_btnBackToHome.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
