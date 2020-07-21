public class Main {
//Crear una clase persona con los siguientes atributos
//- nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura
//- Se implmentaran varios constructores
//    - Vacío
//    - Con nombre, edad y sexo
//    - con todos los atributos
//    crear un método para calcular (return) el IMC de la persona
    public static void main(String[] args) {

        Persona pepito = new Persona("Pepito", 25, "12345678X", 'H', 72, 1.7f);

        Persona romualda = new Persona("Romualda", 40, 'M');

        System.out.println(pepito.calculoImc());
        System.out.println(romualda.calculoImc());
    }
}
