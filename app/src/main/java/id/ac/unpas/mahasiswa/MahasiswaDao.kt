package id.ac.unpas.mahasiswa

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface MahasiswaDao {
    @Query("SELECT * FROM mahasiswaData")
    fun getAllMahasiswa(): LiveData<List<Mahasiswa>> // Perubahan tipe pengembalian ke LiveData

    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)

    @Update
    suspend fun updateMahasiswa(mahasiswa: Mahasiswa)

    @Delete
    suspend fun deleteMahasiswa(mahasiswa: Mahasiswa)
}
