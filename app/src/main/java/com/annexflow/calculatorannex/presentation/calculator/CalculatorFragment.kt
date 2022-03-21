package com.annexflow.calculatorannex.presentation.calculator

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.annexflow.calculatorannex.R
import com.annexflow.calculatorannex.databinding.FragmentCalculatorBinding
import com.annexflow.calculatorannex.presentation.extension.viewBinding

class CalculatorFragment : Fragment(R.layout.fragment_calculator) {
    private val binding by viewBinding(FragmentCalculatorBinding::bind)

    private val calculatorViewModel: CalculatorViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUI()
    }
    private fun setupUI(){
        binding.editTextExpression.showSoftInputOnFocus = false
        binding.editTextResult.showSoftInputOnFocus = false
    }
}