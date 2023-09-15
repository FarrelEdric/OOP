# Laporan Praktikum 3

NIM : 2241720032 \
NAMA : Fransiscus Farrel Edric W \
KELAS : TI - 2C

### 3. Percobaan

## 3.1 Percobaan 1 - Enkapsulasi

### Class Motor

![Alt text](image.png)

### Class MotorDemo

![Alt text](image-1.png)

### Output

![Alt text](image-7.png)

## 3.2 Percobaan 2 - Access Modifier

### Class Motor

![Alt text](image-8.png)

### Class MotorDemo

![Alt text](image-9.png)

### Output

![Alt text](image-10.png)

## 3.3 Pertanyaan

1. Pada class TestMobil, saat kita menambah kecepatan untuk pertama kalinya, mengapa muncul peringatan “Kecepatan tidak bisa bertambah karena Mesin Off?"
   > Karena pada saat itu mesin masih pada keadaan OFF sehingga tidak dapat menambah kecepatan. Karena syarat dari bertambahnya kecepatan adalah mesin harus menyala terlebih dahulu.
2. Mengapa atribut kecepatan dan kontakOn diset private?
   > Supaya kontakOn hanya dapat dimodifikasi di dalam class Motor
3. Ubah class Motor sehingga kecepatan maksimalnya adalah 100!

### Modifikasi Class Motor

<img src = "ss/tugas/1soal3.png">
<img src = "ss/tugas/2soal3.png">

### Modifikasi Class MotorDemo

<img src = "ss/tugas/3soal3.png">

### Output setelah di Modifikasi

<img src = "ss/tugas/4soal3.png">

## 3.4 Percobaan 3 - Getter dan Setter

### Class Anggota

![Alt text](image-2.png)

### Class KoperasiDemo

<img src = "ss/9.png">

### Output

<img src = "ss/10.png">

## 3.5 Percobaan 4 - Konstruktor, Instansiasi

### Mengubah Class Anggota dengan membuat Konstruktor

<img src = "ss/11.png">

### Mengubah Class KoperasiDemo dengan melakukan Instansiasi

<img src = "ss/12.png">

### Output

<img src = "ss/13.png">

## 3.6 Pertanyaan – Percobaan 3 dan 4

1. Apa yang dimaksud getter dan setter?
   > Getter digunakan untuk mendapatkan atau mengambil nilai dari sebuah atribut. Sedangkan Setter digunakan untuk memberikan nilai pada sebuah atribut
2. Apa kegunaan dari method getSimpanan()?
   > Method tersebut digunakan untuk mengambil nilai simpanan yang dimiliki oleh anggota. Method tersebut akan mengembalikan nilai atribut simpanan.
3. Method apa yang digunakan untk menambah saldo?
   > Method setor digunakan untuk menambah saldo anggota
4. Apa yand dimaksud konstruktor?
   > Konstruktor digunakan ketika membuat sebuah objek. Sebuah objek akan diinisialisasi sekaligus saat dibuat jika menggunakan kunstruktor.
5. Sebutkan aturan dalam membuat konstruktor?
   > - Nama konstruktor harus sama dengan nama class
   > - Konstruktor tidak mengembalikan sebuah nilai, tidak memiliki return
   > - Konstruktor tidak memiliki tipe data
   > - Modifier harus public
6. Apakah boleh konstruktor bertipe private?
   > Konstruktor tidak boleh bertipe private. Hal ini dikarenakan konstruktor digunakan pada class lain di beberapa situasi.
7. Kapan menggunakan parameter dengan passsing parameter?
   > Passing parameter dilakukan ketika atribut membutuhkan nilai yang spesifik.
8. Apa perbedaan atribut class dan instansiasi atribut?
   > Pada class terdapat deklarasi sebuah atribut yang masih merupakan blue print karena belum terisi oleh nilai. Sedangkan Instansiasi atribut digunakan ketika memasukkan sebuah nilai pada atribut yang berada di dalam class.
9. Apa perbedaan class method dan instansiasi method?
   > Class method dideklarasikan pada sebuah class. Sedangkan instasiasi method dilakukan ketika pemanggilan method.

## 4. Kesimpulan

Telah dipelajari kosep dari enkapsulasi, kontruktor, access modifier yang terdiri dari 4 jenis yaitu public, protected, default dan private. Konsep atribut atau method class yang ada di dalam blok code class dan konsep instansiasi atribut atau method. Cara penggunaan getter dan setter beserta fungsi dari getter dan setter. Dan juga telah dipelajari atau memahami notasi UML

## 5. Tugas

1. Cobalah program dibawah ini dan tuliskan hasil outputnya

### Class EncapDemo

![Alt text](image-3.png)

### Class EncapTest

<img src = "ss/tugas/2tugas1.png">

### Output

<img src = "ss/tugas/3tugas1.png">

2. Pada program diatas, pada class EncapTest kita mengeset age dengan nilai 35, namun pada saat ditampilkan ke layar nilainya 30, jelaskan mengapa.

   > Karena pada method setAge terdapat pemilihan dengan kondisi jika nilai umur yang dimasukkan lebih dari 30 maka umur akan dirubah menjadi 30, sehingga nilai yang muncul di layar adalah 30.

3. Ubah program diatas agar atribut age dapat diberi nilai maksimal 30 dan minimal 18.

### Modifikasi Kode Program Class EncapDemo

<img src = "ss/tugas/1tugas3.png">

### Modifikasi Kode Program Class EncapTest

<img src = "ss/tugas/2tugas3.png">

### Output setelah di Modifikasi

<img src = "ss/tugas/3tugas3.png">

4. Pada sebuah sistem informasi koperasi simpan pinjam, terdapat class Anggota yang memiliki atribut antara lain nomor KTP, nama, limit peminjaman, dan jumlah pinjaman. Anggota
   dapat meminjam uang dengan batas limit peminjaman yang ditentukan. Anggota juga dapat mengangsur pinjaman. Ketika Anggota tersebut mengangsur pinjaman, maka jumlah pinjaman akan berkurang sesuai dengan nominal yang diangsur. Buatlah class Anggota tersebut, berikan atribut, method dan konstruktor sesuai dengan kebutuhan. Uji dengan TestKoperasi berikut ini untuk memeriksa apakah class Anggota yang anda buat telah sesuai dengan yang diharapkan.

### Kode Program Class Anggota

![Alt text](image-4.png)
<img src = "ss/tugas/2tugas4.png">

### Kode Program Class TestKoperasi

![Alt text](image-5.png)

### Output yang diinginkan

![Alt text](image-6.png)

5. Modifikasi soal no. 4 agar nominal yang dapat diangsur minimal adalah 10% dari jumlah pinjaman saat ini. Jika mengangsur kurang dari itu, maka muncul peringatan “Maaf, angsuran harus 10% dari jumlah pinjaman”.

### Modifikasi Class Anggota

<img src = "ss/tugas/1tugas5.png">

### Modifikasi Class TestKoperasi

<img src = "ss/tugas/2tugas5.png">

### Output

<img src = "ss/tugas/3tugas5.png">

6. Modifikasi class TestKoperasi, agar jumlah pinjaman dan angsuran dapat menerima input dari console.

### Modifikasi Kode Program Class KoperasiTest

![Alt text](image-12.png)

### Output setelah di Modifikasi

![Alt text](image-11.png)
