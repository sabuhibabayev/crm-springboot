package az.websuper.crm.dtos.customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerUpdateDto {

    private String name;
    private String lastname;
    private String email;
}
