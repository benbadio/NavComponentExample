package com.benbadio.navcomponentexample.ui.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.benbadio.navcomponentexample.R

class LoginActivity : AppCompatActivity() {
  override fun onCreate(
    savedInstanceState: Bundle?,
    persistentState: PersistableBundle?
  ) {
    super.onCreate(savedInstanceState, persistentState)
    setContentView(R.layout.fragment_login)
  }
}