package services;

import models.DVDFilm;
import models.DVDMusik;

import java.util.ArrayList;
import java.util.List;

public class DVDService {
    private List<DVDFilm> dvdFilm;
    private List<DVDMusik> dvdMusik;

    public DVDService() {
        this.dvdFilm = new ArrayList<>();
        this.dvdMusik = new ArrayList<>();
    }

    public List<DVDFilm> getDvdFilm() {
        return dvdFilm;
    }

    public List<DVDMusik> getDvdMusik() {
        return dvdMusik;
    }

    public void addDVDFilm(DVDFilm dvdFilm) {
        this.dvdFilm.add(dvdFilm);
    }

    public void addDVDMusik(DVDMusik dvdMusik) {
        this.dvdMusik.add(dvdMusik);
    }
}
