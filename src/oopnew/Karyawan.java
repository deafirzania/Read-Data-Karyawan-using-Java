/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopnew;

/**
 *
 * @author ASUS
 */
public abstract class Karyawan {
    
    protected int id;
    protected String nama;
    protected String alamat;
    protected String noHp;
    protected int lamaJabatan;
    
    
    
    public Karyawan(int id, String nama, String alamat, String noHp, int lamaJabatan){
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.noHp = noHp;
        this.lamaJabatan = lamaJabatan;

    }
    abstract void data();
    

}
