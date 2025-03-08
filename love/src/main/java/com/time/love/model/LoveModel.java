package com.time.love.model;

public class LoveModel {
    private long anos;
    private long meses;
    private long dias;
    private long horas;
    private long minutos;
    private long segundos;

    // Construtores, getters e setters
    public LoveModel(long anos, long meses, long dias, long horas, long minutos, long segundos) {
        this.anos = anos;
        this.meses = meses;
        this.dias = dias;
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public long getAnos() { return anos; }
    public long getMeses() { return meses; }
    public long getDias() { return dias; }
    public long getHoras() { return horas; }
    public long getMinutos() { return minutos; }
    public long getSegundos() { return segundos; }
}
