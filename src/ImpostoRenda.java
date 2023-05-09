public class ImpostoRenda {
    public double imposto;
    public String nome;
    public double aliquota;
    public double salario;

    public void impostoRenda(){
        if( this.salario <= 1903.98){
            System.out.println("Está isento de imposto de renda");
        }
        if (this.salario > 1903.99 && this.salario <= 2826.65){
            this.imposto = this.salario * 0.075;
            System.out.println("Deverá pagar: "+ this.imposto+ "de imposto.");
        }
        if (this.salario >  2826.66 && this.salario <= 3751.05){
            this.imposto = this.salario * 0.15;
            System.out.println("Deverá pagar: "+ this.imposto+ " de imposto.");

        }
        if (this.salario >  3751.06 && this.salario <=  4664.68){
            this.imposto = this.salario * 0.225;
            System.out.println("Deverá pagar: "+ this.imposto+ " de imposto.");;
        }
        if (this.salario > 4664.68){
            this.imposto = this.salario * 0.275;
            System.out.println("Deverá pagar: "+ this.imposto+ " de imposto.");
        }

    }

    public void sobra(){
        this.aliquota = this.salario - this.imposto ;
        System.out.println("Ficando com o salario de: "+ this.aliquota);
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
