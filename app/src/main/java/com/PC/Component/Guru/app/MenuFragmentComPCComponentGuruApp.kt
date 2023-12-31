package com.PC.Component.Guru.app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.PC.Component.Guru.app.databinding.FragmentMenuComPCComponentGuruAppBinding


class MenuFragmentComPCComponentGuruApp : Fragment() {

    private var _binding: FragmentMenuComPCComponentGuruAppBinding? = null
    private val binding: FragmentMenuComPCComponentGuruAppBinding
        get() = _binding ?: throw RuntimeException("FragmentMenuComPCComponentGuruAppBinding == null")


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMenuComPCComponentGuruAppBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            starterBui.setOnClickListener {
                findNavController().navigate(R.id.action_menuFragmentComPCComponentGuruApp4_to_starterBuildFragmentMenuComPCComponentGuruAppBinding2)
            }
            basicBuild.setOnClickListener {
                findNavController().navigate(R.id.action_menuFragmentComPCComponentGuruApp4_to_basicBuildProcComPcComponentGuruApp)
            }
            optimalBui.setOnClickListener {
                findNavController().navigate(R.id.action_menuFragmentComPCComponentGuruApp4_to_optimalBuildProcComPcComponentGuru)
            }
            advancedBu.setOnClickListener {
                findNavController().navigate(R.id.action_menuFragmentComPCComponentGuruApp4_to_advancedBuildProcComPcComponentGuruApp)
            }
            maximumBui.setOnClickListener {
                findNavController().navigate(R.id.action_menuFragmentComPCComponentGuruApp4_to_maxBuildProcComPcComponentGuruApp)
            }
            exit.setOnClickListener {
                requireActivity().finish()
            }
        }

    }

}