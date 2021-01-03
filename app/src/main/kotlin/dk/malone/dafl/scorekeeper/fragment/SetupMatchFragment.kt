package dk.malone.dafl.scorekeeper.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dk.malone.dafl.scorekeeper.databinding.FragmentSetupMatchBinding

class SetupMatchFragment : Fragment() {

    private var _binding: FragmentSetupMatchBinding? = null
    private val binding: FragmentSetupMatchBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentSetupMatchBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}