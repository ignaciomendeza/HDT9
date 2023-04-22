import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.uvg.ht9.*;
import structure5.SplayTree;
import structure5.RedBlackSearchTree;
import structure5.BinarySearchTree;


class Tests{
    
    @Test
    void insertarSplayTree(){
        SplayTree<Palabra> miDiccionario = new SplayTree<Palabra>(new ComparadorPalabras<Palabra>());
		
		miDiccionario.add(new Palabra("yes", "si"));
		miDiccionario.add(new Palabra("woman", "mujer"));
		miDiccionario.add(new Palabra("town", "pueblo"));

        assertEquals(miDiccionario.size(), 3);
    }

    @Test
    void traducirSplayTree(){
        SplayTree<Palabra> miDiccionario = new SplayTree<Palabra>(new ComparadorPalabras<Palabra>());
		
		miDiccionario.add(new Palabra("yes", "si"));
		miDiccionario.add(new Palabra("woman", "mujer"));
		miDiccionario.add(new Palabra("town", "pueblo"));

        Palabra buscada = miDiccionario.get(new Palabra("woman", ""));

		assertEquals("woman", buscada.getEnglish());
        assertEquals("mujer", buscada.getSpanish());

    }

    @Test
    void insertarRedBlackTree(){
        RedBlackSearchTree<Palabra> miDiccionario = new RedBlackSearchTree<Palabra>();
		
		miDiccionario.add(new Palabra("yes", "si"));
		miDiccionario.add(new Palabra("woman", "mujer"));
		miDiccionario.add(new Palabra("town", "pueblo"));

        assertEquals(miDiccionario.size(), 3);
    }
    
    @Test
    void traducirRedBlackTree(){
        RedBlackSearchTree<Palabra> miDiccionario = new RedBlackSearchTree<Palabra>();
		
		miDiccionario.add(new Palabra("yes", "si"));
		miDiccionario.add(new Palabra("woman", "mujer"));
		miDiccionario.add(new Palabra("town", "pueblo"));

        Palabra buscada = miDiccionario.get(new Palabra("woman", ""));

		assertEquals("woman", buscada.getEnglish());
        assertEquals("mujer", buscada.getSpanish());   
    }

    @Test
    void insertarBinarySearchTree(){
        BinarySearchTree<Palabra> miDiccionario = new BinarySearchTree<Palabra>();
		
		miDiccionario.add(new Palabra("yes", "si"));
		miDiccionario.add(new Palabra("woman", "mujer"));
		miDiccionario.add(new Palabra("town", "pueblo"));

        assertEquals(miDiccionario.size(), 3);
    }

    @Test
    void traducirBinarySearchTree(){
        BinarySearchTree<Palabra> miDiccionario = new BinarySearchTree<Palabra>();
		
		miDiccionario.add(new Palabra("yes", "si"));
		miDiccionario.add(new Palabra("woman", "mujer"));
		miDiccionario.add(new Palabra("town", "pueblo"));

        Palabra buscada = miDiccionario.get(new Palabra("woman", ""));

		assertEquals("woman", buscada.getEnglish());
        assertEquals("mujer", buscada.getSpanish()); 
    }
}