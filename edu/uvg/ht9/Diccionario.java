package edu.uvg.ht9;

import java.util.ArrayList;

/*
 * Ignacio Méndez (22613)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 9
 * 21-04-2023
 * Clase Diccionario
 */

public class Diccionario{
    private IEstructuraArbol<Palabra> arbol;
    private Factory factory;
    private ArrayList<String> palabras;

    public Diccionario() {
        this.factory = new Factory();
        this.palabras = new ArrayList<String>();
    }

    public Diccionario(Factory factory, int type, ArrayList<String> palabras) {
        this.factory = new Factory();
        this.arbol = factory.getInstance(type);
        this.palabras = palabras;
    }

    public Diccionario(int type) {
        this.factory = new Factory();
        this.arbol = factory.getInstance(type);
        this.palabras = new ArrayList<String>();
    }

    
    /** 
     * @return IEstructuraArbol<Palabra>
     */
    public IEstructuraArbol<Palabra> getArbol() {
        return this.arbol;
    }

    
    /** 
     * @param arbol
     */
    public void setArbol(IEstructuraArbol<Palabra> arbol) {
        this.arbol = arbol;
    }

    
    /** 
     * @return Factory
     */
    public Factory getFactory() {
        return this.factory;
    }

    
    /** 
     * @param factory
     */
    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    
    /** 
     * @return ArrayList<String>
     */
    public ArrayList<String> getPalabras() {
        return this.palabras;
    }

    
    /** 
     * @param palabras
     */
    public void setPalabras(ArrayList<String> palabras) {
        this.palabras = palabras;
    }

    
    /** 
     * @param lineasDatos
     */
    public void guardarDatos(ArrayList<String> lineasDatos){
        ArrayList<String> unaLinea = new ArrayList<String>();

        for (String fila : lineasDatos) {
            String [] lineaSeparada = fila.split(",");
            unaLinea = new ArrayList<String>();
            for (String caracter : lineaSeparada) {
                unaLinea.add(caracter.trim());
            }

            palabras.add(unaLinea.get(0));
            Palabra palabra = new Palabra(unaLinea.get(0), unaLinea.get(1));
            
            arbol.add(palabra);
        }
    }

    
    /** 
     * @param lineasDatos2
     * @return String
     */
    public String traducir(ArrayList<String> lineasDatos2){
        ArrayList<String> unaLinea2 = new ArrayList<String>();
        String resultado = "";

        for (String fila : lineasDatos2) {
            resultado = resultado + "\nORIGINAL:\n" + fila;
            String [] lineaSeparada = fila.split(" ");
            unaLinea2 = new ArrayList<String>();
            for (String caracter : lineaSeparada) {
                unaLinea2.add(caracter.trim());
            }

            String last2 = "";
            String last = unaLinea2.remove(unaLinea2.size() - 1);
            if (last.endsWith(".")){
                last2 = last.substring(0, last.length() - 1);
                unaLinea2.add(last2);        
            }
            else{
                unaLinea2.add(last);
            }
            
            resultado = resultado + "\nTRADUCCION:\n";
            for (String pal : unaLinea2){
                String pal2 = pal.toLowerCase();
    
                if (palabras.contains(pal2)){
                    Palabra pa = arbol.get(new Palabra(pal2, ""));
                    resultado = resultado + pa.getSpanish() + " ";
    
                }
                else{
                    resultado = resultado + "*" + pal2 + "* ";
                }
            }
            resultado = resultado + "\n";
        }

        return resultado;

    }

}