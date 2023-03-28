package ReflexaoJava;

public class Notas {
    private double atv1;
    private double atv2;
    private double atv3;
    private double nota1;
    private double nota2;
    private double nota3;
    
    public Notas() {
    }

    public double getAtv1() {
        return atv1;
    }

    public void setAtv1(double atv1) {
        this.atv1 = atv1;
    }

    public double getAtv2() {
        return atv2;
    }

    public void setAtv2(double atv2) {
        this.atv2 = atv2;
    }

    public double getAtv3() {
        return atv3;
    }

    public void setAtv3(double atv3) {
        this.atv3 = atv3;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    double mediaSemestre = 0;

    public String calculaMediaSemestre(){
        mediaSemestre = (atv1 + atv2 + atv3 + nota1 + nota2 + nota3) /6;
        return "A media do semestre é:" + mediaSemestre;
    }

    public String verificaAprovado_Recusado(){
        if(mediaSemestre >= 6.0){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }

    public double REFLECTEDtentouEscreverNegativo(double valor){
        if(valor < 0 || valor > 10){
                System.out.print("!!!Error!!! Nao pode ser valor negativo :(");
                System.out.print("Tente Novamente :)");
                return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Notas \n[atv1 = " + atv1 + ",\n atv2 = " + atv2 + ",\n atv3 = " + atv3 + ",\n nota1 = " + nota1 + ",\n nota2 = " + nota2
                + ",\n nota3 = " + nota3 + "]";
    } 

}
