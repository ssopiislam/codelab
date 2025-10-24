# Exception Handling - Input Angka Positif

Program ini adalah contoh sederhana penggunaan **Exception Handling** di Java.  
Program akan meminta pengguna memasukkan sebuah angka, lalu melakukan pengecekan:

- Jika angka **kurang dari atau sama dengan 0**, program akan memunculkan **custom exception** bernama `InvalidNumberException`.
- Jika input yang dimasukkan **bukan angka**, program akan menampilkan pesan error bawaan.
- Jika valid, program akan menampilkan pesan berhasil.

---

## Cara Menjalankan
1. Jalankan program di IntelliJ IDEA atau terminal
2. Masukkan input angka **positif**
3. Lihat hasil output sesuai kondisi yang terjadi

---

## Contoh Output

**Input valid:**  
Masukkan angka: 5  
✅ Valid! Angka Positif: 5

**Input <= 0:**  
Masukkan angka: -3  
⚠️ Angka tidak valid! Harus lebih dari 0.

**Input bukan angka:**  
Masukkan angka: abc  
⚠️ Input harus berupa angka!

---

## Tujuan Pembelajaran
- Memahami **custom exception** (`InvalidNumberException`)
- Membedakan **Exception spesifik dan umum**
- Mengetahui cara menggunakan **try-catch-finally**
- Menutup scanner dengan aman menggunakan `finally`

