public class Persona {
    ////- nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura
    ////- Se implmentaran varios constructores
    ////    - Vacío
    ////    - Con nombre, edad y sexo
    ////    - con todos los atributos
    ////    crear un método para calcular (return) el IMC de la persona
    //El IMC es su peso en kilos divido por la altura (estatura) al cuadrado.

    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private float peso; //kg
    private float altura; //m

    public Persona(){

    }

    public Persona (String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona (String nombre, int edad, String dni, char sexo, float kg, float metros){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        peso = kg;
        altura = metros;
    }

    public float calculoImc(){
        float imc = peso / (float)Math.pow(altura, 2);
        return imc;
    }
}
