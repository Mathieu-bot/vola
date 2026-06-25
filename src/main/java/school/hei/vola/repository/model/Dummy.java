package school.hei.vola.repository.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import school.hei.vola.PojaGenerated;

@PojaGenerated
@Entity
@Getter
@Setter
public class Dummy {
  @Id private String id;
}
