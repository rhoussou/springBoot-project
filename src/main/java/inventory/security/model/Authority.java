package inventory.security.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@RequiredArgsConstructor

public class Authority {

    @Id
    private Long id;
    @NonNull
    private AuthorityName name;

}