package com.benbadio.navcomponentexample.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.benbadio.navcomponentexample.R
import kotlinx.android.synthetic.main.fragment_sign_up.view.cancelButton
import kotlinx.android.synthetic.main.fragment_sign_up.view.doneButton

class SignUpFragment : Fragment() {
  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    return inflater.inflate(R.layout.fragment_sign_up, container, false)
  }

  override fun onViewCreated(
    view: View,
    savedInstanceState: Bundle?
  ) {
    super.onViewCreated(view, savedInstanceState)

    view.doneButton.setOnClickListener {
      it.findNavController()
          .navigate(R.id.action_global_homeFragment, null)
    }

    view.cancelButton.setOnClickListener {
      it.findNavController()
          .navigateUp()
    }
  }
}