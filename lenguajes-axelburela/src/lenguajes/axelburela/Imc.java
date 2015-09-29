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
    public String calcular()
    {
    String mensajito="Nada";
    float resultadoImc=peso/(altura*altura);
    if(resultadoImc<20)mensajito="Eres toda una anoréxica, moriras";
    else if(resultadoImc>=20||resultadoImc<25)mensajito="Estás muy bien";
    else if(resultadoImc>=25||resultadoImc<30)mensajito="Te pasaste de tamales";
    else mensajito="Eres obeso mórbido, moriras";
    return mensajito+"Tu Imc es: "+resultadoImc;
}
}
