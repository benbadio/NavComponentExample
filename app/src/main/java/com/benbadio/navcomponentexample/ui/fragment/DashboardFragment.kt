package com.benbadio.navcomponentexample.ui.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.benbadio.navcomponentexample.R
import kotlinx.android.synthetic.main.fragment_layout.view.imageView
import kotlinx.android.synthetic.main.fragment_layout.view.textView

class DashboardFragment : Fragment() {

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    return inflater.inflate(R.layout.fragment_layout, container, false)
  }

  override fun onViewCreated(
    view: View,
    savedInstanceState: Bundle?
  ) {
    super.onViewCreated(view, savedInstanceState)
    view.textView.setText(R.string.title_dashboard)
    view.imageView.setImageResource(R.drawable.ic_dashboard_black_24dp)
  }
}