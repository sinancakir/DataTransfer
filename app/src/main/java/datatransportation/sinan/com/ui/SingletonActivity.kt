package datatransportation.sinan.com.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import datatransportation.sinan.com.R
import datatransportation.sinan.com.model.UserModelSingleton
import datatransportation.sinan.com.ui.data.DataSingletonActivity
import kotlinx.android.synthetic.main.activity_singleton.*

class SingletonActivity : AppCompatActivity(), View.OnClickListener {

    private var edtName: EditText? = null
    private var edtPhone: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Singleton Activity"
        setContentView(R.layout.activity_singleton)

        edtName = findViewById(R.id.activity_singleton_edtName)
        edtPhone = findViewById(R.id.activity_singleton_edtPhone)
        activity_singleton_btnBundle.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, DataSingletonActivity::class.java)
        val name = edtName!!.text.toString()
        UserModelSingleton.name = name
        val phone = edtPhone!!.text.toString()
        UserModelSingleton.phone = phone
        intent.putExtra("Name", UserModelSingleton.name)
        intent.putExtra("Phone",UserModelSingleton.phone)
        startActivity(intent)
        finish()
    }
}
