package ru.netology.radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetStation() {
        Radio station = new Radio();

        station.setCurrentStation(9);

        int expected = 9;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextStation() {
        Radio station = new Radio();
        station.setCurrentStation(9);

        station.nextStation();

        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevStationInBorder() {
        Radio station = new Radio();
        station.setCurrentStation(0);

        station.prevStation();

        int expected = 9;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevStation() {
        Radio station = new Radio();
        station.setCurrentStation(9);

        station.prevStation();

        int expected = 8;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldStationAboveMax() {
        Radio station = new Radio();
        station.setCurrentStation(10);

        station.nextStation();

        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldStationBelowMin() {
        Radio station = new Radio();
        station.setCurrentStation(-1);

        station.nextStation();

        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(100);

        int expected = 100;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolumeAboveMax() {
        Radio cond = new Radio();

        cond.setCurrentVolume(101);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolumeBelowMin() {
        Radio cond = new Radio();

        cond.setCurrentVolume(-1);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);

        cond.increaseVolume();

        int expected = 1;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(100);

        cond.decreaseVolume();

        int expected = 99;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolumeAboveMax() {
        Radio cond = new Radio();
        cond.setCurrentVolume(100);

        cond.increaseVolume();

        int expected = 100;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolumeAboveMin() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);

        cond.decreaseVolume();

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMaxVolume() {
        Radio cond = new Radio();

        cond.setMaxVolume();

        int expected = 100;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() {
        Radio cond = new Radio();

        cond.setMinVolume();

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
}
