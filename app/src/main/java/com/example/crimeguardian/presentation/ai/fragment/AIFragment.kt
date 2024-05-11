package com.example.crimeguardian.presentation.ai.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import com.example.crimeguardian.R
import com.example.crimeguardian.databinding.FragmentAIBinding


class AIFragment : Fragment() {

    private lateinit var binding: FragmentAIBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAIBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        webViewPage()
    }


    @SuppressLint("SetJavaScriptEnabled")
    private fun webViewPage(){
        binding.webView2.settings.javaScriptEnabled = true
        binding.webView2.webViewClient = WebViewClient()
        binding.webView2.loadUrl("https://chatgpt.com/")

    }

    }
