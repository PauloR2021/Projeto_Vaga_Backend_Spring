package com.prsoftware.vagabackend.vaga_backend_java.dto;

import java.util.DoubleSummaryStatistics;

/*Criando a Parte de Staticas */
public class StatisticsResponse {

    private long count;
    private double avg;
    private double sum;
    private double min;
    private double max;
    

    public StatisticsResponse(DoubleSummaryStatistics stats){
        this.count = stats.getCount();
        this.sum = stats.getSum();
        this.avg = stats.getAverage();
        this.min = stats.getMin();
        this.max = stats.getMax();
    }


    public long getCount() {
        return count;
    }


    public double getAvg() {
        return avg;
    }


    public double getSum() {
        return sum;
    }


    public double getMin() {
        return min;
    }


    public double getMax() {
        return max;
    }

    

    
}
