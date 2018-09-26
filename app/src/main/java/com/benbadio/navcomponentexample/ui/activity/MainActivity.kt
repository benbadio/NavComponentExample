package com.benbadio.navcomponentexample.ui.activity

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.benbadio.navcomponentexample.R
import com.benbadio.navcomponentexample.R.layout
import kotlinx.android.synthetic.main.activity_main.bottomNavigation

class MainActivity : AppCompatActivity() {
  private var showMenus = true

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(layout.activity_main)
    val host: NavHostFragment =
      supportFragmentManager.findFragmentById(R.id.fragmentHost) as NavHostFragment? ?: return
    val navController = host.navController
    bottomNavigation.setupWithNavController(navController)

    navController.addOnNavigatedListener { controller, destination ->
      when (destination.id) {
        R.id.homeFragment -> toggleMenus(true)
        R.id.loginFragment -> toggleMenus(false)
      }
    }
  }

  override fun onCreateOptionsMenu(menu: Menu): Boolean {
    val retValue = super.onCreateOptionsMenu(menu)
    menuInflater.inflate(R.menu.menu_overflow, menu)
    for (i in 0 until menu.size()) {
      menu.getItem(i)
          .isVisible = showMenus
    }
    return retValue
  }

  override fun onOptionsItemSelected(item: MenuItem): Boolean {
    return NavigationUI.onNavDestinationSelected(
        item, findNavController(R.id.fragmentHost)
    ) || super.onOptionsItemSelected(item)
  }

  fun toggleMenus(show: Boolean) {
    showMenus = show
    invalidateOptionsMenu()
    bottomNavigation.visibility = if (showMenus) {
      View.VISIBLE
    } else
      View.GONE
  }
}
