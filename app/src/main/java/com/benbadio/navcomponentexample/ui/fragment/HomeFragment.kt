package com.benbadio.navcomponentexample.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.benbadio.navcomponentexample.R
import com.benbadio.navcomponentexample.ui.activity.MainActivity
import kotlinx.android.synthetic.main.fragment_home.view.navByActionButton
import kotlinx.android.synthetic.main.fragment_home.view.navByDestinationButton

class HomeFragment : Fragment() {

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    return inflater.inflate(R.layout.fragment_home, container, false)
  }

  override fun onViewCreated(
    view: View,
    savedInstanceState: Bundle?
  ) {
    super.onViewCreated(view, savedInstanceState)
    (activity as MainActivity).toggleMenus(true)
    view.navByDestinationButton.setOnClickListener(
        Navigation.createNavigateOnClickListener(R.id.stepOneFragment)
    )
    view.navByActionButton.setOnClickListener(
        Navigation.createNavigateOnClickListener(R.id.action_next)
    )
  }
}