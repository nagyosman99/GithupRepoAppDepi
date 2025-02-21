import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.placeholder.material.placeholder


@Composable
fun ShimmerLoadingItem() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape)
                .placeholder(visible = true, color = Color.LightGray)
        )

        Spacer(modifier = Modifier.width(12.dp))

        Column(modifier = Modifier.weight(1f)) {
            Box(
                modifier = Modifier
                    .height(16.dp)
                    .fillMaxWidth(0.6f)
                    .clip(RoundedCornerShape(4.dp))
                    .placeholder(visible = true, color = Color.LightGray)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Box(
                modifier = Modifier
                    .height(14.dp)
                    .fillMaxWidth(0.4f)
                    .clip(RoundedCornerShape(4.dp))
                    .placeholder(visible = true, color = Color.LightGray)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Box(
                modifier = Modifier
                    .height(12.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(4.dp))
                    .placeholder(visible = true, color = Color.LightGray)
            )
        }

        Spacer(modifier = Modifier.width(12.dp))


        Box(
            modifier = Modifier
                .height(14.dp)
                .fillMaxWidth(0.1f)
                .clip(RoundedCornerShape(6.dp))
                .placeholder(visible = true, color = Color.LightGray)
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ShimmerLoadingList() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Github Repositories", color = Color.Black,fontWeight = FontWeight.Bold, )
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.White)
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            repeat(10) {
                ShimmerLoadingItem()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewShimmerLoadingList() {
    ShimmerLoadingList()
}
