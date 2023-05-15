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
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setToMinRadioStation() {
        currentRadioStation = 0;
    }

    public void setToMaxRadioStation() {
        currentRadioStation = 9;
    }

    public void nextRadioStation() {
        if (currentRadioStation != 9) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation != 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = 9;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
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
