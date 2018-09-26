package com.benbadio.navcomponentexample.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.benbadio.navcomponentexample.R
import kotlinx.android.synthetic.main.fragment_step_two.view.nextButton

class StepTwoFragment : Fragment() {

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    return inflater.inflate(R.layout.fragment_step_two, container, false)
  }

  override fun onViewCreated(
    view: View,
    savedInstanceState: Bundle?
  ) {
    super.onViewCreated(view, savedInstanceState)
    view.nextButton.setOnClickListener(
        Navigation.createNavigateOnClickListener(R.id.action_next)
    )
  }
}