package az.websuper.crm.dtos.driver;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverCreateDto {
    private String email;
    private String firstName;
    private String lastName;
   // private String password;

}

