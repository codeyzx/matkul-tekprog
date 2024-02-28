package controllers;

import java.util.List;
import java.util.Scanner;

import models.DVDFilm;
import models.DVDMusik;
import services.DVDService;
import utils.enums.FilmKategori;
import utils.enums.MusikKategori;

public class DVDController {

    public void inputDVDFilm(Scanner scanner, DVDService service) {
        System.out.println("\nMasukkan data DVD Film:");
        System.out.print("Judul: ");
        String judulFilm = scanner.nextLine();

        System.out.print("Pemeran (pisahkan dengan koma): ");
        String[] pemeranFilm = scanner.nextLine().split(",");

        System.out.print("Sutradara: ");
        String sutradaraFilm = scanner.nextLine();

        System.out.print("Publisher: ");
        String publisherFilm = scanner.nextLine();

        FilmKategori kategoriFilm = null;
        boolean validKategori = false;
        while (!validKategori) {
            System.out.print("Kategori (SU/D/R/A): ");
            String input = scanner.nextLine().toUpperCase();
            try {
                kategoriFilm = FilmKategori.valueOf(input);
                validKategori = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Kategori tidak valid. Silakan pilih kategori yang benar.");
            }
        }

        int stokFilm;
        while (true) {
            try {
                System.out.print("Stok: ");
                stokFilm = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Masukkan harus berupa angka. Silakan coba lagi.");
            }
        }

        DVDFilm film = new DVDFilm(judulFilm, pemeranFilm, sutradaraFilm, publisherFilm, kategoriFilm, stokFilm);
        service.addDVDFilm(film);

        System.out.println("DVD Film berhasil dimasukkan.");
    }

    public void inputDVDMusik(Scanner scanner, DVDService service) {
        System.out.println("\nMasukkan data DVD Musik:");
        System.out.print("Judul: ");
        String judulMusik = scanner.nextLine();

        System.out.print("Penyanyi: ");
        String penyanyiMusik = scanner.nextLine();

        System.out.print("Produser: ");
        String produserMusik = scanner.nextLine();

        System.out.print("Publisher: ");
        String publisherMusik = scanner.nextLine();

        System.out.print("Top Hits (pisahkan dengan koma): ");
        String[] topHitsMusik = scanner.nextLine().split(",");

        MusikKategori kategoriMusik = null;
        boolean validKategori = false;
        while (!validKategori) {
            System.out.print("Kategori (C/J/P/R/O): ");
            String input = scanner.nextLine().toUpperCase();
            try {
                kategoriMusik = MusikKategori.valueOf(input);
                validKategori = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Kategori tidak valid. Silakan pilih kategori yang benar.");
            }
        }

        int stokMusik;
        while (true) {
            try {
                System.out.print("Stok: ");
                stokMusik = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Masukkan harus berupa angka. Silakan coba lagi.");
            }
        }

        DVDMusik musik = new DVDMusik(judulMusik, penyanyiMusik, produserMusik, publisherMusik, topHitsMusik,
                kategoriMusik, stokMusik);

        service.addDVDMusik(musik);

        System.out.println("DVD Musik berhasil dimasukkan.");
    }

    public void tampilkanDVD(String jenis, DVDService service) {
        if (jenis.equalsIgnoreCase("film")) {
            List<DVDFilm> daftarFilm = service.getDvdFilm();

            System.out.println("======= Daftar DVD Film =======");
            if (daftarFilm.isEmpty()) {
                System.out.println("Tidak ada DVD film yang tersedia.");
            } else {
                for (int i = 0; i < daftarFilm.size(); i++) {
                    DVDFilm film = daftarFilm.get(i);
                    System.out.println((i + 1) + ". " + film.getJudul());
                    film.displayInfo();
                }
            }
        } else if (jenis.equalsIgnoreCase("musik")) {
            List<DVDMusik> daftarMusik = service.getDvdMusik();

            System.out.println("======= Daftar DVD Musik =======");
            if (daftarMusik.isEmpty()) {
                System.out.println("Tidak ada DVD musik yang tersedia.");
            } else {
                for (int i = 0; i < daftarMusik.size(); i++) {
                    DVDMusik musik = daftarMusik.get(i);
                    System.out.println((i + 1) + ". " + musik.getJudul());
                    musik.displayInfo();
                }
            }
        } else {
            List<DVDFilm> daftarFilm = service.getDvdFilm();
            List<DVDMusik> daftarMusik = service.getDvdMusik();

            System.out.println("======= Daftar Semua DVD =======");
            if (daftarFilm.isEmpty() && daftarMusik.isEmpty()) {
                System.out.println("Tidak ada DVD yang tersedia.");
            } else {
                if (!daftarFilm.isEmpty()) {
                    System.out.println("\nFilm");
                    for (int i = 0; i < daftarFilm.size(); i++) {
                        DVDFilm film = daftarFilm.get(i);
                        System.out.println((i + 1) + ". " + film.getJudul());
                        film.displayInfo();
                    }
                }

                if (!daftarMusik.isEmpty()) {
                    System.out.println("Musik");
                    for (int i = 0; i < daftarMusik.size(); i++) {
                        DVDMusik musik = daftarMusik.get(i);
                        System.out.println((i + 1) + ". " + musik.getJudul());
                        musik.displayInfo();
                    }
                }
            }
        }
    }

}
