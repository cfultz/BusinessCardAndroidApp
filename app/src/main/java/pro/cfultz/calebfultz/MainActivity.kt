package pro.cfultz.calebfultz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pro.cfultz.calebfultz.ui.theme.CalebFultzTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalebFultzTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CalebFultzApp()
                }
            }
        }
    }
}

@Composable
fun CalebFultzText(
    name: String,
    phone: String,
    linkTree: String,
    email: String,
    modifier: Modifier) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = name,
            fontWeight = FontWeight.Bold,
            fontSize = 28.sp,
            modifier = Modifier
                .padding(top = 96.dp)
        )
        Text(text = phone
        )
        Text(text = linkTree
        )
        Text(text = email
        )

    }
}
@Composable
fun CalebFultzImage() {

    Image(
        painter = painterResource(R.drawable.headshot_sc),
        contentDescription = "Caleb Fultz",
        modifier = Modifier
            .padding(top = 100.dp)
    )
    Image(
        painter = painterResource(R.drawable.caleb_vcard),
        contentDescription = "Caleb's vCard QR Code",
        modifier = Modifier
            .padding(top = 16.dp)
            .width(96.dp)
            .height(96.dp)
    )

}
@Composable
fun CalebFultzApp(){

Column(
horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center){
    CalebFultzImage()

    CalebFultzText(
        name = stringResource(R.string.app_name),
        phone = stringResource(R.string.phone),
        linkTree = stringResource(R.string.linktree),
        email = stringResource(R.string.email),
        modifier = Modifier)
}

}

@Preview(showBackground = true)
@Composable
fun PreviewCalebFultzApp(){

CalebFultzApp()
}