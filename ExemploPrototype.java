package prototype.example;

import formas.Circulo;
import formas.Retangulo;
import formas.Forma;

import java.util.ArrayList;
import java.util.List;

public class ExemploPrototype 
{
    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();
        List<Forma> copiaFormas = new ArrayList<>();

        Circulo circulo = new Circulo();
        circulo.x = 10;
        circulo.y = 20;
        circulo.radius = 15;
        circulo.color = "Orange";
        formas.add(circulo);

        Circulo circulo2 = (Circulo) circulo.clone();
        formas.add(circulo2);

        Retangulo retangulo = new Retangulo();
        retangulo.largura = 10;
        retangulo.altura = 20;
        retangulo.color = "Orange";
        formas.add(retangulo);

        copiarForma(formas, copiaFormas);
    }

    private static void copiarForma(List<Forma> formas, List<Forma> copiaFormas) 
    {
        for (Forma forma : formas) 
        {
            formasCopia.add(shape.clone());
        }

        for (int i = 0; i < formas.size(); i++) 
        {
            if (formas.get(i) != formasCopia.get(i)) 
            {
                System.out.println(i + ": Diferentes!");
                if (shapes.get(i).equals(formasCopia.get(i))) {
                    System.out.println(i + ": Iguais!");
                } 
                else 
                {
                    System.out.println(i + ": Objetos diferentes!");
                }
            } 
            else 
            {
                System.out.println(i + ": Objetos iguais!");
            }
        }
    }
}