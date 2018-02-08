package datatransportation.sinan.com.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import datatransportation.sinan.com.R
import datatransportation.sinan.com.ui.data.DataIntentActivity
import kotlinx.android.synthetic.main.activity_intent.*

class IntentActivity : AppCompatActivity(), View.OnClickListener {

    private var edtName: EditText? = null
    private var edtPhone : EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Intent Activity"
        setContentView(R.layout.activity_intent)

        edtName = findViewById(R.id.activity_intent_edtName)
        edtPhone = findViewById(R.id.activity_intent_edtPhone)
        activity_intent_btnIntent.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, DataIntentActivity::class.java)
        intent.putExtra("Name", edtName!!.text.toString())
        intent.putExtra("Phone",edtPhone!!.text.toString())
        startActivity(intent)
        finish()
    }
}
