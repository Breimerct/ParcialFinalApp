package com.parcialfinalapp;

public class Program {
    private String programName;
    private String programInfo;
    private int imgProgram;

    public Program(String programName, String programInfo, int imgProgram) {
        this.programName = programName;
        this.programInfo = programInfo;
        this.imgProgram = imgProgram;
    }

    public int getImgProgram() {
        return imgProgram;
    }

    public void setImgProgram(int imgProgram) {
        this.imgProgram = imgProgram;
    }

    public String getProgramInfo() {
        return programInfo;
    }

    public void setProgramInfo(String programInfo) {
        this.programInfo = programInfo;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }
}
