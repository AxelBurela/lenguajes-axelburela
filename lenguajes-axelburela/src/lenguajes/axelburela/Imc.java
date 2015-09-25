package lenguajes.axelburela;

/**
 *
 * @author T-107
 */
public class Imc 
{
    float peso;
    float altura;
    


public Imc(float p, float a)
    {
    peso=p; 
    altura=a;
    }
    public float calcular()
    {
    float resultadoImc=peso/(altura*altura);
    
    
    if(resultadoImc<=20)
    {
    System.out.println("Estás bien chirgo");
    }
    if(resultadoImc>=20 && resultadoImc<=25)
    {
    System.out.println("Estás bien");
    }
    if(resultadoImc>=25 && resultadoImc<=30)
    {
    System.out.println("Estás medio chonco");
    }
    if(resultadoImc>=30)
    {
    System.out.println("Estás bien choncho");
    }
    return resultadoImc;
}
}
