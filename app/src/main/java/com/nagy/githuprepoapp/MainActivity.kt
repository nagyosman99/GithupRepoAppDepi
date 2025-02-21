package com.nagy.githuprepoapp

import DetailsScreen
import ShimmerLoadingItem
import ShimmerLoadingList
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import com.nagy.githuprepoapp.ui.screens.RepositoryScreen
import com.nagy.githuprepoapp.ui.theme.GithubRepoAppTheme
import com.nagy.githuprepoapp.ui.theme.Screens.ErrorScreen
import com.nagy.githuprepoapp.ui.theme.Screens.IssueScreen.IssuesScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            GithubRepoAppTheme {
                ErrorScreen(onRetry = { })


            }
        }
    }}
