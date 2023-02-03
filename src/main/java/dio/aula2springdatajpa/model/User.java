package dio.aula2springdatajpa.model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // banco voce precisa ter uma estrutura de idetificação possa ter o id em cada senseção do meu usuario
    @Column(name = "user_id") // nome vai ter uma diferença com meu atributo
    private Integer id;
    @Column(length = 50,nullable = false) // coluna precisa ter tamanho de 50 caracteres não permite nulo
    private String name;
    @Column(length = 20, nullable = false)
    private String usarname;
    @Column(length = 100, nullable = false)
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsarname() {
        return usarname;
    }

    public void setUsarname(String usarname) {
        this.usarname = usarname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", usarname='" + usarname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
