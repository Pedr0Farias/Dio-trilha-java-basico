public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;


    // Metodos de mudar o canal
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        ++canal;
    }
    public void diminuirCanal(){
        --canal;
    }

    // Metodos de Volume
    public void aumentarVolume(){
        ++volume;
        System.out.println("Aumentando o volume para: "+volume);
    }
    public void diminuirVolume(){
        --volume;
        System.out.println("Diminuindo o volume para: "+volume);
    }
    
    // Metodos de Status("Ligada"||"Desligada")
    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
}
