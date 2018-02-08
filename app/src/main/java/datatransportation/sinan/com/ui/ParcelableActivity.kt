package datatransportation.sinan.com.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import datatransportation.sinan.com.R
import datatransportation.sinan.com.model.UserModelParcelable
import datatransportation.sinan.com.ui.data.DataParcelableActivity
import kotlinx.android.synthetic.main.activity_parcelable.*

class ParcelableActivity : AppCompatActivity(), View.OnClickListener {

    private var edtName: EditText? = null
    private var edtPhone: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Parcelable Activity"
        setContentView(R.layout.activity_parcelable)

        edtName = findViewById(R.id.activity_parcelable_edtName)
        edtPhone = findViewById(R.id.activity_parcelable_edtPhone)
        activity_parcelable_btnBundle.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, DataParcelableActivity::class.java)
        val userModel = UserModelParcelable(edtName!!.text.toString(), edtPhone!!.text.toString())
        intent.putExtra("UserModelParcelable", userModel)
        startActivity(intent)
        finish()
    }
}
