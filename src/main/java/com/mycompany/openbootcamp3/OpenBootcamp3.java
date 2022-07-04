/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.openbootcamp3;

/**
 *
 * @author chr_i
 */
public class OpenBootcamp3 {
    

    public static void main(String[] args) {
        class persona{
         private int edad;
         private String nombre;
         private String telefono;

        public persona() {
        }
         
         public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
         
    }
        persona sujeto1 = new persona();
        sujeto1.setNombre("Christian Jimenez");
        sujeto1.setEdad(26);
        sujeto1.setTelefono("7221307240");
        
        System.out.println("Nombre: "+sujeto1.getNombre());
        System.out.println("Edad: "+sujeto1.getEdad());
        System.out.println("Telefono: "+sujeto1.getTelefono());
    }
}
