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
public class DivisiCS extends Karyawan implements kontrak{

    private int kehadiran;
    private int jmlPelanggan;
    private int bonus;
    
    public DivisiCS(int id, String nama, String alamat, String noHp, int lamaJabatan, int kehadiran, int jmlPelanggan) {
        super(id, nama, alamat, noHp, lamaJabatan);
        this.kehadiran = kehadiran;
        this.jmlPelanggan = jmlPelanggan;
    }
    
    @Override
    public void data(){
        System.out.println("ID          : "+id);
        System.out.println("Nama        : "+nama);
        System.out.println("Alamat      : "+alamat);
        System.out.println("No Hp       : "+noHp);
        System.out.println("Lama Jabatan: "+lamaJabatan+" tahun");
    }
    
    @Override
    public void bonus(String status) {
        if(status == "Karyawan Kontrak"){
            if (jmlPelanggan >= 20){
            bonus = 200000;
                System.out.println("Bonus       : "+bonus);
        }
        else {
            bonus = 80000*jmlPelanggan; 
            System.out.println("Bonus       : "+bonus);
        }
        }else {
            bonus = 0;
            System.out.println("Bonus       : "+bonus);
        }
        
    }
    
    @Override
    public void gaji(String status) {
        int gaji, total;
        if(status == "Karyawan Kontrak"){
            if(kehadiran == 22){
            gaji = 1500000;
            total = gaji+bonus;
            System.out.println("Gaji        : "+gaji);
            System.out.println();
            System.out.println("Total Gaji  : "+total);
        } else if(kehadiran <=22){
            gaji = kehadiran*50000;
            total = gaji+bonus;
            System.out.println("Gaji        : "+gaji);
            System.out.println();
            System.out.println("Total Gaji  : "+total);
        }
        } else {
            System.out.println("Gaji        : 0");
            System.out.println("Gaji Total  : 0");
        }
        
    }

}
