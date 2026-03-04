
package com.mycompany.pessoaex;
class Pessoa {
    String nome;
    String sexo;
    String país; 

    // Métodos definidos dentro da classe Pessoa
    void anda() {
        System.out.println(nome  + " , do sexo " + sexo + ", nascido no "+ país + ", esta andando. " );
    }
    void fala() {
        System.out.println(nome  + " , do sexo " + sexo + ", nascido no "+ país + ", esta falando.");
    }
    void corre() {
        System.out.println(nome  + " , do sexo " + sexo + ", nascido no "+ país + ", esta correndo.");
    }
    void estuda() {
        System.out.println(nome  + " , do sexo " + sexo + ", nascido no "+ país + ", esta estudando. ");
    }
    void brinca() {
        System.out.println(nome  + " , do sexo " + sexo + ", nascido no "+ país + ", esta brincando.");
    }
}
