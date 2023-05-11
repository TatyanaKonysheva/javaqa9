package ru.netolodgy.qa.javaqa9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation(){
        Radio station = new Radio();

        station.currentRadioStation = 3;

        int expected = 3;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSeyVolume() {
        Radio voulume = new Radio();

        voulume.currentVolume = 50;

        int expected = 50;
        int actual = voulume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinRadioStation() {
        Radio station = new Radio();

        station.setToMinRadioStation();

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxRadioStation() {
        Radio station = new Radio();

        station.setToMaxRadioStation();

        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToNextRadioStation() {
        Radio station = new Radio();

        station.setToNextRadioStation(8);

        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldZeroToNextRadioStation() {
        Radio station = new Radio();

        station.setToNextRadioStation(9);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldToPrevRadioStation() {
        Radio station = new Radio();

        station.setToPrevRadioStation(9);

        int expected = 8;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNaneToPrevRadioStation() {
        Radio station = new Radio();

        station.setToPrevRadioStation(-1);

        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() {
        Radio volume = new Radio();

        volume.setToMinVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected,  actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio volume = new Radio();

        volume.setToMaxVolume();

        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected,  actual);
    }

    @Test
    public void shouldSetIncreaseVolume() {
        Radio volume = new Radio();

        volume.setIncreaseVolume(0);

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected,  actual);
    }

    @Test
    public void shouldSetStopIncreaseVolume() {
        Radio volume = new Radio();

        volume.setIncreaseVolume(100);

        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected,  actual);
    }

    @Test
    public void shouldSetDecreaseVolume() {
        Radio volume = new Radio();

        volume.setDecreaseVolume(99);

        int expected = 98;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected,  actual);
    }

    @Test
    public void shouldSetStopDecreaseVolume() {
        Radio volume = new Radio();

        volume.setDecreaseVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected,  actual);
    }




}
