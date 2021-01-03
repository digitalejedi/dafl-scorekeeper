package dk.malone.dafl.scorekeeper.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dk.malone.dafl.scorekeeper.databinding.FragmentSetupTeamBinding

class SetupTeamFragment : Fragment() {

    private var _binding: FragmentSetupTeamBinding? = null
    private val binding: FragmentSetupTeamBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentSetupTeamBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}