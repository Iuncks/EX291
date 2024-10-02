/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carro;

/**
 *
 * @author joaoi
 */
public class Veiculo {

    private double caminho;
    private double gasolina;

    public Veiculo() {
        this.caminho = 0;
        this.gasolina = 0;
    }

    public Veiculo(double caminho, double gasolina) {
        this.caminho = caminho;
        this.gasolina = gasolina;
    }

    public double getCaminho() {
        return caminho;
    }

    public void setCaminho(double caminho) {
        this.caminho = caminho;
    }

    public double getGasolina() {
        return gasolina;
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }

    public double getComsumo() {
        return (getCaminho() / getGasolina());
    }

}
