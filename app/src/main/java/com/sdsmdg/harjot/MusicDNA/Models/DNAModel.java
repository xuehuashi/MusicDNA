package com.sdsmdg.harjot.MusicDNA.Models;

import android.graphics.Bitmap;
import android.util.Pair;

import java.util.List;

/**
 * Created by Harjot on 02-Jun-16.
 */
public class DNAModel {
    private boolean type;
    private LocalTrack localTrack;
    private Track track;
    private List<Pair<Float, Float>> pts;
    private List<Pair<Float, Pair<Integer, Integer>>> ptPaint;
    private Bitmap bmp;

    public DNAModel(boolean type, LocalTrack localTrack, Track track, List<Pair<Float, Float>> pts, List<Pair<Float, Pair<Integer, Integer>>> ptPaint, Bitmap bmp) {
        this.type = type;
        this.localTrack = localTrack;
        this.track = track;
        this.pts = pts;
        this.ptPaint = ptPaint;
        this.bmp = bmp;
    }

    public boolean getType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public List<Pair<Float, Float>> getPts() {
        return pts;
    }

    public void setPts(List<Pair<Float, Float>> pts) {
        this.pts = pts;
    }

    public List<Pair<Float, Pair<Integer, Integer>>> getPtPaint() {
        return ptPaint;
    }

    public void setPtPaint(List<Pair<Float, Pair<Integer, Integer>>> ptPaint) {
        this.ptPaint = ptPaint;
    }

    public LocalTrack getLocalTrack() {
        return localTrack;
    }

    public void setLocalTrack(LocalTrack localTrack) {
        this.localTrack = localTrack;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public Bitmap getBmp() {
        return bmp;
    }

    public void setBmp(Bitmap bmp) {
        this.bmp = bmp;
    }
}
