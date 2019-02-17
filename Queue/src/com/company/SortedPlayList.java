package com.company;

public class SortedPlayList {
    private AudioTrack[] arr;
    int n = 0;

    public SortedPlayList(int size) {
        this.arr = new AudioTrack[size];
    }

    //вставляет новый трек в массив так, чтобы
    //треки в нем остались упорядочены
    public void add(AudioTrack AudioTrack) {
        int c = 0;
        while (c < n && n != 0 && arr[c].compareTo(AudioTrack) <= 0) {
            c++;
        }
        for(int i = n; i > c; i--){
            arr[i] = arr[i - 1];
        }
        arr[c] = AudioTrack;
        n++;
    }
}