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
public class DivisiIT extends Karyawan implements kontrak, tetap {

    private int kehadiran;
    private int project;
    private int bonus;

    public DivisiIT(int id, String nama, String alamat, String noHp, int lamaJabatan, int kehadiran, int project) {
        super(id, nama, alamat, noHp, lamaJabatan);
        this.kehadiran = kehadiran;
        this.project = project;
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
            if (project >= 10) {
                bonus = 2500000;
                System.out.println("Bonus       : " + bonus);
            } else {
                bonus = project * 200000;
                System.out.println("Bonus       : " + bonus);
            }
        } else if (status == "Karyawan Kontrak") {
            if (project >= 10) {
                bonus = 1000000;
                System.out.println("Bonus       : " + bonus);
            } else {
                bonus = project * 800000;
                System.out.println("Bonus       : " + bonus);
            }
        }

    }

    @Override
    public void gaji(String status) {
        int gaji, total;
        if (status == "Karyawan Tetap") {
            if (kehadiran == 22) {
                gaji = 7500000;
                total = gaji + bonus;
                System.out.println("Gaji        : " + gaji);
                System.out.println();
                System.out.println("Gaji Total  : " + total);
            } else if (kehadiran <= 22) {
                gaji = kehadiran * 320000;
                total = gaji + bonus;
                System.out.println("Gaji            : " + gaji);
                System.out.println();
                System.out.println("Gaji Total      : " + total);
            }
        } else if (status == "Karyawan Kontrak"){
            if (kehadiran == 22) {
                gaji = 4000000;
                total = gaji + bonus;
                System.out.println("Gaji        : " + gaji);
                System.out.println();
                System.out.println("Gaji Total  : " + total);
            } else if (kehadiran <= 22) {
                gaji = kehadiran * 150000;
                total = gaji + bonus;
                System.out.println("Gaji            : " + gaji);
                System.out.println();
                System.out.println("Gaji Total      : " + total);
            }
        }

    }

}
