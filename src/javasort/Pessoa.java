/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javasort;

import java.time.LocalDate;

/**
 *
 * @author fabri
 */
public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private LocalDate dataNascimento;

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    @Override
    public String toString(){
       return this.nome + " Data de Nascimento: "+ this.dataNascimento;
    }
    
   @Override
    public int compareTo(Pessoa outraPessoa){
        int comparaNome = this.nome.compareTo(outraPessoa.getNome());
        if(comparaNome==0)// nomes iguais
            return this.dataNascimento.compareTo(outraPessoa.getDataNascimento());
        
        return comparaNome;
    }

}
