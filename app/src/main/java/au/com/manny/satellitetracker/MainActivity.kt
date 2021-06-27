package au.com.manny.satellitetracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val satellitesFragment = supportFragmentManager
        val fragmentTransaction = satellitesFragment.beginTransaction()
        fragmentTransaction.replace(R.id.content, FragmentSatellites.newInstance("",""))
    }
}