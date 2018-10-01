/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan26.waktu;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/*
 * Nama     : Eka Widyantoro
 * NIM      : 10117113
 * Kelas    : IF-3/PBO-3
 * Desc     : Program menampilkan waktu saat ini
 */
public class Waktu {

    /**
     * @param args the command line arguments
     */
    private String getTanggal(){
        DateFormat dateFormat = new SimpleDateFormat ("EEEE, dd MMM yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }
    
    private String getWaktu(){
        DateFormat dateFormat = new SimpleDateFormat ("HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
    public static void main(String[] args) {
        Waktu tgl = new Waktu();
        System.out.println("Hari Ini Adalah Hari : "+tgl.getTanggal()+" "
                            +tgl.getWaktu());
    }
    
}
