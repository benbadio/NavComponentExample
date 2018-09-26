package com.benbadio.navcomponentexample.ui.activity

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.benbadio.navcomponentexample.R.id
import com.benbadio.navcomponentexample.R.layout
import com.benbadio.navcomponentexample.ui.fragment.DashboardFragment
import com.benbadio.navcomponentexample.ui.fragment.HomeFragment
import com.benbadio.navcomponentexample.ui.fragment.NotificationFragment
import kotlinx.android.synthetic.main.activity_main.navigation

class MainActivity : AppCompatActivity() {

  private val mOnNavigationItemSelectedListener =
    BottomNavigationView.OnNavigationItemSelectedListener { item ->
      when (item.itemId) {
        id.navigation_home -> {
          navigateTo(HomeFragment())
          return@OnNavigationItemSelectedListener true
        }
        id.navigation_dashboard -> {
          navigateTo(DashboardFragment())
          return@OnNavigationItemSelectedListener true
        }
        id.navigation_notifications -> {
          navigateTo(NotificationFragment())
          return@OnNavigationItemSelectedListener true
        }

      }
      false
    }

  fun navigateTo(fragment: Fragment) {
    supportFragmentManager.beginTransaction()
        .replace(id.fragmentHost, fragment)
        .commit()
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(layout.activity_main)
    navigateTo(HomeFragment())
    navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
  }
}
