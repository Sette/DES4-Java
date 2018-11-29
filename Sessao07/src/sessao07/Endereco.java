
package sessao07;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_endereco")
@SequenceGenerator(name = "end_seq", allocationSize = 1, 
        sequenceName = "seq_tb_endereco_id")
public class Endereco {
    @Id
    private int id;
    private String rua;
    private String cep;
    private Pessoa pessoa;
}
