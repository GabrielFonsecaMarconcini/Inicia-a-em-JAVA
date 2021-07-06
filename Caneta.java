public class Caneta {

                 public String modelo;
                 private String cor;
                 private float ponta;
                 public boolean tampada;

//Metodo contrutor facilita a inserção de variaveis nos metodos .........
                 public  Caneta(String m,String c,float p){
                     this.cor=c;
                     this.modelo=m;
                     this.ponta=p;
                     this.tampar();


                 }


    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo=m;

    }

    public float getPonta(){

        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta=p;

    }

    public void tampar(){
                     this.tampada=true;
    }

    public void destampar(){
                     this.tampada=false;
    }

    public void status(){
System.out.println("Sobre a caneta");
System.out.println("Modelo: "+this.modelo);
System.out.println("Ponta: "+this.ponta);
System.out.println("Cor: "+this.cor);
System.out.println("Tampada: "+this.tampada);


    }
}
