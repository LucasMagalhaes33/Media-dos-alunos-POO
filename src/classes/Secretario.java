package classes;

public class Secretario extends Pessoa{

    protected String registro;
    protected String nivelCargo;
    protected String experiencia;

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getNivelCargo() {
        return nivelCargo;
    }

    public void setNivelCargo(String nivelCargo) {
        this.nivelCargo = nivelCargo;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Secretario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", registro='" + registro + '\'' +
                ", nivelCargo='" + nivelCargo + '\'' +
                ", experiencia='" + experiencia + '\'' +
                '}';
    }
}
