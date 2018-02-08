package datatransportation.sinan.com.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import datatransportation.sinan.com.R
import datatransportation.sinan.com.ui.data.DataBundleActivity
import kotlinx.android.synthetic.main.activity_bundle.*

class BundleActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Bundle Activity"
        setContentView(R.layout.activity_bundle)

        activity_bundle_btnBundle.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, DataBundleActivity::class.java)
        val bundle = Bundle()
        bundle.putString("Name", activity_bundle_edtName.text.toString())
        bundle.putString("Phone", activity_bundle_edtPhone.text.toString())
        intent.putExtras(bundle)
        startActivity(intent)
        finish()
    }
}
