package id.ac.unpas.mahasiswa

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MahasiswaList(
    mahasiswaData: List<Mahasiswa>
) {
    LazyColumn {
        items(mahasiswaData) { mahasiswa ->
            Text(
                text = "Nama : ${mahasiswa.name}, Umur : ${mahasiswa.age}, Kampus : ${mahasiswa.department}, Semester: ${mahasiswa.semester}",
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}
