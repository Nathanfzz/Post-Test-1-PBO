Dinathan Fahrezi 2409116050

**Deskripsi Program**


Program ini merupakan sebuah sistem CRUD (Create, Read, Update, Delete) yang berfungsi untuk mencatat berbagai informasi tentang pembangunan

**Alur Program**
 

*Menu Awal
  
   
   <img width="592" height="155" alt="image" src="https://github.com/user-attachments/assets/77455492-d54b-425b-a939-e557071f4b88" />

Tampilan awal ketika pertama kali menjalankan program

1. Tambahkan Catatan


      <img width="758" height="436" alt="image" src="https://github.com/user-attachments/assets/ffb2f55c-c0fc-4a4d-a5de-f2f0d72b0f70" />

   Pilihan ini berfungsi untuk menambahkan catatan informasi
   
3. Lihat Catatan


      <img width="587" height="424" alt="image" src="https://github.com/user-attachments/assets/773110e9-4266-469e-b17c-d3b69f71bd9d" />

   pilihan ini berfungsi untuk melihat catatan informasi yang sudah kita tambahkan tadi
   
4. Ubah Catatan


    <img width="759" height="479" alt="image" src="https://github.com/user-attachments/assets/65e3de77-7441-43a1-a775-088268c0ece4" />

   pilihan ini berfungsi untuk meng update informasi yang telah tercatat
   
5. Hapus Catatan

**Penjelasan kode**


import java.util.ArrayList;
import java.util.Scanner;

Program menggunakan ArrayList untuk menyimpan data proyek dan Scanner untuk membaca input dari pengguna.
Class Pembangunan
Class ini merepresentasikan data proyek pembangunan/perbaikan.
Atribut yang disimpan adalah jenis, alamat, tanggal, lamaKontrak, namaProyek, dan status.
Constructor digunakan untuk mengisi data, sedangkan toString() digunakan untuk menampilkan data dalam format rapi.

Deklarasi Variabel Utama

daftarPembangunan → menyimpan semua data proyek dalam ArrayList.

scanner → membaca input dari pengguna.

pilihan → menyimpan angka menu yang dipilih pengguna.

Menu Utama dengan Perulangan
Program menampilkan menu utama menggunakan perulangan do...while.
Program akan terus berjalan sampai pengguna memilih opsi 5 (Keluar).

Menu 1 – Tambah Catatan
Pengguna diminta mengisi data proyek baru (jenis, alamat, tanggal, lama kontrak, nama proyek, status).
Data kemudian dimasukkan ke dalam ArrayList sebagai objek Pembangunan.

Menu 2 – Lihat Catatan
Jika data kosong, program menampilkan pesan bahwa belum ada catatan.
Jika ada data, program menampilkan semua catatan dengan format rapi menggunakan toString().

Menu 3 – Ubah Catatan
Program menampilkan daftar proyek dengan nomor urut.
Pengguna memilih data yang ingin diubah berdasarkan nomor.
Jika nomor valid, pengguna dapat mengganti data lama dengan data baru.

Menu 4 – Hapus Catatan
Program menampilkan daftar proyek dengan nomor urut.
Pengguna memilih data yang ingin dihapus.
Data dihapus dari ArrayList menggunakan remove().

Menu 5 – Keluar
Program berhenti berjalan dan menampilkan pesan terima kasih.




    <img width="584" height="328" alt="image" src="https://github.com/user-attachments/assets/54d6c34e-0b1d-4b9a-9c14-a1f539a59255" />

   Pilihan ini berfungsi untuk menghapus catatan sesuai dengan nomor catatan
   
