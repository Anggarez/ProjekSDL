package ProjekSDLKel6;
import java.util.Scanner;
public class Klinik {

    public static void main(String[] args) {
        String penyakit = null;
        String nama = null;
        int umur = 0;
        int noantri = 0;
        boolean close = true;
        Scanner sc = new Scanner(System.in);
        Pasien psn;
        Queue queue = new Queue();
        LinkedList list = new LinkedList();
        int pilih;
        System.out.println("PROGRAM ANTRIAN KLINIK");
        System.out.println("=======================");
        while (close) {
            System.out.println("\n1. Ambil Antrian");
            System.out.println("2. Pemanggilan Antrian");
            System.out.println("3. Lihat Antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu: ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    if (queue.size() == 20) {
                        System.out.println("\nAntrian Penuh, Mohon Panggil Antrian\n");
                    } else {
                        noantri++;
                        System.out.print("Masukkan Nama : ");
                        nama = sc.next();
                        System.out.print("Masukkan Penyakit : ");
                        penyakit = sc.next();
                        System.out.print("Masukkan Umur : ");
                        umur = sc.nextInt();
                        psn = new Pasien(nama, penyakit, umur, noantri);
                        if (umur < 60) {
                            queue.enqueue(psn);
                        } else {
                            queue.enqueueLansia(psn);
                        }
                        System.out.println("Nomor Antrian : " + psn.getNoAntri());
                        System.out.println("Antrian yang belum dipanggil : " + queue.size());
                    }
                    break;
                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("\nAntrian Kosong\n");
                    } else {
                        System.out.println("Antrian Dipanggil");
                        System.out.println(queue.dequeue());
                    }
                    System.out.println("Antrian yang belum dipanggil : " + queue.size());
                    break;
                case 3:
                    if (queue.isEmpty()) {
                        System.out.println("\nAntrian Kosong\n");
                    } else {
                        queue.cetak();
                    }
                    break;
                case 4:
                    close = false;
                    break;
                default:
                    System.out.println("\nSalah Input\n");
                    break;
            }

        }

    }
}
