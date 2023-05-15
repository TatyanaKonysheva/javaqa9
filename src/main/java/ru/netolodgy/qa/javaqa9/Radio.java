package ru.netolodgy.qa.javaqa9;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        currentRadioStation = newCurrentRadioStation;
    }

    public void setToMinRadioStation() {
        currentRadioStation = 0;
    }

    public void setToMaxRadioStation() {
        currentRadioStation = 9;
    }

    public void nextRadioStation(int newRadioStation) {
        if (newRadioStation < 9) {
            currentRadioStation = newRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevRadioStation(int newRadioStation) {
        if (newRadioStation > 0) {
            currentRadioStation = newRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public void setToMaxVolume() {
        currentVolume = 99;
    }

    public void increaseVolume(int newVolume) {
        if (newVolume < 100) {
            currentVolume = newVolume + 1;
        } else {
            currentVolume = 99;
        }
    }

    public void decreaseVolume(int newVolume) {
        if (newVolume > 0) {
            currentVolume = newVolume - 1;
        } else {
            currentVolume = 0;
        }
    }

}
