package datatransportation.sinan.com.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import datatransportation.sinan.com.R
import datatransportation.sinan.com.model.UserModelSerializable
import datatransportation.sinan.com.ui.data.DataSerializableActivity
import kotlinx.android.synthetic.main.activity_serializable.*

class SerializableActivity : AppCompatActivity(), View.OnClickListener {

    private var edtName: EditText? = null
    private var edtPhone: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Serializable Activity"
        setContentView(R.layout.activity_serializable)

        edtName = findViewById(R.id.activity_serializable_edtName)
        edtPhone = findViewById(R.id.activity_serializable_edtPhone)
        activity_serializable_btnBundle.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, DataSerializableActivity::class.java)
        val userModel = UserModelSerializable(edtName!!.text.toString(), edtPhone!!.text.toString())
        intent.putExtra("UserModelSerializable", userModel)
        startActivity(intent)
        finish()
    }
}
