package datatransportation.sinan.com.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import datatransportation.sinan.com.R

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private val btnIntent by lazy { findViewById<Button>(R.id.activity_main_btnIntent) }
    private val btnBundle by lazy { findViewById<Button>(R.id.activity_main_btnBundle) }
    private val btnSerializable by lazy { findViewById<Button>(R.id.activity_main_btnSerializable) }
    private val btnParcelable by lazy { findViewById<Button>(R.id.activity_main_btnParcelable) }
    private val btnSingleton by lazy { findViewById<Button>(R.id.activity_main_btnSingleton) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Main Activity"
        setContentView(R.layout.activity_main)

        btnIntent.setOnClickListener(this)
        btnBundle.setOnClickListener(this)
        btnSerializable.setOnClickListener(this)
        btnParcelable.setOnClickListener(this)
        btnSingleton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.activity_main_btnIntent -> {
                val intent = Intent(this, IntentActivity::class.java)
                startActivity(intent)
            }
            R.id.activity_main_btnBundle -> {
                val intent = Intent(this, BundleActivity::class.java)
                startActivity(intent)
            }
            R.id.activity_main_btnSerializable->{
                val intent = Intent(this, SerializableActivity::class.java)
                startActivity(intent)
            }
            R.id.activity_main_btnParcelable->{
                val intent = Intent(this, ParcelableActivity::class.java)
                startActivity(intent)
            }
            R.id.activity_main_btnSingleton->{
                val intent = Intent(this, SingletonActivity::class.java)
                startActivity(intent)
            }
        }
    }
}

