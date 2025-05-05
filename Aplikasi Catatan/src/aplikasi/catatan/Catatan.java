/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi.catatan;

/**
 *
 * @author bisma1111981
 * Selasa, 05 Mei 2025
 */
public class Catatan {
    private String isi;

    // Constructor default
    public Catatan() {
        this.isi = "Catatan kosong";
    }

    // Constructor dengan parameter (Overloading)
    public Catatan(String isi) {
        this.isi = isi;
    }

    // Method getter
    public String getIsi() {
        return isi;
    }

    // Method setter
    public void setIsi(String isi) {
        this.isi = isi;
    }

    // Method yang bisa di override
    public String tampilkanInfo() {
        return "Isi Catatan: " + isi;
    }
    
    
}


