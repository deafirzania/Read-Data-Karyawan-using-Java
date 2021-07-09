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
public class DivisiManager extends Karyawan implements tetap {

    private int kehadiran;
    private int bonus;

    public DivisiManager(int id, String nama, String alamat, String noHp, int lamaJabatan, int kehadiran) {
        super(id, nama, alamat, noHp, lamaJabatan);
        this.kehadiran = kehadiran;
    }

    @Override
    public void data() {
        System.out.println("ID          : " + id);
        System.out.println("Nama        : " + nama);
        System.out.println("Alamat      : " + alamat);
        System.out.println("No Hp       : " + noHp);
        System.out.println("Lama Jabatan: " + lamaJabatan + " tahun");
    }

    @Override
    public void bonus(String status) {
        if (status == "Karyawan Tetap") {
            if (kehadiran == 22) {
                bonus = 2500000;
                System.out.println("Bonus       : " + bonus);
            } else if (kehadiran <= 22) {
                bonus = kehadiran * 100000;
                System.out.println("Bonus       : " + bonus);
            }
        } else {
            bonus = 0;
            System.out.println("Bonus           : " + bonus);
        }

    }

    @Override
    public void gaji(String status) {
        if (status == "Karyawan Tetap") {
            int gaji = 10000000;
            int total = gaji + bonus;
            System.out.println("Gaji        : " + gaji);
            System.out.println();
            System.out.println("Gaji Total  : " + total);
        } else {
            System.out.println("Gaji        : 0");
            System.out.println("Gaji Total  : 0");
        }

    }

}
