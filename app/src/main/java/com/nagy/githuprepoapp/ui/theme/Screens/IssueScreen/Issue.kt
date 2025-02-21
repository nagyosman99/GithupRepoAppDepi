package com.nagy.githuprepoapp.ui.theme.Screens.IssueScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.clickable
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import com.nagy.githuprepoapp.R
import com.nagy.githuprepoapp.ui.theme.Screens.IssueScreen.model.Issue
import com.nagy.githuprepoapp.ui.theme.Screens.IssueScreen.model.issuesList

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IssuesScreen() {
    Scaffold(
        topBar = {

                    TopAppBar(
                        title = {
                            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                Text(text = "Issue", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                            }
                        },
                        navigationIcon = {
                            IconButton(onClick = {  }) {
                                Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                            }
                        }
                    )
                }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(issuesList) { issue ->
                IssueItem(issue)
            }
        }
    }
}

@Composable
fun IssueItem(issue: Issue) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp)
            .clickable { },
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.issue),
                contentDescription = "User Avatar", modifier = Modifier.size(40.dp).
                clip(CircleShape)
            )


            Spacer(modifier = Modifier.width(10.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(text = issue.title, fontWeight = FontWeight.Bold, fontSize = 16.sp)
                Text(text="None", fontWeight = FontWeight.Bold)
                Text(text = "Created At: ${issue.date}", fontSize = 12.sp, color = Color.Black,fontWeight = FontWeight.Bold)
            }

            Text(text = issue.status, fontWeight = FontWeight.Bold, fontSize = 14.sp, color = Color.Black)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewIssuesScreen() {
    IssuesScreen()
}
