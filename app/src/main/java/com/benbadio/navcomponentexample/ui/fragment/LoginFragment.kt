package com.benbadio.navcomponentexample.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.benbadio.navcomponentexample.R
import com.benbadio.navcomponentexample.ui.activity.MainActivity
import kotlinx.android.synthetic.main.fragment_login.view.signInButton
import kotlinx.android.synthetic.main.fragment_login.view.signUpButton

class LoginFragment : Fragment() {
  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    return inflater.inflate(R.layout.fragment_login, container, false)
  }

  override fun onViewCreated(
    view: View,
    savedInstanceState: Bundle?
  ) {
    super.onViewCreated(view, savedInstanceState)
    (activity as MainActivity).toggleMenus(false)
    view.signInButton.setOnClickListener {
      it.findNavController()
          .navigate(R.id.action_global_homeFragment, null)

//      val options = NavOptions.Builder()
//          .setEnterAnim(android.R.anim.slide_in_left)
//          .setExitAnim(android.R.anim.slide_out_right)
//          .setPopEnterAnim(android.R.anim.slide_in_left)
//          .setPopExitAnim(android.R.anim.slide_out_right)
//          .build()
//
//      it.findNavController().navigate(R.id.action_global_homeFragment, null, options)
    }

    view.signUpButton.setOnClickListener(
        Navigation.createNavigateOnClickListener(R.id.signUpFragment)
    )
  }
}