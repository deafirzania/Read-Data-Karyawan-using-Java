/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopnew;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("======================================");
        System.out.println("              Data Karyawan           ");
        System.out.println("======================================");
        System.out.println("1. Divisi Manager");
        System.out.println("2. Divisi IT");
        System.out.println("3. Divisi Costumer Service");
        System.out.println("--------------------------");
        System.out.print("Pilihan : ");
        int menu = input.nextInt();
        switch (menu) {
            case 1:
                System.out.println("======================================");
                System.out.println("            Divisi Manager            ");
                System.out.println("======================================");
                System.out.print("Masukkan ID : ");
                int id = input.nextInt();
                System.out.println();
                if (id == 114355) {
                    DivisiManager DM = new DivisiManager(114355, "Wildan Tarumanegara", "Jl. Soekarno No 97 Bandung", "082145275635", 8, 20);
                    System.out.println("Data yang diminta : ");
                    System.out.println("A. Biodata");
                    System.out.println("B. Data Gaji");
                    System.out.println("-------------");
                    System.out.print("Pilihan : ");
                    String pilihan = input.next();
                    switch (pilihan) {
                        case "A":
                            System.out.println("-----BIODATA Karyawan-----");
                            System.out.println("Data Karyawan Ditemukan");
                            DM.data();
                            break;
                        case "B":
                            System.out.println("-----Data Gaji-----");
                            System.out.println("Data Karyawan Ditemukan");
                            DM.bonus("Karyawan Tetap");
                            System.out.println();
                            DM.gaji("Karyawan Tetap");
                            break;
                    }

                } else if (id == 114356) {
                    System.out.println();
                    DivisiManager DM1 = new DivisiManager(114356, "Retno Kirana Candra", "Jl. Tarumanegara No 56, Cimahi", "081255686729", 7, 22);
                    System.out.println("Data yang diminta : ");
                    System.out.println("A. Biodata");
                    System.out.println("B. Data Gaji");
                    System.out.println("-------------");
                    System.out.print("Pilihan : ");
                    String pilihan = input.next();
                    switch (pilihan) {
                        case "A":
                            System.out.println("-----BIODATA Karyawan-----");
                            System.out.println("Data Karyawan Ditemukan");
                            DM1.data();
                            break;
                        case "B":
                            System.out.println("-----Data Gaji-----");
                            System.out.println("Data Karyawan Ditemukan");
                            DM1.bonus("Karyawan Tetap");
                            System.out.println();
                            DM1.gaji("Karyawan Tetap");
                            break;
                    }
                } else {
                    System.out.println("Data Karyawan Tidak Ditemukan.");
                }
                break;
            case 2:
                System.out.println("======================================");
                System.out.println("              Divisi IT               ");
                System.out.println("======================================");
                System.out.print("Masukkan ID : ");
                id = input.nextInt();
                if (id == 123249) {
                    System.out.println();
                    DivisiIT DI = new DivisiIT(123249, "Amydin Sahira", "Jl.Sukamaju No. 3, Cimahi", "082144783749", 5, 22, 15);
                    System.out.println("Data yang diminta : ");
                    System.out.println("A. Biodata");
                    System.out.println("B. Data Gaji");
                    System.out.println("-------------");
                    System.out.print("Pilihan : ");
                    String pilihan = input.next();
                    switch (pilihan) {
                        case "A":
                            System.out.println("-----BIODATA Karyawan-----");
                            System.out.println("Data Karyawan Ditemukan");
                            DI.data();
                            break;
                        case "B":
                            System.out.println("-----Data Gaji-----");
                            System.out.println("Data Karyawan Ditemukan");
                            DI.bonus("Karyawan Tetap");
                            System.out.println();
                            DI.bonus("Karyawan Tetap");
                            DI.gaji("Karyawan Tetap");
                            break;
                    }
                } else if (id == 123253) {
                    System.out.println();
                    DivisiIT DI1 = new DivisiIT(123253, "Farhan Abdullah", "Jl. Maju Mundur No. 8, Bandung", "081255784568", 3, 20, 8);
                    System.out.println("Data yang diminta : ");
                    System.out.println("A. Biodata");
                    System.out.println("B. Data Gaji");
                    System.out.println("-------------");
                    System.out.print("Pilihan : ");
                    String pilihan = input.next();
                    switch (pilihan) {
                        case "A":
                            System.out.println("-----BIODATA Karyawan-----");
                            System.out.println("Data Karyawan Ditemukan");
                            DI1.data();
                            break;
                        case "B":
                            System.out.println("-----Data Gaji-----");
                            System.out.println("Data Karyawan Ditemukan");
                            DI1.bonus("Karyawan Tetap");
                            System.out.println();
                            DI1.bonus("Karyawan Tetap");
                            DI1.gaji("Karyawan Tetap");
                            break;
                    }
                } else if (id == 123269) {
                    System.out.println();
                    DivisiIT DI2 = new DivisiIT(123269, "Rico Tanuwijaya", "Jl. Sukaramai No 89, Cimahi", "089378492738", 2, 21, 5);
                    System.out.println("Data yang diminta : ");
                    System.out.println("A. Biodata");
                    System.out.println("B. Data Gaji");
                    System.out.println("-------------");
                    System.out.print("Pilihan : ");
                    String pilihan = input.next();
                    switch (pilihan) {
                        case "A":
                            System.out.println("-----BIODATA Karyawan-----");
                            System.out.println("Data Karyawan Ditemukan");
                            DI2.data();
                            break;
                        case "B":
                            System.out.println("-----Data Gaji-----");
                            System.out.println("Data Karyawan Ditemukan");
                            DI2.bonus("Karyawan Kontrak");
                            DI2.gaji("Karyawan Kontrak");
                            break;
                    }
                } else {
                    System.out.println("Data Karyawan Tidak Ditemukan.");
                }
                break;
            case 3:
                System.out.println("======================================");
                System.out.println("       Divisi Costumer Service        ");
                System.out.println("======================================");
                System.out.print("Masukkan ID : ");
                id = input.nextInt();
                if (id == 125895) {
                    System.out.println();
                    DivisiCS DC = new DivisiCS(125895, "Pungky Wulan", "Jl. Hayam Wuruk No. 85, Bandung", "087758367943", 3, 22, 25);
                    System.out.println("Data yang diminta : ");
                    System.out.println("A. Biodata");
                    System.out.println("B. Data Gaji");
                    System.out.println("-------------");
                    System.out.print("Pilihan : ");
                    String pilihan = input.next();
                    switch (pilihan) {
                        case "A":
                            System.out.println("-----BIODATA Karyawan-----");
                            System.out.println("Data Karyawan Ditemukan");
                            DC.data();
                            break;
                        case "B":
                            System.out.println("-----Data Gaji-----");
                            System.out.println("Data Karyawan Ditemukan");
                            DC.bonus("Karyawan Kontrak");
                            DC.gaji("Karyawan Kontrak");
                            break;
                    }
                } else if (id == 125846) {
                    System.out.println();
                    DivisiCS DC1 = new DivisiCS(125846, "Berti Indra", "Jl. Nasional 2 No. 293, Bandung", "089256847358", 3, 18, 20);
                    System.out.println("Data yang diminta : ");
                    System.out.println("A. Biodata");
                    System.out.println("B. Data Gaji");
                    System.out.println("-------------");
                    System.out.print("Pilihan : ");
                    String pilihan = input.next();
                    switch (pilihan) {
                        case "A":
                            System.out.println("-----BIODATA Karyawan-----");
                            System.out.println("Data Karyawan Ditemukan");
                            DC1.data();
                            break;
                        case "B":
                            System.out.println("-----Data Gaji-----");
                            System.out.println("Data Karyawan Ditemukan");
                            DC1.bonus("Karyawan Kontrak");
                            DC1.gaji("Karyawan Kontrak");
                            break;
                    }
                } else if (id == 125889) {
                    System.out.println();
                    DivisiCS DC2 = new DivisiCS(125889, "Fara dina", "Perum Bumi Parahyangan Blok D No. 5, Cimahi", "", 2, 21, 15);
                    System.out.println("Data yang diminta : ");
                    System.out.println("A. Biodata");
                    System.out.println("B. Data Gaji");
                    System.out.println("-------------");
                    System.out.print("Pilihan : ");
                    String pilihan = input.next();
                    switch (pilihan) {
                        case "A":
                            System.out.println("-----BIODATA Karyawan-----");
                            System.out.println("Data Karyawan Ditemukan");
                            DC2.data();
                            break;
                        case "B":
                            System.out.println("-----Data Gaji-----");
                            System.out.println("Data Karyawan Ditemukan");
                            DC2.bonus("Karyawan Kontrak");
                            DC2.gaji("Karyawan Kontrak");
                            break;
                    }
                } else if (id == 125923) {
                    System.out.println();
                    DivisiCS DC3 = new DivisiCS(125923, "Latif Wijayanto", "Kompleks Taman Citeureup Blok C No. 6, Cimahi", "087346783679", 1, 20, 10);
                    System.out.println("Data yang diminta : ");
                    System.out.println("A. Biodata");
                    System.out.println("B. Data Gaji");
                    System.out.println("-------------");
                    System.out.print("Pilihan : ");
                    String pilihan = input.next();
                    switch (pilihan) {
                        case "A":
                            System.out.println("-----BIODATA Karyawan-----");
                            System.out.println("Data Karyawan Ditemukan");
                            DC3.data();
                            break;
                        case "B":
                            System.out.println("-----Data Gaji-----");
                            System.out.println("Data Karyawan Ditemukan");
                            DC3.bonus("Karyawan Kontrak");
                            DC3.gaji("Karyawan Kontrak");
                            break;
                    }
                } else if (id == 125969) {
                    System.out.println();
                    DivisiCS DC4 = new DivisiCS(125969, "Gilang Hariyadi", "Perum Tirta Kencana Blok H No. 3, Cimahi", "", 1, 15, 8);
                    DC4.data();
                    DC4.gaji("Karyawan Kontrak");
                } else {
                    System.out.println("Data Karyawan Tidak Ditemukan.");
                }
                break;
            default:
                System.out.println("Data Tidak Ditemukan");
        }
    }

}
