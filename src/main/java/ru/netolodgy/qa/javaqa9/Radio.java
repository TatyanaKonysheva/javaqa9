package ru.netolodgy.qa.javaqa9;

public class Radio {
    public int setCurrentVolume;
    private int minRadioStation = 0;
    private int amountRadioStation = 10;
    private int maxRadioStation = amountRadioStation - 1;
    private int currentRadioStation = minRadioStation;
    private int minVolume = 0;
    private int maxVolume = 99;
    private int currentVolume = minVolume;

    public Radio() {
    }

    public Radio(int newAmountRadioStation) {
        maxRadioStation = minRadioStation + newAmountRadioStation - 1;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }


    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setToMinRadioStation() {
        currentRadioStation = minRadioStation;
    }

    public void setToMaxRadioStation() {
        currentRadioStation = maxRadioStation;
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
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
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

    public void increaseVolume() {
        if (currentVolume < 99) {
            currentVolume++;
        } else {
            currentVolume = 99;
        }
    }

    public void decreaseVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }

}