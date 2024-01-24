package pro.cfultz.calebfultz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
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

                }
            }
        }
    }
}

@Composable
fun CalebFultz(name: String, phone: String, mastodon: String, linkTree: String, email: String, modifier: Modifier) {


}

@Preview(showBackground = true)
@Composable
fun PreviewCalebFultz(){
CalebFultz(
    name = stringResource(R.string.app_name),
    phone = stringResource(R.string.phone),
    mastodon = stringResource(R.string.mastodon),
    linkTree = stringResource(R.string.linktree),
    email = stringResource(R.string.email),
    modifier = Modifier)
}