package br.com.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    
    private LocalDate data;
    
    @Override
    public double calcularXP() {
       return XP_PADRAO + 20;
    }

    public LocalDate getLocalDate() {
        return data;
    }
    public void setLocalDate(LocalDate data) {
        this.data = data;
    }
    
    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", localDate=" + data + "]";
    }

}
