package id.ac.unpas.mahasiswa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    private val viewModel: MahasiswaViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val mahasiswaData = viewModel.getAllMahasiswa().observeAsState(listOf())
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                MahasiswaForm(viewModel = viewModel)
                Spacer(modifier = Modifier.height(16.dp))
                MahasiswaList(mahasiswaData = mahasiswaData.value)
            }
        }
    }
}