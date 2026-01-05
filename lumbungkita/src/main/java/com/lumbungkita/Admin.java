package com.lumbungkita;

public class Admin {
    private int idAdmin;
    private String username;
    private String password;
    // Tambahan opsional, jika di tabel database ada kolom nama_lengkap
    // private String namaLengkap; 

    // Constructor Kosong
    public Admin() {
    }

    // Constructor Lengkap
    public Admin(int idAdmin, String username, String password) {
        this.idAdmin = idAdmin;
        this.username = username;
        this.password = password;
    }

    // Getter & Setter
    public int getIdAdmin() { return idAdmin; }
    public void setIdAdmin(int idAdmin) { this.idAdmin = idAdmin; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}