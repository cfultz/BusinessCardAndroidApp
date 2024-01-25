package pro.cfultz.calebfultz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.EmojiSupportMatch
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
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

// The text portions of the application
@Composable
fun CalebFultzText(
    name: String,
    phone: String,
    linkTree: String,
    email: String,
    modifier: Modifier) {
// Set them in a column. Added the emojis to the strings so didn't need to use the 'Row' composable
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
                .padding(top = 8.dp, bottom = 8.dp)
    ){
        Text(text = name,
            fontWeight = FontWeight.Bold,
            fontSize = 28.sp
        )
        Text(text = "☎️ " + phone
        )
        Text(text = "\uD83C\uDF33 " + linkTree
        )
        Text(text = "✉\uFE0F " + email
        )

    }
}
// The images portion of the application
@Composable
fun CalebFultzImage() {

    Image(
        painter = painterResource(R.drawable.headshot_sc),
        contentDescription = "Caleb Fultz",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(400.dp)
            .wrapContentWidth(Alignment.CenterHorizontally)
            .padding(top = 64.dp, bottom = 24.dp)
            .absolutePadding(left = 8.dp, right = 8.dp)
            .clip(shape = RoundedCornerShape(16.dp))

    )
    Image(
        painter = painterResource(R.drawable.caleb_vcard),
        contentDescription = "Caleb's vCard QR Code",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .absolutePadding(left = 8.dp, right = 8.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .size(200.dp)
    )

}

// The actual "meat" of the app
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

//Preview for composing (HE SAID THE TITLE!)
@Preview(showBackground = true)
@Composable
fun PreviewCalebFultzApp(){
    CalebFultzApp()
}