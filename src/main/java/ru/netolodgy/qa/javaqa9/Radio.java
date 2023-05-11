package ru.netolodgy.qa.javaqa9;

public class Radio {
    public int currentRadioStation;
    public int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setToMinRadioStation() {
        currentRadioStation = 0;
    }

    public void setToMaxRadioStation() {
        currentRadioStation = 9;
    }

    public void setToNextRadioStation(int newRadioStation) {
        if (newRadioStation < 9) {
            currentRadioStation = newRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void setToPrevRadioStation(int newRadioStation) {
        if (newRadioStation > 0) {
            currentRadioStation = newRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public void setToMaxVolume() {
        currentVolume = 99;
    }

    public void setIncreaseVolume(int newVolume) {
        if (newVolume < 100) {
            currentVolume = newVolume + 1;
        } else {
            currentVolume = 99;
        }
    }

    public void setDecreaseVolume(int newVolume) {
        if (newVolume > 0) {
            currentVolume = newVolume - 1;
        } else {
            currentVolume = 0;
        }
    }


}
