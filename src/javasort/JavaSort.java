/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javasort;

import static java.time.Clock.system;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author fabri
 */
public class JavaSort {
     public static Pessoa[] geraArrayPessoas() {
        return new Pessoa[]{
            new Pessoa("Carlos", LocalDate.of(1990, 5, 20)),
            new Pessoa("Ana", LocalDate.of(1985, 3, 15)),
            new Pessoa("Rafael", LocalDate.of(2000, 1, 25)),
            new Pessoa("Bruno", LocalDate.of(1992, 7, 10))
            
        };
    }
     
      public static Integer[] geraArrayAleatorio(int size, int min, int max) {
        Random random = new Random();
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min; // Gera um número aleatório entre min e max
        }
        return array;
    }


  public static void main(String[] args) {
      /*      Pessoa[] vetorPessoas = geraArrayPessoas();
        System.out.println("Pessoas do vetor:");
        for(Pessoa p: vetorPessoas)
            System.out.println(p);
        
        Comparator<Pessoa> comparaNome = (p1,p2) ->
                p1.getNome().compareTo(p2.getNome());
        
        Comparator<Pessoa> comparaDataNascimento = (p1,p2) ->
                p1.getDataNascimento().compareTo(p2.getDataNascimento());
        
        BubbleSort<Pessoa> bsort = new BubbleSort<>();
        SelectionSort<Pessoa> selectionSort = new SelectionSort();
        InsertionSort<Pessoa> isort = new InsertionSort<>();
        
        //bsort.sort(vetorPessoas, comparaNome);
        //selectionSort.sort(vetorPessoas, comparaNome);
        isort.sort(vetorPessoas, comparaNome);
        
        System.out.println("");
        System.out.println("Pessoas ordenadas pelo nome:");
        for(Pessoa p: vetorPessoas)
            System.out.println(p);
            */
      int tamanho = 100000, min =1, max=100;
      Integer[] vetor1 = geraArrayAleatorio(tamanho, min, max);
      Integer[] vetor2 = new Integer[tamanho];
      Integer[] vetor3 = new Integer[tamanho];
      
      for (int i = 0;i<tamanho;i++){
          vetor2[i]=vetor1[i];
          vetor3[i]=vetor1[i];
          System.out.println("|"+vetor1[i]);
      }
      
      Comparator<Integer> comparatorInteiro = (a, b) -> a.compareTo(b);
      
      BubbleSort<Integer> bsort = new BubbleSort<>();
      SelectionSort<Integer> ssort = new SelectionSort();
      InsertionSort<Integer> isort = new InsertionSort<>();
      
      long inicio = System.currentTimeMillis();
      bsort.sort(vetor1,comparatorInteiro);
      long tfinal = System.currentTimeMillis();
      long tempo = tfinal - inicio;
      System.out.println("Tempo do Bubble Sort: "+tempo +" Comparacoes:"+bsort.getContaComparacoes());
      
      
             
        // Selection Sort
       inicio = System.currentTimeMillis();
       ssort.sort(vetor2, comparatorInteiro);
       tfinal = System.currentTimeMillis();
       tempo = tfinal - inicio;
       System.out.println("Tempo do Selection Sort:"+tempo+" Comparacoes:"+ssort.getContaComparacoes());
       
       // Insertion Sort
       inicio = System.currentTimeMillis();
       isort.sort(vetor3, comparatorInteiro);
       tfinal = System.currentTimeMillis();
       tempo = tfinal - inicio;
       System.out.println("Tempo do Insertion Sort:"+tempo+" Comparacoes:"+isort.getContaComparacoes());

     
  }

  }
    
