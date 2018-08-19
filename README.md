# Spring-Framework-Autowiring-used-Annotation
Selain autowiring menggunakan file konfigurasi XML, ada cara lainnya untuk melakukan autowiring dalam program Java,
menggunakan annotation `@Autowired`. Annotation ini dapat digunakan untuk melakukan autowiring sebuah bean ke setter, constuctor, atau field.
Cara kerja `@Autowired` mirip dengan autowiring byType yaitu Spring mencari referensi bean yang tipe-nya atau class-nya sama
dengan tipe dari parameter setter, parameter conscructor atau field.
Untuk mendukung penggunaan annotation @Autowired, header dari file **Beans.xml** harus diberi header dimana bentuknya ada 2
dan pilih salah satu bentuknya (bisa Anda lihat di file **pom.xml**).

Catatan:
1. Untuk annotation pada field, secara default `@Autowired` akan melakukan dependency checking untuk memastikan referensi bean
yang ingin disuntik ditemukan. Jika referensi bean yang dimaksud tidak ditemukan maka, Spring akan melemparkan exception. 
Untuk menghindari munculnya pesan kesalahan tersebut maka dependency checking harus diset menjadi false. Jadi, saat 
referensi bean tidak ditemukan, field tersebut tidak akan disuntik atau tetap bernilai null.
2. Jika ditemukan lebih dari satu referensi bean dengan tipe atau class yang sama maka, programmer harus memerintahkan Spring
untuk memilih bean yang akan digunakan dan jika tidak maka, hasil eksekusinya menjadi tidak terprediksi. Untuk memerintahkan
Spring memilih salah satu referensi bean, gunakan annotation `@Qualifier` diikuti nama referensi bean yang dimaksud.

