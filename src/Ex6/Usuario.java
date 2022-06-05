package Ex6;
public class Usuario {
    private String userName;
    private int acertos;
    private int erros;

    public Usuario() {}

    public Usuario(String userName, int acertos, int erros) {
        this.setUserName(userName);
        this.setAcertos(acertos);
        this.setErros(erros);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAcertos() {
        return acertos;
    }

    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }

    public int getErros() {
        return erros;
    }

    public void setErros(int erros) {
        this.erros = erros;
    }

    @Override
    public String toString() {
        return "Usuario " + this.getUserName() + "\nAcertos: " + this.getAcertos() + "\nErros: " + this.getErros();
    }
}
