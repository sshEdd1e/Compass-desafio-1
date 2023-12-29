package Q2.model.entities;

import Q2.model.enums.Saudacao;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sistema {
    private Map<String, String> credenciais = new HashMap<>();
    private Saudacao saudacao;

    public Sistema() {
    }

    public Sistema(String login, String senha) {
        this.credenciais.put(login, senha);
    }


    public void addUser(String login, String senha){
        if(!credenciais.containsKey(login)) {
            this.credenciais.put(login, senha);
        } else {
            System.out.println("Usuário já utilizado");
        }
    }
    public boolean logar(String login, String senha){
        if(this.credenciais.containsKey(login)){
            if(this.credenciais.get(login).equals(senha)){
                this.saudacao = Saudacao.valueOf(LocalTime.now().getHour() / 6);
                System.out.println(this.saudacao.toString().replace("_", " ") + ", você se logou ao nosso sistema");
                return true;
            }
        }
        System.out.println("Usuário e/ou senha incorretos");
        return false;
    }
}
