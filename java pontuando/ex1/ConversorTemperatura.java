package com.mycompany.temperatura;

public class ConversorTemperatura {

    double fahrenheitParaCelsius(double f) {
        return (5.0 / 9.0) * (f - 32);
    }

    double kelvinParaCelsius(double k) {
        return k - 273.15;
    }
}
