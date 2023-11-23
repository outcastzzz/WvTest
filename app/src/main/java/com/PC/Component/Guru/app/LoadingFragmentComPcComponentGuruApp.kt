package com.PC.Component.Guru.app

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.PC.Component.Guru.app.databinding.FragmentLoadingComPcComponentGuruAppBinding
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class LoadingFragmentComPcComponentGuruApp : Fragment() {

    private var _binding: FragmentLoadingComPcComponentGuruAppBinding? = null
    private val binding: FragmentLoadingComPcComponentGuruAppBinding
        get() = _binding ?: throw RuntimeException(
            "FragmentLoadingComPcComponentGuruAppBinding == null"
        )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoadingComPcComponentGuruAppBinding.inflate(
            inflater,
            container,
            false

        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Handler(Looper.getMainLooper()).postDelayed({
            findNavController().navigate(R.id.action_loadingFragmentComPcComponentGuruApp_to_menuFragmentComPCComponentGuruApp4)
        }, 3000)
    }

}