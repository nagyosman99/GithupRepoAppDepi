package com.nagy.githuprepoapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nagy.githuprepoapp.ui.components.RepositoryItem

import repoList

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RepositoryScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Github Repositories", fontSize = 20.sp) }
            )
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(repoList) { repo ->
                RepositoryItem(repo)
            }
        }
    }
}

@Preview
@Composable
fun RepositoryScreenPreview() {
    RepositoryScreen()
}
