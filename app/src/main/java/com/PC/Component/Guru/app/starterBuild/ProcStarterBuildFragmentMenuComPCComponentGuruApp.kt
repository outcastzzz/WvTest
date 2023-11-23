package com.PC.Component.Guru.app.starterBuild

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.PC.Component.Guru.app.R
import com.PC.Component.Guru.app.databinding.FragmentLoadingComPcComponentGuruAppBinding
import com.PC.Component.Guru.app.databinding.FragmentStarterBuildProcComPCComponentGuruAppBinding

class ProcStarterBuildFragmentMenuComPCComponentGuruApp : Fragment() {

    private var _binding: FragmentStarterBuildProcComPCComponentGuruAppBinding? = null
    private val binding: FragmentStarterBuildProcComPCComponentGuruAppBinding
        get() = _binding ?: throw RuntimeException(
            "FragmentStarterBuildProcComPCComponentGuruAppBinding == null"
        )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentStarterBuildProcComPCComponentGuruAppBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_starterBuildFragmentMenuComPCComponentGuruAppBinding2_to_MBStarerBuildComPCComponentGuruApp)
        }
        binding.backComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_starterBuildFragmentMenuComPCComponentGuruAppBinding2_to_menuFragmentComPCComponentGuruApp4)
        }
        binding.menuComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_starterBuildFragmentMenuComPCComponentGuruAppBinding2_to_menuFragmentComPCComponentGuruApp4)
        }
    }

}