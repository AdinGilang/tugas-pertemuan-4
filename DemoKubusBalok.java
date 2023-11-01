/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author ading
 */
public class DemoKubusBalok {
    public static void main(String[] args) {
        // Membuat objek Kubus dan menghitung volume serta luas permukaan
        Perhitungan kubus = new Kubus(8);
        System.out.println("Volume Kubus: " + kubus.Volume());
        System.out.println("Luas Permukaan Kubus: " + kubus.LuasPermukaan());

        // Membuat objek Balok dan menghitung volume serta luas permukaan
        Perhitungan balok = new Balok(6, 5, 4);
        System.out.println("Volume Balok: " + balok.Volume());
        System.out.println("Luas Permukaan Balok: " + balok.LuasPermukaan());
    }
}
