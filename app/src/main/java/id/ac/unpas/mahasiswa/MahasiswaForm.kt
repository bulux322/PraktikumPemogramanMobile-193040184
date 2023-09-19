package id.ac.unpas.mahasiswa

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MahasiswaForm(
    viewModel: MahasiswaViewModel
) {
    var name by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }
    var department by remember { mutableStateOf("") }
    var semester by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .padding(16.dp)
    ) {
        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Nama") }
        )
        TextField(
            value = age,
            onValueChange = { age = it },
            label = { Text("Umur") }
        )
        TextField(
            value = department,
            onValueChange = { department = it },
            label = { Text("Kampus") }
        )
        TextField(
            value = semester,
            onValueChange = { semester = it },
            label = { Text("Semester") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                val mahasiswa = Mahasiswa(
                    name = name,
                    age = age.toIntOrNull() ?: 0,
                    department = department,
                    semester = semester.toIntOrNull() ?: 0
                )
                viewModel.insertMahasiswa(mahasiswa)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Tambah Mahasiswa")
        }
    }
}
