package ru.netolodgy.qa.javaqa9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetRadioStation(){
        Radio station = new Radio();

        station.setCurrentRadioStation(3);

        int expected = 3;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetOverRadioStation(){
        Radio station = new Radio();

        station.setCurrentRadioStation(13);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLessRadioStation(){
        Radio station = new Radio();

        station.setCurrentRadioStation(-3);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(50);

        int expected = 50;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetOverVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(150);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLessVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-50);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinMaxCurrentRadioStation() {
        Radio station = new Radio(20);

        station.setToMinRadioStation();
        station.setToMaxRadioStation();
        station.setCurrentRadioStation(15);


        Assertions.assertEquals(0, station.getMinRadioStation());
        Assertions.assertEquals(19, station.getMaxRadioStation());
        Assertions.assertEquals(15, station.getCurrentRadioStation());
    }


    @Test
    public void shouldSetToMinRadioStation() {
        Radio station = new Radio();

        station.setToMinRadioStation();

        int expected = 0;
        int actual = station.getMinRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetToMaxRadioStation() {
        Radio station = new Radio();

        station.setToMaxRadioStation();

        int expected = 9;
        int actual = station.getMaxRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToNextRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(8);

        station.nextRadioStation();

        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldZeroToNextRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(9);

        station.nextRadioStation();

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldToPrevRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(9);

        station.prevRadioStation();

        int expected = 8;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNaneToPrevRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(0);

        station.prevRadioStation();

        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinMaxCurrentVolume() {
        Radio station = new Radio();

        station.setToMinVolume();
        station.setToMaxVolume();
        station.setCurrentVolume(50);


        Assertions.assertEquals(0, station.getMinVolume());
        Assertions.assertEquals(99, station.getMaxVolume());
        Assertions.assertEquals(50, station.getCurrentVolume());
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
        volume.setCurrentVolume(0);

        volume.increaseVolume();

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected,  actual);
    }

    @Test
    public void shouldSetStopIncreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);

        volume.increaseVolume();

        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected,  actual);
    }

    @Test
    public void shouldSetDecreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);

        volume.decreaseVolume();

        int expected = 98;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected,  actual);
    }

    @Test
    public void shouldSetStopDecreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected,  actual);
    }
}
